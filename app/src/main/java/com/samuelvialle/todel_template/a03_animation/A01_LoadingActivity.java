package com.samuelvialle.todel_template.a03_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.samuelvialle.todel_template.R;

public class A01_LoadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a01_loading);

        // On fait le lien entre vue et code
        ImageView ivLoading = findViewById(R.id.iv_loading);
        // On anime l'image
        // On fait un fade pour faire apparaitre notre image et
        // on la fait tourner en même temps
        ivLoading.animate().alpha( 1).rotation(3600).setDuration(2000);
    }
}