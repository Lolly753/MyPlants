package com.example.myplants;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myplants.ui.main.SectionsPagerAdapter;
import com.example.myplants.databinding.ActivityMainBinding;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding binding;
    private TextView humidityValue;
    private FloatingActionButton fab;

    private LinearLayout soilhumiditybox;
    private LinearLayout airhumiditybox;
    private TextView airHumidityValue;
    private int count;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_main);

        soilhumiditybox = findViewById(R.id.soilhumidity);
        soilhumiditybox.setOnClickListener(this);

        airhumiditybox  = findViewById(R.id.airhumidity);
        airhumiditybox.setOnClickListener(this);

        airHumidityValue = findViewById(R.id.airhumidityPercentage);
        count = 0;

    }

    public void onClick(View view) {
        Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT).show();
        switch (view.getId()) {
            case R.id.soilhumidity:
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


