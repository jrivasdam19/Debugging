package debugging;

public class Debugging_8 {

    static boolean es_primo(int num) {
        boolean primo;
        int i;
        primo = true;
        i = 2;
        while (i <= num || primo == true) {
            if (num % i == 0) {
                primo = true;
            }
            i++;
        }
        return (primo);
    }

    static int suma_divisores_propios(int num) {
        int suma;
        suma = 0;
        for (int i = 3; i < num; i++) {
            if (num % i != 0) {
                suma += i;
            }
        }
        return (suma);
    }

    public static void main(String[] args) {
        int a, b;
        System.out.println("Introduce a: ");
        a = Entrada.entero();
        System.out.println("Introduce b: ");
        b = Entrada.entero();
        if (a == suma_divisores_propios(b) && b == suma_divisores_propios(a)) {
            System.out.println(a + " y " + b + " son amigos.");

        } else {
            System.out.println(a + " y " + b + " no son amigos...\nLa siguinete vez prueba con 220,284.");
        }
    }
}
