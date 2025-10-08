package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Equipos {

    private int idEquipo;
    private String codigo; //CODIGO DE 3 LETRAS
    private String nombreEquipo;
    private List<Jugadores> jugadores; //TIENEN MUCHOS JUGADORES
    private Entrenadores entrenador;

    public Equipos(int idEquipo, String codigo, String nombreEquipo, Entrenadores entrenador) {
        this.idEquipo = idEquipo;
        this.codigo = codigo;
        this.nombreEquipo = nombreEquipo;
        this.jugadores = new ArrayList<>();
        this.entrenador = entrenador;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public List<Jugadores> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugadores> jugadores) {
        this.jugadores = jugadores;
    }

    public Entrenadores getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenadores entrenador) {
        this.entrenador = entrenador;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Equipos equipos = (Equipos) o;
        return idEquipo == equipos.idEquipo && Objects.equals(codigo, equipos.codigo) && Objects.equals(nombreEquipo, equipos.nombreEquipo) && Objects.equals(jugadores, equipos.jugadores) && Objects.equals(entrenador, equipos.entrenador);
    }

    @Override
    public String toString() {
        return "Equipos{" +
                "idEquipo=" + idEquipo +
                ", codigo='" + codigo + '\'' +
                ", nombreEquipo='" + nombreEquipo + '\'' +
                ", jugadores=" + jugadores +
                ", entrenador=" + entrenador +
                '}';
    }
}
