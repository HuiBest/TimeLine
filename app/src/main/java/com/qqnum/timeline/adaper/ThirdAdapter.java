package com.qqnum.timeline.adaper;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.qqnum.timeline.R;

/**
 * Created by CodeArt on 2017/1/14.
 */

public class ThirdAdapter extends BaseAdapter {
   private String data[];
   private Activity context;
    public int point; //用来标记点的位置

    public ThirdAdapter(Activity context, String data[]) {
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
            convertView = View.inflate(context,R.layout.item_third,null);
            viewHold = new ViewHold(convertView);
            convertView.setTag(viewHold);
        viewHold.thirdText.setText(data[position]);
        if (position == point){  //设置 选中的条目
            viewHold.image.setImageResource(R.drawable.point1);
            //初始化动画
            Animation scaleAnimation = new ScaleAnimation(1.0f, 1.5f,1.0f,1.5f,0,0.5f,Animation.ZORDER_BOTTOM,0.5f);
            //设置动画时间
            scaleAnimation.setDuration(500);
            scaleAnimation.setFillAfter(true);
            //给控件设置动画
            viewHold.thirdText.startAnimation(scaleAnimation);
        }
        return convertView;
    }

    class ViewHold {
        TextView thirdText;
        ImageView image;
        public ViewHold(View view) {
            thirdText = (TextView) view.findViewById(R.id.item_third_text);
            image = (ImageView) view.findViewById(R.id.image_normal);
        }
    }
}
