package br.com.ufpi.es.eventyacademic.utilidades;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Segundo on 13/11/2017.
 */

public class Mensagens {

    public void mostraMensagem(Context context, String mensagem) {
        Toast toast = Toast.makeText(context, mensagem, Toast.LENGTH_LONG);
        toast.show();
    }
}
