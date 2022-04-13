import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class AVLTree_Test
{
    @Test
    public void testcase1() {
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
        x.insert(6);

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
        x.insert(14);
        AVLTree.Node y = x.getRoot();
        assertEquals(14, y.key);
    }

    @Test
    public void testCase7() {
        AVLTree x = null;
        x = new AVLTree();
        x.insert(11);
        x.insert(12);
        x.insert(8);
        AVLTree.Node y = x.getRoot();
        assertEquals(8, y.left.key);
    }

    @Test
    public void testCase8() {
        AVLTree x = null;
        x = new AVLTree();
        x.insert(121);
        x.insert(312);
        x.insert(88);
        AVLTree.Node y = null;
        y = x.getRoot();
        assertEquals(312, y.right.key);
    }

    @Test
    public void testCase9() {
        AVLTree x = null;
        x = new AVLTree();
        x.insert(3);
        x.insert(7);
        x.delete(7);
        assertNull(x.find(7));
    }

    @Test
    public void testCase10() {
        AVLTree x = null;
        x = new AVLTree();
        x.insert(16);
        x.insert(18);
        x.insert(15);
        x.insert(21);
        assertEquals(1, x.getBalance(x.find(18)));
    }

    @Test
    public void testCase11() {
        AVLTree x = null;
        x = new AVLTree();
        x.insert(101);
        x.insert(121);
        x.insert(91);
        AVLTree.Node y = null;
        y = x.getRoot();
        assertEquals(101, x.find(101).key);
    }

    @Test
    public void testCase12() {
        AVLTree x = null;
        x = new AVLTree();
        x.insert(37);
        AVLTree.Node y = null;
        y = x.find(37);
        assertEquals(37, y.key);
    }

    @Test
    public void testCase13() {
        int[] array = { 20, 30, 40, 50, 25};
        AVLTree x = new AVLTree();

        for (int i = 0; i < array.length; i++) {
            x.insert(array[i]);
        }
        assertEquals(x.find(60), null);
    }


    @Test
    public void testCase14() {
        int[] array = {1000, 2000, 3000, 4000, 5000, 2500};
        AVLTree x = new AVLTree();

        for (int i = 0; i < array.length; i++) {
            x.insert(array[i]);
        }

        assertEquals(x.height(), 2);
    }

    @Test
    public void testCase15() {

        AVLTree x = new AVLTree();
        x.insert(4);

        assertNotNull(x.find(4));
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
        assertEquals(x.find(400), null);
    }

    @Test
    public void testCase18() {
        AVLTree x = new AVLTree();
        x.insert(1220);
        x.insert(2220);
        x.insert(3220);
        x.insert(4220);
        x.insert(5220);
        assertEquals(x.height(), 2);
    }

    @Test
    public void testCase19() {
        AVLTree x = new AVLTree();
        x.insert(17);
        x.insert(24);
        x.insert(34);
        x.insert(44);
        x.insert(54);
        x.delete(34);
        assertEquals(x.find(33), null);
    }

    @Test
    public void testCase20() {
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
    public void testCase21() {
        AVLTree x = new AVLTree();
        x.insert(1111);
        x.delete(1111);
        x.insert(2222);
        x.insert(3333);
        x.insert(4444);
        x.delete(4444);
        x.insert(5555);
        x.insert(6666);
        x.insert(7777);
        x.insert(8888);
        assertEquals(x.find(4444),null);
    }

    @Test
    public void testCase22()  {
        AVLTree x = new AVLTree();
        x.insert(43);
        x.delete(43);
        x.height();
        x.insert(46);
        x.find(43);
        assertEquals(0, x.height());
    }

    @Test
    public void testCase23() {
        AVLTree x = new AVLTree();
        x.insert(110);
        x.insert(210);
        x.insert(310);
        x.insert(410);
        x.insert(510);
        x.insert(225);
        assertEquals(x.getRoot(), x.find(310));
    }

    @Test
    public void testCase24()   {
        AVLTree x = new AVLTree();
        AVLTree.Node y = x.find((-17));
        assertNull(y);
    }

    @Test
    public void testCase25() {
        AVLTree x = new AVLTree();
        x.insert(141);
        AVLTree.Node y = x.getRoot();
        assertEquals(141, y.key);
        assertNotNull(x.find(141));
    }

    @Test
    public void testCase26()  {
        AVLTree x = new AVLTree();
        x.insert(5);
        x.delete(5);
        assertEquals((-1), x.height());
    }



}
