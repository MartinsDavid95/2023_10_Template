package com.samuelvialle.todel_template;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.samuelvialle.todel_template.a01_layout.L01_LinearActivity;
import com.samuelvialle.todel_template.a01_layout.L02_FrameActivity;
import com.samuelvialle.todel_template.a01_layout.L03_RelativeActivity;
import com.samuelvialle.todel_template.a03_animation.A01_LoadingActivity;
import com.samuelvialle.todel_template.a03_animation.A02_SimpsonActivity;
import com.samuelvialle.todel_template.a04_list.S01_ListViewActivity;

public class HomeActivity extends AppCompatActivity {
    /** Personal **/
    // 1 Variables globales
    Button btnLinearLayout, btnFrameLayout, btnRelativeLayout;
    Button btnAnimationLoading, btnAnimationSimpson;
    Button btnListView, btnSpinner;

    // 2 Méthode init pour l'inititalisation des widgets
    public void initUI(){
        btnLinearLayout = findViewById(R.id.btn_linear_layout);
        btnFrameLayout = findViewById(R.id.btn_frame_layout);
        btnRelativeLayout = findViewById(R.id.btn_relative_layout);
        btnAnimationLoading = findViewById(R.id.btn_animation_loading);
        btnAnimationSimpson = findViewById(R.id.btn_animation_simpson);
        btnListView = findViewById(R.id.btn_list_view);
        btnSpinner = findViewById(R.id.btn_spinner);
    }

    // 4 Méthode pour la gestion du bouton LinearLayout
    public void setBtnLinearLayout(){
        btnLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, L01_LinearActivity.class));
            }
        });
    }

    public void setBtnFrameLayout(){
        btnFrameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, L02_FrameActivity.class));
            }
        });
    }
 public void setBtnRelativeLayout(){
        btnRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, L03_RelativeActivity.class));
            }
        });
    }

    public void setBtnAnimationLoading(){
        btnAnimationLoading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, A01_LoadingActivity.class));
            }
        });
    }

    public void setBtnAnimationSimpson(){
        btnAnimationSimpson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, A02_SimpsonActivity.class));
            }
        });
    }

    public void setBtnListView(){
        btnListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, S01_ListViewActivity.class));
            }
        });
    }
    public void setBtnSpinner(){
        btnSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, S01_ListViewActivity.class));
            }
        });
    }


    /** Life Cycles */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initUI(); // 3 Appel de la méthode
        setBtnLinearLayout(); // 5 Appel de la méthode
        setBtnFrameLayout();
        setBtnRelativeLayout();
        setBtnAnimationLoading();
        setBtnAnimationSimpson();
        setBtnListView();
        setBtnSpinner();
    }
}