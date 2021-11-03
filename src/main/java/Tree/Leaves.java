package Tree;

public class Leaves {
    private String color;
    private int numberOfLeaves;
    private LeafType leafType;

    public Leaves(String color, int numberOfLeaves, LeafType leafType) {
        this.color = color;
        this.numberOfLeaves = numberOfLeaves;
        this.leafType = leafType;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfLeaves() {
        return numberOfLeaves;
    }

    public void setNumberOfLeaves(int numberOfLeaves) {
        this.numberOfLeaves = numberOfLeaves;
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }
}
