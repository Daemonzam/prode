import java.util.ArrayList;
import java.util.HashMap;

public class Tarjeta {
    private HashMap<Integer,Apuesta> tarjetas;
    public HashMap<Integer, Apuesta> getTarjetas() {
        return tarjetas;
    }
    public void setTarjetas(HashMap<Integer, Apuesta> tarjetas) {
        this.tarjetas = tarjetas;
    }
    public Tarjeta(){
        this.tarjetas = new HashMap<>();
    }
    public void agregarApuesta(Apuesta nueva){
        tarjetas.put(nueva.getNumPartid(), nueva);
    }
    public Apuesta buscarApuesta(int numPartid){
        return tarjetas.get(numPartid);
    }
    public int cantidadApuestas(){
        return tarjetas.size();
    }
    @Override
    public String toString() {
        String lista = "Tarjeta: \n";
        for(Apuesta a: tarjetas.values())
            lista += a.toString() + "\n";
        return lista;
    }
}
