import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class AVLTree_Test
{
    @Test
    public void testcase1()
    {
        AVLTree x = null;
        x = new AVLTree();
        assertEquals(x, x);
    }

    @Test
    public void testCase2() {
        AVLTree x = null;
        x = new AVLTree();
        assertNotNull(x);
        System.out.println("Default Constructor");
    }

    @Test
    public void testCase3() {
        AVLTree x = null;
        x = new AVLTree();
        AVLTree.Node y = x.new Node(5);
        assertEquals(5, y.key);
    }

    @Test
    public void testcase4() {

        AVLTree x = new AVLTree();
        x.insert(5);

        assertEquals(x.find(10), null);
    }

    @Test
    public void testCase5() {
        AVLTree x = null;
        x = new AVLTree();
        x.insert(10);
        Object o = x.getRoot();
        assertNotNull(o);
    }

    @Test
    public void testCase6() {
        AVLTree x = null;
        x = new AVLTree();
        x.insert(10);
        AVLTree.Node y = x.getRoot();
        assertEquals(10, y.key);
    }

    @Test
    public void testCase7() {
        AVLTree x = null;
        x = new AVLTree();
        x.insert(10);
        x.insert(12);
        x.insert(9);
        AVLTree.Node y = x.getRoot();
        assertEquals(9, y.left.key);
    }

    @Test
    public void testCase8() {
        AVLTree x = null;
        x = new AVLTree();
        x.insert(10);
        x.insert(12);
        x.insert(9);
        AVLTree.Node y = null;
        y = x.getRoot();
        assertEquals(12, y.right.key);
    }

    @Test
    public void testCase9() {
        AVLTree x = null;
        x = new AVLTree();
        x.insert(10);
        x.insert(12);
        x.delete(10);
        assertNull(x.find(10));
    }

    @Test
    public void testCase10() {
        AVLTree x = null;
        x = new AVLTree();
        x.insert(10);
        x.insert(12);
        x.insert(9);
        x.insert(15);
        assertEquals(1, x.getBalance(x.find(12)));
    }

    @Test
    public void testCase11() {
        AVLTree x = null;
        x = new AVLTree();
        x.insert(10);
        x.insert(12);
        x.insert(9);
        AVLTree.Node y = null;
        y = x.getRoot();
        assertEquals(10, x.find(10).key);
    }

    @Test
    public void testCase12() {
        AVLTree x = null;
        x = new AVLTree();
        x.insert(10);
        AVLTree.Node y = null;
        y = x.find(10);
        assertEquals(10, y.key);
    }


}
