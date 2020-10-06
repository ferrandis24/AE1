package es.florida;

public class Act5 {
    public static int getLargest(int[] a, int total) {
        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total - 1];
    }
    public static void main(String args[]) {
        int numeros[] = {37, 82, 164, 3, 65, 36, 80};
        System.out.println("El numero mas grande es " + getLargest(numeros, 7));
    }
}
