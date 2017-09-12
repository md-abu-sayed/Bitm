package com.example.toshiba.listviewcustomadepter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Abu Sayed on 8/26/2017.
 */
public class CustomAdapter extends BaseAdapter{
    String[] title;
   // String[] dis;
    int[] flag;
    Context context;
    LayoutInflater inflater;
    CustomAdapter(Context context,String[] title,int[] flag){
        this.context=context;
        this.title=title;
        this.flag=flag;
    }
    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view==null){
            inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(R.layout.custom_view,viewGroup,false);
        }
        ImageView imageView= (ImageView) view.findViewById(R.id.flag);
        TextView textView= (TextView) view.findViewById(R.id.textView1);

        imageView.setImageResource(flag[i]);
        textView.setText(title[i]);
        return view;
    }
}
