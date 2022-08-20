package ues.occ.edu.sv.ingenieria.prn335.guia01_2022.control;

import java.util.ArrayList;
import ues.occ.edu.sv.ingenieria.prn335.guia01_2022.entity.Persona;

/**
 *
 * @author jose
 */
public class BolsaTrabajo {

    ArrayList<Persona> persona = new ArrayList<>();

    public BolsaTrabajo() {

        persona.add(new Persona(1, "jose", "osorio", "09780780-3", "0210-050788-10-1", "2343232", "M", "06-09-1999", "sistema de prevision", false, "ejemplo isss", "ejemplo nombre isss", "Ejemplo nombre nup", "Jose Osorio", "chepe", "numro de pasaporte", "09-2025", "numero iva", "92839283928", "ahorros", "agricola"));
        persona.add(new Persona(2, "chepe", "mendoza", "02940480-2", "0210-050788-10-1", "2343232", "M", "06-03-1998", "sistema de prevision", false, "ejemplo isss", "ejemplo nombre isss", "Ejemplo nombre nup", "Jose Osorio", "chepe", "numro de pasaporte", "09-2025", "numero iva", "92839283928", "ahorros", "agricola"));
        persona.add(new Persona(3, "luis", "figueroa", "81828384-1", "0210-050788-10-1", "2343232", "M", "06-01-1997", "sistema de prevision", false, "ejemplo isss", "ejemplo nombre isss", "Ejemplo nombre nup", "Jose Osorio", "chepe", "numro de pasaporte", "09-2025", "numero iva", "92839283928", "ahorros", "agricola"));
        persona.add(new Persona(4, "marcos", "rey", "67985289-4", "0210-050788-10-1", "2343232", "M", "06-07-1996", "sistema de prevision", false, "ejemplo isss", "ejemplo nombre isss", "Ejemplo nombre nup", "Jose Osorio", "chepe", "numro de pasaporte", "09-2025", "numero iva", "92839283928", "ahorros", "agricola"));
        persona.add(new Persona(5, "marvin", "montano", "97807690-5", "0210-050788-10-1", "2343232", "M", "06-09-1995", "sistema de prevision", false, "ejemplo isss", "ejemplo nombre isss", "Ejemplo nombre nup", "Jose Osorio", "chepe", "numro de pasaporte", "09-2025", "numero iva", "92839283928", "ahorros", "agricola"));

    }

    public ArrayList<Persona> getPersona() {
        return persona;
    }

}
