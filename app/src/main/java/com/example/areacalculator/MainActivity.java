package com.example.areacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button areaOfCircle,areaOfRectangle,areaOfTriangle,areaOfSquare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        areaOfCircle=findViewById(R.id.areaOfCircle);
        areaOfRectangle=findViewById(R.id.areaOfRectange);
        areaOfSquare=findViewById(R.id.areaOfSquare);
        areaOfTriangle=findViewById(R.id.areaOfTriangle);

        Redirectors();
    }

    private void Redirectors() {
        areaOfCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,areaofcircle.class);
                startActivity(intent);
            }
        });
        areaOfTriangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, areaoftriangle.class);
                startActivity(intent);
            }
        });
        areaOfSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, areaofsquare.class);
                startActivity(intent);
            }
        });
        areaOfRectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, areaofrectangle.class);
                startActivity(intent);
            }
        });
    }
}