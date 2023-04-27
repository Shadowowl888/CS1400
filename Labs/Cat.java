/*-------------------------------------------------------------------------
// AUTHOR: Devin Khun
// FILENAME: Cat.java
// SPECIFICATION: The Cat class is a subclass of the abstract Animal class.
// FOR: CS1400 - Lab #8
// TIME SPENT: 30 minutes
//----------------------------------------------------------------------*/

public class Cat extends Animal {
    private int numWhiskers;
    
    /**
     * The Constructor with the name, vegetarian, food, color, and numWhiskers parameters. It calls the superclass constructor and updates the number of whiskers instance field with the numWhiskers parameter.
     * @param name the cat's name
     * @param veg the cat's vegetarian status
     * @param food the cat's food type
     * @param color the cat's color
     * @param numWhiskers the cat's number of whiskers
     */
    public Cat(String name, boolean veg, String food, String color, int numWhiskers) {
        super(name, veg, food, color);
        this.numWhiskers = numWhiskers;
    }

    /**
     * The Constructor with name, vegetarian, food, color, numWhiskers, and speed parameters. It calls the superclass constructor and updates the number of whiskers instance field with the numWhiskers parameter.
     * @param name the cat's name
     * @param veg the cat's vegetarian status
     * @param food the cat's food type
     * @param color the cat's color
     * @param numWhiskers the cat's number of whiskers
     * @param speed the cat's average speed
     */
    public Cat(String name, boolean veg, String food, String color, int numWhiskers, double speed) {
        super(name, veg, food, color, speed);
        this.numWhiskers = numWhiskers;
    }

    /**
     * The getNumWhiskers method returns the cat's number of whiskers
     * @return the cat's number of whiskers
     */
    public int getNumWhiskers() {
        return numWhiskers;
    }

    /**
     * The setNumWhiskers method changes the cat's number of whiskers based on the integer parameter provided
     * @param numWhiskers the cat's number of whiskers
     */
    public void setNumWhiskers(int numWhiskers) {
        this.numWhiskers = numWhiskers;
    }

    /** The setSpeed method overrides the method in the superclass by increasing the cat's speed by 10%
     * @param speed the cat's speed
     */
    @Override
    public void setSpeed(double speed) {
        super.setSpeed(speed * 1.1);
    }
}
