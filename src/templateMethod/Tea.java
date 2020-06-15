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
public class Tea extends CaffeineBeverage{

    @Override
    
    public void brew() {
        System.out.println("Pha trà với nhiệt độ 80 độ C");
        
    }

    @Override
    public void addCondiment() {
        System.out.println("Thêm chanh vào trà , có chua thì thêm đường");
       
    }
    
}
