/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysecondpro;

/**
 *
 * @author pupil
 */
public class MySecondPro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Hello World2");
        System.out.print("First Update2");
        System.out.print("Second Change");
        System.out.printf(String.join ("%n",
                "Using argument index:",
                "First number:%1$-5d",
                "Second number:%2$5d",
                "PI:%3$.5f%n"), 1234, 456, Math.PI);
        // TODO code application logic here
    }
    
}
