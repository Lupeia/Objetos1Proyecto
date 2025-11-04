package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Estadistica {

    private int idEstadistica;
    private Jugador jugador;
    private Partido partido;
    private Equipo equipo;
    private int goles;
    private int asistencias;
    private int minutosJugados;

    public Estadistica(int idEstadistica, Jugador jugador,  Equipo equipo,  Partido partido, int goles, int asistencias, int minutosJugados) {
        this.idEstadistica = idEstadistica;
        this.jugador = jugador;
        this.equipo = equipo;
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

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
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
        Estadistica that = (Estadistica) o;
        return idEstadistica == that.idEstadistica && goles == that.goles && asistencias == that.asistencias && minutosJugados == that.minutosJugados && Objects.equals(jugador, that.jugador) && Objects.equals(partido, that.partido) && Objects.equals(equipo, that.equipo);
    }

    @Override
    public String toString() {
        return "Estadistica [idEstadistica=" + idEstadistica + ", jugador=" + jugador.getNombre() +" "+jugador.getApellido()+ ", equipo=" + equipo.getNombreEquipo()
                + ", partido=" + partido.getFecha()+" "+partido.getHora()+" "+ partido.getEquipoLocal().getNombreEquipo()+" "+ partido.getResultado()+" "+partido.getEquipoVisitante().getNombreEquipo()+ ", goles=" + goles + ", asistencias=" + asistencias + ", minutosJugados="
                + minutosJugados + "]";
    }

}
