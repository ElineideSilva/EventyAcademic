package es.ufpi.br.eventyacademic.visao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import br.com.ufpi.es.eventyacademic.R;

public class CarregaTela extends AppCompatActivity {

    Button Entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrega_tela);

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
        Intent intentMostraTelaConsultar = new Intent(this,TelaConsultarEvento.class);
        startActivity (intentMostraTelaConsultar);
    }
}
