package com.example.okay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Division extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.division);


        Button a = findViewById(R.id.a);
        a.setOnClickListener(view -> {

            Intent intent1 = new Intent (Division.this, attendance.class);
            startActivity(intent1);

        });

        Button b = findViewById(R.id.b);
        b.setOnClickListener(view -> {

            Intent intent1 = new Intent (Division.this, attendance.class);
            startActivity(intent1);

        });

        Button c = findViewById(R.id.c);
        c.setOnClickListener(view -> {

            Intent intent1 = new Intent (Division.this, attendance.class);
            startActivity(intent1);

        });
    }
}