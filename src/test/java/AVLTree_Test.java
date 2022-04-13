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

    @Test
    public void testCase13() {
        int[] array = { 10, 20, 30, 40, 50, 25 };
        AVLTree x = new AVLTree();

        for (int i = 0; i < array.length; i++) {
            x.insert(array[i]);
        }
        assertEquals(x.find(60), null);
    }

    @Test
    public void testCase14() {
        int[] array = { 1000, 2000, 3000, 4000, 5000, 2500 };
        AVLTree x = new AVLTree();

        for (int i = 0; i < array.length; i++) {
            x.insert(array[i]);
        }

        assertEquals(x.height(), 2);
    }

    @Test
    public void testCase15() {

        AVLTree x = new AVLTree();
        x.insert(5);

        assertNotNull(x.find(5));
    }

    @Test
    public void testCase16() {
        AVLTree x = new AVLTree();
        x.insert(300);
        x.delete(300);
        x.insert(300);
        AVLTree.Node y = x.getRoot();
        int z = x.getBalance(y);
        assertEquals(0, x.height());
        assertEquals(0, z);
        assertNotNull(x.find(300));
    }

    @Test
    public void testcase17() {
        AVLTree x = new AVLTree();
        x.insert(150);
        x.insert(250);
        x.insert(350);
        x.insert(450);
        x.insert(750);
        assertEquals(x.find(400),null);
    }

    @Test
    public void testCase18() {
        AVLTree x = new AVLTree();
        x.insert(1220);
        x.insert(2220);
        x.insert(3220);
        x.insert(4220);
        x.insert(5220);
        assertEquals(x.height(),2);
    }

    @Test
    public void testCase19() {
        AVLTree x = new AVLTree();
        x.insert(14);
        x.insert(24);
        x.insert(34);
        x.insert(44);
        x.insert(54);
        x.delete(34);
        assertEquals(x.find(33), null);
    }

    @Test
    public void testCase20() {
        int[] array = { 110, 220, 330, 440, 550, 250 };
        AVLTree x = new AVLTree();
        x.insert(170);
        x.insert(270);
        x.insert(370);
        x.insert(470);
        x.insert(570);
        x.insert(670);
        assertEquals(x.getBalance(x.find(60)), 0);
    }

     @Test
    public  void testCase21() {
        AVLTree x = new AVLTree();
        x.insert(1111);
        x.insert(2222);
        x.insert(3333);
        x.insert(4444);
        x.insert(5555);
        x.insert(6666);
        x.insert(7777);
        x.insert(8888);
        assertTrue(x.find(1110)==null);
        assertTrue(x.find(3330)==null);
    }


}
