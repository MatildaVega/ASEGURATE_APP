package org.example;

import org.example.modelos.accidente;
import org.example.modelos.asegurado;
import org.example.modelos.beneficiario;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {




        asegurado aseguradoUno=new asegurado();
        asegurado aseguradoDos=new asegurado("juanjo","villegas","43912045","cll 33 # 65 b","312485612","premium","17/01/2024","vigente","N/A");



        System.out.println(aseguradoUno);
        System.out.println(aseguradoDos);



        System.out.println(aseguradoUno.setNombre();

        System.out.println(aseguradoUno.setApellido();

        System.out.println(aseguradoUno.setIdentificacion();

        System.out.println(aseguradoUno.setDireccion();

        System.out.println(aseguradoUno.setTelefono();

        System.out.println(aseguradoUno.setTipoSeguro();

        System.out.println(aseguradoUno.setFechaInicioPoliza();

        System.out.println(aseguradoUno.setEstadoPoliza();

        System.out.println(aseguradoUno.setHistorialReclamacion();





        beneficiario beneficiarioUno= new beneficiario();
        beneficiario beneficiarioDos= new beneficiario("matilda","madre", LocalDateTime.now(),"15200243","cll 35 # 54 b","45622325","matilda@gmail.com","80%","soltero","N/A");

        System.out.println(beneficiarioUno);
        System.out.println(beneficiarioDos);



        beneficiarioUno.setRelacionConAsegurado();
        beneficiarioUno.setFechaNacimiento();
        beneficiarioUno.setIdentificacion();
        beneficiarioUno.setDireccion();
        beneficiarioUno.setTelefono();
        beneficiarioUno.setCorreoElectronico();
        beneficiarioUno.setPorcentajeBeneficio();
        beneficiarioUno.setEstadoCivil();
        beneficiarioUno.setHistorial();



    }
}