package com.example.rs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilann);
        setTitle("Tugas3 - Arif Al Farizi");
    }

    public void clickRS(View view) {
        //gambar rs di click
        Intent i = new Intent(this,RS.class);
        startActivity(i);

    }
}