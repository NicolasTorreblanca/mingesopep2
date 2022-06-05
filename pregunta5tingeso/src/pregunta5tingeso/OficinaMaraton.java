package pregunta5tingeso;

import java.util.*;

import static jdk.nashorn.internal.objects.ArrayBufferView.length;
import static jdk.nashorn.internal.objects.NativeMap.size;

public class OficinaMaraton {


    private ArrayList<Corredor> listaCorredores;

    OficinaMaraton(){
        this.listaCorredores =  new ArrayList() ;
    }

    public void agregarCorredor(Corredor corredor){
        this.listaCorredores.add(corredor);
    }
    public int cantidadCorredores(){return this.listaCorredores.size();}

    public String calcularCorredorPrimerPuestoMaraton(){

        int indicePrimerLugar = 0;
        int medicionTiempo = 0;
        if(cantidadCorredores()==0){
            return "No hay corredores registrados";
        } else if (cantidadCorredores()==1) {
            return "Solo hay un corredor registrado";
        }
        int mejorTiempoActual = this.listaCorredores.get(0).tiempoMaraton();
        for(int i = 1;i < cantidadCorredores();i++){
            if(listaCorredores.get(i).corredorFinaliza()){
                medicionTiempo = this.listaCorredores.get(i).tiempoMaraton();
                if((medicionTiempo < mejorTiempoActual) & (medicionTiempo != 0) ){
                    mejorTiempoActual = medicionTiempo;
                    indicePrimerLugar = i;
                }
            }
        }
        return listaCorredores.get(indicePrimerLugar).getNombre();
    }

    public String calcularTiempoPromedioCorredores(){

        int tiempoTotal = 0;
        int tiempoMedio = 0;
        if(cantidadCorredores()==0){
            return "No hay corredores registrados";
        } else if (cantidadCorredores()==1) {
            return "Solo hay un corredor registrado";
        }
        for(int i = 0;i < cantidadCorredores();i++){
            if(listaCorredores.get(i).corredorFinaliza()){
                tiempoTotal = tiempoTotal + listaCorredores.get(i).tiempoMaraton();
            }
        }
        tiempoMedio = tiempoTotal/cantidadCorredores();

        String tiempoSegundos = String.valueOf(tiempoMedio);

        String salida = "Tiempo medio fue de :"+ tiempoSegundos;

        return salida ;
    }

    public String calcularPorcentajeCorredoresQueLlegaronMeta(){
        int finalizadores = 0;
        double porcentajefinalizadores = 0.0;

        if(cantidadCorredores()==0){
            return "No hay corredores registrados";
        } else if (cantidadCorredores()==1) {
            return "Solo hay un corredor registrado";
        }
        for(int i = 0;i < cantidadCorredores();i++){
            if(listaCorredores.get(i).corredorFinaliza()){
                finalizadores = finalizadores +1;
            }
        }

        porcentajefinalizadores = (finalizadores/cantidadCorredores())*100;

        String porcentaje = String.valueOf(porcentajefinalizadores);

        return "El porcentaje de corredores que termino la carrera fue"+porcentaje+"%";
    }

    public String calcularPorcentajeCorredoresInscritosQueNOCorrieron(){

        int noCorredores = 0;
        double porcentajeNoCorredores = 0.0;

        if(cantidadCorredores()==0){
            return "No hay corredores registrados";
        } else if (cantidadCorredores()==1) {
            return "Solo hay un corredor registrado";
        }
        for(int i = 0;i < cantidadCorredores();i++){
            if (listaCorredores.get(i).corredorInscrito() & !(listaCorredores.get(i).corredorComienza())) {
                noCorredores = noCorredores +1 ;
            }
        }

        porcentajeNoCorredores = (noCorredores/cantidadCorredores())*100;

        return "El porcentaje de corredores inscritos que no corrieron fue"+porcentajeNoCorredores+"%";

    }

}