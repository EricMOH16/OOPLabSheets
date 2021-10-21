package labsheet8.exercise1;

public class Bicycle extends Vehicle {
    private int gearCount;
    private boolean hasBell;

    public Bicycle(){
        setHasBell(false);
        setGearCount(0);
    }
    public Bicycle(double price, double length, double height, double weight, String manufacturer, String model,boolean hasBell, int gearCount){
        super(price,length,height,weight,manufacturer,model);
        setHasBell(hasBell);
        setGearCount(gearCount);
    }

    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    public boolean isHasBell() {
        return hasBell;
    }

    public void setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
    }
    public String toString(){
        return super.toString() + "\nHas Bell: " + isHasBell() + "\nGear Count: " + getGearCount();
    }
}
