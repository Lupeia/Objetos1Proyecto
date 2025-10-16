package modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Jugadores extends Persona {

    private float estatura;
    private float peso;
    private String posicion;
    private int nCamiseta;

    public Jugadores(int id, String nombre, String apellido, long dni, LocalDate fechaNacimiento,float estatura, float peso, String posicion, int nCamiseta) {
        super(id, nombre, apellido, dni, fechaNacimiento);
        this.estatura = estatura;
        this.peso = peso;
        this.posicion = posicion;
        this.nCamiseta = nCamiseta;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getnCamiseta() {
        return nCamiseta;
    }

    public void setnCamiseta(int nCamiseta) {
        this.nCamiseta = nCamiseta;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Jugadores jugadores = (Jugadores) o;
        return Float.compare(estatura, jugadores.estatura) == 0 && Float.compare(peso, jugadores.peso) == 0 && nCamiseta == jugadores.nCamiseta && Objects.equals(posicion, jugadores.posicion);
    }

    @Override
    public String toString() {
        return "Jugadores{" +
                "estatura=" + estatura +
                ", peso=" + peso +
                ", posicion='" + posicion + '\'' +
                ", nCamiseta=" + nCamiseta +
                '}';
    }
}
