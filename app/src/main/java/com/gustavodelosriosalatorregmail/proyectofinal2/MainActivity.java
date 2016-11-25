package com.gustavodelosriosalatorregmail.proyectofinal2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button systemStartButton= (Button) findViewById(R.id.systemStartButton);
    public void goToScreen2(View view) {
        startActivity(new Intent(MainActivity.this, screenActivity2.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
