package Tree;

public abstract class AbstractTree implements Tree {

    protected Trunk tunk;
    protected Branches branches;
    protected Leaves leaves;
    protected int age;


    public AbstractTree(Trunk tunk, Branches branches, Leaves leaves, int age) {
        this.tunk = tunk;
        this.branches = branches;
        this.leaves = leaves;
        this.age = age;
    }

    public Trunk getTunk() {
        return tunk;
    }

    public void setTunk(Trunk tunk) {
        this.tunk = tunk;
    }

    public Branches getBranches() {
        return branches;
    }

    public void setBranches(Branches branches) {
        this.branches = branches;
    }

    public Leaves getLeaves() {
        return leaves;
    }

    public void setLeaves(Leaves leaves) {
        this.leaves = leaves;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void growUp(int value) {

        if (age == 0) {
            System.out.println("Tree not exist!");
        } else {
            int howGrowUp = tunk.getHeight() + value;
            int drawBranches = branches.getNumberOfBranches() + value;
            int drawLeaves = leaves.getNumberOfLeaves() + value;
            age++;
            System.out.println("The tree has grown up ! The tree trunk has grown by " + value + " to " + howGrowUp +
                    ". The  number of branches has increased to " + drawBranches + ". The number of leaves has increased to " + drawLeaves
                    + ". Age of tree is " + age);

        }

    }

    @Override
    public void droopingLeaves() {
        if (LeafType.LEAF.equals(leaves.getLeafType())) {
            leaves.setNumberOfLeaves(0);
            System.out.println("Leaves have fallen from the tree! Number of leaves is: " + leaves.getNumberOfLeaves());
        } else {
            System.out.println("Needles do not fall in winter");
        }

    }

    @Override
    public void winterSeason(boolean isWinter) {

        if (isWinter) {
            System.out.println("Winter season has begun!");
            droopingLeaves();
        } else {
            System.out.println("Winter season has not begun!");
        }

    }
}
