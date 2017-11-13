package br.com.ufpi.es.eventyacademic.visao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import br.com.ufpi.es.eventyacademic.R;

public class TelaConsultarEvento extends AppCompatActivity {

    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_consultar_evento);

        login = (Button) findViewById(R.id.buttonLogin);

        login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){
                mudaTelaLogin(view);
            }
        });

    }
    public void mudaTelaLogin (View view){
        Intent intentMostraTelaConsultar = new Intent(this, TelaLogin.class);
        startActivity (intentMostraTelaConsultar);
    }

}
