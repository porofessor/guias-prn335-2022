package ues.occ.edu.sv.ingenieria.prn335.guia01_2022.entity;

/**
 *
 * @author jose
 */
public class Persona {
    public int id_persona;
    public String nombres;
    public String apellidos;
    public String dui;
    public String nit;
    public String nup;
    public String genero;
    public String fecha_nacimiento;
    public String sistema_previcion;
    public boolean jubilado;
    public String isss;
    public String nombre_isss;
    public String nombre_nup;
    public String nombre_nit;
    public String conocido_por;
    public String numero_pasaporte;
    public String fecha_vencimiento_dui;
    public String numero_iva;
    public String cuenta_bancaria;
    public String tipo_cuenta_bancaria;
    public String banco;

    public Persona(int id_persona, String nombres, String apellidos, String dui, String nit, String nup, String genero, String fecha_nacimiento, String sistema_previcion, boolean jubilado, String isss, String nombre_isss, String nombre_nup, String nombre_nit, String conocido_por, String numero_pasaporte, String fecha_vencimiento_dui, String numero_iva, String cuenta_bancaria, String tipo_cuenta_bancaria, String banco) {
        this.id_persona = id_persona;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dui = dui;
        this.nit = nit;
        this.nup = nup;
        this.genero = genero;
        this.fecha_nacimiento = fecha_nacimiento;
        this.sistema_previcion = sistema_previcion;
        this.jubilado = jubilado;
        this.isss = isss;
        this.nombre_isss = nombre_isss;
        this.nombre_nup = nombre_nup;
        this.nombre_nit = nombre_nit;
        this.conocido_por = conocido_por;
        this.numero_pasaporte = numero_pasaporte;
        this.fecha_vencimiento_dui = fecha_vencimiento_dui;
        this.numero_iva = numero_iva;
        this.cuenta_bancaria = cuenta_bancaria;
        this.tipo_cuenta_bancaria = tipo_cuenta_bancaria;
        this.banco = banco;
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

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNup() {
        return nup;
    }

    public void setNup(String nup) {
        this.nup = nup;
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

    public String getSistema_previcion() {
        return sistema_previcion;
    }

    public void setSistema_previcion(String sistema_previcion) {
        this.sistema_previcion = sistema_previcion;
    }

    public boolean isJubilado() {
        return jubilado;
    }

    public void setJubilado(boolean jubilado) {
        this.jubilado = jubilado;
    }

    public String getIsss() {
        return isss;
    }

    public void setIsss(String isss) {
        this.isss = isss;
    }

    public String getNombre_isss() {
        return nombre_isss;
    }

    public void setNombre_isss(String nombre_isss) {
        this.nombre_isss = nombre_isss;
    }

    public String getNombre_nup() {
        return nombre_nup;
    }

    public void setNombre_nup(String nombre_nup) {
        this.nombre_nup = nombre_nup;
    }

    public String getNombre_nit() {
        return nombre_nit;
    }

    public void setNombre_nit(String nombre_nit) {
        this.nombre_nit = nombre_nit;
    }

    public String getConocido_por() {
        return conocido_por;
    }

    public void setConocido_por(String conocido_por) {
        this.conocido_por = conocido_por;
    }

    public String getNumero_pasaporte() {
        return numero_pasaporte;
    }

    public void setNumero_pasaporte(String numero_pasaporte) {
        this.numero_pasaporte = numero_pasaporte;
    }

    public String getFecha_vencimiento_dui() {
        return fecha_vencimiento_dui;
    }

    public void setFecha_vencimiento_dui(String fecha_vencimiento_dui) {
        this.fecha_vencimiento_dui = fecha_vencimiento_dui;
    }

    public String getNumero_iva() {
        return numero_iva;
    }

    public void setNumero_iva(String numero_iva) {
        this.numero_iva = numero_iva;
    }

    public String getCuenta_bancaria() {
        return cuenta_bancaria;
    }

    public void setCuenta_bancaria(String cuenta_bancaria) {
        this.cuenta_bancaria = cuenta_bancaria;
    }

    public String getTipo_cuenta_bancaria() {
        return tipo_cuenta_bancaria;
    }

    public void setTipo_cuenta_bancaria(String tipo_cuenta_bancaria) {
        this.tipo_cuenta_bancaria = tipo_cuenta_bancaria;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }
    
    
    
    
}
