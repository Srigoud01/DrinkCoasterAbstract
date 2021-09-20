
package srikanth.drinkcoasterabstract.drinkcoasterabstract;

public class GlassCoaster extends DrinkCoaster{
   
    DrinkCoasterFactory ingredientFactory;
    
    public GlassCoaster( DrinkCoasterFactory ingredientFactory ){
        this.ingredientFactory = ingredientFactory;
    }
    void prepare(){
        System.out.println("Preparing " + name );
        limestone = ingredientFactory.createLimestone();
        sodaash = ingredientFactory.createSodaash();
        sand = ingredientFactory.createSand();
    }
}