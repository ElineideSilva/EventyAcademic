package es.ufpi.br.eventyacademic.visao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

import br.com.ufpi.es.eventyacademic.R;



import java.util.ArrayList;

import es.ufpi.br.eventyacademic.dados.RepositorioUsuarios;

public class TelaLogin extends AppCompatActivity {
    Button BtLogin, BtEventos, BtEntrar, BtCriarUsuario;
    private EditText usuario;
    private EditText senha;
   // private Fachada fachada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        //fachada = new Fachada();

        usuario = (EditText) findViewById(R.id.editTextEmail);
        senha = (EditText) findViewById(R.id.editTextSenha);

        BtLogin = (Button) findViewById(R.id.buttonLogin);
        BtEventos = (Button) findViewById(R.id.buttonEventos);
        BtEntrar = (Button) findViewById(R.id.buttonEntrar);
        BtCriarUsuario = (Button) findViewById(R.id.buttonNewUsuario);
    }

    public void TelaLogin (View v){
        String usuarioInformado = usuario.getText().toString();
        String senhaInformada = senha.getText().toString();

    }

    public void limpaCamposEntrada(){
        usuario.setText("");
        senha.setText("");
    }
}
