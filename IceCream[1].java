/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyingicecream;

/**
 *
 * @author Bingnan Dong
 */
public class IceCream {
    private int amount;
    private int cost;
    public IceCream(int amount, int cost){
        this.amount = amount;
        this.cost = cost; 
    }
    
     public int getAmount(){
        return amount;
    }
    
    public int getCost(){
        return cost;
    }
}
