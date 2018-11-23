public class Mazda extends Car {
    public static final String COUNTRY = "Japan";
    private boolean isPraviyRul = true;

    public Mazda(String coulor, boolean isAutomat, int powerOfEngine, boolean isPraviyRul) throws InvalidCarParametrsExceptiopn {
        super(coulor, isAutomat, powerOfEngine);
        this.isPraviyRul = isPraviyRul;
    }
    public void move (){
        System.out.println("Mazda zoom-zoom");

    }

    public boolean isPraviyRul() {
        return isPraviyRul;
    }

    public void setPraviyRul(boolean praviyRul) {
        isPraviyRul = praviyRul;
    }
}
