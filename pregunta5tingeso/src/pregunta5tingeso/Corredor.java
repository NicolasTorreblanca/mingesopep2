package pregunta5tingeso;

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

    public boolean corredorInscrito(){
        if((getNombre()!= null & getRut() != null)){
            return true;
        }
        return false;
    }
    public boolean corredorComienza(){
        if((getCheckPointPartida() != null)& corredorInscrito()){
                return true;
            }
        return false;
    }

    public boolean corredorFinaliza(){
        if((getCheckPointLlegada()!= null) & corredorComienza()){
            if((getCheckPoint1()!= null)&(getCheckPoint2()!=null)){
                return true;
            }
        }
        return false;
    }





    public int tiempoMaraton(){

        int tiempoP = 0;
        int tiempoF = 0;
        int tiempoTotal = 0;

        String partida = this.checkPointPartida;
        String llegada = this.checkPointLlegada;

        String[] hmsP = partida.split(":");
        String[] hmsF = llegada.split(":");

        tiempoP = tiempoP +Integer.parseInt(hmsP[0])*60*60;
        tiempoP = tiempoP +Integer.parseInt(hmsP[1])*60;
        tiempoP = tiempoP +Integer.parseInt(hmsP[2]);

        tiempoF = tiempoF +Integer.parseInt(hmsF[0])*60*60;
        tiempoF = tiempoF +Integer.parseInt(hmsF[1])*60;
        tiempoF = tiempoF +Integer.parseInt(hmsF[2]);

        tiempoTotal = tiempoF - tiempoP;

        if(tiempoTotal < 0){
            return 0;
        }

        return tiempoTotal;
    }
}