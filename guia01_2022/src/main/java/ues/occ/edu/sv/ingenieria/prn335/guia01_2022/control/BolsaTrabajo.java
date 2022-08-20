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

        persona.add(new Persona(1, "jose", "osorio", "mi casa", "M", "1999/09/06", true, "chepe", "No", "soltero/a"));
        persona.add(new Persona(2, "jose", "clemente", "su casa", "M", "2000/01/03", true, "armando", "No", "soltero/a"));
        persona.add(new Persona(3, "carlos", "roberto", "candelaria", "M", "2001/09/04", true, "carlitos", "No", "soltero/a"));
        persona.add(new Persona(4, "cristiano", "ronaldo", "soyapango", "M", "1985/02/05", true, "el bicho", "No", "casado/a"));
        persona.add(new Persona(5, "leonel", "messi", "apopa", "M", "1987/05/24", true, "la pulga", "No", "casado/a"));
        
    }

    public ArrayList<Persona> getPersona() {
        return persona;
    }

}
