package modelo;

import java.time.LocalDate;

public class Entrenadores extends Persona {

    private int EstrategiaFavorita;

    public Entrenadores(int id, String nombre, String apellido, long dni, LocalDate fechaNacimiento, int estrategiaFavorita) {
        super(id, nombre, apellido, dni, fechaNacimiento);
        EstrategiaFavorita = estrategiaFavorita;
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
        return EstrategiaFavorita == that.EstrategiaFavorita;
    }

    @Override
    public String toString() {
        return "Entrenadores{" +
                "EstrategiaFavorita=" + EstrategiaFavorita +
                '}';
    }
}
