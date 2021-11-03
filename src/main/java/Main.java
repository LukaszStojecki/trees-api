import Conifer.ConiferTree;
import Conifer.ConiferTreeType;
import Tree.Branches;
import Tree.LeafType;
import Tree.Leaves;
import Tree.Trunk;

public class Main {

    public static void main(String[] args) {

        Trunk trunk  = new Trunk(50);
        Branches branches = new Branches(5);
        Leaves leaves = new Leaves("purple",50, LeafType.LEAF);

        ConiferTree coniferTree = new ConiferTree(ConiferTreeType.PINE,trunk,branches,leaves,1);

        coniferTree.growUp(15);
        coniferTree.winterSeason(true);

    }
}
