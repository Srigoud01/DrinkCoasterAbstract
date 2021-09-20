
package drinkcoasterabstract;


public abstract class DrinkCoaster {
    String name;
    
    Silicone harderner;
    Silicone resin;
    Silicone micaPowder;
    Solvent alcoholInk;
    //Wood
    Bamboo bamboo;
    Cork cork;
    PulpWood pulpWood;
    //metal
    Silver silver;
    Magnesium magnesium;
    Iron iron;
    //glass
    Limestone limestone;
    SodaAsh sodaash;
    Sand sand;
    
    abstract void prepare();
    
    public void setName( String name ) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void mix(){
        System.out.println( name + " Mixing the materials ");
    }
    public void addColor(){
        System.out.println( name + " Adding color ");
    }
    public void pourMold(){
        System.out.println( name + " Carefully pour the mixture into a Mold");
    }
    public void applyHeat(){
        System.out.println( name + " Apply heat constantly ");
    }
    public void pack(){
        System.out.println( "Packing " + name + " completed");
    }
    
    public String toString(){
        StringBuffer display = new StringBuffer();
        display.append("------- " + name + "-----------");
        display.append("\n");
        if( harderner != null ){
            display.append(harderner);
            display.append("\n");
        }
        if( resin != null ){
            display.append(resin);
            display.append("\n");
        }
        if( micaPowder != null){
            display.append(micaPowder);
            display.append("\n");
        }
        if( alcoholInk!= null){
            display.append( alcoholInk);
            display.append("\n");
        }
        if( bamboo != null ){
            display.append(bamboo);
            display.append("\n");
        }
        if( cork != null){
            display.append(cork);
            display.append("\n");
        }
        if( pulpWood != null){
            display.append( pulpWood );
            display.append("\n");
        } 
        if( silver != null ){
            display.append(silver);
            display.append("\n");
        }
        if( magnesium != null){
            display.append(magnesium);
            display.append("\n");
        }
        if( iron != null){
            display.append( iron );
            display.append("\n");
        }      
        if( limestone != null ){
            display.append(limestone);
            display.append("\n");
        }
        if( sodaash != null){
            display.append(sodaash);
            display.append("\n");
        }
        if( sand != null){
            display.append( sand );
            display.append("\n");
        }         
        return display.toString();
    }
}
