package com.gustavodelosriosalatorregmail.proyectofinal2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PantallaCCI extends AppCompatActivity {
    Button direcciondeprof= (Button) findViewById(R.id.direcciondeProf);
    Button profesduni=(Button) findViewById(R.id.profesduni);
    Button profesprepa=(Button) findViewById(R.id.profesprepa);



    public void goToProfesduni(View view) {
        startActivity(new Intent(PantallaCCI.this, ProfesdeProf.class));
    }

    public void goTodirecciondeprof(View view){
        startActivity(new Intent(PantallaCCI.this,DireccionProfesional.class));
    }

    public void goToprofesdeprepa(View view){
        startActivity(new Intent(PantallaCCI.this,ProfesdePrepa.class));
    }

    public void goToMap(View view){
        startActivity(new Intent(PantallaCCI.this,screenActivity2.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_cci);
    }
}
