class Triangulo {
  public double peri;
  public char tipo;
  private double area, s, r;
  static int trianCreados = 0;
  static public void help (){
    System.out.println("Esta clase crea un objeto triángulo, que podría ser equilatero, isóceles o rectángulo");
    System.out.println("//todas las opciones y métodos");
    return;
  }
  public double calcArea(double l){
    double pow = 3;
    s = (3 * l) / 2;
    r = s * Math.pow(s - l, pow);
    return Math.sqrt(r);
  }
  public double calcArea(double l, double b){
    s = (l * 2 + b)/2;
    r =  Math.pow(s - l, 2);
    r *= s * (s-b);
    return Math.sqrt(r);
  }
  public double calcArea(double l1, double l2, double l3){
    s = ( l1 + l2 + l3) / 2;
    r = s * (s - l1) * (s - l2) * (s - l3);
    return Math.sqrt(r);
  }
  public void type (){
    System.out.println("Este triángulo es " + tipo);
    return;
  }
}
