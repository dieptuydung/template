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
public abstract class CaffeineBeverage {
    public void prepareRecipe()
            
    {
        boilWater();
        brew();
        pourIncup();
        addCondiment();
        
    }

    private void boilWater() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public abstract void brew();
    

    private void pourIncup() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public  abstract void addCondiment();
    
    
  
    
}
