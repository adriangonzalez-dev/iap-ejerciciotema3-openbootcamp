public class App {
    public static void main(String[] args){
        /* Ejercicio 1 */
        int resultado = 0;
        resultado = suma(4,4,5);
        System.out.println(resultado);

        /* Ejercicio 2 */
        Coche miCoche = new Coche();
        miCoche.AumentarPuertas();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }

}

class Coche {
    public int puertas = 0;

    public void AumentarPuertas(){
        this.puertas++;
    }
}
