import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Computadora> baseDeDatos = new ArrayList<>();

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Registrar dispositivo");
            System.out.println("2. Mostrar base de datos de dispositivos");
            System.out.println("3. Eliminar dispositivo");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    registrarDispositivo(scanner, baseDeDatos);
                    break;
                case 2:
                    mostrarBaseDeDatos(baseDeDatos);
                    break;
                case 3:
                    eliminarDispositivo(scanner, baseDeDatos);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void registrarDispositivo(Scanner scanner, List<Computadora> baseDeDatos) {
        System.out.println("Seleccione el tipo de dispositivo que desea registrar:");
        System.out.println("1. Laptop");
        System.out.println("2. Desktop");
        System.out.println("3. Smartphone");
        System.out.println("4. Tablet");
        System.out.println("5. Electrodoméstico");
        int tipo = scanner.nextInt();
        scanner.nextLine();  // Consumir la nueva línea

        System.out.println("Ingrese la marca:");
        String marca = scanner.nextLine();
        Computadora dispositivo = null;

        switch (tipo) {
            case 1:
                System.out.println("Ingrese el modelo:");
                String modeloLaptop = scanner.nextLine();
                System.out.println("Ingrese la CPU:");
                String cpuLaptop = scanner.nextLine();
                System.out.println("Ingrese la cantidad de memoria RAM:");
                String ramLaptop = scanner.nextLine();
                System.out.println("Ingrese la capacidad de la batería en miliamperios por hora:");
                String bateriaLaptop = scanner.nextLine();
                dispositivo = new Laptop(marca, modeloLaptop, cpuLaptop, ramLaptop, bateriaLaptop);
                break;
            case 2:
                System.out.println("Ingrese el modelo:");
                String modeloDesktop = scanner.nextLine();
                System.out.println("Ingrese la CPU:");
                String cpuDesktop = scanner.nextLine();
                System.out.println("Ingrese la cantidad de memoria RAM:");
                String ramDesktop = scanner.nextLine();
                System.out.println("Ingrese el modelo de la fuente de poder:");
                String fuentePoder = scanner.nextLine();
                dispositivo = new Destok(marca, modeloDesktop, cpuDesktop, ramDesktop, fuentePoder);
                break;
            case 3:
                System.out.println("Ingrese el modelo:");
                String modeloSmartphone = scanner.nextLine();
                System.out.println("Ingrese la CPU:");
                String cpuSmartphone = scanner.nextLine();
                System.out.println("Ingrese la cantidad de memoria RAM:");
                String ramSmartphone = scanner.nextLine();
                System.out.println("Ingrese la capacidad de la batería en miliamperios por hora:");
                String bateriaSmartphone = scanner.nextLine();
                dispositivo = new Smartphone(marca, modeloSmartphone, cpuSmartphone, ramSmartphone, bateriaSmartphone);
                break;
            case 4:
                System.out.println("Ingrese el modelo:");
                String modeloTablet = scanner.nextLine();
                System.out.println("Ingrese la CPU:");
                String cpuTablet = scanner.nextLine();
                System.out.println("Ingrese la cantidad de memoria RAM:");
                String ramTablet = scanner.nextLine();
                System.out.println("Ingrese la capacidad de la batería en miliamperios por hora:");
                String bateriaTablet = scanner.nextLine();
                dispositivo = new Tablet(marca, modeloTablet, cpuTablet, ramTablet, bateriaTablet);
                break;
            case 5:
                System.out.println("Ingrese el tipo de electrodoméstico:");
                String tipoElectrodomestico = scanner.nextLine();
                System.out.println("Ingrese el consumo energético en kW:");
                String consumo = scanner.nextLine();
                dispositivo = new Electrodomestico(marca, tipoElectrodomestico, consumo);
                break;
            default:
                System.out.println("Tipo de dispositivo no válido.");
                return;
        }
        baseDeDatos.add(dispositivo);
        System.out.println("Dispositivo registrado exitosamente.");
    }

    private static void mostrarBaseDeDatos(List<Computadora> baseDeDatos) {
        if (baseDeDatos.isEmpty()) {
            System.out.println("No hay dispositivos registrados.");
        } else {
            System.out.println("Dispositivos registrados:");
            for (int i = 0; i < baseDeDatos.size(); i++) {
                System.out.println((i + 1) + ". " + baseDeDatos.get(i).mostrarDetalles());
            }
        }
    }

    private static void eliminarDispositivo(Scanner scanner, List<Computadora> baseDeDatos) {
        if (baseDeDatos.isEmpty()) {
            System.out.println("No hay dispositivos registrados.");
            return;
        }

        mostrarBaseDeDatos(baseDeDatos);
        System.out.println("Ingrese el número del dispositivo que desea eliminar:");
        int index = scanner.nextInt() - 1;

        if (index < 0 || index >= baseDeDatos.size()) {
            System.out.println("Número de dispositivo no válido.");
        } else {
            baseDeDatos.remove(index);
            System.out.println("Dispositivo eliminado exitosamente.");
        }
    }
}