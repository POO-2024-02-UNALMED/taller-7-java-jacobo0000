package comunicacion;

public class Fabula extends Escrito{
  
	private int paginas;
  private String ensenanzas;
  private String interpretacion;

  public Fabula(String origen, String titulo, String autor, int paginas, String ensenanzas, String interpretacion){
    super(origen, titulo, autor, paginas);
    this.ensenanzas = ensenanzas;
    this.interpretacion = interpretacion;
  }

  public int palabrasTotales(int x ){
    return this.paginas * x;
  }

  public String interpretacion(){
    return this.interpretacion;
  }

  public String toString(){
    String retorno = this.getOrigen() + "\n" +
    this.getTitulo() + "\n" + 
    this.getAutor() + "\n" +
    this.getPaginas() + "\n" +
    this.ensenanzas + "\n";

    return retorno;
  }

  public String getInterpretacion(){
    return this.interpretacion;
  }

  public void setInterpretacion(String interpretacion){
    this.interpretacion = interpretacion;
  }

  public String getEnsenanza(){
    return this.ensenanzas;
  }

  public void setEnsenanza(String ensenanzas){
    this.ensenanzas = ensenanzas;
  }
}
