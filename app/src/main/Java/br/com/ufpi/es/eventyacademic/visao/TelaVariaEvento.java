package br.com.ufpi.es.eventyacademic.visao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import br.com.ufpi.es.eventyacademic.R;


public class TelaVariaEvento extends AppCompatActivity {

    Button consultaEventos, cadastraEventos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_varia_evento);

        consultaEventos = (Button) findViewById(R.id.buttonConsultarEventos);
        cadastraEventos = (Button) findViewById(R.id.buttonCadastrarEventos);

       consultaEventos.setOnClickListener(new View.OnClickListener()
       {
           @Override
           public void onClick(View view){
               mudaTelaConsultarEvento(view);
           }
       });

        cadastraEventos.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){
                mudaTelaCadastraEvento(view);
            }
        });

    }
    //mudar de uma activy para outro
    //Intent intent = new Intent(this, SegundaActivity.class);
    //startActivity(intent);
    //usar bundle para passar parametros

    public void mudaTelaConsultarEvento (View view){
        Intent intentMostraTelaConsultar = new Intent(this,TelaConsultarEvento.class);
        startActivity (intentMostraTelaConsultar);
    }

    public void mudaTelaCadastraEvento (View view){
        Intent intentMostraTelaConsultar = new Intent(this,TelaCadastrarEvento.class);
        startActivity (intentMostraTelaConsultar);
    }

}
