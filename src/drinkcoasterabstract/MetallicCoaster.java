/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drinkcoasterabstract;

/**
 *
 * @author xyzalpha
 */
public class MetallicCoaster extends DrinkCoaster{
   
    DrinkCoasterFactory ingredientFactory;
    
    public MetallicCoaster( DrinkCoasterFactory ingredientFactory ){
        this.ingredientFactory = ingredientFactory;
    }
    void prepare(){
        System.out.println("Preparing " + name );
        silver = ingredientFactory.createSilver();
        magnesium = ingredientFactory.createMagnesium();
        iron = ingredientFactory.createIron();

    }  
}
