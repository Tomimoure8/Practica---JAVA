package edu.coderhouse.jpa.entity;

import edu.coderhouse.jpa.models.Persona;

public class ClaseSecundaria {
    public static void main (String Args []) {
     ClasePrincipal.main(Args);
     ClasePrincipal.metodoadicional();
        Persona uno = new Persona();
        uno.nombre = "Tomas";
        uno.apellido = "Moure";
        uno.edad = 22;

        Persona dos = new Persona();
        dos.nombre = "Mailen";
        dos.apellido = "Moure";
        dos.edad = 22;

        System.out.println(uno.nombre+" y "+dos.nombre+" tienen "+uno.edad+" años cada uno");
        double resultado = uno.edad + dos.edad;
        double tres = 3;
        int humo = 3;
        int resultado2 = uno.edad + dos.edad;
        System.out.println(resultado / tres);
        System.out.println(resultado / humo);
        System.out.println(resultado2 / humo);
        System.out.println(resultado2 / tres);
    }
}
