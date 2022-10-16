import java.util.*;

class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
class recursive{
    
       
        static void postorderTraversal(Node cur,ArrayList<Integer>postorder) {
            if(cur==null) return;
             postorderTraversal(cur.left,postorder);
             
             postorderTraversal(cur.right,postorder);
             postorder.add(cur.data);
            
            
        }
  
    

    public static void main(String args[]) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(9);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        ArrayList < Integer > postorder = new ArrayList < > ();
        postorderTraversal(root, postorder);

        System.out.println("The postOrder Traversal is : ");
        for (int i = 0; i < postorder.size(); i++) {
            System.out.print(postorder.get(i) + " ");
        }
    }
}
