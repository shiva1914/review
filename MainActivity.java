package com.example.review;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rd1,rd2;
    RadioButton r1,r2;
    EditText ed;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rd1=findViewById(R.id.rd1);
        rd2=findViewById(R.id.rd2);
        b1=findViewById(R.id.button_submit);
        ed=findViewById(R.id.ed);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r1  = findViewById(rd1.getCheckedRadioButtonId());
                String yourVote = r1.getText().toString();
                r2  = findViewById(rd2.getCheckedRadioButtonId());
                String your = r2.getText().toString();
                String edit=ed.getText().toString();
                rd1.clearCheck();
                rd2.clearCheck();
                if(edit.isEmpty()){
                    ed.setError("Empty");
                    ed.requestFocus();
                }
                else{
                    ed.setText("");
                    Toast.makeText(MainActivity.this, "successfully submitted the feedback", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
