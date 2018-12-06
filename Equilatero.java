class Equilatero extends Triangulo{
  private double lados;
  Equilatero (double lado){
    this.lados = lado;
    this.tipo = 'e';
    trianCreados++;
    System.out.println("Se creó el triángulos con lados = " + lados);
  }
  Equilatero(){
    this(0);
  }
  public double getLados (){
    return lados;
  }
  public void setlados (double newLado){
    lados = newLado;
    System.out.println("Se cambió la medida de los lados");
    return;
  }
}
