public class Algoritmo
{
    public int[] arreglo;

    public Algoritmo(int[] arreglo){
        this.arreglo = arreglo;
    }
    public static int[] nump(int n)
    {
        // Declaraciones.

        int minimo = 2;
        int i;
        int j;
        int d = n+1;

        int cuenta=0;

        double raiz = Math.sqrt(d)+1;

        boolean[] tabla = new boolean[d];

        // Ejecucion algoritmo

        if(n >= minimo){

            for(i=0;i<d;i++){
                tabla[i]=true;
            }

            tabla[0] = tabla[1] = false;

            for(i=2;i<raiz;i++){
                if(tabla[i]){
                    for(j=2*i ; j<d ; j+=i){
                        tabla[j]=false;
                    }
                }
            }
            for(i=0;i<d;i++){
                if(tabla[i])
                    cuenta ++;
            }
            int[]nPrim=new int[cuenta];
            for(i=0,j=0;i<d;i++){
                if(tabla[i])
                    nPrim[j++]=i;
            }
            return nPrim;
        }else{
            return new int[0];
        }
    }


}
