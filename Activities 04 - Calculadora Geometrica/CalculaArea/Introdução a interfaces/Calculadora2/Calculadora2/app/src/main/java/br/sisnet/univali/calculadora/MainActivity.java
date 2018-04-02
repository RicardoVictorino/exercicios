package br.sisnet.univali.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    double result;
    EditText num1, num2;
    Button sum, subtract, divide, multiply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Values
        num1 = (EditText) findViewById(R.id.eT1);
        num2 = (EditText) findViewById(R.id.eT2);

        //Actions
        sum = (Button) findViewById(R.id.btnSum);
        subtract = (Button) findViewById(R.id.btnSubtract);
        divide = (Button) findViewById(R.id.btnDivide);
        multiply = (Button) findViewById(R.id.btnMultiply);


        //Sum values rslt
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.length() == 0 || num2.length() == 0) {
                    Toast.makeText(MainActivity.this, "Informe valoeres nos campos", Toast.LENGTH_SHORT).show();
                } else {
                    double n1 = Double.parseDouble(num1.getText().toString());
                    double n2 = Double.parseDouble(num2.getText().toString());
                    Calculator calculator = new Calculator(n1, n2);
                    result = calculator.sum();
                    int result_sum = (int) result;
                    if (result_sum >= 0) {
                        Toast.makeText(MainActivity.this, "O resultado da soma é  " + result_sum, Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                        intent.putExtra("valor", result_sum);
                        startActivity(intent);
                    } else {
                        Toast.makeText(MainActivity.this, "coloque alguem numero" + result_sum, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });


        //Subtract values rslt
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.length() == 0 || num2.length() == 0) {
                    Toast.makeText(MainActivity.this, "Informe valoeres nos campos", Toast.LENGTH_SHORT).show();

                } else {

                    double n1 = Double.parseDouble(num1.getText().toString());
                    double n2 = Double.parseDouble(num2.getText().toString());
                    Calculator calculator = new Calculator(n1, n2);
                    result = calculator.subtract();
                    int result_sub = (int) result;
                    Toast.makeText(MainActivity.this, "O resultado da subtração é  " + result_sub, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                    intent.putExtra("valor", result_sub);
                    startActivity(intent);
                }
            }
        });


        //Divide values rslt
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (num1.length() == 0 || num2.length() == 0) {
                    Toast.makeText(MainActivity.this, "Informe valoeres nos campos", Toast.LENGTH_SHORT).show();
                } else {

                    double n1 = Double.parseDouble(num1.getText().toString());
                    double n2 = Double.parseDouble(num2.getText().toString());
                    Calculator calculator = new Calculator(n1, n2);
                    result = calculator.divide();
                    int result_divi = (int) result;
                    if (n1 == 0 || n2 == 0) {
                        Toast.makeText(MainActivity.this, "Não é possivel dividir por 0 ", Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                        intent.putExtra("valor", result_divi);
                        startActivity(intent);
                    } else {
                        Toast.makeText(MainActivity.this, "O resultado da divisão é  " + result_divi, Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                        intent.putExtra("valor", result_divi);
                        startActivity(intent);
                    }
                }
            }
        });

        //Multiply values rslt
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (num1.length() == 0 || num2.length() == 0) {
                    Toast.makeText(MainActivity.this, "Informe valoeres nos campos", Toast.LENGTH_SHORT).show();
                } else {

                    double n1 = Double.parseDouble(num1.getText().toString());
                    double n2 = Double.parseDouble(num2.getText().toString());
                    Calculator calculator = new Calculator(n1, n2);
                    result = calculator.multiply();
                    int result_mult = (int) result;
                    //Toast.makeText(MainActivity.this, "O resultado da multiplicação é  " + result_mult, Toast.LENGTH_SHORT).show();



                    Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                    intent.putExtra("valor", result_mult);
                    startActivity(intent);

                }
            }
        });
    }
}
