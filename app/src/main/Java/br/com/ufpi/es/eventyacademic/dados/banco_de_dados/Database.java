package br.com.ufpi.es.eventyacademic.dados.banco_de_dados;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.*;


/**
 * Created by Thanbo on 02/12/2017.
 *
 */

public class Database extends SQLiteOpenHelper {
    //criação do banco

    SQLiteDatabase db;

    public Database(Context context){
        super(context,"Eventos",null,1);
        db = this.getReadableDatabase();

    }
    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(ScriptSql.criarEvento());
        db.execSQL(ScriptSql.criarWorkshop());
        db.execSQL(ScriptSql.criarUsuario());
        db.execSQL(ScriptSql.criarPalestra());
        db.execSQL(ScriptSql.criarMinicurso());

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL(ScriptSql.deletaEvento());
        onCreate(db);
    }

    public Cursor recuperarDados (String tabela){
        Cursor retorno = db.rawQuery("SELECT * FROM " + tabela, null);
        return retorno;
    }

    public void inserirUsuario(ContentValues values, String tabela){
        if(values.containsKey("USERNAME") && values.getAsString("USERNAME")!= null){
            String username = values.getAsString("username");
            db.update(tabela,values,"username= " +username,null);
        }
        else{
            db.insert(tabela,null,values);
        }
    }

}
