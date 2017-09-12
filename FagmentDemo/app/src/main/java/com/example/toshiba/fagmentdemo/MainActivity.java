package com.example.toshiba.fagmentdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentOne fragmentOne=new FragmentOne();
        fragmentTransaction.add(R.id.fagment,fragmentOne);
        fragmentTransaction.commit();
    }

    public void ChengeFragment(View view) {
        switch (view.getId()){
            case R.id.button_fagmentOne :
                FragmentManager f1=getSupportFragmentManager();
                FragmentTransaction fr1 = f1.beginTransaction();
                FragmentOne fragmentOne=new FragmentOne();
                fr1.replace(R.id.fagment,fragmentOne);
                fr1.commit();
            break;
            case R.id.button_fagmentTwo:
                FragmentManager fragment=getSupportFragmentManager();
                FragmentTransaction Transaction = fragment.beginTransaction();
                FragmentTwo fragmenttwo=new FragmentTwo();
                Transaction.replace(R.id.fagment,fragmenttwo);
                Transaction.commit();
                break;
            case R.id.button_fagmentThree :
                FragmentManager f3=getSupportFragmentManager();
                FragmentTransaction fr2 = f3.beginTransaction();
                FragmentThree fragmentthree=new FragmentThree();
                fr2.replace(R.id.fagment,fragmentthree);
                fr2.commit();
                break;
        }
    }
}
