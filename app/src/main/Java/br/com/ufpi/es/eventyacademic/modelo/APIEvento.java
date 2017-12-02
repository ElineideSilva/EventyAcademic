package br.com.ufpi.es.eventyacademic.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class APIEvento {
    @SerializedName("event")
    @Expose
    private EventoAdd event;

    public EventoAdd getEvent() {
        return event;
    }

    public void setEvent(EventoAdd event) {
        this.event = event;
    }

    public APIEvento() {
    }
}

