package modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Entrenador extends Persona {

    private String EstrategiaFavorita;

    public Entrenador(int id, String nombre, String apellido, long dni, LocalDate fechaNacimiento, String estrategiaFavorita) {
        super(id, nombre, apellido, dni, fechaNacimiento);
        EstrategiaFavorita = estrategiaFavorita;
    }

    public String getEstrategiaFavorita() {
        return EstrategiaFavorita;
    }

    public void setEstrategiaFavorita(String estrategiaFavorita) {
        EstrategiaFavorita = estrategiaFavorita;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Entrenador that = (Entrenador) o;
        return Objects.equals(EstrategiaFavorita, that.EstrategiaFavorita);
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "EstrategiaFavorita='" + EstrategiaFavorita + '\'' +
                '}';
    }
}
