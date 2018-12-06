class Isoceles extends Triangulo {
  private double lados, base;
  Isoceles (double lados, double base){
    this.lados = lados;
    this.base = base;
    this.tipo = 'i';
    System.out.println("Se creó el triángulos con lados = " + lados);
    trianCreados++;
  }
  Isoceles(){}
}
