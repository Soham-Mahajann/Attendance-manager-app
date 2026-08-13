package com.example.okay;

import androidx.appcompat.app.AppCompatActivity;


import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;




public class attendance extends AppCompatActivity {

    public boolean colorChanged = false;
    public boolean colorChanged1 = false;
    public boolean colorChanged2 = false;
    public boolean colorChanged3 = false;
    public boolean colorChanged4 = false;
    public boolean colorChanged5 = false;
    public boolean colorChanged6 = false;
    public boolean colorChanged7 = false;
    public boolean colorChanged8 = false;
    public boolean colorChanged9 = false;
    public boolean colorChanged10 = false;
    public boolean colorChanged11= false;
    public boolean colorChanged12= false;
    public boolean colorChanged13= false;
    public boolean colorChanged14= false;
    public boolean colorChanged15= false;
    public boolean colorChanged16= false;
    public boolean colorChanged17= false;
    public boolean colorChanged18 = false;
    public boolean colorChanged19= false;
    public boolean colorChanged20= false;
    public boolean colorChanged21= false;
    public boolean colorChanged22= false;
    public boolean colorChanged23= false;
    public boolean colorChanged24= false;
    public boolean colorChanged25= false;
    public boolean colorChanged26= false;
    public boolean colorChanged27= false;
    public boolean colorChanged28 = false;
    public boolean colorChanged29 = false;
    public boolean colorChanged30= false;




    boolean[] Data = new boolean[30];











    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attendance);


        for (int i = 0; i < 30; i++) { // Use the size directly
            Data[i] = false;
        }


        Button save = findViewById(R.id.save);
        save.setOnClickListener(view -> {

            Intent intent1 = new Intent(attendance.this, result.class);

            intent1.putExtra("Data", Data);

            startActivity(intent1);

        });


        Button one = findViewById(R.id.one);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (colorChanged1) {
                    // Change to default color
                    one.setBackgroundResource(R.drawable.buttons);
                } else {
                    // Change to new color
                    one.setBackgroundResource(R.drawable.buttonsp);
                }
                colorChanged1 = !colorChanged1;
                Data[0] = !Data[0];
            }
        });

        Button two = findViewById(R.id.two);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (colorChanged2) {
                    // Change to default color
                    two.setBackgroundResource(R.drawable.buttons);
                } else {
                    // Change to new color
                    two.setBackgroundResource(R.drawable.buttonsp);
                }
                colorChanged2 = !colorChanged2;
                Data[1] = !Data[1];
            }
        });

        Button three = findViewById(R.id.three);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (colorChanged3) {
                    // Change to default color
                    three.setBackgroundResource(R.drawable.buttons);
                } else {
                    // Change to new color
                    three.setBackgroundResource(R.drawable.buttonsp);
                }
                colorChanged3 = !colorChanged3;
                Data[2] = !Data[2];
            }
        });

        Button four = findViewById(R.id.four);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (colorChanged4) {
                    // Change to default color
                    four.setBackgroundResource(R.drawable.buttons);
                } else {
                    // Change to new color
                    four.setBackgroundResource(R.drawable.buttonsp);
                }
                colorChanged4 = !colorChanged4;
                Data[3] = !Data[3];
            }
        });

        Button five = findViewById(R.id.five);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (colorChanged5) {
                    // Change to default color
                    five.setBackgroundResource(R.drawable.buttons);
                } else {
                    // Change to new color
                    five.setBackgroundResource(R.drawable.buttonsp);
                }
                colorChanged5 = !colorChanged5;
                Data[4] = !Data[4];
            }
        });

        //2nd line


        Button six = findViewById(R.id.six);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (colorChanged6) {
                    // Change to default color
                    six.setBackgroundResource(R.drawable.buttons);
                } else {
                    // Change to new color
                    six.setBackgroundResource(R.drawable.buttonsp);
                }
                colorChanged6 = !colorChanged6;
                Data[5] = !Data[5];
            }
        });

        Button seven = findViewById(R.id.seven);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (colorChanged7) {
                    // Change to default color
                    seven.setBackgroundResource(R.drawable.buttons);
                } else {
                    // Change to new color
                    seven.setBackgroundResource(R.drawable.buttonsp);
                }
                colorChanged7 = !colorChanged7;
                Data[6] = !Data[6];
            }
        });



        Button eight = findViewById(R.id.eight);

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (colorChanged8) {
                    // Change to default color
                    eight.setBackgroundResource(R.drawable.buttons);
                } else {
                    // Change to new color
                    eight.setBackgroundResource(R.drawable.buttonsp);
                }
                colorChanged8= !colorChanged8;
                Data[7] = !Data[7];
            }
        });





        Button nine = findViewById(R.id.nine);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (colorChanged9) {
                    // Change to default color
                    nine.setBackgroundResource(R.drawable.buttons);
                } else {
                    // Change to new color
                    nine.setBackgroundResource(R.drawable.buttonsp);
                }
                colorChanged9 = !colorChanged9;
                Data[8] = !Data[8];
            }
        });

        Button ten = findViewById(R.id.ten);
        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (colorChanged10) {
                    // Change to default color
                    ten.setBackgroundResource(R.drawable.buttons);
                } else {
                    // Change to new color
                    ten.setBackgroundResource(R.drawable.buttonsp);
                }
                colorChanged10 = !colorChanged10;
                Data[9] = !Data[9];
            }
        });






        // 3rd line



        Button eleven = findViewById(R.id.eleven);
        eleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (colorChanged11) {
                    // Change to default color
                    eleven.setBackgroundResource(R.drawable.buttons);
                } else {
                    // Change to new color
                    eleven.setBackgroundResource(R.drawable.buttonsp);
                }
                colorChanged11 = !colorChanged11;
                Data[10] = !Data[10];
            }
        });

        Button twelve = findViewById(R.id.twelve);
        twelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (colorChanged12) {
                    // Change to default color
                    twelve.setBackgroundResource(R.drawable.buttons);
                } else {
                    // Change to new color
                    twelve.setBackgroundResource(R.drawable.buttonsp);
                }
                colorChanged12 = !colorChanged12;
                Data[11] = !Data[11];
            }
        });

        Button thirteen = findViewById(R.id.thirteen);
        thirteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (colorChanged13) {
                    // Change to default color
                    thirteen.setBackgroundResource(R.drawable.buttons);
                } else {
                    // Change to new color
                    thirteen.setBackgroundResource(R.drawable.buttonsp);
                }
                colorChanged13 = !colorChanged13;
                Data[12] = !Data[12];
            }
        });

        Button fourteen = findViewById(R.id.fourteen);
        fourteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (colorChanged14) {
                    // Change to default color
                    fourteen.setBackgroundResource(R.drawable.buttons);
                } else {
                    // Change to new color
                    fourteen.setBackgroundResource(R.drawable.buttonsp);
                }
                colorChanged14 = !colorChanged14;
                Data[13] = !Data[13];
            }
        });

        Button fifteen = findViewById(R.id.fifteen);
        fifteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (colorChanged15) {
                    // Change to default color
                    fifteen.setBackgroundResource(R.drawable.buttons);
                } else {
                    // Change to new color
                    fifteen.setBackgroundResource(R.drawable.buttonsp);
                }
                colorChanged15 = !colorChanged15;
                Data[14] = !Data[14];
            }
        });







// II


        Button sixteen = findViewById(R.id.sixteen);
        sixteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (colorChanged16) {
                    // Change to default color
                    sixteen.setBackgroundResource(R.drawable.buttons);
                } else {
                    // Change to new color
                    sixteen.setBackgroundResource(R.drawable.buttonsp);
                }
                colorChanged16 = !colorChanged16;
                Data[15] = !Data[15];
            }
        });

        Button seventeen = findViewById(R.id.seventeen);
        seventeen.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                if (colorChanged17) {
                    // Change to default color
                    seventeen.setBackgroundResource(R.drawable.buttons);
                } else {
                    // Change to new color
                    seventeen.setBackgroundResource(R.drawable.buttonsp);
                }
                colorChanged17 = !colorChanged17;
                Data[16] = !Data[16];
            }
        });

        Button eighteen = findViewById(R.id.eighteen);
        eighteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (colorChanged18) {
                    // Change to default color
                    eighteen.setBackgroundResource(R.drawable.buttons);
                } else {
                    // Change to new color
                    eighteen.setBackgroundResource(R.drawable.buttonsp);
                }
                colorChanged18 = !colorChanged18;
                Data[17] = !Data[17];
            }
        });

        Button nineteen = findViewById(R.id.nineteen);
        nineteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (colorChanged19) {
                    // Change to default color
                    nineteen.setBackgroundResource(R.drawable.buttons);
                } else {
                    // Change to new color
                    nineteen.setBackgroundResource(R.drawable.buttonsp);
                }
                colorChanged19 = !colorChanged19;
                Data[18] = !Data[18];
            }
        });

        Button twenty = findViewById(R.id.twenty);
        twenty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (colorChanged20) {
                    // Change to default color
                    twenty.setBackgroundResource(R.drawable.buttons);
                } else {
                    // Change to new color
                    twenty.setBackgroundResource(R.drawable.buttonsp);
                }
                colorChanged20 = !colorChanged20;
                Data[19] = !Data[19];
            }
        });

        //2nd line


        Button tone = findViewById(R.id.tone);
        tone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (colorChanged21) {
                    // Change to default color
                    tone.setBackgroundResource(R.drawable.buttons);
                } else {
                    // Change to new color
                    tone.setBackgroundResource(R.drawable.buttonsp);
                }
                colorChanged21 = !colorChanged21;
                Data[20] = !Data[20];
            }
        });

        Button ttwo = findViewById(R.id.ttwo);
        ttwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (colorChanged22) {
                    // Change to default color
                    ttwo.setBackgroundResource(R.drawable.buttons);
                } else {
                    // Change to new color
                    ttwo.setBackgroundResource(R.drawable.buttonsp);
                }
                colorChanged22 = !colorChanged22;
                Data[21] = !Data[21];
            }
        });

        Button tthree = findViewById(R.id.tthree);
        tthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (colorChanged23) {
                    // Change to default color
                    tthree.setBackgroundResource(R.drawable.buttons);
                } else {
                    // Change to new color
                    tthree.setBackgroundResource(R.drawable.buttonsp);
                }
                colorChanged23= !colorChanged23;
                Data[22] = !Data[22];
            }
        });

        Button tfour = findViewById(R.id.tfour);
        tfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (colorChanged24) {
                    // Change to default color
                    tfour.setBackgroundResource(R.drawable.buttons);
                } else {
                    // Change to new color
                    tfour.setBackgroundResource(R.drawable.buttonsp);
                }
                colorChanged24 = !colorChanged24;
                Data[23] = !Data[23];
            }
        });

        Button tfive = findViewById(R.id.tfive);
        tfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (colorChanged25) {
                    // Change to default color
                    tfive.setBackgroundResource(R.drawable.buttons);
                } else {
                    // Change to new color
                    tfive.setBackgroundResource(R.drawable.buttonsp);
                }
                colorChanged25 = !colorChanged25;
                Data[24] = !Data[24];
            }
        });






        // 3rd line



        Button tsix = findViewById(R.id.tsix);
        tsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (colorChanged26) {
                    // Change to default color
                    tsix.setBackgroundResource(R.drawable.buttons);
                } else {
                    // Change to new color
                    tsix.setBackgroundResource(R.drawable.buttonsp);
                }
                colorChanged26 = !colorChanged26;
                Data[25] = !Data[25];
            }
        });

        Button tseven = findViewById(R.id.tseven);
        tseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (colorChanged27) {
                    // Change to default color
                    tseven.setBackgroundResource(R.drawable.buttons);
                } else {
                    // Change to new color
                    tseven.setBackgroundResource(R.drawable.buttonsp);
                }
                colorChanged27 = !colorChanged27;
                Data[26] = !Data[26];
            }
        });

        Button teight = findViewById(R.id.teight);
        teight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (colorChanged28) {
                    // Change to default color
                    teight.setBackgroundResource(R.drawable.buttons);
                } else {
                    // Change to new color
                    teight.setBackgroundResource(R.drawable.buttonsp);
                }
                colorChanged28 = !colorChanged28;
                Data[27] = !Data[27];
            }
        });

        Button tnine = findViewById(R.id.tnine);
        tnine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (colorChanged29) {
                    // Change to default color
                    tnine.setBackgroundResource(R.drawable.buttons);
                } else {
                    // Change to new color
                    tnine.setBackgroundResource(R.drawable.buttonsp);
                }
                colorChanged29 = !colorChanged29;
                Data[28] = !Data[28];
            }
        });

        Button thirty = findViewById(R.id.thirty);
        thirty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (colorChanged30) {
                    // Change to default color
                    thirty.setBackgroundResource(R.drawable.buttons);
                } else {
                    // Change to new color
                    thirty.setBackgroundResource(R.drawable.buttonsp);
                }
                colorChanged30 = !colorChanged30;
                Data[29] = !Data[29];
            }
        });




        }
}








