import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class myBinarySearchTreeNodeTester {
    @Test
    //Test for the insert(), regular performance test
    //input array for the tree = {2,1}
    //Insert node with value: 99
    public void myBinarySearchTreeNodeTester1(){
        int[] a = {2,1};
        myBinarySearchTreeNode testTree = new myBinarySearchTreeNode(a);
        testTree.insert(99);
        int[] b = {2,1,99};
        myBinarySearchTreeNode expectedTree = new myBinarySearchTreeNode(b);
        assertEquals(expectedTree.myValue ,testTree.myValue);
        assertEquals(expectedTree.left.myValue ,testTree.left.myValue);
        assertEquals(expectedTree.right.myValue ,testTree.right.myValue);
        assertNull(testTree.left.left);
        assertNull(testTree.left.right);
        assertNull(testTree.right.left);
        assertNull(testTree.right.right);



    }

    @Test
    //Test for height(). Regular performance test.
    //Expected = 5
    //Input array = {1,2,3,4,5}
    public void myBinarySearchTreeNodeTester2(){
        int[] a = {1,2,3,4,5};
        myBinarySearchTreeNode testTree = new myBinarySearchTreeNode(a);
        assertEquals(5, testTree.height());
    }

    @Test
    //Test for depth(). Regular performance test
    //Array of the test tree = {0,1,1,2,2,2,2,3,3,3,3,3,3,3,3,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4};
    //Expected: 4
    public void myBinarySearchTreeNodeTester3(){
        int[] a = {0,1,1,2,2,2,2,3,3,3,3,3,3,3,3,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4};
        myBinarySearchTreeNode testTree = new myBinarySearchTreeNode(a);
        assertEquals(4, testTree.depth(4));
    }

    @Test
    //Test for depth(). Edge case test, search a value that is not in the tree
    //Array of the test tree = {0,1,1,2,2,2,2,3,3,3,3,3,3,3,3,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4};
    //Expected: -1
    public void myBinarySearchTreeNodeTester4(){
        int[] a = {0,1,1,2,2,2,2,3,3,3,3,3,3,3,3,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4};//
        myBinarySearchTreeNode testTree = new myBinarySearchTreeNode(a);
        assertEquals(-1, testTree.depth(777));
    }

    @Test
    //Test for size(), Regular performance test
    //Array ot the test tree = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31}
    //Expected: 32
    public void myBinarySearchTreeNodeTester5(){
        int[] a = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
        myBinarySearchTreeNode testTree = new myBinarySearchTreeNode(a);
        assertEquals(32, testTree.size());

    }
}
