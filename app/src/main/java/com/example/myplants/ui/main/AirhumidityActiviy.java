package com.example.myplants.ui.main;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myplants.R;
import com.jjoe64.graphview.DefaultLabelFormatter;
import com.jjoe64.graphview.GraphView;

public class AirhumidityActiviy extends AppCompatActivity{
    private GraphView graphView ;
    private RadioGroup radioGroup;
    private String unit;

    @Override
    protected void onStart() {
        super.onStart();
        graphView = findViewById(R.id.graphAirhumidity);
        radioGroup = findViewById(R.id.rgAirhumidity);
        this.unit = "%";

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch (checkedId){
                    case R.id.rbdayAirhumidity:
                        graphView.setScaleX(10);
                        Toast.makeText(getApplicationContext(),"checkmark clicked",Toast.LENGTH_SHORT);
                        break;
                    case R.id.rbmonthAirhumidity:
                        break;
                    case R.id.rbyearAirhumidity:
                        break;
                    default:
                        break;
                }
            }
        });
    }

    public void updateGraph()
    {
        graphView.setScaleX(10);
    }


}
