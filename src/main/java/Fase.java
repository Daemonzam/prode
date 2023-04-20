import java.util.ArrayList;
import java.util.HashMap;

public class Fase {
    private HashMap<Integer, Partido> fases;
    public HashMap<Integer, Partido> getFases() {
        return fases;
    }
    public void setFases(HashMap<Integer, Partido> fases) {
        this.fases = fases;
    }
    public Fase(){
        this.fases = new HashMap<>();
    }
    public void agregarPartido(Partido nuevo){
        fases.put(nuevo.getNumPartido(),nuevo);
    }
    public Partido buscarPartido(int numPartido){
        return fases.get(numPartido);
    }
    public int cantidadPartidos(){
        return fases.size();
    }
    @Override
    public String toString() {
       String lista = "Fase: \n";
       for(Partido p: fases.values())
           lista += p.toString() + "\n";
        return lista;
    }
}
