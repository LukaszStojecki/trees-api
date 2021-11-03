import Conifer.ConiferTree;
import Conifer.ConiferTreeType;
import Deciduous.DeciduousTree;
import Deciduous.DeciduousTreeType;
import Tree.Branches;
import Tree.LeafType;
import Tree.Leaves;
import Tree.Trunk;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeciduousTreeTest {

    Trunk trunk = new Trunk(60);
    Branches branches = new Branches(10);
    Leaves leaves = new Leaves("dark", 100, LeafType.LEAF);

    DeciduousTree deciduousTree = new DeciduousTree(DeciduousTreeType.BIRCH, trunk, branches, leaves, 1);


    @Test
    void shouldTreeGrowUpBy30() {

        try {
            deciduousTree.growUp(30);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(80,deciduousTree.getTunk().getHeight());
        Assertions.assertEquals(40,deciduousTree.getBranches().getNumberOfBranches());
        Assertions.assertEquals(130,deciduousTree.getLeaves().getNumberOfLeaves());
        Assertions.assertEquals(2,deciduousTree.getAge());

    }

    @Test
    void shouldDroopingAllLeaves(){

        deciduousTree.droopingLeaves();

        Assertions.assertEquals(0,deciduousTree.getLeaves().getNumberOfLeaves());
    }
}
