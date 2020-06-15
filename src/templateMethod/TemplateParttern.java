/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templateMethod;

/**
 *
 * @author boss dung
 */
public class TemplateParttern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CaffeineBeverage ca1 =new Coffee(); {
            CaffeineBeverage ca2 =new Tea();
            ca1.prepareRecipe();
           
            ca2.prepareRecipe();
          
                    
        }
          
    }
    
}
