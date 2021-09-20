
package drinkcoasterabstract;

public interface DrinkCoasterFactory {
    public Solvent createAlcoholInk();
    public Silicone createResin();
    public Silicone createMicaPowder();
    public Silicone createHarderner();
    //wood
    public Bamboo createBamboo();
    public Cork createCork();
    public PulpWood createPulpWood();
    //metal
    public Iron createIron();
    public Silver createSilver();
    public Magnesium createMagnesium();
    //glass
    public Limestone createLimestone();
    public Sand createSand();
    public SodaAsh createSodaash();
            
}
