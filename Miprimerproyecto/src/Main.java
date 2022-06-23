import java.util.Scanner;

//Ejercicios Tema 3

//Primera parte

public class Main {
    public static void main(String[] args){
        suma(3, 4, 5);


    }

    public static void suma(int a, int b, int c) {
        int resultant;
        resultant = a + b +c;

        System.out.println(resultant);

    }
}

//Segunda parte

public class Main{
    public static void main(String[] args) {
        coche Micoche = new coche();
        Micoche.AgregarPuerta();
        Micoche.AgregarPuerta();
        Micoche.AgregarPuerta();
        Micoche.AgregarPuerta();
        System.out.println(Micoche.npuertas);
    }

    public static  int suma(int a, int b)  {
        return a + b;
    }
}

class coche {
    public int npuertas = 0;
    public void AgregarPuerta(){
        this.npuertas++;
    }
}

