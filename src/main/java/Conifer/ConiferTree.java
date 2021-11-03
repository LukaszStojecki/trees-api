package Conifer;

import Tree.AbstractTree;
import Tree.Branches;
import Tree.Leaves;
import Tree.Trunk;

public class ConiferTree extends AbstractTree {

    protected ConiferTreeType coniferTreeType;


    public ConiferTree(ConiferTreeType coniferTreeType, Trunk tunk, Branches branches, Leaves leaves, int age) {
        super(tunk, branches, leaves, age);
        this.coniferTreeType = coniferTreeType;

    }

    public ConiferTreeType getConiferTreeType() {
        return coniferTreeType;
    }

    public void setConiferTreeType(ConiferTreeType coniferTreeType) {
        this.coniferTreeType = coniferTreeType;
    }


    @Override
    public String toString() {
        return "AbstractConiferTree{" +
                "coniferTreeType=" + coniferTreeType +
                ", tunk=" + tunk +
                ", branches=" + branches +
                ", leaves=" + leaves +
                ", age=" + age +
                '}';
    }
}
