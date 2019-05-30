package com.hritik.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //storing value variable
    double temp =0;
    //input values
    double input1=0 , input2=0;
    //boolean values
    boolean add,subtract,multiply,divide;
    EditText inttext; //textbox
    //number buttons
    Button button_zero,button_one,button_two,button_three,button_four,button_five,button_six,button_seven,button_eight,button_nine;
    //funtion buttons
    Button button_clear,button_backspace,button_bracket,button_percent , button_decimal,button_divide ,button_multiply,button_subtract,button_add,button_equalto;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Connecting xml button to java
        //text button
        inttext = findViewById(R.id.inttext);
        //number buttons
        button_zero =findViewById(R.id.button_zero);
        button_one = findViewById(R.id.button_one);
        button_two = findViewById(R.id.button_two);
        button_three = findViewById(R.id.button_three);
        button_four = findViewById(R.id.button_four);
        button_five = findViewById(R.id.button_five);
        button_six = findViewById(R.id.button_six);
        button_seven = findViewById(R.id.button_seven);
        button_eight = findViewById(R.id.button_eight);
        button_nine = findViewById(R.id.button_nine);
        //function buttons
        button_clear = findViewById(R.id.button_clear);
        button_backspace = findViewById(R.id.button_backspace);
        button_bracket = findViewById(R.id.button_bracket);
        button_percent = findViewById(R.id.button_percent);
        button_decimal = findViewById(R.id.button_decimal);
        button_divide = findViewById(R.id.button_divide);
        button_multiply = findViewById(R.id.button_multiply);
        button_subtract = findViewById(R.id.button_subtract);
        button_add = findViewById(R.id.button_add);
        button_equalto = findViewById(R.id.button_equalto);


        // Functions that happen when the button is clicked.


        button_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                inttext.append("0");

            }
        });

        button_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                inttext.append("1");

            }
        });

        button_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                inttext.append("2");

            }
        });

        button_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                inttext.append("3");

            }
        });

        button_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                inttext.append("4");

            }
        });

        button_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                inttext.append("5");

            }
        });

        button_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inttext.append("6");
            }
        });

        button_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inttext.append("7");
            }
        });

        button_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inttext.append("8");
            }
        });

        button_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inttext.append("9");
            }
        });

        button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inttext.setText("");
            }
        });

        button_backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Feature Comning Soon",Toast.LENGTH_LONG).show();
            }
        });
        button_bracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Feature Comning Soon",Toast.LENGTH_LONG).show();

            }
        });

        button_percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Feature Comning Soon",Toast.LENGTH_LONG).show();

            }
        });

        button_decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inttext.append(".");
            }
        });


        button_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(inttext.getText().length()!=0)
                {
                    input1 = Float.parseFloat(inttext.getText()+"");
                    divide = true;
                    inttext.setText(null);
                }

            }
        });

        button_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inttext.getText().length()!=0)
                {
                    input1 = Float.parseFloat(inttext.getText() + "");
                    multiply = true;
                    inttext.setText(null);
                }
            }
        });

        button_subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inttext.getText().length()!=0)
                {
                    input1 = Float.parseFloat(inttext.getText() + "");
                    subtract = true;
                    inttext.setText(null);
                }
            }
        });

        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (inttext.getText().length()!=0)
                {
                    temp = Float.parseFloat(inttext.getText().toString())+temp;
                    add = true;
                    inttext.setText(null);
                }


            }
        });

        button_equalto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(add || subtract || multiply || divide)
                {
                    input2 = Float.parseFloat(inttext.getText().toString())+temp;
                }

                if(add)
                {
                    inttext.setText(input1 + input2 + "");
                    add = false;
                }

                if(subtract)
                {
                    inttext.setText(input1 - input2 + "");
                    subtract = false;
                }

                if(multiply)
                {
                    inttext.setText(input1 * input2 + "");
                    multiply = false;
                }

                if(divide)
                {

                    inttext.setText(input1/input2 + "");
                    divide = false;
                }


            }
        });

        //Disabling the keyboard in the edit text.

        inttext.setShowSoftInputOnFocus(false);




    }
}
