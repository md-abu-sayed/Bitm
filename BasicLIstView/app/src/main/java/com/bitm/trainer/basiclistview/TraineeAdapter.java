package com.bitm.trainer.basiclistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Trainer on 8/22/2017.
 */

public class TraineeAdapter extends ArrayAdapter<Trainee>{
    private Context context;
    private ArrayList<Trainee>trainees;

    public TraineeAdapter(Context context, ArrayList<Trainee>trainees) {
        super(context, R.layout.list_row,trainees);
        this.context=context;
        this.trainees=trainees;
    }
    private class ViewHolder{
         TextView nameText;
         TextView idText;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView==null){
            Toast.makeText(context, ""+position, Toast.LENGTH_SHORT).show();
            LayoutInflater layoutInflater=LayoutInflater.from(context);
            convertView=layoutInflater.inflate(R.layout.list_row,parent,false);
            viewHolder=new ViewHolder();
            viewHolder.nameText= convertView.findViewById(R.id.nameText);
            viewHolder.idText= convertView.findViewById(R.id.idText);
            convertView.setTag(viewHolder);
        }else{
            viewHolder= (ViewHolder) convertView.getTag();
        }
        viewHolder.nameText.setText(trainees.get(position).getTraineeName());
        viewHolder.idText.setText(trainees.get(position).getTraineeId());
        return convertView;
    }
}
