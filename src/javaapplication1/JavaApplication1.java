
package javaapplication1;

import java.util.Scanner;


public class JavaApplication1 {

   
    public static void main(String[] args) {
        //metodo scanner
      Scanner sc = new Scanner (System.in);
      int[]numeros= new int[5];
      System.out.println("ingrese las 5 ventas realizadas:");
        for (int i = 0; i<5; i++){  
            numeros[i] = sc.nextInt();
        }
      //metodo de ordenamiento burbuja 
      for (int i=0;  i<numeros.length - 1; i++){
          for(int j=0; j<numeros.length -i -1; j++){
              if (numeros[j]<  numeros[j+1]){
                  //intercambio de elementos 
                  
                  int temp= numeros[j];
                  numeros[j]=numeros [j + 1];
                  numeros[j + 1]=temp;
                  
              }
          }
          
      }
              System.out.println("arreglo ordenado:");
              for (int numero: numeros){
                  System.out.println(numero + "");
              }
    }
    
}
