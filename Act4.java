package es.florida;

public class Act4 {
    public static void main(String[] args) {
        double factorial = 1;
        double numero = 15;
        while (numero != 0) {
            factorial = factorial * numero;
            numero--;
        }
        System.out.println(factorial);
    }
}
