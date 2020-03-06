package com.example.touristattractions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Utils.initializeAll();

        b1=(Button)findViewById(R.id.btn1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tourist();
            }
        });
    }
    public void tourist(){
        Intent intent = new Intent(this,AllPlacesActivity.class);
        startActivity(intent);
    }
}