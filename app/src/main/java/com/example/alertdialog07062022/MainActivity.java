package com.example.alertdialog07062022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FastFood fastFood = new FastFood.BuilderFood()
                .setDesserts(Desserts.CREAM_BALL)
                .setDrinks(Drinks.COFFEE)
                .build();

        Log.d("BBBB", fastFood.toString());
    }
}
