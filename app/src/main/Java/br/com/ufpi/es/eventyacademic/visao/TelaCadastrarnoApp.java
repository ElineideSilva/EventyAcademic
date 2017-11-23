package br.com.ufpi.es.eventyacademic.visao;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import br.com.ufpi.es.eventyacademic.R;
import br.com.ufpi.es.eventyacademic.controle.Fachada;
import br.com.ufpi.es.eventyacademic.dados.Usuario;

public class TelaCadastrarnoApp extends AppCompatActivity  {
    private EditText nome, cpf, endereco, telefone;
    private Spinner spinnerN;
    private EditText email, senha, confirmeSenha;
    private Spinner spinnerA;
    private Button cadastrar;
    private Fachada fachada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastrarno_app);

        fachada = Fachada.getIntance();

        nome = (EditText) findViewById(R.id.editTextNomeCadastro);
        cpf = (EditText) findViewById(R.id.editTextCPF);
        endereco = (EditText) findViewById(R.id.editTextEndereco);
        telefone = (EditText) findViewById(R.id.editTextTelefone);

       // spinnerN = (Spinner) findViewById(R.id.spinnerNivel);

        email = (EditText) findViewById(R.id.editTextEmailCadastro);
        senha = (EditText) findViewById(R.id.editTextSenhaCadastro);
        confirmeSenha = (EditText) findViewById(R.id.editTextConfirmeSenhaCadastro);

        //spinnerA = (Spinner) findViewById(R.id.spinnerAreaDesejada);
        cadastrar = (Button) findViewById(R.id.buttonCadastrar);
        cadastrar.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                if (isEmpty(nome) || isEmpty(cpf) || isEmpty(endereco) || isEmpty(telefone) || isEmpty(email) || isEmpty(senha) || isEmpty(confirmeSenha) ){

                    Toast.makeText(getContext(),"Preencha todos os campos",Toast.LENGTH_SHORT).show();
                } else {

                    if (senha != confirmeSenha){
                        Toast.makeText(getContext(),"Senhas diferentes",Toast.LENGTH_SHORT).show();
                    }

                    else {

                         if(fachada.buscarUsuarioEmail(email.getText().toString())!=null){
                             Toast.makeText(getContext(),"Email já cadastrado",Toast.LENGTH_SHORT).show();
                         }

                         else{
                        //jogar no banco de dados
                        //public Usuario (String User, String Email, String Senha, String Nome, String CPF, Date Nascimento)
                     /*   Usuario user = new Usuario(null, email.getText().toString(), senha.getText().toString(),
                                nome.getText().toString(), cpf.getText().toString(), null);*/
                        Usuario user = new Usuario ();

                        user.setUsername(null); // O que fazer
                        user.setEmail(email.getText().toString());
                        user.setSenha(senha.getText().toString());
                        user.setNome(nome.getText().toString());
                        user.setCPF(cpf.getText().toString());
                        user.setNascimento(null); //O que fazer

                        fachada.inserirUsuario(user);
                        //mudar pra tela de login
                        mudaTelaLogin(view);
                         }
                    }
                }
             }

        }
        );


    }

    private Context getContext(){
        return this;
    }

    public void mudaTelaLogin (View view){
        Intent intentMostraTelaConsultar = new Intent(this, TelaLogin.class);
        startActivity (intentMostraTelaConsultar);
    }

    public boolean isEmpty (EditText etText){
        String text = etText.getText().toString().trim();
        if (text.length()<1)
            return true;
        return false;
    }

/*
    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }*/
}
