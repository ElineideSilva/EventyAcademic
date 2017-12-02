package br.com.ufpi.es.eventyacademic.dados.banco_de_dados;

import android.content.Context;
import android.database.sqlite.*;

/**
 * Created by Thanbo on 02/12/2017.
 *
 */

public class Database extends SQLiteOpenHelper {
    //criação do banco

    public Database(Context context){
        super(context,"Eventos",null,1);


    }
    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(ScriptSql.criarEvento());

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
