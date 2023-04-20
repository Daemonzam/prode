import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Path partidosm = Paths.get("partidosmundial.csv");
        Path Apuestasm = Paths.get("Apuestasmundial.txt");

        Scanner l1 = new Scanner(partidosm);
        Scanner l2 = new Scanner(Apuestasm);

        l1.useDelimiter("[,;|\\n\\r]+");
        l2.useDelimiter("[,;|\\n\\r]+");

        Fase fases = new Fase();
        Tarjeta tarjetas = new Tarjeta();

        while(l1.hasNextInt()){
            int nP = l1.nextInt();
            int nF = l1.nextInt();
            String loc = l1.next();
            String visit = l1.next();
            int gL = l1.nextInt();
            int gV = l1.nextInt();

        Partido nuevo = new Partido(nP,nF,loc,visit,gL,gV);
        fases.agregarPartido(nuevo);

        }
        while(l2.hasNextInt()){
            int nP = l2.nextInt();
            String nom = l2.next();
            String ape = l2.next();
            int ap = l2.nextInt();

        Apuesta nueva = new Apuesta(nP,nom,ape,ap);
        tarjetas.agregarApuesta(nueva);

        }

        System.out.println(fases);
        System.out.println(tarjetas);
    }

}
