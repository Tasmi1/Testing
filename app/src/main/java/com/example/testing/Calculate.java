package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculate extends AppCompatActivity {

    private TextView tvappname;
    private EditText etfirstno, etsecondno;
    private Button btnsum, btnsub, btndiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);


        etfirstno = findViewById(R.id.etfirstno);
        etsecondno = findViewById(R.id.etsecondno);
        btnsum = findViewById(R.id.btnSum);

        btnsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Add();

            }
        });
    }

    private  void Add()
    {
        float first = Float.parseFloat(etfirstno.getText().toString());
        float second = Float.parseFloat(etsecondno.getText().toString());
        Arithematic arithematic = new Arithematic();

        float result = arithematic.add(first, second);

        Intent intent = new Intent(Calculate.this, MainActivity.class);
        intent.putExtra("result",result);
        startActivity(intent);
    }
}
