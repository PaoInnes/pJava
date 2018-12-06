class Rectangulo extends Triangulo {
  private double ladoA, ladoB, ladoC;
  Rectangulo (double ladoA, double ladoB, double ladoC){
    this.ladoA = ladoA;
    this.ladoB = ladoB;
    this.ladoC = ladoC;
    this.tipo = 'r';
    trianCreados++;
  }
  Rectangulo (){
    this(0, 0, 0);
  }
  public void setlados (double a,double b, double c){
    ladoA = a;
    ladoB = b;
    ladoC = c;
    System.out.println("Se cambiaron los lados");
    return;
  }
  public void getlados (){
    System.out.println("Lado a = " + ladoA +"\nLado b = " + ladoB + "\nLado c = " + ladoC);
    return;
  }
  public double calcArea (){
    return super.calcArea (ladoA, ladoB, ladoC);
  }
}
