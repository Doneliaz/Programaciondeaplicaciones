public class Candidato {
    public int id;
    public String nombre;
    public int votos;

    public Candidato(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.votos = 0;
    }

    public int getId() {
        return id;
    }
}
