package com.qqnum.timeline;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.qqnum.timeline.adaper.FirstAdapter;

public class FirstActivity extends Activity {
    ListView firstListView;
    FirstAdapter firstAdapter;
    String data[] = {"测试1","测试2","测试3","测试4"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        firstListView  = (ListView) findViewById(R.id.first_listview);
        firstAdapter  = new FirstAdapter(this,data);
        firstListView.setAdapter(firstAdapter);
    }
}
