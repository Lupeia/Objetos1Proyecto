package modelo;

import java.util.Objects;

public class Estadisticas {

    private int idEstadistica;
    private Jugadores jugador;
    private Partidos partido;
    private int goles;
    private int asistencias;
    private int minutosJugados;

    public Estadisticas(int idEstadistica, Jugadores jugador, Partidos partido, int goles, int asistencias, int minutosJugados) {
        this.idEstadistica = idEstadistica;
        this.jugador = jugador;
        this.partido = partido;
        this.goles = goles;
        this.asistencias = asistencias;
        this.minutosJugados = minutosJugados;
    }

    public int getIdEstadistica() {
        return idEstadistica;
    }

    public void setIdEstadistica(int idEstadistica) {
        this.idEstadistica = idEstadistica;
    }

    public Jugadores getJugador() {
        return jugador;
    }

    public void setJugador(Jugadores jugador) {
        this.jugador = jugador;
    }

    public Partidos getPartido() {
        return partido;
    }

    public void setPartido(Partidos partido) {
        this.partido = partido;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public int getMinutosJugados() {
        return minutosJugados;
    }

    public void setMinutosJugados(int minutosJugados) {
        this.minutosJugados = minutosJugados;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Estadisticas that = (Estadisticas) o;
        return idEstadistica == that.idEstadistica && goles == that.goles && asistencias == that.asistencias && minutosJugados == that.minutosJugados && Objects.equals(jugador, that.jugador) && Objects.equals(partido, that.partido);
    }

    @Override
    public String toString() {
        return "Estadisticas{" +
                "idEstadistica=" + idEstadistica +
                ", jugador=" + jugador +
                ", partido=" + partido +
                ", goles=" + goles +
                ", asistencias=" + asistencias +
                ", minutosJugados=" + minutosJugados +
                '}';
    }
}
