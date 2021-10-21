package labsheet8.exercise2;

public class Bicycle2 extends Vehicle2 {
    private int gearCount;
    private boolean hasBell;

    public Bicycle2(){
        setHasBell(false);
        setGearCount(0);
    }
    public Bicycle2(double price, double length, double height, double weight, String manufacturer, String model, boolean hasBell, int gearCount){
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
