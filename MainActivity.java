package com.example.project_003;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnclick(View v)
    {
        double vol1, time1, flow1;
        EditText volume_1, time_1, flow_1;

        volume_1 = (EditText) findViewById(R.id.volume_1);
        time_1 = (EditText) findViewById(R.id.time_1);
        flow_1 = (EditText) findViewById(R.id.flow_1);

        vol1 = Double.parseDouble(volume_1.getText().toString());
        time1 = Double.parseDouble(time_1.getText().toString());
        flow1 = vol1 / time1;
        flow_1.setText(String.valueOf(flow1));

    }
}