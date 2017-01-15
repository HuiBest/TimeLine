package com.qqnum.timeline;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
    Button first, second, third;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first = (Button) findViewById(R.id.first);
        second = (Button) findViewById(R.id.second);
        third = (Button) findViewById(R.id.third);
        first.setOnClickListener(this);
        second.setOnClickListener(this);
        third.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.first:
                Intent intent1 = new Intent(this, FirstActivity.class);
                startActivity(intent1);
                break;
            case R.id.second:
                Intent intent2 = new Intent(this, SecondActivity.class);
                startActivity(intent2);
                break;
            case R.id.third:
                Intent intent3 = new Intent(this, ThirdActivity.class);
                startActivity(intent3);
                break;
        }
    }
}
