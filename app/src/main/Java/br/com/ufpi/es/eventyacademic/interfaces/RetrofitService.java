package br.com.ufpi.es.eventyacademic.interfaces;

import java.util.List;

import br.com.ufpi.es.eventyacademic.modelo.APIEvento;
import br.com.ufpi.es.eventyacademic.modelo.APIUsuario;
import br.com.ufpi.es.eventyacademic.modelo.Evento;
import br.com.ufpi.es.eventyacademic.modelo.Evento2;
import br.com.ufpi.es.eventyacademic.modelo.RespostaCadastro;
import br.com.ufpi.es.eventyacademic.modelo.Usuario;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface RetrofitService {

    @GET("event")
    Call<List<Evento>> getEventos();

    @GET("event/{id}")
    Call<Evento> getEvento(@Path("id") int id);

    @GET("users/{id}")
    Call<Usuario> getUsuario(@Path("id") int id);

    @FormUrlEncoded
    @POST("auth/sign_in")
    Call<APIUsuario> sing_in(
            @Field("email") String email,
            @Field("password") String password
    );

    @FormUrlEncoded
    @POST("auth")
    Call<RespostaCadastro> sing_up(
            @Field("email") String email,
            @Field("password") String password,
            @Field("password_confirmation ") String password_confirmation
    );

    @Headers("Content-Type: application/json")
    @POST("event/add")
    Call<Evento2> adicionar_evento(
            @Body APIEvento evento
    );

}
