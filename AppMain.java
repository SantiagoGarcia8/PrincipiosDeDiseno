import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppMain {

    public static void main(String[] args) {
        List<Ave> avesRegistradas = new ArrayList<>();
        Ave ave1 = new Pinguino(new NoVuelo(), new Nadar());
        Ave ave2 = new Tucan(new Vuelo(), new NoNadar());
        avesRegistradas.add(ave1);
        avesRegistradas.add(ave2);
        int opcion = 0;        
        Scanner teclado = new Scanner(System.in);
        
        do {
            String menu = "1. Listar aves\n2.Tucan\n3.Pinguino\n4.Salir";
            System.out.println(menu);
            opcion = teclado.nextInt();
            switch(opcion) {
                case 1 -> {
                    avesRegistradas.forEach(System.out::println);
                }
                case 2 -> System.out.println(ave2.toString());
                case 3 -> System.out.println(ave1.toString());
                case 4 -> System.out.println("Hasta luego :)");
            }            
        } while(opcion != 4);
    }
}
