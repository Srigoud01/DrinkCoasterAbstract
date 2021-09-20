
package srikanth.drinkcoasterabstract.drinkcoasterabstract;

 



public class CanadaDrinkCoasterStore extends DrinkCoasterStore {
    
    protected DrinkCoaster createCoaster( String item ){
        DrinkCoaster drinkCoaster = null;
        
        DrinkCoasterFactory ingredientFactory = new KatzDrinkCoasterFactory();
        
        

        if( item.equalsIgnoreCase("Silicone")){
            drinkCoaster = new SiliconeCoaster(ingredientFactory);
            drinkCoaster.setName("Canada Drink Coaster Factory");
        }
        else if( item.equalsIgnoreCase("glass")){
            drinkCoaster = new GlassCoaster(ingredientFactory);
            drinkCoaster.setName("Canada Drink Coaster Factory");
        }        
        else if( item.equalsIgnoreCase("metal")){
            drinkCoaster = new MetallicCoaster(ingredientFactory);
            drinkCoaster.setName("Canada Drink Coaster Factory");
        }      
      
        return drinkCoaster;
    }
    
}
