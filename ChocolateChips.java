public class ChocolateChips extends ToppingsDecorator{
    private IceCream iceCream;

    /**
     * setup an iceCream
     * @param iceCream type of IceCream
     */
    public ChocolateChips(IceCream iceCream)
    {
        this.iceCream = iceCream;
    }

    /**
     * Print the description of the class
     * @return a String, Description of ChocolateChips
     */
    @Override
    public String toString() {
        return iceCream.toString() + " + chocolate chips";
    }

    /**
     * get the cost of iceCream
     * @return a double number
     */
    @Override
    public double getCost() {
        return 0.3;
    }
}
