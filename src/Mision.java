public class Mision {
    private int id;
    private String nombre;
    private String dificultad;
    private int nivelRecomendado;
    private int recompensaExperiencia;
    boolean completada;

    public Mision(int id, String nombre, String dificultad,int nivelRecomendado,int recompensaExperiencia, boolean completada ){
        this.id = id;
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.nivelRecomendado = nivelRecomendado;
        this.recompensaExperiencia = recompensaExperiencia;
        this.completada = completada;
    }

    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDificultad() {
        return dificultad;
    }
    public int getNivelRecomendado() {
        return nivelRecomendado;
    }
    public int getRecompensaExperiencia() {
        return recompensaExperiencia;
    }
    public boolean completada() {
        return completada;
    }
}
