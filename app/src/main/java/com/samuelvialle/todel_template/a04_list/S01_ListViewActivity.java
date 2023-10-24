package com.samuelvialle.todel_template.a04_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.samuelvialle.todel_template.R;

public class S01_ListViewActivity extends AppCompatActivity {

    private ListView lvListView;

    /** Méthode 1 avec un tableau dans le java ;) */
    private String[] stagiaires = new String[]{
          "David 1", "Naoufel", "Stanlenes", "Laureline", "Nadia",
          "Didier", "Simon", "Rima", "David 2", "Naziha", "Jérôme",
          "Ali", "Khadim", "Naoufel", "Stanlenes", "Laureline", "Nadia",
            "Didier", "Simon", "Rima", "David 2", "Naziha", "Jérôme",
            "Ali", "Khadim", "Naoufel", "Stanlenes", "Laureline", "Nadia",
            "Didier", "Simon", "Rima", "David 2", "Naziha", "Jérôme",
            "Ali", "Khadim", "Naoufel", "Stanlenes", "Laureline", "Nadia",
            "Didier", "Simon", "Rima", "David 2", "Naziha", "Jérôme",
            "Ali", "Khadim"
    };

    public void populateListView(){
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(
          //le contexte    la mise en forme           les données à afficher
          this, android.R.layout.simple_list_item_activated_1, stagiaires);

        lvListView.setAdapter(adapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_s01_list_view);

        lvListView = findViewById(R.id.lv_listview);
        populateListView();
    }
}