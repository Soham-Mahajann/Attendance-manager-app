package com.example.okay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class year extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.year);

        Button two = findViewById(R.id.two);
        two.setOnClickListener(view -> {

            Intent intent1 = new Intent (year.this, Division.class);
            startActivity(intent1);

        });

        Button three = findViewById(R.id.three);
        three.setOnClickListener(view -> {

            Intent intent1 = new Intent (year.this, Division.class);
            startActivity(intent1);

        });

        Button four = findViewById(R.id.four);
        four.setOnClickListener(view -> {

            Intent intent1 = new Intent (year.this, Division.class);
            startActivity(intent1);

        });



    }
}