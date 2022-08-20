package ues.occ.edu.sv.ingenieria.prn335.guia01_2022.entity;

/**
 *
 * @author jose
 */
public class Persona {
    public int id_persona;
    public String nombres;
    public String apellidos;
    public String direccion;
    public String genero;
    public String fecha_nacimiento;

    public boolean jubilado;
    public String conocido_por;
    public String CapacidadesEspeciales;
    public String EstadoCivil;

    public Persona(int id_persona, String nombres, String apellidos, String direccion, String genero, String fecha_nacimiento, boolean jubilado, String conocido_por, String CapacidadesEspeciales, String EstadoCivil) {
        this.id_persona = id_persona;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.genero = genero;
        this.fecha_nacimiento = fecha_nacimiento;
        this.jubilado = jubilado;
        this.conocido_por = conocido_por;
        this.CapacidadesEspeciales = CapacidadesEspeciales;
        this.EstadoCivil = EstadoCivil;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public boolean isJubilado() {
        return jubilado;
    }

    public void setJubilado(boolean jubilado) {
        this.jubilado = jubilado;
    }

    public String getConocido_por() {
        return conocido_por;
    }

    public void setConocido_por(String conocido_por) {
        this.conocido_por = conocido_por;
    }

    public String getCapacidadesEspeciales() {
        return CapacidadesEspeciales;
    }

    public void setCapacidadesEspeciales(String CapacidadesEspeciales) {
        this.CapacidadesEspeciales = CapacidadesEspeciales;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }



  
    
    
}
