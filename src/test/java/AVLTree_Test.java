import org.junit.Test;

public class AVLTree_Test {



    @Test(timeout = 4000)
    public void test00()  throws Throwable  {
        AVLTree aVLTree0 = new AVLTree();
        aVLTree0.insert((-926));
        aVLTree0.delete(190);
        int int0 = 0;
        aVLTree0.insert(1678);
        aVLTree0.insert(0);
        aVLTree0.insert(190);
        aVLTree0.delete(0);
        aVLTree0.insert(1);
        AVLTree.Node aVLTree_Node0 = aVLTree0.find(1);
        aVLTree_Node0.key = 3603;
        aVLTree0.height();
        AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
        aVLTree_Node0.left = aVLTree_Node1;
        AVLTree.Node aVLTree_Node2 = aVLTree0.new Node(3603);
        aVLTree_Node2.key = 3603;
        aVLTree_Node0.right = aVLTree_Node2;
        int int1 = aVLTree0.getBalance(aVLTree_Node0);
        aVLTree0.getRoot();
        aVLTree0.insert(int1);
        aVLTree0.getRoot();
        aVLTree0.find(int0);
        int int2 = 1930;
        aVLTree0.find(int2);
    }



}