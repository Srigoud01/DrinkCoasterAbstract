
package srikanth.drinkcoasterabstract.drinkcoasterabstract;

public class DrinkCoasterMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        KatzDrinkCoasterStore katzDrinkCoasterStore = new KatzDrinkCoasterStore();
        CanadaDrinkCoasterStore canadaDrinkCoasterStore = new CanadaDrinkCoasterStore();
        
        DrinkCoaster drinkCoaster = katzDrinkCoasterStore.orderCoaster("metallic");
        
        System.out.println("Boniface ordered " + drinkCoaster + "\n");
        
        
        drinkCoaster = katzDrinkCoasterStore.orderCoaster("glass");
        
        System.out.println("Hilton hotel ordered " + drinkCoaster + "\n");
        
        drinkCoaster = canadaDrinkCoasterStore.orderCoaster("silicone");
        
        System.out.println("MIT university just ordered " + drinkCoaster + "\n");
    }
}
