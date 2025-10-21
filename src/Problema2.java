public class Problema2 {
    static int max(int[] a){
        int max = a[0];
        for (int x : a){
            if (x > max)
                max = x;
        }
        return max;
    }

    static int min(int[] a){
        int min = a[0];
        for (int x : a){
            if (x < min)
                min = x;
        }
        return min;
    }

    static int summax(int[] a){
        int suma = 0;
        for (int x : a){
            suma += x;
        }
        return suma - min(a);
    }

    static int summin(int[] a){
        int suma = 0;
        for (int x : a){
            suma += x;
        }
        return suma - max(a);
    }

    public static void main(String[] args) {
        int[] a = {4, 8, 3, 10, 17};
        System.out.println("Maxim: " + max(a));
        System.out.println("Minim: " + min(a));
        System.out.println("Suma maxima: " + summax(a));
        System.out.println("Suma minima: " + summin(a));
    }

}
