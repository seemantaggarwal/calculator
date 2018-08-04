package com.seemantaggarwal.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvdisplay;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnadd,btnmul,btndiv,btnsub,btnclear,btnback,btneq,btnper,madd,msub;
    String number,operator;
    float num1, num2,result=0,prevresult,finalresult;
    public float seemant() {
        if(result!=0)
            prevresult=result;
        if (operator == "+") {
            num2 = Float.valueOf(number);
            result = num1 + num2;
        } else if (operator == "-") {
            num2 = Float.valueOf(number);
            result = num1 - num2;
        }
        else if (operator == "*")
        {       num2 = Float.valueOf(number);
                result = num1 * num2;
        }
        else if (operator == "/")
        {       num2 = Float.valueOf(number);
            result = num1 / num2;
        }
        else if (operator == "%")
        {       num2 = Float.valueOf(number);
            result = num1 % num2;
        }
        return result;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvdisplay= findViewById(R.id.tvdisplay);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btn0=findViewById(R.id.btn0);
        btnadd=findViewById(R.id.btnadd);
        btnsub=findViewById(R.id.btnsub);
        btnmul=findViewById(R.id.btnmul);
        btndiv=findViewById(R.id.btndiv);
        btnclear=findViewById(R.id.btnclear);
        btnback=findViewById(R.id.btnback);
        btnper=findViewById(R.id.btnper);
        btneq=findViewById(R.id.btneq);
        msub=findViewById(R.id.msub);
        madd=findViewById(R.id.madd);
        number = "0";
        tvdisplay.setText(number);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(number =="0") {
                    number = "1";
                }
                else{
                    number += "1";
                }
                tvdisplay.setText(number);
            }

        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(number =="0") {
                    number = "2";
                }
                else{
                    number += "2";
                }
                tvdisplay.setText(number);
            }

        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(number =="0") {
                    number = "3";
                }
                else{
                    number += "3";
                }
                tvdisplay.setText(number);
            }

        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(number =="0") {
                    number = "4";
                }
                else{
                    number += "4";
                }
                tvdisplay.setText(number);
            }

        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(number =="0") {
                    number = "5";
                }
                else{
                    number += "5";
                }
                tvdisplay.setText(number);
            }

        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(number =="0") {
                    number = "6";
                }
                else{
                    number += "6";
                }
                tvdisplay.setText(number);
            }

        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(number =="0") {
                    number = "7";
                }
                else{
                    number += "7";
                }
                tvdisplay.setText(number);
            }

        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(number =="0") {
                    number = "8";
                }
                else{
                    number += "8";
                }
                tvdisplay.setText(number);
            }

        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(number =="0") {
                    number = "9";
                }
                else{
                    number += "9";
                }
                tvdisplay.setText(number);
            }

        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(number =="0") {
                    number = "0";
                }
                else{
                    number += "0";
                }
                tvdisplay.setText(number);
            }

        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Float.valueOf(number);
                number="0";
                tvdisplay.setText(String.valueOf(number));
                operator= "+";
                Toast.makeText(MainActivity.this, "addition", Toast.LENGTH_LONG).show();


            }
        });
        btnsub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
            num1 = Float.valueOf(number);
            number="0";
                tvdisplay.setText(String.valueOf(number));;
                operator= "-";
                Toast.makeText(MainActivity.this, "subtract", Toast.LENGTH_LONG).show();


        }
    });
        btnmul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                num1 = Float.valueOf(number);
                number="0";
                tvdisplay.setText(String.valueOf(number));
                operator= "*";
                Toast.makeText(MainActivity.this, "multiply", Toast.LENGTH_LONG).show();


            }
        });
        btndiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
            num1 = Float.valueOf(number);
            number="0";
            tvdisplay.setText(String.valueOf(number));
                operator= "/";
            Toast.makeText(MainActivity.this, "divide", Toast.LENGTH_LONG).show();


        }
    });
        btnper.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
            num1 = Float.valueOf(number);
            number="0";
            tvdisplay.setText(String.valueOf(number));
                operator= "%";
            Toast.makeText(MainActivity.this, "perc", Toast.LENGTH_LONG).show();


        }
    });


     btneq.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            finalresult=seemant();
            tvdisplay.setText(String.valueOf(finalresult));
        }
    });
        btnclear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
               number="0";
                tvdisplay.setText(String.valueOf(number));
            }
        });
        btnback.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                number=number.substring(0,number.length()-1);
                tvdisplay.setText(String.valueOf(number));
            }
        });
        madd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                finalresult=finalresult-prevresult;
                tvdisplay.setText(String.valueOf(finalresult));
            }
        });
        msub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                finalresult=finalresult+prevresult;
                tvdisplay.setText(String.valueOf(finalresult));
            }
        });
    }
}
