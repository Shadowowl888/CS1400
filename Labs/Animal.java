/*-------------------------------------------------------------------------
// AUTHOR: Devin Khun
// FILENAME: Animal.java
// SPECIFICATION: The Animal class is a superclass with accessor and mutator methods for the instance fields.
// FOR: CS1400 - Lab #8
// TIME SPENT: 30 minutes
//----------------------------------------------------------------------*/

public abstract class Animal {
    private String name;
    private boolean veg;
    private String food;
    private String color;
    private double speed;

    /**
     * The Constructor with name, vegetarian, food, and color parameters.
     * @param name the name of the animal
     * @param veg boolean whether the animal is a vegetarian
     * @param food the food the animal eats
     * @param color the color of the animal
     */
    public Animal(String name, boolean veg, String food, String color) {
        this.name = name;
        this.veg = veg;
        this.food = food;
        this.color = color;
    }
    
    /**
     * The Constructor with name, vegetarian, food, color, and speed paramters.
     * @param name the name of the animal
     * @param veg boolean whether the animal is a vegetarian
     * @param food the food the animal eats
     * @param color the color of the animal
     * @param speed the average speed of the animal
     */
    public Animal(String name, boolean veg, String food, String color, double speed) {
        this.name = name;
        this.veg = veg;
        this.food = food;
        this.color = color;
        this.speed = speed;
    }

    /**
     * The getName method returns the name of the animal
     * @return the name of the animal
     */
    public String getName() {
        return name;
    }

    /**
     * The setName method updates the name of the animal with the String parameter provided
     * @param name the updated name of the animal
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The isVeg method returns a boolean whether the animal is a vegetarian
     * @return True if the animal is a vegetarian and False if it is not
     */
    public boolean isVeg() {
        return veg;
    }

    /**
     * The setVeg method updates the vegetarian status with the boolean parameter provided
     * @param veg the updated boolean to change the vegetarian status
     */
    public void setVeg(boolean veg) {
        this.veg = veg;
    }

    /**
     * The getFood method returns the type of food the animal eats
     * @return the food that the animal eats
     */
    public String getFood() {
        return food;
    }

    /**
     * The setFood method updates the food type with the String parameter provided
     * @param food the updated food type for the animal
     */
    public void setFood(String food) {
        this.food = food;
    }

    /**
     * The getColor method returns the color of the animal
     * @return the color of the animal
     */
    public String getColor() {
        return color;
    }

    /**
     * The setColor method updates the color of the animal with the String parameter provided
     * @param color the updated color of the animal
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * The getSpeed method returns the average speed of the animal
     * @return the speed of the animal
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * The setSpeed method updates the average speed of the animal with the double parameter provided
     * @param speed the updated speed of the animal
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }
}