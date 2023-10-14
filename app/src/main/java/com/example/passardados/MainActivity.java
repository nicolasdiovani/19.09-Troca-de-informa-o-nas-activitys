package com.example.passardados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText texto1;
    EditText texto2;
    Button btn_envia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.primeiratela);
        texto1=(EditText) findViewById(R.id.texto1);
        texto2=(EditText) findViewById(R.id.texto2);
        btn_envia=(Button) findViewById(R.id.bnt_enviar);

        btn_envia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,segunda_tela.class);
                intent.putExtra("key1",texto1.getText().toString());
                intent.putExtra("key2",texto2.getText().toString());
                startActivity(intent);
                finish();
            }
        });
    }
}