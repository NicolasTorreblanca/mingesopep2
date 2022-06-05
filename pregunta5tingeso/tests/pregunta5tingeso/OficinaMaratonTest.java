package pregunta5tingeso;

import static org.junit.jupiter.api.Assertions.*;

class OficinaMaratonTest {


    @org.junit.jupiter.api.Test
    void calcularCorredorPrimerPuestoMaraton() {

        Corredor usainBolt = new Corredor("20112321-3","UsainBolt","09:25:00","09:52:00","10:15:50","10:45:05");
        Corredor solezzi = new Corredor("19112321-3","solezzi","09:25:00","09:54:15","10:25:50","11:50:15");
        Corredor rannou = new Corredor("20142021-3","Rannou","09:25:00","09:57:12","10:35:50",null);
        Corredor santis = new Corredor("20112681-3","santis",null,null,null,null);

        OficinaMaraton oficinaMaratonValdivia = new OficinaMaraton();

        oficinaMaratonValdivia.agregarCorredor(usainBolt);
        oficinaMaratonValdivia.agregarCorredor(solezzi);
        oficinaMaratonValdivia.agregarCorredor(rannou);
        oficinaMaratonValdivia.agregarCorredor(santis);

        assertEquals("UsainBolt",oficinaMaratonValdivia.calcularCorredorPrimerPuestoMaraton());
        System.out.println(oficinaMaratonValdivia.calcularCorredorPrimerPuestoMaraton());

    }

    @org.junit.jupiter.api.Test
    void calcularTiempoPromedioCorredores() {
    }

    @org.junit.jupiter.api.Test
    void calcularPorcentajeCorredoresQueLlegaronMeta() {
    }

    @org.junit.jupiter.api.Test
    void calcularPorcentajeCorredoresInscritosQueNOCorrieron() {
    }
}