/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author Alex
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(getSum(3));                        // 3 : 3 + 2 + 1 = 6
        System.out.println(getSum(6));                        // 6 + 5 + 4 + 3 + 2 + 1 = 21  
        
    }
    public static int getSum(int number){
        if(number ==1) {
            return 1;
        }
        else{
        return number + getSum(number-1);}                      // 3 + getSum(2) = 3 + 2 + getSum(1) = 3 +2+1 = 6
    }
    
    
}
