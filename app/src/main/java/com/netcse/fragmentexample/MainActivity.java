package com.netcse.fragmentexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.netcse.fragmentexample.multifragment.MultiFragActivity;
import com.netcse.fragmentexample.simplefragment.SimpleFragmentActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void simple(View view) {
        Intent intent = new Intent(getApplicationContext(), SimpleFragmentActivity.class);
        startActivity(intent);
    }

    public void multiple(View view) {
        Intent intent = new Intent(getApplicationContext(), MultiFragActivity.class);
        startActivity(intent);
    }
}
