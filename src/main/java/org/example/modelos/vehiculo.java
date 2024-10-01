package org.example.modelos;

import java.time.LocalDate;
import java.util.StringJoiner;

public class vehiculo {

    private String marca;
    private String modelo;
    private LocalDate año;
    private String kilometraje;
    private String tipoCombustible;
    private String transmision;
    private String color;
    private String numeroPuertas;
    private  String tipoCarroceria;
    private String potenciaMotor;
    private String numeroAsiento;
    private String equipoSeguridad;
    private String tecnologia;
    private String historialMantenimiento;
    private String precio;

    public vehiculo() {
    }

    public vehiculo(String marca, String modelo, LocalDate año, String kilometraje, String tipoCombustible, String transmision, String color, String numeroPuertas, String tipoCarroceria, String potenciaMotor, String numeroAsiento, String equipoSeguridad, String tecnologia, String historialMantenimiento, String precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.kilometraje = kilometraje;
        this.tipoCombustible = tipoCombustible;
        this.transmision = transmision;
        this.color = color;
        this.numeroPuertas = numeroPuertas;
        this.tipoCarroceria = tipoCarroceria;
        this.potenciaMotor = potenciaMotor;
        this.numeroAsiento = numeroAsiento;
        this.equipoSeguridad = equipoSeguridad;
        this.tecnologia = tecnologia;
        this.historialMantenimiento = historialMantenimiento;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getAño() {
        return año;
    }

    public void setAño(LocalDate año) {
        this.año = año;
    }

    public String getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(String numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    public String getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(String potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public String getEquipoSeguridad() {
        return equipoSeguridad;
    }

    public void setEquipoSeguridad(String equipoSeguridad) {
        this.equipoSeguridad = equipoSeguridad;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String getHistorialMantenimiento() {
        return historialMantenimiento;
    }

    public void setHistorialMantenimiento(String historialMantenimiento) {
        this.historialMantenimiento = historialMantenimiento;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", kilometraje='" + kilometraje + '\'' +
                ", tipoCombustible='" + tipoCombustible + '\'' +
                ", transmision='" + transmision + '\'' +
                ", color='" + color + '\'' +
                ", numeroPuertas='" + numeroPuertas + '\'' +
                ", tipoCarroceria='" + tipoCarroceria + '\'' +
                ", potenciaMotor='" + potenciaMotor + '\'' +
                ", numeroAsiento='" + numeroAsiento + '\'' +
                ", equipoSeguridad='" + equipoSeguridad + '\'' +
                ", tecnologia='" + tecnologia + '\'' +
                ", historialMantenimiento='" + historialMantenimiento + '\'' +
                ", precio='" + precio + '\'' +
                '}';
    }
}
