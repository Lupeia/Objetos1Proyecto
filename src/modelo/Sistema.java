package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sistema {

    private List<Torneos> torneo;
    private List<Equipos> equipos;
    private List<Persona> personas;
    private List<Jugadores> jugadores;
    private List<Entrenadores> entrenadores;

    public Sistema() {
        this.torneo = new ArrayList<>();
        this.equipos = new ArrayList<>();
        this.personas = new ArrayList<>();
        this.jugadores = new ArrayList<>();
        this.entrenadores = new ArrayList<>();
    }

    public List<Torneos> getTorneo() {
        return torneo;
    }

    public void setTorneo(List<Torneos> torneo) {
        this.torneo = torneo;
    }

    public List<Equipos> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipos> equipos) {
        this.equipos = equipos;
    }

    public List<Persona> getPersona() {
        return personas;
    }

    public void setPersona(List<Persona> persona) {
        this.personas = persona;
    }

    public List<Jugadores> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugadores> jugadores) {
        this.jugadores = jugadores;
    }

    public List<Entrenadores> getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(List<Entrenadores> entrenadores) {
        this.entrenadores = entrenadores;
    }


    public boolean agregarPersona (String nombre, String apellido, long dni, LocalDate fechaNacimiento) throws Exception{

        //AGREGAR VALIDACION DE DNI PARA QUE NO HAYA DNIS REPETIDOS

        int indice = 0;
        boolean encontrado = false;

        while (indice < personas.size() && !encontrado){

            if(personas.get(indice).dni == dni)throw new Exception("ERROR, DNI registrado");
            encontrado = true;
        }

       int id = 0;

       if(personas.size() > 0){

           int ultimoId = personas.size()-1;
           Persona p = personas.get(ultimoId);
           id = p.getId();

       }

       Persona nueva = new Persona(id + 1, nombre, apellido, dni, fechaNacimiento);
       return personas.add(nueva);
    }


    public boolean agregarJugador (int idPersona, String nombre, String apellido, long dni, LocalDate fechaNacimiento,
                                   float estatura, float peso, String posicion, int numeroCamiseta) throws Exception{

       //AGREGAR VALIDACION DE DNIS PARA QUE NO HAYA JUGADORES CON DNIS DUPLICADOS
        // "Ya es un jugador"

        int indice = 0;
        boolean encontrado = false;

        while (indice < jugadores.size() && !encontrado){

            if(jugadores.get(indice).dni == dni)throw new Exception("ERROR, DNI ya registrado como jugador");
            encontrado = true;
        }

       int nuevoId = jugadores.size() + 1;
       Jugadores nuevo = new Jugadores(idPersona, nombre, apellido, dni, fechaNacimiento, nuevoId, estatura, peso, posicion, numeroCamiseta);

       return jugadores.add(nuevo);

    }

    public Jugadores traerJugador (int idJugador){

        int indice = 0;
        boolean encontrado = false;
        Jugadores buscado = null;

        while (indice < jugadores.size() && !encontrado){

            if(jugadores.get(indice).getId() == idJugador){

                buscado = jugadores.get(indice);
                encontrado = true;

            }

            indice++;

        }

        return buscado;

    }


    public boolean agregarEntrenador (int idPersona, String nombre, String apellido, long dni, LocalDate fechaNacimiento,
                                      int EstrategiaFavorita) throws Exception{

        //AGREGAR VALIDACION DE DNIS PARA QUE NO HAYA ENTRENADORES CON DNIS DUPLICADOS
        // "Ya es un entrenador"

        int indice = 0;
        boolean encontrado = false;

        while (indice < entrenadores.size() && !encontrado){

            if(entrenadores.get(indice).dni == dni)throw new Exception("ERROR, DNI ya registrado como entrenador");
            encontrado = true;
        }


        int nuevoId = entrenadores.size() + 1;
        Entrenadores nuevo = new Entrenadores(idPersona, nombre, apellido, dni, fechaNacimiento, nuevoId, EstrategiaFavorita);

        return entrenadores.add(nuevo);

    }

    public Entrenadores traerEntrenador (int idEntrenador){

        int indice = 0;
        boolean encontrado = false;
        Entrenadores buscado = null;

        while (indice < entrenadores.size() && !encontrado){

            if(entrenadores.get(indice).getId() == idEntrenador){

                buscado = entrenadores.get(indice);
                encontrado = true;

            }

            indice++;

        }

        return buscado;

    }


    public boolean agregarEquipo (String codigo, String nombreEquipo, Entrenadores entrenador) throws Exception{

        //Agregar validacion de codigo unico
        if(!codigo.matches("^[A-Z]{3}$")) throw new Exception("ERROR, codigo invalido");

        int nuevoId = equipos.size() + 1;
        Equipos nueva = new Equipos(nuevoId, codigo, nombreEquipo, entrenador);
        return equipos.add(nueva);

    }

    public Equipos traerEquipos (int idEquipos){

        int indice = 0;
        boolean encontrado = false;
        Equipos buscado = null;

        while (indice < entrenadores.size() && !encontrado){

            if(equipos.get(indice).getIdEquipo() == idEquipos){

                buscado = equipos.get(indice);
                encontrado = true;

            }

            indice++;

        }

        return buscado;

    }

    public boolean agregarTorneo (String nombre, String temporada, LocalDate fechaIncio, LocalDate fechafin){

        int nuevoId = torneo.size() + 1;
        Torneos nuevo = new Torneos(nuevoId, nombre, temporada, fechaIncio, fechafin);

        return torneo.add(nuevo);

    }

    public Torneos traerTorneos (int idTorneos){

        int indice = 0;
        boolean encontrado = false;
        Torneos buscado = null;

        while (indice < torneo.size() && !encontrado){

            if(torneo.get(indice).getIdTorneo() == idTorneos){

                buscado = torneo.get(indice);
                encontrado = true;

            }

            indice++;

        }

        return buscado;

    }




}
