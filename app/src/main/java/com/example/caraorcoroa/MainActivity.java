package com.example.caraorcoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageButton buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    buttonEnviar = findViewById(R.id.buttonJogar);

    buttonEnviar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        Intent intent = new Intent(getApplicationContext(), Resultado.class);//1 Comando para abrir segunda activity


        //Passar dados para a proxima tela

        int numero = new Random().nextInt(2); // gerar numero random (1 e 2)
        intent.putExtra("numero", numero);
        startActivity(intent); //2 Comando para abrir segunda activity




    }
});

    }
}