package com.example.capitales;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class MainActivity extends AppCompatActivity {

    TextView capital;
    EditText pais;
    Button obtener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pais=findViewById(R.id.etCapitales);
        capital=findViewById(R.id.tvCapital);
        obtener=findViewById(R.id.btObtenerCapital);

        HashMap<String,String> capitales= new HashMap<>();
        capitales.put("Colombia","Bogotá");
        capitales.put("Brasil","Brasilia");
        capitales.put("Argentina", "Buenos Aires");
        capitales.put("Venezuela","Caracas");
        capitales.put("Ecuador","Quito");
        capitales.put("Chile","Santiago");
        capitales.put("Uruguay","Montevideo");
        capitales.put("Peru", "Lima");
        capitales.put("Paraguay", "Asunción");
        capitales.put("Bolivia", "Sucre");

        obtener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                for(Map.Entry<String,String> i:capitales.entrySet()){
                    if(pais.getText().toString().equals(i.getKey())){
                        capital.setText(i.getValue());
                    }
                }*/
// [Colombia, Brasil, Argentina, Venezuela, Chile, ...]
                for (String i: capitales.keySet()){
                   if (pais.getText().toString().equalsIgnoreCase(i)){
                       capital.setText(capitales.get(i));
                   }

                }


            }
        });



    }

    public void crearPaisCapital(){
        //Ingresar País y capital al HashMap siempre
        // y cuando este no exista ya
    }
}