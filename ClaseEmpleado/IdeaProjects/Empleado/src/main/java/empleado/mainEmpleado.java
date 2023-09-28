package empleado;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class mainEmpleado {
    public static void main(String[] args) {

        List<Empleado> listaEmpleados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opciones;

        do {

            System.out.println("Informacion del empleado");
            System.out.println("==========================");
            System.out.println("ingrese solo el numero correspondiente");


            System.out.println("1. Nombre del Empleado");
            System.out.println("2. Correo Electronico");
            System.out.println("3. Nombre de la empresa perteneciente");
            System.out.println("4. Rol del empleado");
            System.out.println("5. salir del pregrama");

            opciones = scanner.nextInt();
            scanner.nextLine();

            switch (opciones) {

                case 1:
                    System.out.println("Agregue el nombre del empleado: ");
                    String nombreEmpleado = scanner.nextLine();

                    String decisión;

                    decisión = "si";
                    decisión = "no";

                    System.out.println("¿Deseas modificar el nombre anterior? si/no");
                    Scanner scanner1 = new Scanner(System.in);
                    decisión = scanner.nextLine();

                    if (decisión.equals("si")) {

                        System.out.println("ingrese el nuevo nombre del empleado: ");
                        String Nuevoempleado = scanner.nextLine();
                        nombreEmpleado = Nuevoempleado;

                        System.out.println("el anterior nombre se ha modificado a: " + Nuevoempleado);

                    } else {
                        System.out.println("continue llenando la informacion solicitada");
                    }
                    break;

                case 2:
                    System.out.println("Ingrese un correo electronico:");
                    String correoEmpleado = scanner.nextLine();

                    while (!correoEmpleado.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$")) {
                        System.out.println("Correo electrónico invalido. Ingreselo nuevamente:");
                        correoEmpleado = scanner.nextLine();
                    }

                    String decisión1;

                    decisión1 = "si";
                    decisión1 = "no";

                    System.out.println("¿Quieres modificar el correo electronico anterior? si/no");
                    Scanner scanner2 = new Scanner(System.in);
                    decisión1 = scanner.nextLine();

                    if (decisión1.equals("si")) {

                        System.out.println("añada un nuevo correo electronico");
                        String correoNuevo = scanner.nextLine();
                        correoEmpleado = correoNuevo;

                        System.out.println("el anterior correo electronico se ha modificado a: " + correoNuevo);

                    } else {
                        System.out.println("Continue llenando la informacion solicitada");

                    }
                    break;

                case 3:
                    System.out.println("ingrese el nombre de la empresa a la cual pertenece: ");
                    String empresaPerteneciente = scanner.nextLine();

                    String decisión2;

                    decisión2 = "si";
                    decisión2 = "no";

                    System.out.println("¿Gustas cambiar el nombre de la empresa anterior? si/no ");
                    Scanner scanner3 = new Scanner(System.in);
                    decisión2 = scanner.nextLine();

                    if (decisión2.equals("si")) {

                        System.out.println("ingrese el nuevo nombre de la empresa a la cual pertenece: ");
                        String nuevaEmpresa = scanner.nextLine();
                        empresaPerteneciente = nuevaEmpresa;

                        System.out.println("la anterior empresa perteneciente se ha modificado a: " + nuevaEmpresa);

                    } else {
                        System.out.println(" Continue llenando la informacion solicitada");
                    }
                    break;

                case 4:
                    String decisión3;
                    decisión3 = "administrador";
                    boolean modificarRol = true;

                    System.out.println("seleccione su rol correspondiente: administrador/operario");
                    decisión3 = scanner.nextLine();

                    while (!decisión3.equals("administrador") && !decisión3.equals("operario")) {
                        System.out.println("El valor ingresado no es válido. Ingrese 'administrador' o 'operario'.");
                        decisión3 = scanner.nextLine();
                    }

                    System.out.println("su rol es: " + decisión3);
                    System.out.println("============================================");

                    System.out.println("¿Deseas modificar el rol anterior?: si/no");
                    Scanner scanner4 = new Scanner(System.in);
                    String nuevoRol = scanner4.nextLine();

                    if (decisión3.equals("si")) {

                        while (!nuevoRol.equals("administrador") && !nuevoRol.equals("operario")) {
                            System.out.println("El valor ingresado no es válido. Ingrese 'administrador' o 'operario'.");
                            nuevoRol = scanner4.nextLine();
                        }


                    } else {
                        modificarRol = false;
                    }
                    System.out.println("su rol correspondiente es: " + decisión3);

                    break;

                case 5:
                    System.out.println("Saliendo del Programa");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opción no Valida");

            }
        }while (opciones != 5) ;
    }
}