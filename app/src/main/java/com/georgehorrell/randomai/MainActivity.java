package com.georgehorrell.randomai;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    int a = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void incrementText(View view) {
        TextView t = (TextView)findViewById(R.id.textView);
        Random rand = new Random();
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        Color randomColor = new Color(r, g, b);
        a++;
        t.setText(String.format(Locale.ENGLISH, "%d", a));

    }
}

