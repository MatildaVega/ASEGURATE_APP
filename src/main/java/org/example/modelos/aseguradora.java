package org.example.modelos;

public class aseguradora {
    private String nombreAseguradora;
    private String tipoSeguro;
    private String cobertura;
    private String prima;
    private String deductible;
    private String limiteCobertura;
    private String historialReclamacion;
    private String calificacionSatisfaccion;
    private String redServicio;
    private String disponibilidadAtencion;

    public aseguradora() {
    }

    public aseguradora(String nombreAseguradora, String tipoSeguro, String cobertura, String prima, String deductible, String limiteCobertura, String historialReclamacion, String calificacionSatisfaccion, String redServicio, String disponibilidadAtencion) {
        this.nombreAseguradora = nombreAseguradora;
        this.tipoSeguro = tipoSeguro;
        this.cobertura = cobertura;
        this.prima = prima;
        this.deductible = deductible;
        this.limiteCobertura = limiteCobertura;
        this.historialReclamacion = historialReclamacion;
        this.calificacionSatisfaccion = calificacionSatisfaccion;
        this.redServicio = redServicio;
        this.disponibilidadAtencion = disponibilidadAtencion;
    }

    public String getNombreAseguradora() {
        return nombreAseguradora;
    }

    public void setNombreAseguradora(String nombreAseguradora) {
        this.nombreAseguradora = nombreAseguradora;
    }

    public String getTipoSeguro() {
        return tipoSeguro;
    }

    public void setTipoSeguro(String tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public String getPrima() {
        return prima;
    }

    public void setPrima(String prima) {
        this.prima = prima;
    }

    public String getDeductible() {
        return deductible;
    }

    public void setDeductible(String deductible) {
        this.deductible = deductible;
    }

    public String getLimiteCobertura() {
        return limiteCobertura;
    }

    public void setLimiteCobertura(String limiteCobertura) {
        this.limiteCobertura = limiteCobertura;
    }

    public String getHistorialReclamacion() {
        return historialReclamacion;
    }

    public void setHistorialReclamacion(String historialReclamacion) {
        this.historialReclamacion = historialReclamacion;
    }

    public String getCalificacionSatisfaccion() {
        return calificacionSatisfaccion;
    }

    public void setCalificacionSatisfaccion(String calificacionSatisfaccion) {
        this.calificacionSatisfaccion = calificacionSatisfaccion;
    }

    public String getRedServicio() {
        return redServicio;
    }

    public void setRedServicio(String redServicio) {
        this.redServicio = redServicio;
    }

    public String getDisponibilidadAtencion() {
        return disponibilidadAtencion;
    }

    public void setDisponibilidadAtencion(String disponibilidadAtencion) {
        this.disponibilidadAtencion = disponibilidadAtencion;
    }

    @Override
    public String toString() {
        return "aseguradora{" +
                "nombreAseguradora='" + nombreAseguradora + '\'' +
                ", tipoSeguro='" + tipoSeguro + '\'' +
                ", cobertura='" + cobertura + '\'' +
                ", prima='" + prima + '\'' +
                ", deductible='" + deductible + '\'' +
                ", limiteCobertura='" + limiteCobertura + '\'' +
                ", historialReclamacion='" + historialReclamacion + '\'' +
                ", calificacionSatisfaccion='" + calificacionSatisfaccion + '\'' +
                ", redServicio='" + redServicio + '\'' +
                ", disponibilidadAtencion='" + disponibilidadAtencion + '\'' +
                '}';
    }
}
