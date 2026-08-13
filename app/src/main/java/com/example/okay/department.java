package com.example.okay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class department extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.department);

        Button cs = findViewById(R.id.cs);
        cs.setOnClickListener(view -> {

            Intent intent1 = new Intent (department.this, year.class);
            startActivity(intent1);
        });

        Button it = findViewById(R.id.it);
        it.setOnClickListener(view -> {

            Intent intent1 = new Intent (department.this, year.class);
            startActivity(intent1);
        });

        Button entc = findViewById(R.id.entc);
        entc.setOnClickListener(view -> {

            Intent intent1 = new Intent (department.this, year.class);
            startActivity(intent1);
        });

        Button aids = findViewById(R.id.aids);
        aids.setOnClickListener(view -> {

            Intent intent1 = new Intent (department.this, year.class);
            startActivity(intent1);
        });

        Button mech = findViewById(R.id.mech);
        mech.setOnClickListener(view -> {

            Intent intent1 = new Intent (department.this, year.class);
            startActivity(intent1);
        });

        Button civi = findViewById(R.id.civi);
        civi.setOnClickListener(view -> {

            Intent intent1 = new Intent (department.this, year.class);
            startActivity(intent1);
        });
    }
}