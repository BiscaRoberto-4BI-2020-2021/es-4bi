/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personeammalate_01;
import java.util.Scanner;



public class PersoneAmmalate_01 {


    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        

        System.out.println("Quantita di persone di una popolazione->");
        int popolazione = input.nextInt();
        
        System.out.println("Tasso di propagazioni di un virus ->");
        int tpv = input.nextInt();        
        
        int giorni=0,oldtpv=1,d=0;
        
        if (tpv > popolazione){
        System.out.println("Error");
        }
        
        while(d < (popolazione/2)){     
        d=oldtpv*tpv+oldtpv;
        oldtpv=d;
        giorni++;    
        }
            
        System.out.println("La meta della popolazione verra ammalata in  "+giorni+" giorni");
    
    
    
    }
    
}
