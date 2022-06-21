package domain;

public enum Type {

    ECONOMIC(100),
    COUPLE_ECONOMIC(120),
    STANDARD(200),
    COUPLE_STANDARD(220),
    POPULAR(450),
    POPULAR_COUPLE(500),
    SUITE(800),
    LUXURIOUS(1000);

    public static void showValues(){
        for (Type type: Type.values()){
            System.out.println(type.name()+" - $"+type.getValue());
        }
    }
    private double value;

    public double getValue() {
        return value;
    }

    Type(double value) {
        this.value = value;
    }
}
