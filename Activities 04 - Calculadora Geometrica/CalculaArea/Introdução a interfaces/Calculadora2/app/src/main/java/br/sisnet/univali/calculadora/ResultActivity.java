package br.sisnet.univali.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultActivity extends AppCompatActivity {
        TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultado = (TextView) findViewById(R.id.resultado);
        Intent res = getIntent();
        int num = res.getIntExtra("valor", 0);
        resultado.setText(String.valueOf(num));

    }
}
