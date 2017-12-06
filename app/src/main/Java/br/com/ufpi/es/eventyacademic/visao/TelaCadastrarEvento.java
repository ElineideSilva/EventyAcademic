package br.com.ufpi.es.eventyacademic.visao;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.com.ufpi.es.eventyacademic.R;
import br.com.ufpi.es.eventyacademic.controle.Fachada;

public class TelaCadastrarEvento extends AppCompatActivity {

    private Button buttonLogin, buttonEventos;
    private EditText editTextNomeEvento, editText4;
    private android.widget.Button buttonCriarEvento;
    private Fachada fachada = new Fachada();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastrar_evento);

        buttonLogin = (android.widget.Button) findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                MudaTelaLoginEventos(v);
            }
        });

        buttonEventos = (android.widget.Button) findViewById(R.id.buttonEventos);
        buttonEventos.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                MudaTelaConsultarEventos(v);
            }
        });



        editTextNomeEvento = (EditText) findViewById(R.id.editTextNomeEvento);
        editText4 = (EditText) findViewById(R.id.editText4);

        buttonCriarEvento = (android.widget.Button) findViewById(R.id.buttonCriarEvento);
        buttonCriarEvento.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                if (isEmpty(editTextNomeEvento) || isEmpty(editText4) ){
                    Toast.makeText(getContext(),"Preencha todos os campos",Toast.LENGTH_SHORT).show();
                } else {

                    //falta buscar evento peo nome para consultar sua existencia pra não permitir a inserção de eventos com mesmo nome



                    //jogar no banco de dados
                    //Mudar contexto e enviar pelo bundle e intent o usuario para cadastrar o evento e associa-lo como organizador
                    MudaConfirmarEvento(v);
                }
            }
            }
        );
    }

    private Context getContext(){
        return this;
    }

    public boolean isEmpty (EditText etText){
        String text = etText.getText().toString().trim();
        if (text.length()<1)
            return true;
        return false;
    }

    public void MudaConfirmarEvento (View v){
        Intent intentMostraTelaConsultar = new Intent(this, TelaConsultarEvento.class);
        startActivity (intentMostraTelaConsultar);
    }

    public void MudaTelaLoginEventos(View v) {
        Intent intent = new Intent(this,TelaLogin.class);
        startActivity(intent);
    }

    public void MudaTelaConsultarEventos(View v){
        Intent intent = new Intent(this,TelaConsultarEvento.class);
        startActivity(intent);
    }

}
