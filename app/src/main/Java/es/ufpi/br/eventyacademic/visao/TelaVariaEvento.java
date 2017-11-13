package es.ufpi.br.eventyacademic.visao;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import es.ufpi.br.eventyacademic.visao.*;
import br.com.ufpi.es.eventyacademic.R;

public class TelaVariaEvento extends AppCompatActivity {

    Button consultaEventos, cadastraEventos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_varia_evento);

        consultaEventos = (Button) findViewById(R.id.buttonConsultarEventos);
        cadastraEventos = (Button) findViewById(R.id.buttonCadastrarEventos);

        consultaEventos.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v){
                Intent it1 = new Intent(this, TelaConsultarEvento.class);
                startActivity(it1);
            }
        });

        cadastraEventos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent it2 = new Intent(this, TelaCadastrarEvento.class);
            startActivity(it2);
            }
        });

    }
    //mudar de uma activy para outro
    //Intent intent = new Intent(this, SegundaActivity.class);
    //startActivity(intent);
    //usar bundle para passar parametros
}
