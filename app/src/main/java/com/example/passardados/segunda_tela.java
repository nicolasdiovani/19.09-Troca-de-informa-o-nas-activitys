package com.example.passardados;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class segunda_tela extends Activity {
    TextView texto1;
    TextView texto2;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segundatela);
        texto1=(TextView)findViewById(R.id.texto1);
        texto2=(TextView)findViewById(R.id.texto2);
        String valor1 =getIntent().getStringExtra("key1");
        String valor2 =getIntent().getStringExtra("key2");
        texto1.setText(valor1);
        texto2.setText(valor2);
    }
}
