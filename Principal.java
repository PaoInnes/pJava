class Principal {
  public static void main (String[] args ){
    Triangulo.help();
    Rectangulo rec = new Rectangulo(3, 4 ,5);
    //rec.getlados();
    System.out.println("El area del triángulo es " + rec.calcArea());
    return;
  }
}
