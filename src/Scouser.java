public class Scouser extends Person{
    public Scouser(String aName, int anAge){
        super(aName,anAge); //Must be the first line in the constructor of your subclass and has to be a call to the superclass
    }

    @Override
    public void greeting(){
        System.out.println("Arite Cocker");
    }
}
