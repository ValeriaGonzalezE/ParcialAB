package ParcialA;

import java.util.Scanner;

import ParcialA.Cohete;
import ParcialA.Interplaneta;
import ParcialA.NaveEspacial;
import ParcialA.Satelite;
import ParcialA.Transbordador;

public class Main {
    private static final int MAX_NAVES = 9;
    private static NaveEspacial[] inventario = new NaveEspacial[MAX_NAVES];
    private static int contadorNaves = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean terminar = false;

        while (!terminar) {
            System.out.println("Que tipo de nave deseas crear?");
            System.out.println();
            System.out.println("1. Satelite");
            System.out.println("2. Cohete");
            System.out.println("3. Transbordador Espacial");
            System.out.println("4. Nave Interplanetaria");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crearSatelite();
                    break;
                case 2:
                    crearCohete();
                    break;
                case 3:
                    crearTransbordadorEspacial();
                    break;
                case 4:
                    crearNaveInterplanetaria();
                    break;
                case 5:
                    terminar = true;
                    break;
                default:
                    System.out.println("Opcion inexistente");
                    break;
            }
        }
        System.out.println();
        System.out.println("Programa finalizado.");
        System.out.println();
        boolean fin = false;
        while (!fin) {
        System.out.println("Desea buscar alguna nave?");
        System.out.println("1. Si");
        System.out.println("2. No");
        
        int buscar = scanner.nextInt();
        
        if(buscar==1) {
        	System.out.println("que nave desea buscar?");
        	System.out.println("1. Satelite");
            System.out.println("2. Cohete");
            System.out.println("3. Transbordador Espacial");
            System.out.println("4. Nave Interplanetaria");
            System.out.println("no deseo buscar naves, salir");
            System.out.println();
            int nave = scanner.nextInt();
            
            switch (nave) {
            case 1:
                buscarNave("Satelite");
                break;

            case 2:
                buscarNave("Cohete");
                break;

            case 3:
                buscarNave("Transbordador");
                break;

            case 4:
                buscarNave("Interplaneta");
                break;

            case 5:
            	fin = true;;
                break;
            default:
                System.out.println("Opción inexistente");
                break;
        }
        }else if(buscar==2) {
        	
        	fin = true;
       
        	}else {
        		System.out.println("opcion inexistente");
        	}
        	}
        }
    
    private static void crearSatelite() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el peso del satelite:");
        double peso = scanner.nextDouble();

        System.out.println("Ingrese la capacidad del satelite:");
        double capacidad = scanner.nextDouble();

        System.out.println("Ingrese la velocidad maxima del satelite:");
        double velocidadMaxima = scanner.nextDouble();

        System.out.println("Ingrese la orbita del satelite:");
        String orbita = scanner.next();
        
        System.out.println();
        Satelite satelite = new Satelite(peso, capacidad, velocidadMaxima, orbita);
        agregarNave(satelite);
    }

    private static void crearCohete() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el peso del cohete:");
        double peso = scanner.nextDouble();

        System.out.println("Ingrese la capacidad del cohete:");
        double capacidad = scanner.nextDouble();

        System.out.println("Ingrese la velocidad maxima del cohete:");
        double velocidadMaxima = scanner.nextDouble();

        System.out.println("Ingrese el propulsor del cohete:");
        String propulsor = scanner.next();
        
        System.out.println();

        Cohete cohete = new Cohete(peso, capacidad, velocidadMaxima, propulsor);
        agregarNave(cohete);
    }

    private static void crearTransbordadorEspacial() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el peso del transbordador espacial:");
        double peso = scanner.nextDouble();

        System.out.println("Ingrese la capacidad del transbordador espacial:");
        double capacidad = scanner.nextDouble();

        System.out.println("Ingrese la velocidad maxima del transbordador espacial:");
        double velocidadMaxima = scanner.nextDouble();

        System.out.println("Ingrese el numero de astronautas del transbordador espacial:");
        int numAstronautas = scanner.nextInt();
        
        System.out.println();

        Transbordador transbordador = new Transbordador(peso, capacidad, velocidadMaxima, numAstronautas);
        agregarNave(transbordador);
    }

    private static void crearNaveInterplanetaria() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el peso de la nave interplanetaria:");
        double peso = scanner.nextDouble();

        System.out.println("Ingrese la capacidad de la nave interplanetaria:");
        double capacidad = scanner.nextDouble();

        System.out.println("Ingrese la velocidad maxima de la nave interplanetaria:");
        double velocidadMaxima = scanner.nextDouble();

        System.out.println("Ingrese el sistema de propulsion de la nave interplanetaria:");
        String sistemaPropulsion = scanner.next();
        
        System.out.println();

        Interplaneta naveInterplanetaria = new Interplaneta(peso, capacidad, velocidadMaxima, sistemaPropulsion);
        agregarNave(naveInterplanetaria);
    }

    private static void agregarNave(NaveEspacial naveInterplanetaria) {
        if (contadorNaves < MAX_NAVES) {
            inventario[contadorNaves] = naveInterplanetaria;
            contadorNaves++;
            System.out.println("Nave agregada al inventario.");
        } else {
            System.out.println("El inventario de naves esta lleno. No se puede agregar mas naves.");
        }
    }
    
    

    public static void buscarNave(String tipoNave) {
        boolean encontrada = false;
        for (NaveEspacial nave : inventario) {
            if (nave != null && nave.getClass().getSimpleName().equalsIgnoreCase(tipoNave)) {
                encontrada = true;
                System.out.println("Nave encontrada en el inventario: " + nave.getClass().getSimpleName());
                System.out.println(nave.toString()); // Muestra el contenido de la nave
                break;
            }
        }
        if (!encontrada) {
            System.out.println("Nave no encontrada en el inventario.");
        }
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	


