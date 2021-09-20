
package srikanth.drinkcoasterabstract.drinkcoasterabstract;

public class SiliconeCoaster extends DrinkCoaster{
   
    DrinkCoasterFactory ingredientFactory;
    
    public SiliconeCoaster( DrinkCoasterFactory ingredientFactory ){
        this.ingredientFactory = ingredientFactory;
    }
    void prepare(){
        System.out.println("Preparing " + name );
        harderner = ingredientFactory.createHarderner();
        resin = ingredientFactory.createResin();
        micaPowder = ingredientFactory.createMicaPowder();
        alcoholInk = ingredientFactory.createAlcoholInk();
        
    }
}
