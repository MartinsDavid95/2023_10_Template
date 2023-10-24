package com.samuelvialle.todel_template;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.samuelvialle.todel_template.a01_layout.L01_LinearActivity;
import com.samuelvialle.todel_template.a01_layout.L02_FrameActivity;
import com.samuelvialle.todel_template.a01_layout.L03_RelativeActivity;
import com.samuelvialle.todel_template.a03_animation.A01_LoadingActivity;
import com.samuelvialle.todel_template.a03_animation.A02_SimpsonActivity;
import com.samuelvialle.todel_template.a04_list.S01_ListViewActivity;

public class HomeActivity extends AppCompatActivity {

    private static final String TAG = "HomeActivity";

    public void pushedButton(View view) throws ClassNotFoundException {
        // Récupération des informations pour la gestion du clic sur les boutons
        // Quel bouton vient d'être pressé dans la vue ?
        Button button = (Button) view;
        // Son texte pour l'affecté au titre l'activité de destination avec putExtra
        String buttonTitle = button.getText().toString();
        // Son tag pour créer la chaîne de caractère de la classe de destination
        String buttonTag = button.getTag().toString();
        // Pour transformer un String en class il faut le nom complet du package donc
        String destinationActivity = "com.samuelvialle.todel_template." + buttonTag;
        // Transformation du string nomClasseDestination en classe pour l'injecter dans l'intent
        Class destination = Class.forName(destinationActivity);

        Intent intent = new Intent(HomeActivity.this, destination);

        startActivity(intent);





    }

    /** Life Cycles */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


    }
}