package com.sinhvien.android_java_onmovie;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;

public class IntroActivity extends AppCompatActivity {

    private ViewPager2 screenPager;
    IntroViewPagerAdapter introViewPagerAdapter;
    TabLayout tabLayout;
    Button btnStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);


        //setup Viewpager
        screenPager = findViewById(R.id.screen_viewpager);
        introViewPagerAdapter = new IntroViewPagerAdapter(IntroActivity.this);
        screenPager.setAdapter(introViewPagerAdapter);

        btnStart = findViewById(R.id.btnStart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentIntro = new Intent(IntroActivity.this, SignInActivity.class);
                startActivity(intentIntro);
            }
        });
        tabLayout = findViewById(R.id.intro_tabLayout);
        new TabLayoutMediator(tabLayout, screenPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                }
            }
        }).attach();

    }
}