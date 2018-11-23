public class BMW extends Car {
    public static final String COUNTRY = "Germany";
    private int numberOfSpoilers;

    public BMW(String colour, boolean isAutomat, int powerOfEngine, int numberOfSpoilers) throws InvalidCarParametrsExceptiopn {
        super(colour, isAutomat, powerOfEngine);
        if (numberOfSpoilers < 0 || numberOfSpoilers > 10) {
            throw new InvalidCarParametrsExceptiopn("NumberSpoilers must be from 0 ti 10");
        }
        this.numberOfSpoilers = numberOfSpoilers;
    }

    public void move() {
        System.out.println("BMW moves");
    }

    public int getNumberOfSpoilers() {
        return numberOfSpoilers;
    }

    public void setNumberOfSpoilers(int numberOfSpoilers) {
        if (numberOfSpoilers < 0 || numberOfSpoilers > 10) {
            System.out.println("NumberSpoilers must be from 0 ti 10");
            return;
        }
        this.numberOfSpoilers = numberOfSpoilers;
    }
}