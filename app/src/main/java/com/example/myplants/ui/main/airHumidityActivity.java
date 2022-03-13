package com.example.myplants.ui.main;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myplants.R;

public class airHumidityActivity extends AppCompatActivity implements View.OnClickListener{
    private LinearLayout airhumiditybox;
    private TextView airHumidityValue;

    private int count;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_main);

        airhumiditybox = (LinearLayout)findViewById(R.id.airhumidity);
        airHumidityValue = findViewById(R.id.airhumidityPercentage);

        count = 0;

        airhumiditybox.setOnClickListener(this);

    }

    public void onClick(View view) {
        Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT).show();
        switch (view.getId()) {
            case R.id.fab:
                count++;
                airHumidityValue.setText(Integer.toString(count));
                break;
            case R.id.airhumidity:
                count--;
                airHumidityValue.setText(Integer.toString(count));
                break;
            default:
                break;
        }
    }
}
