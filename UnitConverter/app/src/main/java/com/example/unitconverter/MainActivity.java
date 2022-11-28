package com.example.unitconverter;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView title,path,signvalue,showvalue;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        Configuration configuration = new Configuration();
        int currentNightMode = configuration.uiMode & Configuration.UI_MODE_NIGHT_MASK;
        switch (currentNightMode) {
            case Configuration.UI_MODE_NIGHT_NO:
                // Night mode is not active, we're using the light theme
                break;
            case Configuration.UI_MODE_NIGHT_YES:
                // Night mode is active, we're using dark theme
                break;
        }


        title = findViewById(R.id.title);
        path = findViewById(R.id.path);
        showvalue = findViewById(R.id.showvalue);
        signvalue = findViewById(R.id.signvalue);

        editText = findViewById(R.id.editTextNumber);

        btn = findViewById(R.id.button);
        ActionBar actionBar =getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ConvertmetertoKilo();
            }
        });
    }

    private void ConvertmetertoKilo() {

        String valueinmeter = editText.getText().toString();

        double meter = Double.parseDouble(valueinmeter);
        double kilo = meter/ 1000;

        showvalue.setText("" + kilo);

    }
}