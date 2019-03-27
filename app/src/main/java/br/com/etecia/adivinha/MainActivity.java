package br.com.etecia.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

        private Button botaoJogar;
        private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boraoJogar =  findViewById(R.id.button);
        textoResultado = findViewById(R.id.text_resultado);
    }
}
