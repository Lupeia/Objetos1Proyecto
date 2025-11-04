package modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Partido {

    private int idPartidos;
    private LocalDate fecha;
    private LocalTime hora;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private String estadio;
    private List<Estadistica> estadisticas;
    private String resultado;


    public Partido(int idPartidos, LocalDate fecha, LocalTime hora, Equipo equipoLocal, Equipo equipoVisitante, String estadio, String resultado) {
        this.idPartidos = idPartidos;
        this.fecha = fecha;
        this.hora = hora;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.estadio = estadio;
        this.estadisticas = new ArrayList<>();
        this.resultado=resultado;
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

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public List<Estadistica> getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(List<Estadistica> estadisticas) {
        this.estadisticas = estadisticas;
    }

    public String getResultado() {return resultado;}

    public void setResultado(String resultado) {this.resultado = resultado;}


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Partido partido = (Partido) o;
        return idPartidos == partido.idPartidos && Objects.equals(fecha, partido.fecha) && Objects.equals(equipoLocal, partido.equipoLocal) && Objects.equals(equipoVisitante, partido.equipoVisitante) && Objects.equals(estadio, partido.estadio) && Objects.equals(estadisticas, partido.estadisticas) && Objects.equals(resultado, partido.resultado);
    }

    @Override
    public String toString() {
        return "Partido [idPartidos=" + idPartidos + ", fecha=" + fecha + ", horario=" + hora + ", Local="
                + equipoLocal.getNombreEquipo() + ", Visitante=" + equipoVisitante.getNombreEquipo() +", "+ "resultado=" + resultado + "]\n";
    }

    public boolean agregarEstadisticas (Jugador jugador, Equipo equipo,  Partido partido, int goles, int asistencias, int minutosJugados){

        int id = 1;

        if(estadisticas.size() > 0) {

            id = estadisticas.get(estadisticas.size() - 1).getIdEstadistica() + 1;
        }
        Estadistica nuevo = new Estadistica(id, jugador,equipo, partido, goles, asistencias, minutosJugados);

        return estadisticas.add(nuevo);
    }


    public Estadistica traerEstadistica (int id){

        int indice =  0;
        boolean encontrado = false;
        Estadistica buscado = null;


        while (indice < estadisticas.size() && !encontrado){

            if(estadisticas.get(indice).getIdEstadistica() == id){
                buscado = estadisticas.get(indice);
                encontrado = true;
            }

            indice++;
        }

        return buscado;
    }

    public boolean eliminarEstadistica (int id){

        Estadistica aEliminar = traerEstadistica(id);

        if(aEliminar == null){
            return false;
        }

        return estadisticas.remove(aEliminar);
    }




}
