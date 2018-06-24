package com.example.sabe.findmyage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText etDOB;
    TextView tvShowAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etDOB = (EditText) findViewById(R.id.etDOB);
        tvShowAge = (TextView) findViewById(R.id.tvShowAge);
    }

    public void buFindAge(View view) {
        int DOB = Integer.parseInt(etDOB.getText().toString());
        // get device current time
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int age = year - DOB;
        tvShowAge.setText("Your age is: " + age);
    }
}
