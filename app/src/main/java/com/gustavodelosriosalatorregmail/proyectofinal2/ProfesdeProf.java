package com.gustavodelosriosalatorregmail.proyectofinal2;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ProfesdeProf extends AppCompatActivity {
    ImageButton saladeprofs= (ImageButton) findViewById(R.id.saladeprofsbot);

    public void goToCCI3(View view) {
        startActivity(new Intent(ProfesdeProf.this, PantallaCCI.class));
    }

    @Nullable
    @Override
    public View findViewById(@IdRes int id) {
        return super.findViewById(id);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profesde_prof);
    }
}
