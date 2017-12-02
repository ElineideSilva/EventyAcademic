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
            query+= "NOME TEXT,";
            query+= "LOCAL TEXT,";
            query+= "TIPO INT,";
            query+= "DATA_I TEXT,";
            query+= "DATA_F TEXT";
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
        query+= "NOME TEXT,";
        query+= "CPF INT,";
        query+= "TIPO INT,";
        query+= "EMAIL TEXT,";
        query+= "SENHA TEXT";
        query+= "USERNAME TEXT";
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
        query+= "NOME TEXT,";
        query+= " DATA_I TEXT,";
        query+= " DATA_F TEXT,";
        query+= ")";

        return query;
    }

    public static String criarUserEvent (){


        String query = "CREATE TABLE USUARIOEVENTO";
        query+= " (";
        query+= "NOMEUSUARIO TEXT,";
        query+= "NOMEEVNT TEXT,";
        query+= ")";

        return query;
    }

    public static String criarEventUser (){


        String query = "CREATE TABLE WORKSHOP";
        query+= " (";
        query+= "NOMEEVENT TEXT,";
        query+= "NOMEUSER TEXT,";
        query+= ")";

        return query;
    }

    /**
     * cria a string de deletar o banco
     * @return a string montada
     */
    public static String deletaEvento (){

        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("DELETE TABLE");

        return sqlBuilder.toString();
    }



}
