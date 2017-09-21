/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invertirnumero;

/**
 *
 * @author Emmanuel
 */
public class Invertirnumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int a= 234;
    
    System.out.println("El numero invertido es: "+invnum(a, 2));
    }
    
    public static int invnum(int num, int pos){
        if(num<10){
            return num;
        }else{
            return(num %10)*(int) Math.pow(10, pos)+(invnum(num/10, pos-1));
            
        }
    }
}
