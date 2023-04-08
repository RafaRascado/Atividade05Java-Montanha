// Faça um Programa que converta metros para centímetros.

import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
      System.out.println("Informe o tamanho em metros: ");
      Scanner teclado = new Scanner(System.in);
      double metro = teclado.nextDouble();

      double conversao = metro * 100;

      System.out.println("O tamanho convertido fica: " + conversao);
    
  }
}