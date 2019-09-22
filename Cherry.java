public class Cherry extends ToppingsDecorator {
    private IceCream iceCream; //An iceCream
    /**
     * setup an IceCream
     * @param iceCream type of IceCream
     */
    public Cherry(IceCream iceCream)
    {
        this.iceCream = iceCream;
    }

    /**
     * Print the description of the class
     * @return a String, Description of Cherry
     */
    @Override
    public String toString() {
        return iceCream.toString() + " + a cherry on top";
    }

    /**
     * get the cost of iceCream
     * @return a double number
     */
    @Override
    public double getCost() {
        return 0.4;
    }
}
