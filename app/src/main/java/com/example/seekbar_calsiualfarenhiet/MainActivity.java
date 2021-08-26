package com.example.seekbar_calsiualfarenhiet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //ProgressBar progressBar;
    SeekBar seekBar;
    TextView cal,farhn,count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        progressBar=findViewById(R.id.progressBar);
        seekBar=(SeekBar) findViewById(R.id.seekBar);
        cal=(TextView) findViewById(R.id.cal);
        farhn=(TextView) findViewById(R.id.farhen);
        count=(TextView) findViewById(R.id.count);

        seekBar.setMax(50);


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

              //  progressBar.setProgress(progress);
                count.setText(progress+"%");
                //Toast.makeText(MainActivity.this, "ProgresBar Lenght "+progress, Toast.LENGTH_SHORT).show();

              int res =((progress*9)/5)+32;
              farhn.setText("farenhiet = "+res);


              int res1=((progress-32)*5)/9;
              cal.setText("Calsius is "+res1);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}