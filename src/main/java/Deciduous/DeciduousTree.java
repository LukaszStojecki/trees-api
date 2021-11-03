package Deciduous;


import Tree.AbstractTree;
import Tree.Branches;
import Tree.Leaves;
import Tree.Trunk;

public class DeciduousTree extends AbstractTree {

    protected DeciduousTreeType deciduousTreeType;


    public DeciduousTree(DeciduousTreeType deciduousTreeType, Trunk tunk, Branches branches, Leaves leaves, int age) {
        super(tunk, branches, leaves, age);
        this.deciduousTreeType = deciduousTreeType;

    }

    public DeciduousTreeType getDeciduousTreeType() {
        return deciduousTreeType;
    }

    public void setDeciduousTreeType(DeciduousTreeType deciduousTreeType) {
        this.deciduousTreeType = deciduousTreeType;
    }


    @Override
    public String toString() {
        return "AbstractDeciduousTree{" +
                "deciduousTreeType=" + deciduousTreeType +
                ", tunk=" + tunk +
                ", branches=" + branches +
                ", leaves=" + leaves +
                ", age=" + age +
                '}';
    }
}
