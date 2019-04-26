/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyingicecream;

import java.util.ArrayList;

/**
 *
 * @author Bingnan Dong
 */
public class MethodOfBuying {
    public int HowMuch(ArrayList<IceCream> cool, int HowMany){
        int result;
        int greatest = 0;
        int greatesti = 0;
        for(int i = 0; i< cool.size(); i++){
            if(cool.get(i).getAmount()>greatest){
                greatest = cool.get(i).getAmount();
                greatesti = i;
            }
        }
      
        int count = HowMany/greatest * cool.get(greatesti).getCost();
        result = count;
        cool.remove(greatesti);
        int left = HowMany%greatest;
        while(!cool.isEmpty()){
        greatesti = 0;
                greatest = 0;
            for(int i = 0; i< cool.size(); i++){
                
            if(cool.get(i).getAmount()>greatest){
                greatest = cool.get(i).getAmount();
                greatesti = i;
            }
        }
            if(left/greatest == 0){
                cool.remove(greatesti);
            }
            else if(left/greatest > 0){
                result = result + left/greatest * cool.get(greatesti).getCost();
                left = left%greatest;
                cool.remove(greatesti);
            }
        
        }
       return result;
    }
}


