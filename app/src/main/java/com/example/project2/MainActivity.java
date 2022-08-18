package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
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
}