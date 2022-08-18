package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private CheckBox newsCheckBox;
    private CheckBox termsCheckBox;
    private RadioButton maleBtn;
    private RadioButton femaleBtn;
    private ToggleButton statusToggleBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroupID);
        newsCheckBox = findViewById(R.id.newsCheckBoxID);
        termsCheckBox = findViewById(R.id.termsCheckBoxID);
        maleBtn = findViewById(R.id.maleID);
        femaleBtn = findViewById(R.id.femaleID);
        statusToggleBtn = findViewById(R.id.statusID);


        statusToggleBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    statusToggleBtn.setTextOn("Active");
                    Toast.makeText(MainActivity.this, "You are now online", Toast.LENGTH_SHORT).show();
                }else {
                    statusToggleBtn.setTextOff("InActive");
                    Toast.makeText(MainActivity.this, "You are now going offline", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    // checking a checkbox is checked or not in Java codes
    public void checkBoxChecked(View view){
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()){
            case R.id.newsCheckBoxID:
                if (checked)
                    Toast.makeText(this, "You will be receiving news updates", Toast.LENGTH_SHORT).show();
                break;
            case R.id.termsCheckBoxID:
                if (checked)
                    Toast.makeText(this, "You just agreed to our terms and conditions", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    // which radio button is selected in android studio
    public void selectedRadioButton(View view){
        boolean selected = ((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.maleID:
                if (selected)
                    Toast.makeText(this, "You are a male gender", Toast.LENGTH_SHORT).show();
                break;
            case R.id.femaleID:
                if (selected)
                    Toast.makeText(this, "You are a female gender", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    // which state is toggled in toggleButton

}