package com.jsy3949.myweathermap01;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView cityField;
    TextView updatedField;
    TextView selectCity;
    TextView weatherIcon;
    TextView curenTempField;
    TextView datailyField;
    TextView humidityField;
    ProgressBar loader;
    Typeface weatherFont;

    String city = "Seoul";
    String OPEN_WEATHER_MAP_API = "8928d35669d375138f573083364f60b3";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); //상단 액션바 제거
        setContentView(R.layout.activity_main);

        cityField = (TextView) findViewById(R.id.city_field);
        updatedField = (TextView) findViewById(R.id.update_field);
        selectCity = (TextView) findViewById(R.id.selectcity);
        weatherIcon = (TextView) findViewById(R.id.weather);
        curenTempField = (TextView) findViewById(R.id.current_temp_field);
        datailyField = (TextView) findViewById(R.id.details_field);
        humidityField = ( TextView) findViewById(R.id.humidity_field);
        loader = (ProgressBar) findViewById(R.id.loader);

        /*폰트 적용시 Typeface를 사용한다. */
        weatherFont = Typeface.createFromAsset(getAssets(),"fonts/weathericons-regular-webfont");
        weatherIcon.setTypeface(weatherFont);

    }
}
