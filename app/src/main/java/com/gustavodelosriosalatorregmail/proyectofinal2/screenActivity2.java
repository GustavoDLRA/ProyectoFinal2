package com.gustavodelosriosalatorregmail.proyectofinal2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class screenActivity2 extends AppCompatActivity {
    Button cci=(Button) findViewById(R.id.cci);
    Button ccd=(Button) findViewById(R.id.ccd);
    Button aulas1=(Button) findViewById(R.id.aulas1);
    Button aulas2=(Button) findViewById(R.id.aulas2);
    Button aulas3=(Button) findViewById(R.id.aulas3);
    Button cafedegas=(Button) findViewById(R.id.cafe_degas);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
    }
    public void goToPantallaCCI(View view) {
        startActivity(new Intent(screenActivity2.this, PantallaCCI.class));}

    public void gotoPantallaCCD(View view){
        startActivity(new Intent(screenActivity2.this,PantallaCCD.class));
    }
    public void gotoPantallaCafe(View view){
        startActivity(new Intent(screenActivity2.this,PantallaCafe.class));
    }
    public  void gotoPantallaaulas1(View view){
        startActivity(new Intent(screenActivity2.this, PantallaAulas1.class));
    }
}
