package br.com.ufpi.es.eventyacademic.visao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;

import br.com.ufpi.es.eventyacademic.R;

public class TelaCadastrarnoApp extends AppCompatActivity  {
    private EditText nome, rg, endereco, telefone;
    private Spinner spinnerN;
    private EditText email, senha, confirmeSenha;
    private Spinner spinnerA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastrarno_app);

        nome = (EditText) findViewById(R.id.editTextNomeCadastro);
        rg = (EditText) findViewById(R.id.editTextRG);
        endereco = (EditText) findViewById(R.id.editTextEndereco);
        telefone = (EditText) findViewById(R.id.editTextTelefone);

        spinnerN = (Spinner) findViewById(R.id.spinnerNivel);

        email = (EditText) findViewById(R.id.editTextEmailCadastro);
        senha = (EditText) findViewById(R.id.editTextSenhaCadastro);
        confirmeSenha = (EditText) findViewById(R.id.editTextConfirmeSenhaCadastro);

        spinnerA = (Spinner) findViewById(R.id.spinnerAreaDesejada);
    }

    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }
}
