package comunicacion;

public class Periodico extends Escrito{
  
  private String origen;
  private String titulo;
	private String autor;
	private int paginas;
  private String fecha;
  private String primicia;
  private String interpretacion;

  public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion){
    super(origen, titulo, autor, paginas);
    this.fecha = fecha;
    this.primicia = primicia;
    this.interpretacion = interpretacion;

  }

  public int palabrasTotales(int x ){
    return this.paginas * x * 10;
  }

  public String interpretacion(){
    return this.interpretacion;
  }

  public String toString(){
    String retorno = this.origen + "\n" +
    this.titulo + "\n" + 
    this.autor + "\n" +
    this.paginas + "\n" +
    this.fecha + "\n" +
    this.primicia + "\n" ;

    return retorno;
  }

  public String getInterpretacion(){
    return this.interpretacion;
  }

  public void setInterpretacion(String interpretacion){
    this.interpretacion = interpretacion;
  }

  public String getFecha(){
    return this.fecha;
  }

  public void setFecha(String fecha){
    this.fecha = fecha;
  }

  public String getPrimicia(){
    return this.primicia;
  }

  public void setPrimicia(String primicia){
    this.primicia = primicia;
  }
}
