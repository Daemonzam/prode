public class Partido {
    private int numPartido;
    private int fase;
    private String local;
    private String visitante;
    private int golLocal;
    private int golVisitante;
    public int getNumPartido() {
        return numPartido;
    }
    public void setNumPartido(int numPartido) {
        this.numPartido = numPartido;
    }
    public int getFase() {
        return fase;
    }
    public void setFase(int fase) {
        this.fase = fase;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public String getVisitante() {
        return visitante;
    }
    public void setVisitante(String visitante) {
        this.visitante = visitante;
    }
    public int getGolLocal() {
        return golLocal;
    }
    public void setGolLocal(int golLocal) {
        this.golLocal = golLocal;
    }
    public int getGolVisitante() {
        return golVisitante;
    }
    public void setGolVisitante(int golVisitante) {
        this.golVisitante = golVisitante;
    }
    public Partido(int numPartido, int fase, String local, String visitante, int golLocal, int golVisitante) {
        this.numPartido = numPartido;
        this.fase = fase;
        this.local = local;
        this.visitante = visitante;
        this.golLocal = golLocal;
        this.golVisitante = golVisitante;
    }
    public Integer resultado(int golLocal, int golVisitante){
        if (golLocal>golVisitante){
            return 1;
        } else if(golLocal == golVisitante){
            return 2;
        }else{
            return 3;
        }
 }
    public String toString(){
        return numPartido +" "+fase+" "+local+" "+visitante+" "+golLocal+" "+golVisitante;
 }
}
