package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Torneo {
    private int idTorneo;
    private String nombre;
    private String temporada;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private List<Equipo> equipoParticipantes; //EN UN TONEO PARTICIPAN MUCHOS EQUIPOS
    private List<Partido> partidosTorneos; //POR ENDE HAY MUCHOS PARTIDOS

    public Torneo(int idTorneo, String nombre, String temporada, LocalDate fechaInicio, LocalDate fechaFin) {
        this.idTorneo = idTorneo;
        this.nombre = nombre;
        this.temporada = temporada;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.equipoParticipantes = new ArrayList<>();
        this.partidosTorneos = new ArrayList<>();
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

    public List<Equipo> getEquiposParticipantes() {
        return equipoParticipantes;
    }

    public void setEquiposParticipantes(List<Equipo> equipoParticipantes) {
        this.equipoParticipantes = equipoParticipantes;
    }

    public List<Partido> getPartidos() {
        return partidosTorneos;
    }

    public void setPartidos(List<Partido> partidos) {
        this.partidosTorneos = partidos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Torneo torneo = (Torneo) o;
        return idTorneo == torneo.idTorneo && Objects.equals(nombre, torneo.nombre) && Objects.equals(temporada, torneo.temporada) && Objects.equals(fechaInicio, torneo.fechaInicio) && Objects.equals(fechaFin, torneo.fechaFin) && Objects.equals(equipoParticipantes, torneo.equipoParticipantes) && Objects.equals(partidosTorneos, torneo.partidosTorneos);
    }

    @Override
    public String toString() {
        return "Torneos{" +
                "idTorneo=" + idTorneo +
                ", nombre='" + nombre + '\'' +
                ", temporada='" + temporada + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", equiposParticipantes=" + equipoParticipantes +
                ", partidos=" + partidosTorneos +
                '}';
    }

   public boolean agregarPartidoTorneo (Partido partido) throws Exception{

       if(partidosTorneos.contains(partido)) throw new Exception("El partido ya esta agregado en torneo");

       return partidosTorneos.add(partido);
   }

    public boolean eliminarPartidoTorneo (Partido partido) throws Exception{

        if(!partidosTorneos.contains(partido)) throw new Exception("El partido no esta agregado en torneo");

        return partidosTorneos.remove(partido);
    }


    public boolean agregarEquiposParticipantes (Equipo equipos) throws Exception{

        if(equipoParticipantes.contains(equipos)) throw new Exception("El equipo ya esta participando");

        return equipoParticipantes.add(equipos);

    }

    public boolean eliminarEquiposParticipantes (Equipo equipos) throws Exception{

        if(!equipoParticipantes.contains(equipos)) throw new Exception("El equipo NO esta participando");

        return equipoParticipantes.remove(equipos);

    }





















}