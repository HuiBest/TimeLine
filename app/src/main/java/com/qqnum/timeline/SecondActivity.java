package com.qqnum.timeline;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.qqnum.timeline.adaper.SecondAdapter;

public class SecondActivity extends Activity {
    ListView secondListView;
    SecondAdapter secondAdapter;
    String data[] = {"测试1","测试2","测试3","测试4"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        secondListView  = (ListView) findViewById(R.id.second_listview);
        secondAdapter  = new SecondAdapter(this,data);
        secondListView.setAdapter(secondAdapter);
    }
}
