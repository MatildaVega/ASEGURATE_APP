package org.example.modelos;

public class asegurado {

    private String nombre;
    private String apellido;
    private String identificacion;
    private String direccion;
    private String telefono;
    private String tipoSeguro;
    private String fechaInicioPoliza;
    private String estadoPoliza;
    private String historialReclamacion;

    public asegurado() {
    }

    public asegurado(String nombre, String apellido, String identificacion, String direccion, String telefono, String tipoSeguro, String fechaInicioPoliza, String estadoPoliza, String historialReclamacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tipoSeguro = tipoSeguro;
        this.fechaInicioPoliza = fechaInicioPoliza;
        this.estadoPoliza = estadoPoliza;
        this.historialReclamacion = historialReclamacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoSeguro() {
        return tipoSeguro;
    }

    public void setTipoSeguro(String tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    public String getFechaInicioPoliza() {
        return fechaInicioPoliza;
    }

    public void setFechaInicioPoliza(String fechaInicioPoliza) {
        this.fechaInicioPoliza = fechaInicioPoliza;
    }

    public String getEstadoPoliza() {
        return estadoPoliza;
    }

    public void setEstadoPoliza(String estadoPoliza) {
        this.estadoPoliza = estadoPoliza;
    }

    public String getHistorialReclamacion() {
        return historialReclamacion;
    }

    public void setHistorialReclamacion(String historialReclamacion) {
        this.historialReclamacion = historialReclamacion;
    }

    @Override
    public String toString() {
        return "asegurado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", tipoSeguro='" + tipoSeguro + '\'' +
                ", fechaInicioPoliza='" + fechaInicioPoliza + '\'' +
                ", estadoPoliza='" + estadoPoliza + '\'' +
                ", historialReclamacion='" + historialReclamacion + '\'' +
                '}';
    }
}

