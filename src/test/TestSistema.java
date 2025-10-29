package test;

import modelo.Sistema;

import java.time.LocalDate;

public class TestSistema {

    public static void main(String args[]){

        Sistema sistema = new Sistema();

        try{

            sistema.crearJugador("Milagros", "Quinteros", 45742189, LocalDate.of(2004,7, 30), 1.68f, 54f, "central", 10);
            sistema.crearJugador("Miriano", "Moreno", 47841235, LocalDate.of(2000,9, 17), 1.74f, 70f, "central", 7);
            sistema.crearJugador("Miriam", "Azgurra", 49745123, LocalDate.of(2001,10, 27), 1.65f, 64f, "defensor", 9);
            sistema.crearJugador("Matias", "Pucheta", 46875324, LocalDate.of(2006,4, 8), 1.80f, 73f, "defensor", 17);
            sistema.crearJugador("Wanda", "Richetti", 44985623, LocalDate.of(2002,4, 25), 1.61f, 65f, "defensor", 19);
            //sistema.getJugadores().forEach(System.out::println);

            System.out.println(sistema.getJugadores() + "\n");

            sistema.crearEntrenador("Gustavo", "Serati", 267451101, LocalDate.of(1989, 5, 5), 3);
            sistema.crearEntrenador("Julieta", "Palvov", 2237498, LocalDate.of(1990, 10, 14), 7);
            sistema.crearEntrenador("Juan", "Natalan", 29945121, LocalDate.of(1995, 2, 26), 9);
            //sistema.getEntrenadores().forEach(System.out::println);

            sistema.agregarEquipo("ASV", "Luciernagas", sistema.traerEntrenador(1));
            sistema.agregarEquipo("TWQ", "Linces", sistema.traerEntrenador(2));
            sistema.agregarEquipo("PSM", "Lunaticos", sistema.traerEntrenador(3));


        } catch (Exception e) {
            System.out.println(e);
        }






    }



}
