package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sistema {

    private List<Torneo> torneo;
    private List<Equipo> equipos;
    private List<Jugador> jugadores;
    private List<Entrenador> entrenadores;
    private List<Partido> partidos;

    public Sistema() {
        this.torneo = new ArrayList<>();
        this.equipos = new ArrayList<>();
        this.jugadores = new ArrayList<>();
        this.entrenadores = new ArrayList<>();
    }

    public List<Torneo> getTorneo() {
        return torneo;
    }

    public void setTorneo(List<Torneo> torneo) {
        this.torneo = torneo;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public List<Entrenador> getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(List<Entrenador> entrenadors) {
        this.entrenadores = entrenadors;
    }


    public boolean crearJugador(String nombre, String apellido, long dni, LocalDate fechaNacimiento,
                                float estatura, float peso, String posicion, int numeroCamiseta) throws Exception {

        //AGREGAR VALIDACION DE DNIS PARA QUE NO HAYA JUGADORES CON DNIS DUPLICADOS
        // "Ya es un jugador"

        for (Jugador j : jugadores) {
            if (j.getDni() == dni) {
                throw new Exception("ERROR: DNI ya registrado como jugador");
            }
        }


        int id = 1;

        if (jugadores.size() < 0) {

            id = jugadores.get(jugadores.size() - 1).getId();

        }

        return jugadores.add(new Jugador(id, nombre, apellido, dni, fechaNacimiento, estatura, peso, posicion, numeroCamiseta));

    }

    public boolean eliminarJugador(int id) {

        Jugador AEliminar = traerJugador(id);

        if (AEliminar == null) {
            return false;
        }

        return jugadores.remove(AEliminar);

    }


    public Jugador traerJugador(int idJugador) {

        int indice = 0;
        boolean encontrado = false;
        Jugador buscado = null;

        while (indice < jugadores.size() && !encontrado) {

            if (jugadores.get(indice).getId() == idJugador) {

                buscado = jugadores.get(indice);
                encontrado = true;

            }

            indice++;

        }

        return buscado;

    }


    public boolean crearEntrenador(String nombre, String apellido, long dni, LocalDate fechaNacimiento,
                                   int EstrategiaFavorita) throws Exception {

        //AGREGAR VALIDACION DE DNIS PARA QUE NO HAYA ENTRENADORES CON DNIS DUPLICADOS
        // "Ya es un entrenador"

        for (Entrenador e : entrenadores) {
            if (e.getDni() == dni) {
                throw new Exception("ERROR: DNI ya registrado como entrenador");
            }
        }


        int id = 1;

        if (entrenadores.size() < 0) {


            id = entrenadores.get(entrenadores.size() - 1).getId() + 1;

        }

        return entrenadores.add(new Entrenador(id, nombre, apellido, dni, fechaNacimiento, EstrategiaFavorita));
    }

    public boolean eliminarEntrenadoR(int id) {

        Entrenador Aeliminar = traerEntrenador(id);

        if (Aeliminar == null) {

            return false;
        }

        return entrenadores.remove(Aeliminar);

    }

    public Entrenador traerEntrenador(int id) {

        int indice = 0;
        boolean encontrado = false;
        Entrenador buscado = null;

        while (indice < entrenadores.size() && !encontrado) {

            if (entrenadores.get(indice).getId() == id) {

                buscado = entrenadores.get(indice);
                encontrado = true;

            }

            indice++;

        }

        return buscado;

    }


    public boolean agregarEquipo(String codigo, String nombreEquipo, Entrenador entrenador) throws Exception {

        int id = 1;

        if (equipos.size() < 0) {

            id = equipos.get(equipos.size() - 1).getIdEquipo() + 1;

        }

        Equipo nueva = new Equipo(id, codigo, nombreEquipo, entrenador);
        return equipos.add(nueva);

    }

    public boolean eliminarEquipo(int id) {

        Equipo aEliminar = traerEquipos(id);

        if (aEliminar == null) {

            return false;

        }

        return equipos.remove(aEliminar);

    }

    public Equipo traerEquipos(int idEquipos) {

        int indice = 0;
        boolean encontrado = false;
        Equipo buscado = null;

        while (indice < entrenadores.size() && !encontrado) {

            if (equipos.get(indice).getIdEquipo() == idEquipos) {

                buscado = equipos.get(indice);
                encontrado = true;

            }

            indice++;

        }

        return buscado;

    }

    public boolean agregarTorneo(String nombre, String temporada, LocalDate fechaIncio, LocalDate fechafin) {

        int nuevoId = torneo.size() + 1;
        Torneo nuevo = new Torneo(nuevoId, nombre, temporada, fechaIncio, fechafin);

        return torneo.add(nuevo);

    }

    public boolean eliminarTorneo(int id) {

        Torneo aEliminar = traerTorneos(id);

        if (aEliminar == null) {

            return false;
        }

        return torneo.remove(aEliminar);
    }

    public Torneo traerTorneos(int idTorneos) {

        int indice = 0;
        boolean encontrado = false;
        Torneo buscado = null;

        while (indice < torneo.size() && !encontrado) {

            if (torneo.get(indice).getIdTorneo() == idTorneos) {

                buscado = torneo.get(indice);
                encontrado = true;

            }

            indice++;

        }

        return buscado;

    }


    public boolean agregarPartidos(LocalDate fecha, Equipo local, Equipo visitante, String estadio) {

        int idNuevo = partidos.size() + 1;
        Partido nuevo = new Partido(idNuevo, fecha, local, visitante, estadio);

        return partidos.add(nuevo);

    }

    public Partido traerPartido(int idPartido) {

        int indice = 0;
        boolean encontrado = false;
        Partido buscado = null;

        while (indice < partidos.size() && !encontrado) {

            if (partidos.get(indice).getIdPartidos() == idPartido) {

                buscado = partidos.get(indice);
                encontrado = true;

            }

            indice++;

        }

        return buscado;

    }


    public boolean eliminarPartido(int idPartido) {

        Partido aEliminar = traerPartido(idPartido);

        if (aEliminar == null) {

            return false;
        }
        return partidos.remove(aEliminar);
    }


    //Agregamos como subClase

    public class Goleador {
        private Jugador jugador;
        private int golesTotales;

        public Goleador(Jugador jugador, int golesTotales) {
            this.jugador = jugador;
            this.golesTotales = golesTotales;
        }

        public Jugador getJugador() {
            return jugador;
        }

        public int getGolesTotales() {
            return golesTotales;
        }

        public void sumarGoles(int goles) {
            this.golesTotales += goles;
        }

        @Override
        public String toString() {
            return jugador.getNombre() + " - " + golesTotales + " goles";
        }


        public List<Goleador> generarTablaGoleadores() {
            List<Goleador> tabla = new ArrayList<>();

            for (Partido partido : partidos) {
                for (Estadistica est : partido.getEstadisticas()) {
                    Jugador j = est.getJugador();
                    int goles = est.getGoles();

                    // Buscamos si el jugador ya está en la tabla
                    Goleador existente = null;
                    for (Goleador g : tabla) {
                        if (g.getJugador().equals(j)) {
                            existente = g;
                            break;
                        }
                    }

                    // Si ya estaba, sumamos goles; si no, lo agregamos
                    if (existente != null) {
                        existente.sumarGoles(goles);
                    } else {
                        tabla.add(new Goleador(j, goles));
                    }
                }
            }

            // Ordenamos con burbuja de mayor a menor
            for (int i = 0; i < tabla.size() - 1; i++) {
                for (int j = 0; j < tabla.size() - i - 1; j++) {
                    if (tabla.get(j).getGolesTotales() < tabla.get(j + 1).getGolesTotales()) {
                        Goleador temp = tabla.get(j);
                        tabla.set(j, tabla.get(j + 1));
                        tabla.set(j + 1, temp);
                    }
                }
            }

            return tabla;
        }






    }






}
