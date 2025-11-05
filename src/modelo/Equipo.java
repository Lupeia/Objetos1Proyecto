package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Equipo {

    private int idEquipo;
    private String codigo; //CODIGO DE 3 LETRAS
    private String nombreEquipo;
    private List<Jugador> jugadores; //TIENEN MUCHOS JUGADORES
    private Entrenador entrenador;
    private LocalDate fechaFundacion;

    public Equipo(int idEquipo, String codigo, String nombreEquipo, Entrenador entrenador, LocalDate fechaFundacion) throws Exception {
        this.setCodigo(codigo);
        this.idEquipo = idEquipo;
        this.nombreEquipo = nombreEquipo;
        this.jugadores = new ArrayList<>();
        this.entrenador = entrenador;
        this.fechaFundacion = fechaFundacion;
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

    public void setCodigo(String codigo) throws Exception {

        if(!codigo.matches("^[A-Z]{3}$")) throw new Exception("ERROR, codigo invalido");

        this.codigo = codigo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(LocalDate fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Equipo equipo = (Equipo) o;
        return idEquipo == equipo.idEquipo && Objects.equals(codigo, equipo.codigo) && Objects.equals(nombreEquipo, equipo.nombreEquipo) && Objects.equals(jugadores, equipo.jugadores) && Objects.equals(entrenador, equipo.entrenador) && Objects.equals(fechaFundacion, equipo.fechaFundacion);
    }

    @Override
    public String toString() {
        return "\nEquipo{" +
                "\nidEquipo=" + idEquipo +
                ", \ncodigo='" + codigo + '\'' +
                ",\n nombreEquipo='" + nombreEquipo + '\'' +
                ", \njugadores=" + jugadores +
                ",\n entrenador=" + entrenador +
                ",\n fechaFundacion=" + fechaFundacion +
                '}';
    }

    public boolean agregarJugadorEquipo (Jugador jugador) throws Exception{

       if(jugadores.contains(jugador))throw  new Exception("El equipo ya contiene a ese jugador");

       return jugadores.add(jugador);
    }


    public boolean eliminarJugadorEquipo (Jugador jugador) throws Exception{

        if(!jugadores.contains(jugador))throw  new Exception("El equipo NO contiene a ese jugador");

        return jugadores.remove(jugador);
    }



}
