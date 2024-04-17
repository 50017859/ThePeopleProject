/**
 * Represents a  person
 */
public class Person {

    private String name; //Field/Variable
    private int age; //Field/Variable

    /**
     * Constructs a new object of the person class
     * @param aName the persons name
     * @param anAge the persons age
     */
    public Person(String aName, int anAge){ //Constructors
        this.name = aName;
        this.age = anAge;
    }

    /**
     * Returns the name of the person
     * @return the name of the person
     */
    public String getName(){ //getter method for name
        return this.name;
    }

    /**
     * Sets the persons name
     * @param aName the name for the person
     */
    /*public void setName(String aName){ //setter method for name
        this.name = aName;
    }*/

    /**
     * Returns the age of the person
     * @return the age of the person
     */
    public int getAge(){ //getter method for age
        return this.age;
    }

    /**
     * Increments the age of the person
     */
    public void birthday(){ //increment the value of the age field
        this.age++;
    }

    /**
     * Outputs a generic greeting
     */
    public void greeting(){
        System.out.println("Hello");
    }

    /**
     * Returns a string descriving the state of a Person Object
     * @return a string descriving the state of a Person Object
     */
    @Override
    public String toString(){
        return "Name: " + this.getName() + ", Age: " + this.getAge();
    }

}
