package br.com.ufpi.es.eventyacademic.dados.banco_de_dados;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
/**
 * Created by Thanbo on 02/12/2017.
 */

public class ScriptSql {

    /**
     * cria a string de criação do banco a partir do sql
     * @return  a string montada
     */

    public static String criarEvento (){


            String query = "CREATE TABLE EVENTO";
            query+= " (";
            query+= "_idevento INTEGER PRIMARY KEY AUTOINCREMENT,";
            query+= "NOME TEXT,";
            query+= "LOCAL TEXT,";
            query+= "TIPO INT,";
            query+= "DATA_I TEXT,";
            query+= "DATA_F TEXT";
            query+= "STATUS TEXT";
            query+= "DATA_F TEXT";
            query+= "FOREIGN KEY (CPFORGANIZADOR) REFERENCES USUARIO (CPF),";
            query+= ")";

            return query;
    }

    /**
     *
     * @return
     */
    public static String criarUsuario (){


        String query = "CREATE TABLE USUARIO";
        query+= " (";
        query+= "_idusuario INTEGER ";
        query+= "NOME TEXT,";
        query+= "CPF INTEGER PRIMARY KEY";
        query+= "TIPO INT,";
        query+= "EMAIL TEXT,";
        query+= "SENHA TEXT";
        query+= "USERNAME TEXT ";
        query+= "DATA_N TEXT";
        query+= ")";

        return query;
    }

    /**
     *
     * @return
     */

    public static String criarPalestra (){


        String query = "CREATE TABLE PALESTRA";
        query+= " (";
        query+= "_idpalestra INTEGER PRIMARY KEY AUTOINCREMENT,";
        query+= "NOME TEXT,";
        query+= "DATA_I TEXT,";
        query+= "DATA_F TEXT,";
        query+= ")";

        return query;
    }

    /**
     *
     * @return
     */
    public static String criarWorkshop (){


        String query = "CREATE TABLE WORKSHOP";
        query+= " (";
        query+= "_idwork INTEGER PRIMARY KEY AUTOINCREMENT,";
        query+= "NOME TEXT,";
        query+= "DATA_I TEXT,";
        query+= "DATA_F TEXT,";
        query+= ")";

        return query;
    }

    /**
     *
     * @return
     */
    public static String criarMinicurso (){


        String query = "CREATE TABLE MINICURSO";
        query+= " (";
        query+= "_idmini INTEGER PRIMARY KEY AUTOINCREMENT,";
        query+= "NOME TEXT,";
        query+= " DATA_I TEXT,";
        query+= " DATA_F TEXT,";
        query+= ")";

        return query;
    }

    public static String criarUserEvent (){


        String query = "CREATE TABLE USUARIOEVENTO";
        query+= " (";
        query+= "_id INTEGER PRIMARY KEY AUTOINCREMENT,";
        query+= "NOMEUSUARIO TEXT,";
        query+= "NOMEEVNT TEXT,";
        query+= "FOREIGN KEY (CPF) REFERENCES USUARIO (CPF),";
        query+= "FOREIGN KEY (_idevento) REFERENCES EVENTO (_idevento),";
        query+= ")";

        return query;
    }

    public static String criarEventUser (){


        String query = "CREATE TABLE WORKSHOP";
        query+= " (";
        query+= "_id INTEGER PRIMARY KEY AUTOINCREMENT,";

        query+= "NOMEEVENT TEXT,";
       // query+= "_id INTEGER PRIMARY KEY AUTOINCREMENT,";
        query+= "NOMEUSER TEXT,";
        query+= "FOREIGN KEY (CPF) REFERENCES USUARIO (CPF),";
        query+= "FOREIGN KEY (_idevento) REFERENCES EVENTO (_idevento),";
        query+= ")";

        return query;
    }

    /**
     * cria a string de deletar o banco
     * @return a string montada
     */
    public static String deletaEvento (String tabela){

        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("DELETE TABLE "+ tabela + " ");

        return sqlBuilder.toString();
    }



}
