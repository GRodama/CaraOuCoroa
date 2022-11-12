package com.example.caraorcoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Resultado extends AppCompatActivity {

    private ImageView imageResultado;
    private ImageButton botaovoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imageResultado = findViewById(R.id.imageResultado);
        botaovoltar = findViewById(R.id.imageVoltar);

        //recuperar dados
        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        if (numero == 0){
        imageResultado.setImageResource(R.drawable.moeda_coroa);
        }else {
            imageResultado.setImageResource(R.drawable.moeda_cara);
        }

    botaovoltar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            finish();
        }
    });



    }
}