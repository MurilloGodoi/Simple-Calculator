package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0, btn_point, btn_convert, btn_reset;
    TextView txtresult;
    EditText ed1;
    float convert_valor, result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_point = (Button) findViewById(R.id.btn_point);
        btn_convert = (Button) findViewById(R.id.btn_convert);
        btn_reset = (Button) findViewById(R.id.btn_reset);
        txtresult = (TextView) findViewById(R.id.txtResult);
        ed1 = (EditText) findViewById(R.id.edText1);


        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "0");
                ed1.setSelection(ed1.getText().length());
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ed1.setText(ed1.getText() + "1");
                ed1.setSelection(ed1.getText().length());
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "2");
                ed1.setSelection(ed1.getText().length());
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "3");
                ed1.setSelection(ed1.getText().length());
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "4");
                ed1.setSelection(ed1.getText().length());
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "5");
                ed1.setSelection(ed1.getText().length());
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "6");
                ed1.setSelection(ed1.getText().length());
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "7");
                ed1.setSelection(ed1.getText().length());
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "8");
                ed1.setSelection(ed1.getText().length());

            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "9");
                ed1.setSelection(ed1.getText().length());
            }

        });

        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtresult.setText(null);
                ed1.setText(null);

            }
        });
        btn_point.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ed1.setText(ed1.getText() + ".");
                ed1.setSelection(ed1.getText().length());
                 }
        });
        btn_convert.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(ed1.getText().length() != 0) {

                    convert_valor = Float.parseFloat(ed1.getText().toString());
                    result = (float) (convert_valor/5.42);
                    txtresult.setText(null);
                    ed1.setText(String.valueOf(result));
                }


        }});
    }
}