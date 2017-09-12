package com.example.toshiba.happyfamily;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Family extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
    }
    public void aboutme(View view){
        Intent i=new Intent(Family.this,Sayed.class);
        startActivity(i);
    }
    public void aboutparent(View view){
        Intent in=new Intent(Family.this,Parent.class);
        startActivity(in);
    }
    public void aboutbrother(View view){
        Intent inte=new Intent(Family.this,Brother.class);
        startActivity(inte);
    }
    public void aboutsister(View view){
        Intent inter=new Intent(Family.this,Sister.class);
        startActivity(inter);
    }
    public void familyhistory(View view){
        Intent intent=new Intent(Family.this,History.class);
        startActivity(intent);
    }
    public void son(View view){
        Intent intent1=new Intent(Family.this,Bson.class);
        startActivity(intent1);
    }
    public void wife(View view){
        Intent intent2=new Intent(Family.this,Bwife.class);
        startActivity(intent2);
    }
}
