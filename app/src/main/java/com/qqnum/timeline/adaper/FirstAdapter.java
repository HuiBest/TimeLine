package com.qqnum.timeline.adaper;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.qqnum.timeline.R;

/**
 * Created by CodeArt on 2017/1/14.
 */

public class FirstAdapter extends BaseAdapter {
    String data[];
    Activity context;

    public FirstAdapter(Activity context, String data[]) {
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHold viewHold;
        if (convertView == null){
            convertView = View.inflate(context,R.layout.item_first,null);
            viewHold = new ViewHold(convertView);
            convertView.setTag(viewHold);
        }else {
            viewHold = (ViewHold) convertView.getTag();
        }
        if (position == 0){//设置第一个item
            viewHold.image.setImageResource(R.drawable.point1);
        }
        viewHold.firstText.setText(data[position]);
        return convertView;
    }

    class ViewHold {
        TextView firstText;
        ImageView image;
        public ViewHold(View view) {
            firstText = (TextView) view.findViewById(R.id.item_first_text);
            image = (ImageView) view.findViewById(R.id.image_normal);
        }
    }
}
