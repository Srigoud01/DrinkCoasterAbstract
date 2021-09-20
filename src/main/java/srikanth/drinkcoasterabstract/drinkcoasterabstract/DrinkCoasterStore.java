
package srikanth.drinkcoasterabstract.drinkcoasterabstract;


public abstract class DrinkCoasterStore {
    protected abstract DrinkCoaster createCoaster( String item );
    
    public DrinkCoaster orderCoaster( String item ){
        
        DrinkCoaster drinkCoaster = createCoaster( item );
        
        drinkCoaster.prepare();
        drinkCoaster.mix();
        drinkCoaster.pourMold();
        drinkCoaster.applyHeat();
        drinkCoaster.pack();
        
        return drinkCoaster;
    }
}
