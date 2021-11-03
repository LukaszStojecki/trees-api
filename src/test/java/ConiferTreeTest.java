import Conifer.ConiferTree;
import Conifer.ConiferTreeType;
import Tree.Branches;
import Tree.LeafType;
import Tree.Leaves;
import Tree.Trunk;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConiferTreeTest {

    Trunk trunk = new Trunk(50);
    Branches branches = new Branches(10);
    Leaves leaves = new Leaves("dark", 100, LeafType.NEEDLE);

    ConiferTree coniferTree = new ConiferTree(ConiferTreeType.PINE, trunk, branches, leaves, 1);


    @Test
    void shouldGrowUpTrunkBy30() {


        try {
            coniferTree.growUp(30);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(80,coniferTree.getTunk().getHeight());
        Assertions.assertEquals(40,coniferTree.getBranches().getNumberOfBranches());
        Assertions.assertEquals(130,coniferTree.getLeaves().getNumberOfLeaves());
        Assertions.assertEquals(2,coniferTree.getAge());

    }

    @Test
    void shouldDroopingAllLeaves(){

        coniferTree.droopingLeaves();

        Assertions.assertEquals(100,coniferTree.getLeaves().getNumberOfLeaves());
    }

    @Test
    void shouldIsWinterSeason(){

        coniferTree.winterSeason(true);

        Assertions.assertTrue(true);
    }

}
