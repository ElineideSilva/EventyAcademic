package br.com.ufpi.es.eventyacademic.visao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.com.ufpi.es.eventyacademic.R;
import br.com.ufpi.es.eventyacademic.controle.Fachada;
import br.com.ufpi.es.eventyacademic.dados.Usuario;
import br.com.ufpi.es.eventyacademic.utilidades.Mensagens;

public class TelaLogin extends AppCompatActivity {
    Button BtLogin, BtEventos, BtEntrar, BtCriarUsuario;
    private EditText usuario;
    private EditText senha;
    private Fachada fachada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        fachada = new Fachada();

        usuario = (EditText) findViewById(R.id.editTextEmail);
        senha = (EditText) findViewById(R.id.editTextSenha);

        BtLogin = (Button) findViewById(R.id.buttonLogin);
        BtEventos = (Button) findViewById(R.id.buttonEventos);
        BtEventos.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                MudaTelaConsultarEventos(v);
            }
        });


        BtEntrar = (Button) findViewById(R.id.buttonEntrar);
        BtEntrar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                TelaLogin(v);
            }
        });

        BtCriarUsuario = (Button) findViewById(R.id.buttonNewUsuario);
        BtCriarUsuario.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                TelaNewUser(v);
            }
        });


    }

    public void  TelaNewUser(View v){
        Intent intent = new Intent(this,TelaCadastrarnoApp.class);
        startActivity(intent);

    }

    public void TelaLogin (View v){
        String usuarioInformado = usuario.getText().toString();
        String senhaInformada = senha.getText().toString();

        try {
            Usuario usuario = fachada.buscarUsuarioEmail(usuarioInformado);
            if (usuario != null){
                if (usuarioInformado.equals("Eleneide") && senhaInformada.equals("23")){
                    Bundle bundle = new Bundle();
                    bundle.putString("nomeUsuario",usuario.getNome());
                    bundle.putString("emailUsuario",usuario.getEmail());
                    Intent intent = new Intent(this,TelaConsultarEvento.class);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            } else{

                String mensagemErroAutenticar = "Usuario não existe!";
                new Mensagens().mostraMensagem(this, mensagemErroAutenticar);
                limpaCamposEntrada();
            }
        } catch (Exception ex){
            new Mensagens().mostraMensagem(this, ex.getMessage());
            limpaCamposEntrada();
        }
    }

    public void limpaCamposEntrada(){
        usuario.setText("");
        senha.setText("");
    }
    public void MudaTelaConsultarEventos(View v){
        Intent intent = new Intent(this,TelaConsultarEvento.class);
        startActivity(intent);
    }
}
