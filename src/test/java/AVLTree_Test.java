import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class AVLTree_Test
{
   @Test
    public void testCaseEqualsItself() {
        AVLTree tree = null;
        tree = new AVLTree();
        assertEquals(tree, tree);
    }

    @Test
    public void testCaseDefaultConstructor() {
        AVLTree tree = null;
        tree = new AVLTree();
        assertNotNull(tree);
    }

    @Test
    public void testCaseIntegerConstructor() {
        AVLTree tree = null;
        tree = new AVLTree();
        AVLTree.Node node = tree.new Node(5);
        assertEquals(5, node.key);
    }

    @Test
    public void testCaseGetFunction() {
        AVLTree tree = null;
        tree = new AVLTree();
        tree.insert(10);
        Object obj = tree.getRoot();
        assertNotNull(obj);
    }

    @Test
    public void testCaseInsertFunction() {
        AVLTree tree = null;
        tree = new AVLTree();
        tree.insert(10);
        AVLTree.Node node = tree.getRoot();
        assertEquals(10, node.key);
    }

    @Test
    public void testCaseLeftFindFunction() {
        AVLTree tree = null;
        tree = new AVLTree();
        tree.insert(10);
        tree.insert(12);
        tree.insert(9);
        AVLTree.Node node = tree.getRoot();
        assertEquals(9, node.left.key);
    }

    @Test
    public void testCaseRightFindFunction() {
        AVLTree tree = null;
        tree = new AVLTree();
        tree.insert(10);
        tree.insert(12);
        tree.insert(9);
        AVLTree.Node node = null;
        node = tree.getRoot();
        assertEquals(12, node.right.key);
    }

    @Test
    public void testCaseDeleteFunction() {
        AVLTree tree = null;
        tree = new AVLTree();
        tree.insert(10);
        tree.insert(12);
        tree.delete(10);
        assertNull(tree.find(10));
    }

    @Test
    public void testCaseGetBalanceFunction() {
        AVLTree tree = null;
        tree = new AVLTree();
        tree.insert(10);
        tree.insert(12);
        tree.insert(9);
        tree.insert(15);
        assertEquals(1, tree.getBalance(tree.find(12)));
    }

    @Test
    public void testCaseMultipleInsertionFunction() {
        AVLTree tree = null;
        tree = new AVLTree();
        tree.insert(10);
        tree.insert(12);
        tree.insert(9);
        AVLTree.Node node = null;
        node = tree.getRoot();
        assertEquals(10, tree.find(10).key);
    }

    @Test
    public void testCaseFindFunction() {
        AVLTree tree = null;
        tree = new AVLTree();
        tree.insert(10);
        AVLTree.Node node = null;
        node = tree.find(10);
        assertEquals(10, node.key);
    }


}
