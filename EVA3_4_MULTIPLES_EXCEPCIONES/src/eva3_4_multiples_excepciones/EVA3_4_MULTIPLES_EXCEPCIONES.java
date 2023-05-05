/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_4_multiples_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_4_MULTIPLES_EXCEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x,y;
        

        
//        try {
//            System.out.println("Introduce valor (entero) de x");
//            x=input.nextInt();
//        
//            System.out.println("Introduce valor (entero) de y");
//            y=input.nextInt();
//        
//            int res=x/y;
//            System.out.println("Division: "+res);
//        } catch (InputMismatchException e) {
//            System.out.println("Captura incorrecta "+e);
//        }catch (ArithmeticException e) {
//            System.out.println("No se puede dividir entre 0 "+e);
//        }
        
        do {            
            try {
                Scanner input=new Scanner(System.in);
                System.out.println("Introduce valor (entero) de x");
                x=input.nextInt();
        
                System.out.println("Introduce valor (entero) de y");
                y=input.nextInt();
        
                int res=x/y;
                System.out.println("Division: "+res);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Captura incorrecta "+e);
            }catch (ArithmeticException e) {
                System.out.println("No se puede dividir entre 0 "+e);
            }
            
        } while (true);        
        
        
        System.out.println("Se ejecuto todo");
    }
    
}
