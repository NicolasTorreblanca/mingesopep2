package com.example.Ejercicicio5mingeso;

public class Corredor{

    private final String rut;
    private final String nombre;
    private final String checkPointPartida;
    private final String checkPoint1;
    private final String checkPoint2;
    private final String checkPointLlegada;



    public Corredor(String rut_C,String nombre_C, String checkPointPartida_C,String checkPoint1_C, String checkPoint2_C,String checkPointLlegada_C){

        rut = rut_C;
        nombre = nombre_C;
        checkPointPartida = checkPointPartida_C;
        checkPoint1 = checkPoint1_C;
        checkPoint2 = checkPoint2_C;
        checkPointLlegada = checkPointLlegada_C;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }
    public String getCheckPoint1() {
        return checkPoint1;
    }
    public String getCheckPoint2() {
        return checkPoint2;
    }
    public String getCheckPointLlegada() {
        return checkPointLlegada;
    }
    public String getCheckPointPartida() {
        return checkPointPartida;
    }
}