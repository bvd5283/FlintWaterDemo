/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyingicecream;

import java.util.ArrayList;
import java.util.Scanner;

public class BuyingIceCream {
    
   
    public static void main(String[] args) {
        MethodOfBuying haha = new MethodOfBuying();
        Scanner sc = new Scanner(System.in); 
        ArrayList<Integer> need = new ArrayList();
        ArrayList<Integer> mode = new ArrayList();
        ArrayList<Integer> needAfter = new ArrayList();
        ArrayList<IceCream> forA = new ArrayList();
        ArrayList<IceCream> forB = new ArrayList();
        ArrayList<IceCream> forC = new ArrayList();
        ArrayList<IceCream> forMix = new ArrayList();
        System.out.println("pls enter the quantity we need for today");
        for(int i = 0; i<3;i++){
            int input = sc.nextInt();
            need.add(input);
        }
        System.out.println("pls enter how many mode we have today");
        for(int j = 0; j<4; j++){
            int input2 = sc.nextInt();
            mode.add(input2);
        }
        System.out.println("pls enter the mode for A");
        for(int s = 0; s < 2;s++){
            int inputofAmount = sc.nextInt();
            int inputofCost = sc.nextInt();
            IceCream A = new IceCream(inputofAmount, inputofCost);
            forA.add(A);
        }
        System.out.println("pls enter the mode for B");
        for(int s = 0; s < 2;s++){
            int inputofAmount = sc.nextInt();
            int inputofCost = sc.nextInt();
            IceCream B = new IceCream(inputofAmount, inputofCost);
            forB.add(B);
        }
        System.out.println("pls enter the mode for C");
        for(int s = 0; s < 2;s++){
            int inputofAmount = sc.nextInt();
            int inputofCost = sc.nextInt();
            IceCream C = new IceCream(inputofAmount, inputofCost);
            forC.add(C);
        }
        System.out.println("pls enter the mode for Mix");
        for(int s = 0; s < 1;s++){
            int inputofAmount = sc.nextInt();
            int inputofCost = sc.nextInt();
            IceCream Mix = new IceCream(inputofAmount, inputofCost);
            forMix.add(Mix);
        }
        System.out.println("done entering");
        int smallest = 1000;
        for(int i = 0; i<3; i++){
            if(need.get(i)<= smallest){
        smallest = need.get(i);
        
        
        }
      }
      for(int i = 0; i<3; i++){
          int finalNeed = need.get(i)-smallest;
          needAfter.add(finalNeed);
      }
      int resultforA = haha.HowMuch(forA, needAfter.get(0));
      int resultforB = haha.HowMuch(forB, needAfter.get(1));
      int resultforC = haha.HowMuch(forC, needAfter.get(2));
      int resultforMix = smallest*forMix.get(0).getCost();
      int finalResult = resultforA + resultforB + resultforC + resultforMix;
        System.out.println(finalResult);
}
}
