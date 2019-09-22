public class Sprinkles extends ToppingsDecorator {
    private IceCream iceCream;
    /**
     * setup an IceCream
     * @param iceCream type of IceCream
     */
    public Sprinkles(IceCream iceCream)
    {
        this.iceCream = iceCream;
    }

    /**
     * Print the description of the class
     * @return a String, Description of Sprinkles
     */
    @Override
    public String toString()
    {
        return iceCream.toString() + " + sprinkles";
    }

    /**
     * get the cost of iceCream
     * @return a double number
     */
    @Override
    public double getCost()
    {
        return 0.2;
    }
}
