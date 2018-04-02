package com.example.ricardo.calculaarea;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private  RadioGroup radioArea;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioArea = (RadioGroup) findViewById(R.id.radioArea);

        radioArea.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                EditText base = (EditText) findViewById(R.id.base);
                EditText altura = (EditText) findViewById(R.id.altura);
                EditText raio = (EditText) findViewById(R.id.raio);
                switch(checkedId){
                    case R.id.radioCirculo:
                        base.setEnabled(false);
                        altura.setEnabled(false);
                        raio.setEnabled(true);

                        break;
                    case R.id.radioQuadrado:
                        base.setEnabled(true);
                        altura.setEnabled(true);
                        raio.setEnabled(false);
                        break;

                    case R.id.radioTriangulo:
                        base.setEnabled(true);
                        altura.setEnabled(true);
                        raio.setEnabled(false);
                        break;
                }

                if(base.length()<= 0 || altura.length() <= 0  ){




                           if(raio.length() > 0) {

                        double r = Double.parseDouble(raio.getText().toString());
                        double at = 3.14 * (r * r);
                        TextView resposta = (TextView) findViewById(R.id.resposta);
                        resposta.setText(String.valueOf(at));
                        ImageView meuImgview = (ImageView) findViewById(R.id.img);
                        meuImgview.setImageResource(R.drawable.circ);

                    }
                    else{
                               Toast.makeText(getApplicationContext(), "Por favor Preencha a área e altura ",
                                       Toast.LENGTH_SHORT).show();
                           }

                }
                else if(checkedId != R.id.radioCirculo){
                    double b = Double.parseDouble(base.getText().toString());
                    double a = Double.parseDouble(altura.getText().toString());
                    if(checkedId == R.id.radioQuadrado) {
                            double at = b * a;
                            TextView resposta = (TextView) findViewById(R.id.resposta);
                            resposta.setText(String.valueOf(at));
                        ImageView meuImgview = (ImageView) findViewById(R.id.img);
                        meuImgview.setImageResource(R.drawable.quad);
                    } else if(checkedId == R.id.radioTriangulo) {
                        double at = (b * a) /2;
                        TextView resposta = (TextView) findViewById(R.id.resposta);
                        resposta.setText(String.valueOf(at));
                        ImageView meuImgview = (ImageView) findViewById(R.id.img);
                        meuImgview.setImageResource(R.drawable.tri);
                    }
            }

            }
        });
    }
}
