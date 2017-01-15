package com.qqnum.timeline;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.qqnum.timeline.adaper.ThirdAdapter;

public class ThirdActivity extends Activity implements AdapterView.OnItemClickListener {
    ListView thirdListView;
    ThirdAdapter thirdAdapter;
    String data[] = {"测试1","测试2","测试3","测试4"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        thirdListView  = (ListView) findViewById(R.id.third_listview);
        thirdListView.setOnItemClickListener(this);
        thirdAdapter  = new ThirdAdapter(this,data);
        thirdListView.setAdapter(thirdAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //改变point 选中的point值
        thirdAdapter.point = position;
        //刷新listview
        thirdAdapter.notifyDataSetChanged();
        thirdListView.setAdapter(thirdAdapter);
    }
}
