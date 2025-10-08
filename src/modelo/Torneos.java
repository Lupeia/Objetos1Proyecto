package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Torneos {
    private int idTorneo;
    private String nombre;
    private String temporada;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private List<Equipos> equiposParticipantes; //EN UN TONEO PARTICIPAN MUCHOS EQUIPOS
    private List<Partidos> partidos; //POR ENDE HAY MUCHOS PARTIDOS

    public Torneos(int idTorneo, String nombre, String temporada, LocalDate fechaInicio, LocalDate fechaFin) {
        this.idTorneo = idTorneo;
        this.nombre = nombre;
        this.temporada = temporada;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.equiposParticipantes = new ArrayList<>();
        this.partidos = new ArrayList<>();
    }

    public int getIdTorneo() {
        return idTorneo;
    }

    public void setIdTorneo(int idTorneo) {
        this.idTorneo = idTorneo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<Equipos> getEquiposParticipantes() {
        return equiposParticipantes;
    }

    public void setEquiposParticipantes(List<Equipos> equiposParticipantes) {
        this.equiposParticipantes = equiposParticipantes;
    }

    public List<Partidos> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<Partidos> partidos) {
        this.partidos = partidos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Torneos torneos = (Torneos) o;
        return idTorneo == torneos.idTorneo && Objects.equals(nombre, torneos.nombre) && Objects.equals(temporada, torneos.temporada) && Objects.equals(fechaInicio, torneos.fechaInicio) && Objects.equals(fechaFin, torneos.fechaFin) && Objects.equals(equiposParticipantes, torneos.equiposParticipantes) && Objects.equals(partidos, torneos.partidos);
    }

    @Override
    public String toString() {
        return "Torneos{" +
                "idTorneo=" + idTorneo +
                ", nombre='" + nombre + '\'' +
                ", temporada='" + temporada + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", equiposParticipantes=" + equiposParticipantes +
                ", partidos=" + partidos +
                '}';
    }

    public boolean agregarPartidos (LocalDate fecha, Equipos local, Equipos visitante, String estadio){

        int idNuevo = partidos.size() + 1;
        Partidos nuevo = new Partidos(idNuevo, fecha, local, visitante, estadio);

        return partidos.add(nuevo);

    }

    public Partidos traerPartido (int idPartido){

        int indice = 0;
        boolean encontrado = false;
        Partidos buscado = null;

        while (indice < partidos.size() && !encontrado){

            if(partidos.get(indice).getIdPartidos() == idPartido){

                buscado = partidos.get(indice);
                encontrado = true;

            }

            indice++;

        }

        return buscado;

    }

    public boolean agregarParticipantes (String codigo, String nombreEquipos, Entrenadores entrenador){

        int nuevoId = equiposParticipantes.size() + 1;
        Equipos equipo = new Equipos(nuevoId, codigo, nombreEquipos, entrenador);

        return equiposParticipantes.add(equipo);

    }


















}