import static org.junit.jupiter.api.Assertions.*;

class AlgoritmoTest {

    @org.junit.jupiter.api.Test
    void testAlgoritmo() {
        int[] resultado1 = Algoritmo.num_p(1);
        for(int i = 0; i < resultado1.length;i++){
            System.out.println(resultado1[i]);
        }
        int[] resultado2 = Algoritmo.num_p(5);
        for(int i = 0; i < resultado2.length;i++){
            System.out.println(resultado2[i]);
        }
        int[] resultado3 = Algoritmo.num_p(13);
        for(int i = 0; i < resultado3.length;i++){
            System.out.println(resultado3[i]);
        }

    }
}