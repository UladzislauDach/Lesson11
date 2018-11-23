public abstract class Car {
    public static final int NUMBER_OF_WHEELS = 4;
    private String coulor;
    private boolean isAutomat;
    private int powerOfEngine;

    public Car(String coulor, boolean isAutomat, int powerOfEngine) throws InvalidCarParametrsExceptiopn {
        if (coulor == null || coulor.isEmpty()) {
            throw new InvalidCarParametrsExceptiopn("Colour can't be empty String");
        }
        if (powerOfEngine < 0 || powerOfEngine > 1000) {
            throw new InvalidCarParametrsExceptiopn("Power must be from 0 to 1000");
        }

        this.coulor = coulor;
        this.isAutomat = isAutomat;
        this.powerOfEngine = powerOfEngine;


    }
    public abstract void move();

    public final String getCoulor() {
        return coulor;
    }

    public void setCoulor(String coulor) throws InvalidCarParametrsExceptiopn {
        if (coulor == null || coulor.isEmpty()) {
            System.out.println("Colour can't be empty String");
            return;
        }
        this.coulor = coulor;
    }

    public final boolean isAutomat() {
        return isAutomat;
    }

    public void setAutomat(boolean automat) {
        isAutomat = automat;
    }

    public final int getPowerOfEngine() {
        return powerOfEngine;
    }

    public void setPowerOfEngine(int powerOfEngine) {
        if (powerOfEngine < 0 || powerOfEngine > 1000) {
            System.out.println("Power must be from 0 to 1000");
            return;
        }
        this.powerOfEngine = powerOfEngine;
    }
}
