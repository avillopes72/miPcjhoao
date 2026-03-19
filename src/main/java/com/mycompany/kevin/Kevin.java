package com.mycompany.kevin;
import java.util.Scanner;
public class Kevin {
    
   /* public static int suma(int a,int b){
        return a+b;
        
    }*/
    public static String saludo(String palabra1,String palabra2){
      
        if (palabra1.equals(palabra2)){            
            return "hola buenos dias en que te puedo ayudar ";
        }
    
        return "no hay";
    }
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        String dat2="hola";
        System.out.println(" ingrse palabra!");
        String dat=leer.nextLine();
        System.out.println(" suma de "+saludo(dat,dat2));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
        Scanner readd = new Scanner(System.in);
        double pesomin = 0.0f, pesolimt = 50.0f;
        double peso[] = new double[5];
        int saco = 0;
        int indicador[] = new int[5];
        double pesomax = 0.0f;

        do {

            System.out.println(" ingrese peso de saco N " + (saco + 1) + " :");
            peso[saco] = readd.nextDouble();
            if (peso[saco] >= pesomin) {
                if (peso[saco] >= pesolimt) {
                    if (peso[saco] >= pesomax) {
                        pesomax = peso[saco];

                    }
                    indicador[saco] = saco;
                }
            }

            saco++;
        } while (saco < 5);
        for (int i = 0; i < 5; i++) {
            if(indicador[i]==i){
                System.out.println(peso[i]);
            }
        }
        System.out.println(pesomax);
*/
    }
    
    
    
}
