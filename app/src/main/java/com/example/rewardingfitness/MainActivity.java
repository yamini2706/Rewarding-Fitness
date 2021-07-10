package com.example.rewardingfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Workouts(View view) {
        Intent intent = new Intent(MainActivity.this, Workouts.class);
        startActivity(intent);
    }

    public void FitnessGames(View view) {
        Intent intent = new Intent(MainActivity.this, FitnessGames.class);
        startActivity(intent);
    }

    public void Coupons(View view) {
        Intent intent = new Intent(MainActivity.this, Coupons.class);
        startActivity(intent);

    }

    public void Discounts(View view) {
        Intent intent = new Intent(MainActivity.this, Discounts.class);
        startActivity(intent);
    }
}


