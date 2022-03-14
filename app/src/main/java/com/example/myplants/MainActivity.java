package com.example.myplants;

import android.os.Bundle;

import com.example.myplants.ui.main.AirhumidityActiviy;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.annotation.MainThread;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.jjoe64.graphview.GraphView;
import com.example.myplants.ui.main.SectionsPagerAdapter;
import com.example.myplants.databinding.ActivityMainBinding;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout soilhumiditybox;
    private LinearLayout airhumiditybox;
    private LinearLayout temperaturebox;
    private LinearLayout brightnessbox;

    private GraphView graphAirHumidity;


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        initializeViews();
    }


    @Override
    @MainThread
    public void onBackPressed()
    {
        initializeViews();
    }

    public void onClick(View view) {
        Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT).show();
        switch (view.getId()) {
            case R.id.airhumidity:
                setContentView(R.layout.airhumidity_layout);
                graphAirHumidity = findViewById(R.id.graphAirhumidity);
                break;
            case R.id.soilhumidity:
                setContentView(R.layout.soilhumidity_layout);
                break;
            case R.id.temperature:
                setContentView(R.layout.temperature_layout);
                break;
            case R.id.brightness:
                setContentView(R.layout.brightness_layout);
            default:
                break;
        }
    }

    private void initializeViews() {
        setContentView(R.layout.fragment_main);

        soilhumiditybox = findViewById(R.id.soilhumidity);
        soilhumiditybox.setOnClickListener(this);

        airhumiditybox  = findViewById(R.id.airhumidity);
        airhumiditybox.setOnClickListener(this);

        temperaturebox = findViewById(R.id.temperature);
        temperaturebox.setOnClickListener(this);

        brightnessbox = findViewById(R.id.brightness);
        brightnessbox.setOnClickListener(this);
    }
}


