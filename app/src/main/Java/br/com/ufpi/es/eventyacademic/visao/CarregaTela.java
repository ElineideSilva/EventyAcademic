package br.com.ufpi.es.eventyacademic.visao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import br.com.ufpi.es.eventyacademic.R;
import br.com.ufpi.es.eventyacademic.dados.RepositorioUsuarios;
import br.com.ufpi.es.eventyacademic.dados.Usuario;

public class CarregaTela extends AppCompatActivity {

    Button Entrar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrega_tela);

        //Popula array assim que inicia o app
        RepositorioUsuarios r = new RepositorioUsuarios();
        r.popoulaRepositorioUsuarios();

        Entrar = (Button) findViewById(R.id.buttonEntre);

        Entrar.setOnClickListener(new View.OnClickListener()
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
