public class ChocolateIceCream extends IceCream {
    /**
     * setup the name of iceCream
     */
    public ChocolateIceCream()
    {
        this.desciption = "Chocolate Ice Cream";
    }

    /**
     * get the cost of ice cream
     * @return a double number
     */
    @Override
    public double getCost() {
        return 0.9;
    }
}
