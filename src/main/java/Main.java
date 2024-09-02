import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    System.out.println("digite um numero");

    int numero = sc.nextInt();
        if (numero>0){
          System.out.println("numero positivo");
    }
    
    if (numero<0){
          System.out.println("numero negativo");
    } if(numero == 0 ){
       System.out.println("numero é 0");
    }


    sc.close();
  }

  
}