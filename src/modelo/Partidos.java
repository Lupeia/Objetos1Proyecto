package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Partidos {

    private int idPartidos;
    private LocalDate fecha;
    private Equipos equipoLocal;
    private Equipos equipoVisitante;
    private String estadio;
    private List<Estadisticas> estadisticas;

    public Partidos(int idPartidos, LocalDate fecha, Equipos equipoLocal, Equipos equipoVisitante, String estadio) {
        this.idPartidos = idPartidos;
        this.fecha = fecha;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.estadio = estadio;
        this.estadisticas = new ArrayList<>();
    }

    public int getIdPartidos() {
        return idPartidos;
    }

    public void setIdPartidos(int idPartidos) {
        this.idPartidos = idPartidos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Equipos getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipos equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipos getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipos equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public List<Estadisticas> getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(List<Estadisticas> estadisticas) {
        this.estadisticas = estadisticas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Partidos partidos = (Partidos) o;
        return idPartidos == partidos.idPartidos && Objects.equals(fecha, partidos.fecha) && Objects.equals(equipoLocal, partidos.equipoLocal) && Objects.equals(equipoVisitante, partidos.equipoVisitante) && Objects.equals(estadio, partidos.estadio) && Objects.equals(estadisticas, partidos.estadisticas);
    }

    @Override
    public String toString() {
        return "Partidos{" +
                "idPartidos=" + idPartidos +
                ", fecha=" + fecha +
                ", equipoLocal=" + equipoLocal +
                ", equipoVisitante=" + equipoVisitante +
                ", estadio='" + estadio + '\'' +
                ", estadisticas=" + estadisticas +
                '}';
    }

    public boolean agregarEstadisticas (Jugadores jugador, Partidos partidos, int goles, int asistencias, int minutosJugados){

        int nuevoId = estadisticas.size() + 1;
        Estadisticas nuevo = new Estadisticas(nuevoId, jugador, partidos, goles, asistencias, minutosJugados);

        return estadisticas.add(nuevo);
    }


}
