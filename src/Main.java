import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;

        do {
            System.out.println("--CALCULADORA--");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");

            System.out.println("Digite una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    suma();
                    break;
                case 2:
                    resta();;
                    break;
                case 3:
                    multiplicacion();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }while(opcion != 5);
        System.out.println("Calculadora Apagada");
    }

    public static void suma(){
        System.out.println("---OPERACIÓN SUMA---");
        System.out.println("Digite el primer numero");
        int numero1 = scanner.nextInt();
        System.out.println("Digite el segundo numero");
        int numero2 = scanner.nextInt();
        int resultado = numero1 + numero2;
        System.out.println("El resultado es: " + resultado);
    }

    public static void resta(){
        System.out.println("---OPERACIÓN RESTA---");
        System.out.println("Digite el primer numero");
        int numero1 = scanner.nextInt();
        System.out.println("Digite el segundo numero");
        int numero2 = scanner.nextInt();
        int resultado = numero1 - numero2;
        System.out.println("El resultado es: " + resultado);
    }

    public static void multiplicacion(){
        System.out.println("---OPERACIÓN MULTIPLICACION---");
        System.out.println("Digite el primer numero");
        int numero1 = scanner.nextInt();
        System.out.println("Digite el segundo numero");
        int numero2 = scanner.nextInt();
        int resultado = numero1 * numero2;
        System.out.println("El resultado es: " + resultado);
    }

    public static void division(){
        System.out.println("---OPERACIÓN DIVISION---");
        System.out.println("Digite el primer numero");
        float numero1 = scanner.nextInt();
        System.out.println("Digite el segundo numero");
        float numero2 = scanner.nextInt();
        if (numero2 == 0) {
            System.out.println("No se puede realizar una división entre cero");
        }
        else {
                float resultado = numero1 / numero2;
                System.out.println("El resultado es: " + resultado);
        }
    }

}