package comunicacion;

public class Tesis extends Escrito{
  
  private String origen;
  private String titulo;
	private String autor;
	private int paginas;
  private String idea;
  private String[] argumentos;
  private String conclusion;
  private String referencias;
  private String interpretacion;

  public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion){
    super(origen, titulo, autor, paginas);
    this.idea = idea;
    this.argumentos = argumentos;
    this.conclusion = conclusion;
    this.referencias = referencias;
    this.interpretacion = interpretacion;
  }

  public int palabrasTotales(int x ){
    return this.paginas * x * 5;
  } 

  public String interpretacion(){
    return this.interpretacion;
  }

  public String toString(){
    String retorno = this.origen + "\n" +
    this.titulo + "\n" + 
    this.autor + "\n" +
    this.paginas + "\n" +
    this.idea + "\n" +
    this.argumentos + "\n" +
    this.conclusion + "\n" +
    this.referencias + "\n";

    return retorno;
  }

  public String getInterpretacion(){
    return this.interpretacion;
  }

  public void setInterpretacion(String interpretacion){
    this.interpretacion = interpretacion;
  }

  public String getIdea(){
    return this.idea;
  }

  public void setIdea(String idea){
    this.idea = idea;
  }

  public String[] getArgumentos(){
    return this.argumentos;
  }

  public void setArgumentos(String[] argumentos){
    this.argumentos = argumentos;
  }

  public String getConclusion(){
    return this.conclusion;
  }

  public void setConclusion(String conclusion){
    this.conclusion = conclusion;
  }

  public String getReferencias(){
    return this.referencias;
  }

  public void setReferencias(String referencias){
    this.referencias = referencias;
  }

}
