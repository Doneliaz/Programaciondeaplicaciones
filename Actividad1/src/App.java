import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        ArrayList candidatos = new ArrayList<>();
        int num1, num2, num3;
        num1 = -1;
        num2 = -1;
        num3 = -1;
        do{
           System.out.println("Bienvenido al sistema de votos , presiona 1)para agregar a los candidatos, presiona 2) para agregar votos");
           num1 = entrada.nextInt();
            switch(num1){
                case 1:
                do{
                    int i = 0;
                    System.out.println("introduce el candidato numero " + i + ", Presiona 0 para salir");
                    num2 = entrada.nextInt()
                    while(num2 != 0){
                        
                    }

                }while (num2 != 0);
            }

            
        } while (num1 != 0);
        entrada.close();
    }

    public registrarCandidato(){
        String nombre;
        System.out.printf("Introduce el nombre del candidato");
        nombre = entrada.netxLine();
        
}
