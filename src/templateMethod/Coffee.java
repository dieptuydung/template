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
public class Coffee extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("pha cà phê");
       
    }

    @Override
    public void addCondiment() {
        System.out.println("thêm sửa với đường");
    }
    
}
