package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button xmlBtn = findViewById(R.id.xmlAnimation);
        xmlBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, XmlAnimationActivity.class);
                startActivity(intent);
            }
        });

        Button viewBtn = findViewById(R.id.viewAnimation);
        viewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ViewAnimationActivity.class);
                startActivity(intent);
            }
        });

        Button drawableBtn = findViewById(R.id.drawableAnimation);
        drawableBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DrawableAnimationActivity.class);
                startActivity(intent);
            }
        });
    }
}