package test;

import modelo.Sistema;

import java.time.LocalDate;
import java.time.LocalTime;

public class TestSistema {

    public static void main(String args[]){

        Sistema sistema = new Sistema();

        try{
            sistema.agregarTorneo("Torneo Clausura 2025","2025", LocalDate.of(2025, 10, 1), LocalDate.of(2025, 10, 14));

// Equipo 1 leones
            sistema.crearJugador("Juan", "Perez", 45742189, LocalDate.of(2000, 2, 10), 1.80f, 75f, "delantero", 9);
            sistema.crearJugador("Martin", "Lopez", 47841235, LocalDate.of(1998, 6, 12), 1.82f, 78f, "defensor", 4);
            sistema.crearJugador("Lucas", "Diaz", 48945324, LocalDate.of(2001, 4, 18), 1.75f, 70f, "mediocampista", 8);
            sistema.crearJugador("Franco", "Ruiz", 46578941, LocalDate.of(1999, 11, 3), 1.85f, 82f, "arquero", 1);
            sistema.crearJugador("Agustin", "Torres", 50321478, LocalDate.of(2002, 7, 21), 1.78f, 73f, "delantero", 11);

// Equipo 2 tigres
            sistema.crearJugador("Diego", "Gonzalez", 46821459, LocalDate.of(1999, 2, 4), 1.83f, 80f, "arquero", 1);
            sistema.crearJugador("Nicolas", "Romero", 45219873, LocalDate.of(1997, 9, 10), 1.80f, 76f, "defensor", 3);
            sistema.crearJugador("Rodrigo", "Sosa", 48102459, LocalDate.of(2000, 12, 12), 1.74f, 68f, "mediocampista", 5);
            sistema.crearJugador("Matias", "Vera", 50413627, LocalDate.of(2002, 1, 5), 1.79f, 71f, "delantero", 10);
            sistema.crearJugador("Pablo", "Castro", 46321087, LocalDate.of(1998, 5, 22), 1.81f, 77f, "defensor", 6);
// Equipo 3 halcones
            sistema.crearJugador("Emiliano", "Cabrera", 47451236, LocalDate.of(1999, 3, 14), 1.86f, 83f, "arquero", 1);
            sistema.crearJugador("Javier", "Morales", 49874125, LocalDate.of(2001, 10, 19), 1.79f, 74f, "defensor", 2);
            sistema.crearJugador("Gonzalo", "Rivas", 48621547, LocalDate.of(2000, 8, 30), 1.77f, 70f, "mediocampista", 6);
            sistema.crearJugador("Lautaro", "Fernandez", 51789452, LocalDate.of(2003, 2, 17), 1.83f, 75f, "delantero", 9);
            sistema.crearJugador("Mateo", "Blanco", 52103648, LocalDate.of(2002, 4, 23), 1.72f, 67f, "mediocampista", 8);

// Equipo 4 lobos
            sistema.crearJugador("Facundo", "Herrera", 45987412, LocalDate.of(1998, 12, 8), 1.84f, 81f, "arquero", 1);
            sistema.crearJugador("Ignacio", "Ramos", 47012596, LocalDate.of(1999, 9, 1), 1.80f, 76f, "defensor", 4);
            sistema.crearJugador("Tomas", "Benitez", 49231574, LocalDate.of(2000, 5, 15), 1.74f, 69f, "mediocampista", 7);
            sistema.crearJugador("Sebastian", "Luna", 50521478, LocalDate.of(2001, 7, 7), 1.81f, 72f, "delantero", 10);
            sistema.crearJugador("Enzo", "Correa", 51632497, LocalDate.of(2002, 3, 28), 1.78f, 74f, "defensor", 5);
            //sistema.getJugadores().forEach(System.out::println);

            //System.out.println(sistema.getJugadores() + "\n");

            sistema.crearEntrenador("Carlos", "Gomez", 12345678, LocalDate.of(1989, 5, 5), "4-4-2");
            sistema.crearEntrenador("Luis", "Martinez", 22345678, LocalDate.of(1990, 10, 14), "4-3-3");
            sistema.crearEntrenador("Jorge", "Perez", 32345678, LocalDate.of(1995, 2, 26), "3-5-2");
            sistema.crearEntrenador("Andres", "Suarez", 42345678, LocalDate.of(1995, 4, 26), "5-3-2");
            //sistema.getEntrenadores().forEach(System.out::println);

            sistema.agregarEquipo("LEO", "Leones", sistema.traerEntrenador(1),LocalDate.of(2010, 1, 1));
            sistema.agregarEquipo("TIG", "Tigres", sistema.traerEntrenador(2),LocalDate.of(2012, 3, 15));
            sistema.agregarEquipo("HAL", "Halcones", sistema.traerEntrenador(3),LocalDate.of(2015, 7, 20));
            sistema.agregarEquipo("LOB", "Lobos", sistema.traerEntrenador(4),LocalDate.of(2013, 9, 5));


            sistema.traerTorneos(1).agregarEquiposParticipantes(sistema.traerEquipos(1));

            sistema.traerTorneos(1).agregarEquiposParticipantes(sistema.traerEquipos(2));

            sistema.traerTorneos(1).agregarEquiposParticipantes(sistema.traerEquipos(3));

            sistema.traerTorneos(1).agregarEquiposParticipantes(sistema.traerEquipos(4));

            sistema.traerEquipos(1).agregarJugadorEquipo(sistema.traerJugador(1));

            sistema.traerEquipos(1).agregarJugadorEquipo(sistema.traerJugador(2));

            sistema.traerEquipos(1).agregarJugadorEquipo(sistema.traerJugador(3));

            sistema.traerEquipos(1).agregarJugadorEquipo(sistema.traerJugador(4));

            sistema.traerEquipos(1).agregarJugadorEquipo(sistema.traerJugador(5));


            sistema.traerEquipos(2).agregarJugadorEquipo(sistema.traerJugador(6));
            sistema.traerEquipos(2).agregarJugadorEquipo(sistema.traerJugador(7));
            sistema.traerEquipos(2).agregarJugadorEquipo(sistema.traerJugador(8));
            sistema.traerEquipos(2).agregarJugadorEquipo(sistema.traerJugador(9));
            sistema.traerEquipos(2).agregarJugadorEquipo(sistema.traerJugador(10));

            sistema.traerEquipos(3).agregarJugadorEquipo(sistema.traerJugador(11));
            sistema.traerEquipos(3).agregarJugadorEquipo(sistema.traerJugador(12));
            sistema.traerEquipos(3).agregarJugadorEquipo(sistema.traerJugador(13));
            sistema.traerEquipos(3).agregarJugadorEquipo(sistema.traerJugador(14));
            sistema.traerEquipos(3).agregarJugadorEquipo(sistema.traerJugador(15));

            sistema.traerEquipos(4).agregarJugadorEquipo(sistema.traerJugador(16));
            sistema.traerEquipos(4).agregarJugadorEquipo(sistema.traerJugador(17));
            sistema.traerEquipos(4).agregarJugadorEquipo(sistema.traerJugador(18));
            sistema.traerEquipos(4).agregarJugadorEquipo(sistema.traerJugador(19));
            sistema.traerEquipos(4).agregarJugadorEquipo(sistema.traerJugador(20));


            sistema.agregarPartidos(LocalDate.of(2025, 10, 10), LocalTime.of(15, 00), sistema.traerTorneos(1).traerEquipo(1), sistema.traerTorneos(1).traerEquipo(2), "Wembley", "2-1");
            sistema.agregarPartidos(LocalDate.of(2025, 10, 17), LocalTime.of(16, 00), sistema.traerTorneos(1).traerEquipo(3), sistema.traerTorneos(1).traerEquipo(4), "Camp Nou", "1-1");
            sistema.agregarPartidos(LocalDate.of(2025, 10, 24), LocalTime.of(15, 00), sistema.traerTorneos(1).traerEquipo(1),sistema.traerTorneos(1).traerEquipo(3), "Wanda Metropolitano", "3-0");
            sistema.agregarPartidos(LocalDate.of(2025, 10, 31), LocalTime.of(16, 00), sistema.traerTorneos(1).traerEquipo(2), sistema.traerTorneos(1).traerEquipo(4), "Mestalla", "0-2");
            sistema.agregarPartidos(LocalDate.of(2025, 10, 7), LocalTime.of(15, 30), sistema.traerTorneos(1).traerEquipo(1), sistema.traerTorneos(1).traerEquipo(4), "Anfield", "1-3");
            sistema.agregarPartidos(LocalDate.of(2025, 10, 14), LocalTime.of(15, 30), sistema.traerTorneos(1).traerEquipo(2), sistema.traerTorneos(1).traerEquipo(3), "La Bombonera", "2-2");

            System.out.println(sistema.traerTorneos(1));

            sistema.traerTorneos(1).agregarPartidoTorneo(sistema.traerPartido(1));
            sistema.traerTorneos(1).agregarPartidoTorneo(sistema.traerPartido(2));
            sistema.traerTorneos(1).agregarPartidoTorneo(sistema.traerPartido(3));
            sistema.traerTorneos(1).agregarPartidoTorneo(sistema.traerPartido(4));
            sistema.traerTorneos(1).agregarPartidoTorneo(sistema.traerPartido(5));
            sistema.traerTorneos(1).agregarPartidoTorneo(sistema.traerPartido(6));

            System.out.println(sistema.traerTorneos(1).getEquiposParticipantes());

            System.out.println(sistema.traerTorneos(1).getPartidos());

            sistema.traerPartido(1).agregarEstadisticas(sistema.traerJugador(1),sistema.traerTorneos(1).traerEquipo(1), sistema.traerTorneos(1).traerPartido(1), 1, 0, 90);
            sistema.traerPartido(1).agregarEstadisticas(sistema.traerJugador(5),sistema.traerTorneos(1).traerEquipo(1), sistema.traerTorneos(1).traerPartido(1), 1, 0, 85);
            sistema.traerPartido(1).agregarEstadisticas(sistema.traerJugador(9),sistema.traerTorneos(1).traerEquipo(2), sistema.traerTorneos(1).traerPartido(1), 1, 0, 90);
            sistema.traerPartido(2).agregarEstadisticas(sistema.traerJugador(14),sistema.traerTorneos(1).traerEquipo(3), sistema.traerTorneos(1).traerPartido(2), 1, 0, 90);
            sistema.traerPartido(2).agregarEstadisticas(sistema.traerJugador(19),sistema.traerTorneos(1).traerEquipo(4), sistema.traerTorneos(1).traerPartido(2), 1, 0, 90);
            sistema.traerPartido(3).agregarEstadisticas(sistema.traerJugador(1),sistema.traerTorneos(1).traerEquipo(1), sistema.traerTorneos(1).traerPartido(3), 2, 0, 90);
            sistema.traerPartido(3).agregarEstadisticas(sistema.traerJugador(5),sistema.traerTorneos(1).traerEquipo(1), sistema.traerTorneos(1).traerPartido(3), 1, 0, 90);
            sistema.traerPartido(4).agregarEstadisticas(sistema.traerJugador(19),sistema.traerTorneos(1).traerEquipo(4), sistema.traerTorneos(1).traerPartido(4), 1, 0, 90);
            sistema.traerPartido(4).agregarEstadisticas(sistema.traerJugador(20),sistema.traerTorneos(1).traerEquipo(4), sistema.traerTorneos(1).traerPartido(4), 1, 0, 90);
            sistema.traerPartido(5).agregarEstadisticas(sistema.traerJugador(5),sistema.traerTorneos(1).traerEquipo(1), sistema.traerTorneos(1).traerPartido(5), 1, 0, 90);
            sistema.traerPartido(5).agregarEstadisticas(sistema.traerJugador(19),sistema.traerTorneos(1).traerEquipo(4), sistema.traerTorneos(1).traerPartido(5), 2, 0, 80);
            sistema.traerPartido(5).agregarEstadisticas(sistema.traerJugador(20),sistema.traerTorneos(1).traerEquipo(4), sistema.traerTorneos(1).traerPartido(5), 1, 0, 90);
            sistema.traerPartido(6).agregarEstadisticas(sistema.traerJugador(8),sistema.traerTorneos(1).traerEquipo(2), sistema.traerTorneos(1).traerPartido(6), 1, 0, 80);
            sistema.traerPartido(6).agregarEstadisticas(sistema.traerJugador(9),sistema.traerTorneos(1).traerEquipo(2), sistema.traerTorneos(1).traerPartido(6), 1, 0, 90);
            sistema.traerPartido(6).agregarEstadisticas(sistema.traerJugador(13),sistema.traerTorneos(1).traerEquipo(3), sistema.traerTorneos(1).traerPartido(6), 1, 0, 85);
            sistema.traerPartido(6).agregarEstadisticas(sistema.traerJugador(14),sistema.traerTorneos(1).traerEquipo(3), sistema.traerTorneos(1).traerPartido(6), 1, 0, 90);



            System.out.println(sistema.traerTorneos(1).traerPartido(1).getEstadisticas());
            System.out.println(sistema.traerTorneos(1).traerPartido(2).getEstadisticas());
            System.out.println(sistema.traerTorneos(1).traerPartido(3).getEstadisticas());
            System.out.println(sistema.traerTorneos(1).traerPartido(4).getEstadisticas());
            System.out.println(sistema.traerTorneos(1).traerPartido(5).getEstadisticas());
            System.out.println(sistema.traerTorneos(1).traerPartido(6).getEstadisticas());

            System.out.println("Posiciones\n"+sistema.generarTablaPosiciones(sistema.traerTorneos(1)));
            System.out.println("Goleadores\n"+sistema.generarTablaGoleadores());


        } catch (Exception e) {
            System.out.println(e);
        }






    }



}
