package org.example.modelos;

import java.time.LocalDate;

public class accidente {

    private String tipoAccidente;
    private String causas;
    private String condicionesAmbientales;
    private String lesionados;
    private String tipoLesiones;
    private String vehiculosInvolucrados;
    private LocalDate fechaAccidente;
    private String impactoPsicologico;
    private String costosEconomicos;
    private String proteccionesUsados;

    public accidente() {
    }

    public accidente(String tipoAccidente, String causas, String condicionesAmbientales, String lesionados, String tipoLesiones, String vehiculosInvolucrados, LocalDate fechaAccidente, String impactoPsicologico, String costosEconomicos, String proteccionesUsados) {
        this.tipoAccidente = tipoAccidente;
        this.causas = causas;
        this.condicionesAmbientales = condicionesAmbientales;
        this.lesionados = lesionados;
        this.tipoLesiones = tipoLesiones;
        this.vehiculosInvolucrados = vehiculosInvolucrados;
        this.fechaAccidente = fechaAccidente;
        this.impactoPsicologico = impactoPsicologico;
        this.costosEconomicos = costosEconomicos;
        this.proteccionesUsados = proteccionesUsados;
    }

    public String getTipoAccidente() {
        return tipoAccidente;
    }

    public void setTipoAccidente(String tipoAccidente) {
        this.tipoAccidente = tipoAccidente;
    }

    public String getCausas() {
        return causas;
    }

    public void setCausas(String causas) {
        this.causas = causas;
    }

    public String getCondicionesAmbientales() {
        return condicionesAmbientales;
    }

    public void setCondicionesAmbientales(String condicionesAmbientales) {
        this.condicionesAmbientales = condicionesAmbientales;
    }

    public String getLesionados() {
        return lesionados;
    }

    public void setLesionados(String lesionados) {
        this.lesionados = lesionados;
    }

    public String getTipoLesiones() {
        return tipoLesiones;
    }

    public void setTipoLesiones(String tipoLesiones) {
        this.tipoLesiones = tipoLesiones;
    }

    public String getVehiculosInvolucrados() {
        return vehiculosInvolucrados;
    }

    public void setVehiculosInvolucrados(String vehiculosInvolucrados) {
        this.vehiculosInvolucrados = vehiculosInvolucrados;
    }

    public LocalDate getFechaAccidente() {
        return fechaAccidente;
    }

    public void setFechaAccidente(LocalDate fechaAccidente) {
        this.fechaAccidente = fechaAccidente;
    }

    public String getImpactoPsicologico() {
        return impactoPsicologico;
    }

    public void setImpactoPsicologico(String impactoPsicologico) {
        this.impactoPsicologico = impactoPsicologico;
    }

    public String getCostosEconomicos() {
        return costosEconomicos;
    }

    public void setCostosEconomicos(String costosEconomicos) {
        this.costosEconomicos = costosEconomicos;
    }

    public String getProteccionesUsados() {
        return proteccionesUsados;
    }

    public void setProteccionesUsados(String proteccionesUsados) {
        this.proteccionesUsados = proteccionesUsados;
    }

    @Override
    public String toString() {
        return "accidente{" +
                "tipoAccidente='" + tipoAccidente + '\'' +
                ", causas='" + causas + '\'' +
                ", condicionesAmbientales='" + condicionesAmbientales + '\'' +
                ", lesionados='" + lesionados + '\'' +
                ", tipoLesiones='" + tipoLesiones + '\'' +
                ", vehiculosInvolucrados='" + vehiculosInvolucrados + '\'' +
                ", fechaAccidente=" + fechaAccidente +
                ", impactoPsicologico='" + impactoPsicologico + '\'' +
                ", costosEconomicos='" + costosEconomicos + '\'' +
                ", proteccionesUsados='" + proteccionesUsados + '\'' +
                '}';
    }
}
