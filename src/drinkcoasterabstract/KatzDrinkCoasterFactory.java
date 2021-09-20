
package drinkcoasterabstract;

public class KatzDrinkCoasterFactory implements DrinkCoasterFactory{
    public Solvent createAlcoholInk(){
        return new AlcoholInk();
    }
    public Silicone createResin(){
        return new Resin();
    }
    public Silicone createMicaPowder(){
        return new MicaPowder();
    }
    public Silicone createHarderner(){
        return new Harderner();
    }
    public Bamboo createBamboo(){
        return new Bamboo();
    }
    public Cork createCork(){
        return new Cork();
    }
    public PulpWood createPulpWood(){
        return new PulpWood();
    }
    public Iron createIron(){
        return new Iron();
    }
    public Silver createSilver(){
        return new Silver();
    }
    public Magnesium createMagnesium(){
        return new Magnesium();
    } 
    public Limestone createLimestone(){
        return new Limestone();
    }
    public Sand createSand(){
        return new Sand();
    }
    public SodaAsh createSodaash(){
        return new SodaAsh();
    }
    
}
