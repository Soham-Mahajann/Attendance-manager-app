package com.example.okay;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;

import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;
import java.util.List;



public class result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        int a = 0;
        int b = 0;

        boolean[] Data = getIntent().getBooleanArrayExtra("Data");

        /*TextView display = findViewById(R.id.display);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < Data.length; i++) {
            stringBuilder.append("Element ").append(i+1).append(": ").append(Data[i]).append("\n");
        }

        display.setText(stringBuilder.toString());

         */

        TextView presentno = findViewById(R.id.presentno);
        StringBuilder presentNumbersBuilder = new StringBuilder();

        for (int j = 0; j < Data.length; j++) {
            // Check if the value at index i is true (representing present)
            if (Data[j]) {
                // Append the present number to the StringBuilder
                presentNumbersBuilder.append(j+1).append(", ");
                a++;
            }
        }
        presentno.setText(presentNumbersBuilder.toString());

        TextView absentno = findViewById(R.id.absentno);
        StringBuilder absentNumbersBuilder = new StringBuilder();

        for (int k = 0; k < Data.length; k++) {
            // Check if the value at index i is true (representing present)
            if (!Data[k]) {
                // Append the present number to the StringBuilder
                absentNumbersBuilder.append(k+1).append(", ");
                b++;
            }
        }
        absentno.setText(absentNumbersBuilder.toString());





        TextView totalp = findViewById(R.id.totalp);
        totalp.setText("(Total " + a + " )");

        TextView totala = findViewById(R.id.totala);
        totala.setText("(Total " + b + " )");


        int totalStudents = a + b;

        // Find the PieChart in your layout
        PieChart pieChart = findViewById(R.id.pie_chart);

        // Create data entries for the pie chart
        List<PieEntry> entries = new ArrayList<>();
        entries.add(new PieEntry(a, "Present"));
        entries.add(new PieEntry(b, "Absent"));

        // Create a data set from the entries
        PieDataSet dataSet = new PieDataSet(entries, "Students");

        // Set colors for the data set
        dataSet.setColors(Color.rgb(128, 190, 118), Color.rgb(255, 101, 101));

        // Create pie data object from the data set
        PieData data = new PieData(dataSet);

        // Set data to the pie chart
        pieChart.setData(data);

        // Set description for the pie chart
        pieChart.getDescription().setEnabled(false);

        // Refresh the chart
        pieChart.invalidate();




    }
}