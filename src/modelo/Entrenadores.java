package modelo;

import java.time.LocalDate;

public class Entrenadores extends Persona {

    private int idEntrenador;
    private int EstrategiaFavorita;

    public Entrenadores(int id, String nombre, String apellido, long dni, LocalDate fechaNacimiento, int idEntrenador, int estrategiaFavorita) {
        super(id, nombre, apellido, dni, fechaNacimiento);
        this.idEntrenador = idEntrenador;
        EstrategiaFavorita = estrategiaFavorita;
    }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    public int getEstrategiaFavorita() {
        return EstrategiaFavorita;
    }

    public void setEstrategiaFavorita(int estrategiaFavorita) {
        EstrategiaFavorita = estrategiaFavorita;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Entrenadores that = (Entrenadores) o;
        return idEntrenador == that.idEntrenador && EstrategiaFavorita == that.EstrategiaFavorita;
    }

    @Override
    public String toString() {
        return "Entrenadores{" +
                "idEntrenador=" + idEntrenador +
                ", EstrategiaFavorita=" + EstrategiaFavorita;
    }

}
