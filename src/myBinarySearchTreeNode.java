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
    myValue = A[0];

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
    if(inValue < myValue ) {
      if (left != null) {
        left.insert(inValue);
      }
      else{
        left = new myBinarySearchTreeNode(inValue);
      }
    }

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
    if(left != null){
       leftHeight = left.height();
    }
    if (right != null) {
      rightHeight = right.height();
    }

    return Math.max(leftHeight, rightHeight) + 1;

  }
  
  public int depth(int search){
     // This method recursively calculates the depth of a given search value. 
     // If the given value is not in the tree, this method returns -1. 
     // Note that if the tree is a proper BST, this method should complete in O(log n) time.
     // Additionally, remember that the depth is the number of nodes on the path from a node to the root 
     // (i.e. the number of the recursive calls).

    int sum = 1;
    if (search < myValue) {
      if (left != null) {
        return sum + left.depth(search);
      }
    }

    if (search > myValue) {
      if (right != null) {
        return sum + right.depth(search);
      }
    }

    if (search == myValue) {
        return sum - 1;
    }
    return -2 - sum;
  }

  public int size(){
    // This method recursively calculates the number of nodes in the (sub)tree.
    int sum = 1;
    if (left != null) {
      sum += left.size();
    }

    if (right != null) {
      sum += right.size();
    }
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
