package practicoHerencia;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("--- Práctico Herencia - Modelado de Clientes Bancarios ---");

        // Ejemplo persona física
        PersonaFisica cliente1 = new PersonaFisica(1, "Francisco", "Riorda",
         "3030303030", "San Lorenzo 445", "35128288282", "fran@gmail.com",
          LocalDate.now(), LocalDate.of(1992, 10, 14),
          "Desarrollador", 250000.0);

          // Ejemplo persona jurídica
          PersonaJuridica cliente2 = new PersonaJuridica(2, "Empresa S.A.", "20-30303030-1",
          "Chacabuco 123", "35190909090", "empresa@gmail.com", LocalDate.now(),
          "Desarrollo de software", "Juan Perez");

          // Ejemplo de cliente preferencial
          ClientePreferencial cliente3 = new ClientePreferencial(3, "Pedro", "Gomez", null,
           "280000010", "San Martin 987", "351939393939", "pedroGomez@gmail.com",
            LocalDate.of(2020, 8, 19), 50000000.0, "Carlos Gonzalez", "Atención prioritaria");

            System.out.println(cliente1);
            System.out.println("---------------------------------------------");
            System.out.println(cliente2);
            System.out.println("---------------------------------------------");
            System.out.println(cliente3);
            System.out.println("---------------------------------------------");
            System.out.println("Calificación de " + cliente1.getNombre() + ": " + cliente1.getCalificacionCliente());
            System.out.println("---------------------------------------------");
            
    }
}
