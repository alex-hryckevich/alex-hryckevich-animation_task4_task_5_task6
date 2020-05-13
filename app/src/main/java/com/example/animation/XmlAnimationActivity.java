package com.example.animation;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class XmlAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        setContentView(R.layout.activity_xmlanimation);

        final ImageView ricksPortal = (ImageView) findViewById(R.id.imageView);
        final Animation portalAnimation = AnimationUtils.loadAnimation(this, R.anim.scaling);

        ricksPortal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ricksPortal.startAnimation(portalAnimation);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == android.R.id.home)
        {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}