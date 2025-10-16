package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sistema {

    private List<Torneos> torneo;
    private List<Equipos> equipos;
    private List<Jugadores> jugadores;
    private List<Entrenadores> entrenadores;

    public Sistema() {
        this.torneo = new ArrayList<>();
        this.equipos = new ArrayList<>();
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


    public boolean agregarJugador (String nombre, String apellido, long dni, LocalDate fechaNacimiento,
                                   float estatura, float peso, String posicion, int numeroCamiseta) throws Exception{

       //AGREGAR VALIDACION DE DNIS PARA QUE NO HAYA JUGADORES CON DNIS DUPLICADOS
        // "Ya es un jugador"

        int indice = 0;
        boolean encontrado = false;

        while (indice < jugadores.size() && !encontrado){

            if(jugadores.get(indice).dni == dni)throw new Exception("ERROR, DNI ya registrado como jugador");
            encontrado = true;
        }

        int id = 1;

        if(jugadores.size() < 0){

            id = jugadores.get(jugadores.size()-1).getId();

        }

       return jugadores.add(new Jugadores(id, nombre, apellido, dni, fechaNacimiento, estatura, peso, posicion, numeroCamiseta));

    }

    public boolean eliminarJugadores(int id){

        Jugadores AEliminar = traerJugador(id);

        if(AEliminar == null){
            return false;
        }

        return jugadores.remove(AEliminar);

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


    public boolean agregarEntrenador (String nombre, String apellido, long dni, LocalDate fechaNacimiento,
                                      int EstrategiaFavorita) throws Exception{

        //AGREGAR VALIDACION DE DNIS PARA QUE NO HAYA ENTRENADORES CON DNIS DUPLICADOS
        // "Ya es un entrenador"

        int indice = 0;
        boolean encontrado = false;

        while (indice < entrenadores.size() && !encontrado){

            if(entrenadores.get(indice).dni == dni)throw new Exception("ERROR, DNI ya registrado como entrenador");
            encontrado = true;
        }


        int id = 1;

        if(entrenadores.size() < 0) {


            id = entrenadores.get(entrenadores.size()-1).getId()+1;

        }

        return entrenadores.add(new Entrenadores(id, nombre, apellido, dni, fechaNacimiento, EstrategiaFavorita));
    }

    public boolean eliminarEntrenadores(int id){

    Entrenadores Aeliminar = traerEntrenador(id);

    if(Aeliminar == null){

        return false;
    }

    return entrenadores.remove(Aeliminar);

    }

    public Entrenadores traerEntrenador (int id){

        int indice = 0;
        boolean encontrado = false;
        Entrenadores buscado = null;

        while (indice < entrenadores.size() && !encontrado){

            if(entrenadores.get(indice).getId() == id){

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

    public boolean eliminarEquipo (int id){

         Equipos aEliminar = traerEquipos(id);

         if(aEliminar == null){

             return false;

         }

         return equipos.remove(aEliminar);

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

    public boolean eliminarTorneo (int id){

        Torneos aEliminar = traerTorneos(id);

        if(aEliminar == null){

            return false;
        }

        return torneo.remove(aEliminar);
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
