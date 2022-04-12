import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class AVLTree_tests
{
    @Test
    void testcase1()
    {
        AVLTree x = null;
        x = new AVLTree();
        assertEquals(x, x);
    }

    @Test
    void testCase2() {
        AVLTree x = null;
        x = new AVLTree();
        assertNotNull(x);
        System.out.println("Default Constructor");
    }

    @Test
    void testCase3() {
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
    void testCase5() {
        AVLTree x = null;
        x = new AVLTree();
        x.insert(10);
        Object o = x.getRoot();
        assertNotNull(o);
    }

    @Test
    void testCase6() {
        AVLTree x = null;
        x = new AVLTree();
        x.insert(10);
        AVLTree.Node y = x.getRoot();
        assertEquals(10, y.key);
    }

    @Test
    void testCase7() {
        AVLTree x = null;
        x = new AVLTree();
        x.insert(10);
        x.insert(12);
        x.insert(9);
        AVLTree.Node y = x.getRoot();
        assertEquals(9, y.left.key);
    }

    @Test
    void testCase8() {
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
    void testCase9() {
        AVLTree x = null;
        x = new AVLTree();
        x.insert(10);
        x.insert(12);
        x.delete(10);
        assertNull(x.find(10));
    }

    @Test
    void testCaseGetBalanceFunction() {
        AVLTree x = null;
        x = new AVLTree();
        x.insert(10);
        x.insert(12);
        x.insert(9);
        x.insert(15);
        assertEquals(1, x.getBalance(x.find(12)));
    }


}
