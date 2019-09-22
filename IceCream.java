public abstract class IceCream { //An abstract class
    protected String desciption; //the name of ice cream

    /**
     * setup the name of ice cream
     */
    public String toString()
    {
        return this.desciption;
    }

    /**
     * get the cost
     * @return a double number
     */
    public abstract double getCost();
}
