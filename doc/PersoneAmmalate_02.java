package personeammalate_01;

import java.util.Scanner;


public class PersoneAmmalate_02 {


 public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
      
        System.out.println("Numero di persone ammalate");
        int nrpA = input.nextInt();
        
        
        System.out.println("La perentuale di perosne che guariscono ogni giorno(nr no %)");
        double perG = input.nextDouble();
        
        int giorni=0;
        double pp=nrpA;
        
        if (pp<perG){
        System.out.println("Hmm");
        }
        
        while(pp > 100){
        pp=pp-(pp*(perG/100));             
        giorni++;    
        }
            
        System.out.println("La "+giorni+" giorni");
    
    
    
    }
    
}

    
    
    
    
    

