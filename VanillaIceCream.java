public class VanillaIceCream extends IceCream {
    /**
     * setup the name of IceCream
     */
    public VanillaIceCream()
    {
        this.desciption = "Vanilla Ice Cream";
    }

    /**
     * get the cost of iceCream
     * @return a double number
     */
    @Override
    public double getCost()
    {
        return 0.75;
    }
}
