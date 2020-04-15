class myBinarySearchTreeNode{
  int myValue;
  myBinarySearchTreeNode left;
  myBinarySearchTreeNode right;
    
  myBinarySearchTreeNode(int inValue){
    // created a new node with empty child pointers
    myValue = inValue;
    left = null;
    right = null;

  }
  
  myBinarySearchTreeNode(int[] A){
    // creates a new Binary Search Tree rooted at the first value in the array
    /// by inserting elements into the tree in the order they are given in A.
    int i = 1;                        //Index iterator
    //Assign the value of the root
    myValue = A[0];

    //Insert nodes until there are no more values in the array
    while(i < A.length){
      this.insert(A[i]);
      i++;
    }
  }
  
  public void insert(int inValue){
    // This method takes a new integer as input and decides 
    // if it should be place: 
    //    * as the left child,
    //    * as the right child, 
    //    * in the left subtree,
    //    * or in the right subtree.
    // If the value already exists in the tree, no action is taken. 

    //Checks if the value should go in the left subtree, if there exists a left child makes a recursive call on that node, otherwise creates a new node and makes it the left child
    if(inValue < myValue ) {
      if (left != null) {
        left.insert(inValue);
      }
      else{
        left = new myBinarySearchTreeNode(inValue);
      }
    }

    //Checks if the value should go in the right subtree, if there exists a right child makes a recursive call on that node, otherwise creates a new node and makes it the right child
    if(inValue > myValue){
      if(right != null) {
        right.insert(inValue);
      }
      else{
        right = new myBinarySearchTreeNode(inValue);
      }
    }
  }
  
  public int height(){
     // This method recursively calculates the height of the entire (sub)tree.
     // This method will take O(n) time
    int leftHeight = 0;
    int rightHeight = 0;

    //If there exists a left child call the method on that node
    if(left != null){
       leftHeight = left.height();
    }
    //If there exists a right child call the method on that node
    if (right != null) {
      rightHeight = right.height();
    }

    //Return the bigger height of each of the subtrees
    return Math.max(leftHeight, rightHeight) + 1;

  }
  
  public int depth(int search){
     // This method recursively calculates the depth of a given search value. 
     // If the given value is not in the tree, this method returns -1. 
     // Note that if the tree is a proper BST, this method should complete in O(log n) time.
     // Additionally, remember that the depth is the number of nodes on the path from a node to the root 
     // (i.e. the number of the recursive calls).

    int sum = 1;

    //If search is smaller it tries to go to the left child
    if (search < myValue) {
      //If there exists a left node it will call the the method on that child
      if (left != null) {
        return sum + left.depth(search);
      }
    }

    //If search is bigger it tries to go to the right child
    if (search > myValue) {
      //If there exists a right node it will call the method on that child
      if (right != null) {
        return sum + right.depth(search);
      }
    }

    //If search is found it will return the depth of the node
    if (search == myValue) {
        return sum - 1;
    }

    //If the value is not found than it will return -1
    return -2 - sum;
  }

  public int size(){
    // This method recursively calculates the number of nodes in the (sub)tree.
    int sum = 1;

    //If there exists a left child, it will make the call to recursively traverse the left subtree
    if (left != null) {
      sum += left.size();
    }

    //If there exists a right child, it will make the call to recursively traverse the right subtree
    if (right != null) {
      sum += right.size();
    }

    //If there are no children return sum
    return sum;
  }
  
  // Utility function included so you can debug your solution. 
  public void print() { print(""); }
  private void print(String prefix) {
    System.out.println(prefix + myValue);
    prefix = prefix.replace('\u251C', '\u2502');
    prefix = prefix.replace('\u2514', ' ');
    if(left != null) left.print(prefix + "\u251C ");
    if(right != null) right.print(prefix + "\u2514 ");
  }

  public static void main(String[] args) {
    int[] a = {4,6,2,1,5,3,7};
    myBinarySearchTreeNode tree = new  myBinarySearchTreeNode(a);
    tree.print();
    System.out.println(tree.height());
    System.out.println(tree.depth(100));
    System.out.println(tree.size());
  }
  
} 
