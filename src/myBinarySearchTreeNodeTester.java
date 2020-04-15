import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class myBinarySearchTreeNodeTester {
    @Test
    public void myBinarySearchTreeNodeTester1(){

    }

    @Test
    //Test for insert, regular performance case, trying to insert a new value
    public void myBinarySearchTreeNodeTester2(){

    }

    @Test
    //Test for height(). Regular performance test.
    //Expected = 5
    //Input arrary = {1,2,3,4,5}
    public void myBinarySearchTreeNodeTeste3(){
        int[] a = {1,2,3,4,5};
        myBinarySearchTreeNode testTree = new myBinarySearchTreeNode(a);
        assertEquals(5, testTree.height());
    }

    @Test
    //Test for depth(). Regular performance test
    //Array of the test tree = {0,1,1,2,2,2,2,3,3,3,3,3,3,3,3,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4};
    //Expected: 4
    public void myBinarySearchTreeNodeTester4(){
        int[] a = {0,1,1,2,2,2,2,3,3,3,3,3,3,3,3,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4};
        myBinarySearchTreeNode testTree = new myBinarySearchTreeNode(a);
        assertEquals(4, testTree.depth(4));
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
