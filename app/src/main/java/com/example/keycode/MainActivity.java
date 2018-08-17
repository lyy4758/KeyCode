package com.example.keycode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override

    public boolean onKeyDown(int keyCode, KeyEvent event)  {

        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) { //按下的如果是BACK，同时没有重复 //do something here
             return true;

        }
        Log.i("keycode is", String.valueOf(keyCode));
        return super.onKeyDown(keyCode, event);

    }
}
