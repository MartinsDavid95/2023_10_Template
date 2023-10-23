package com.samuelvialle.todel_template;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.samuelvialle.todel_template.a01_layout.L01_LinearActivity;
import com.samuelvialle.todel_template.a01_layout.L02_FrameActivity;
import com.samuelvialle.todel_template.a01_layout.L03_RelativeActivity;

public class HomeActivity extends AppCompatActivity {
    /** Personal **/
    // 1 Variables globales
    Button btnLinearLayout, btnFrameLayout, btnRelativeLayout;

    // 2 Méthode init pour l'inititalisation des widgets
    public void initUI(){
        btnLinearLayout = findViewById(R.id.btn_linear_layout);
        btnFrameLayout = findViewById(R.id.btn_frame_layout);
        btnRelativeLayout = findViewById(R.id.btn_relative_layout);
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

    /** Life Cycles */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initUI(); // 3 Appel de la méthode
        setBtnLinearLayout(); // 5 Appel de la méthode
        setBtnFrameLayout();
        setBtnRelativeLayout();
    }
}