package com.example.tabhost;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = findViewById(R.id.TabHost);
        tabHost.setup();

        TabHost.TabSpec tabSpec = tabHost.newTabSpec("Puppy");
        tabSpec.setIndicator("강아지");
        tabSpec.setContent(R.id.Puppy);
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("Cat");
        tabSpec.setIndicator("고양이");
        tabSpec.setContent(R.id.Cat);
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("Fox");
        tabSpec.setIndicator("여우");
        tabSpec.setContent(R.id.Fox);
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("Rabbit");
        tabSpec.setIndicator("토끼");
        tabSpec.setContent(R.id.Rabbit);
        tabHost.addTab(tabSpec);


        tabHost.setCurrentTab(0);
    }
}
