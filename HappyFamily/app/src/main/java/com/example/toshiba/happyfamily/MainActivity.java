package com.example.toshiba.happyfamily;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread t=new Thread(){
            @Override
            public void run(){
            try {
                sleep(5000);
                Intent i=new Intent(MainActivity.this,Family.class);
                startActivity(i);
                finish();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            }

        };t.start();
    }
}
