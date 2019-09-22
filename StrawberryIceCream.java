public class StrawberryIceCream extends IceCream{
    /**
     * setup the name of the ice cream
     */
    public StrawberryIceCream()
    {
        this.desciption = "Strawberry Ice Cream";
    }

    /**
     * get the cost
     * @return a double number
     */
    @Override
   public double getCost() {
        return 0.8;
    }
}
