Public class Candidatos{
  private int id;
  private int votos;
  private String nombre;
  static int CantCandidatos = 0;


  Public Candidato(String Nombre_Candidato){
    this.id = CantCandidatos + 1;
    this.votos = 0;
    this.nombre = Nombre_Candidato;
    }
  
}
