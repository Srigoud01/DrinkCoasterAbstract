
package drinkcoasterabstract;


public class KatzDrinkCoasterStore extends DrinkCoasterStore {
    
    protected DrinkCoaster createCoaster( String item ){
        DrinkCoaster drinkCoaster = null;
        
        DrinkCoasterFactory ingredientFactory = new KatzDrinkCoasterFactory();
        
        

        if( item.equalsIgnoreCase("Silicone")){
            drinkCoaster = new SiliconeCoaster(ingredientFactory);
            drinkCoaster.setName("Katz Drink Coaster Factory");
        }
        else if( item.equalsIgnoreCase("glass")){
            drinkCoaster = new GlassCoaster(ingredientFactory);
            drinkCoaster.setName("Katz Drink Coaster Factory");
        }        
        else if( item.equalsIgnoreCase("metallic")){
            drinkCoaster = new MetallicCoaster(ingredientFactory);
            drinkCoaster.setName("Katz Drink Coaster Factory");
        }      
     
        return drinkCoaster;
    }
    
}
