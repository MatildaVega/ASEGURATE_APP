package org.example.modelos;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class beneficiario {

    private String nombreBeneficiario;
    private String relacionConAsegurado;
    private LocalDateTime fechaNacimiento;

    private String identificacion;
    private String direccion;
    private String telefono;
    private String correoElectronico;
    private String porcentajeBeneficio;
    private String estadoCivil;
    private String historial;

    public beneficiario() {
    }

    public beneficiario(String nombreBeneficiario, String relacionConAsegurado, LocalDateTime fechaNacimiento, String identificacion, String direccion, String telefono, String correoElectronico, String porcentajeBeneficio, String estadoCivil, String historial) {
        this.nombreBeneficiario = nombreBeneficiario;
        this.relacionConAsegurado = relacionConAsegurado;
        this.fechaNacimiento = fechaNacimiento;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.porcentajeBeneficio = porcentajeBeneficio;
        this.estadoCivil = estadoCivil;
        this.historial = historial;
    }

    public String getNombreBeneficiario() {
        return nombreBeneficiario;
    }

    public void setNombreBeneficiario(String nombreBeneficiario) {
        this.nombreBeneficiario = nombreBeneficiario;
    }

    public String getRelacionConAsegurado() {
        return relacionConAsegurado;
    }

    public void setRelacionConAsegurado(String relacionConAsegurado) {
        this.relacionConAsegurado = relacionConAsegurado;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getPorcentajeBeneficio() {
        return porcentajeBeneficio;
    }

    public void setPorcentajeBeneficio(String porcentajeBeneficio) {
        this.porcentajeBeneficio = porcentajeBeneficio;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        this.historial = historial;
    }

    @Override
    public String toString() {
        return "beneficiario{" +
                "nombreBeneficiario='" + nombreBeneficiario + '\'' +
                ", relacionConAsegurado='" + relacionConAsegurado + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", identificacion='" + identificacion + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", porcentajeBeneficio='" + porcentajeBeneficio + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", historial='" + historial + '\'' +
                '}';
    }
}

