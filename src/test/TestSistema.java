package test;

import modelo.Persona;
import modelo.Sistema;

import java.time.LocalDate;

public class TestSistema {

    public static void main(String args[]){

        Sistema sistema = new Sistema();

        try{

            sistema.agregarPersona("Milagros", "Cannabis", 45741247, LocalDate.of(2004,10,01));
            sistema.getPersona().forEach(System.out::println);

            sistema.agregarJugador(1, "Milagros", "Cannabis", 45741247, LocalDate.of(2004,10,01), 1.56f, 45f, "centro", 10);


        } catch (Exception e) {
            System.out.println(e);
        }






    }



}
