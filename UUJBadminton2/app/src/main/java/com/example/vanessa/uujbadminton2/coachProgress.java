package com.example.vanessa.uujbadminton2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;

public class coachProgress extends AppCompatActivity {

    Button btnInsert;
    EditText xInput, yInput;
    GraphView graph;
    BarGraphSeries<DataPoint> series;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coach_progress);

        btnInsert = (Button) findViewById(R.id.btnInsert);
        xInput = (EditText) findViewById(R.id.tbXVal);
        yInput = (EditText) findViewById(R.id.tbYVal);
        graph = (GraphView) findViewById(R.id.graph);
    }
}
