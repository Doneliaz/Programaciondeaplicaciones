import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Candidato> candidatos = new ArrayList<>();
        int num1, num2, num3;
        num1 = -1;
        num2 = -1;
        num3 = -1;
        do {
            System.out.println("Bienvenido al sistema de votos , presiona 1)para agregar a los candidatos, presiona 2) para agregar voto, Presiona 0 para salir");
            num1 = entrada.nextInt();
            switch (num1) {
                case 1:
                    while (num2 != 0) {
                        String nombre;
                        System.out.printf("Introduce el nombre del candidato");
                        nombre = entrada.next();
                        candidatos.add(new Candidato(candidatos.size(), nombre));
                        System.out.println("Presiona 0 para salir, presiona otro numero para Continuar");
                        num2 = entrada.nextInt();
                    }
                    break;
                case 2:
                    while (num3 != 0) {
                        int i = 0;
                        System.out.println("Inserte el voto de la persona " + (i + 1) + " de la urna en base al numero de candidato");
                        System.out.println("Candidatos");
                        for (int j = 0; j < candidatos.size(); j++) {
                            System.out.println(j + ": " + candidatos.get(j).nombre);
                        }
                        System.out.println("Seleccione el numero de acuerdo al identificador. Presiona 0 para salir");
                        num3 = entrada.nextInt();
                        if (num3 == 0) {
                            break;
                        } else if (num3 > candidatos.size()) {
                            System.out.println("El candidato no existe");
                        } else if (num3 != 0) {
                            candidatos.get(num3).votos++;
                            i++;
                        }
                        obtenerGanador(candidatos);
                        mostrarPorcentajeVotos(candidatos);
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (num1 != 0);
        entrada.close();
    }

    public static void obtenerGanador(ArrayList<Candidato> candidatos) {
        int votos = 0;
        int id = 0;
        for (int i = 0; i < candidatos.size(); i++) {
            if (candidatos.get(i).votos > votos) {
                votos = candidatos.get(i).votos;
                id = i;
            }
        }
        System.out.println("El ganador es: " + candidatos.get(id).nombre + " con " + votos + " votos");
    }

    public static void mostrarPorcentajeVotos(ArrayList<Candidato> candidatos) {
        int totalVotos = 0;
        for (Candidato candidato : candidatos) {
            totalVotos += candidato.votos;
        }
        for (Candidato candidato : candidatos) {
            double porcentaje = (totalVotos == 0) ? 0 : (double) candidato.votos / totalVotos * 100;
            System.out.println(candidato.nombre + " tiene " + candidato.votos + " votos (" + String.format("%.2f", porcentaje) + "%)");
        }
    }
}

class Candidato {
    int id;
    String nombre;
    int votos;

    Candidato(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.votos = 0;
    }
}
