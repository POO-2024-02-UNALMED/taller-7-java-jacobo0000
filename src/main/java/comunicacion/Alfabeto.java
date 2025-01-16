package comunicacion;

public class Alfabeto extends Pictograma{
  String origen;
  String[] letras;
  String interpretacion;

  public Alfabeto(String origen, String[] letras, String interpretacion){
    super(origen);
    this.letras = letras;
    this.interpretacion = interpretacion;
  }

  public int cantidadLetras(){
    return letras.length;
  }

  public String interpretacion(){
    return this.interpretacion;
  }

  public String toString(){
    String cadenaDeRetorno = "";
    for (String i : letras){
      cadenaDeRetorno += i + ", ";
    }
    return cadenaDeRetorno;
  }

  public String[] getLetras(){
    return this.letras;
  }

  public void setLetras(String[] letras){
    this.letras = letras;
  }

  public String getInterpretacion(){
    return this.interpretacion;
  }

  public void setInterpretacion(String interpretacion){
    this.interpretacion = interpretacion;
  }

  
  
}
