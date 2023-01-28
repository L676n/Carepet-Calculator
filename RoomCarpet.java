
package assignment8;

public class RoomCarpet {
    
       
    private RoomDimension size;
    private double CarpetCost;

    public RoomCarpet(RoomDimension roomDimensions, double costOfCarpet) {
        super();
        size = roomDimensions;
        CarpetCost = costOfCarpet;
    }

    public double getTotalCost() {
        return CarpetCost * size.getArea();
    }

    @Override
    public String toString() {
        return "The room carpet is \n" + size
                + "\nCarpet cost = " + CarpetCost
                        + "\nTotal cost = " + getTotalCost();
    }
}
