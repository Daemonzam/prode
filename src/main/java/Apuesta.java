public class Apuesta {
    int numPartid;
    String nombre;
    String apellido;
    int apuesta;
    public int getNumPartid() {
        return numPartid;
    }
    public void setNumPartid(int numPartid) {
        this.numPartid = numPartid;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getApuesta() {
        return apuesta;
    }
    public void setApuesta(int apuesta) {
        this.apuesta = apuesta;
    }
    public Apuesta() {
    }
    public Apuesta(int numPartid, String nombre, String apellido, int apuesta) {
        this.numPartid = numPartid;
        this.nombre = nombre;
        this.apellido = apellido;
        this.apuesta = apuesta;
    }
    @Override
    public String toString() {
        return numPartid +" "+nombre+" "+apellido+" "+apuesta;
    }
}
