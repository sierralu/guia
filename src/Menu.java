import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Metodos calculadora = new Metodos();

        int opcion;
        do {
            System.out.println("Seleccione la operacion:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Raiz cuadrada");
            System.out.println("6. Seno");
            System.out.println("7. Coseno");
            System.out.println("8. Tangente");
            System.out.println("9. Cotangente");
            System.out.println("10. Secante");
            System.out.println("11. Cosecante");
            System.out.println("12. Elevar al cuadrado");
            System.out.println("13. Elevar a una potencia");
            System.out.println("14. Calcular IVA");
            System.out.println("15. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    realizarOperacion(calculadora, scanner, "suma");
                    break;
                case 2:
                    realizarOperacion(calculadora, scanner, "resta");
                    break;
                case 3:
                    realizarOperacion(calculadora, scanner, "multiplicacion");
                    break;
                case 4:
                    realizarOperacion(calculadora, scanner, "division");
                    break;
                case 5:
                    realizarOperacion(calculadora, scanner, "raiz");
                    break;
                case 6:
                    realizarOperacion(calculadora, scanner, "seno");
                    break;
                case 7:
                    realizarOperacion(calculadora, scanner, "coseno");
                    break;
                case 8:
                    realizarOperacion(calculadora, scanner, "tangente");
                    break;
                case 9:
                    realizarOperacion(calculadora, scanner, "cotangente");
                    break;
                case 10:
                    realizarOperacion(calculadora, scanner, "secante");
                    break;
                case 11:
                    realizarOperacion(calculadora, scanner, "cosecante");
                    break;
                case 12:
                    realizarOperacion(calculadora, scanner, "alcuadrado");
                    break;
                case 13:
                    realizarOperacion(calculadora, scanner, "alapotencia");
                    break;
                case 14:
                    calcularIVA(calculadora, scanner);
                    break;
                case 15:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 15);
    }

    private static void realizarOperacion(Metodos calculadora, Scanner scanner, String operacion) {
        System.out.println("Ingrese el primer numero:");
        String num1 = scanner.next();

        System.out.println("Ingrese el segundo numero:");
        String num2 = scanner.next();

        switch (operacion) {
            case "suma":
                calculadora.suma(num1);
                break;
            case "resta":
                calculadora.resta(num1);
                break;
            case "multiplicacion":
                calculadora.multiplicacion(num1);
                break;
            case "division":
                if (!num2.equals("0")) {
                    calculadora.division(num1);
                } else {
                    System.out.println("No se puede dividir por 0");
                }
                break;
            case "raiz":
                calculadora.raiz(num1);
                break;
            case "seno":
                calculadora.seno(num1);
                break;
            case "coseno":
                calculadora.coseno(num1);
                break;
            case "tangente":
                calculadora.tangente(num1);
                break;
            case "cotangente":
                calculadora.cotangente(num1);
                break;
            case "secante":
                calculadora.secante(num1);
                break;
            case "cosecante":
                calculadora.cosecante(num1);
                break;
            case "alcuadrado":
                calculadora.alcuadrado(num1);
                break;
            case "alapotencia":
                calculadora.alapotencia(num1);
                break;
            default:
                break;
        }

        double resultado = calculadora.resultado(num2);
        System.out.println("Resultado de la " + operacion + ": " + resultado);
    }

    private static void calcularIVA(Metodos calculadora, Scanner scanner) {
        System.out.println("Ingrese la cantidad:");
        double cantidad = scanner.nextDouble();
        System.out.println("Ingrese el porcentaje de IVA:");
        double porcentajeIVA = scanner.nextDouble();
        double resultadoIVA = calculadora.calcularIva(cantidad, porcentajeIVA);
        System.out.println("Resultado del IVA: " + resultadoIVA);
    }
}
