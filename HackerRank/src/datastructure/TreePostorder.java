package datastructure;

/**
 * Created by Pranav on 29/04/16.
 */
public class TreePostorder {

    /* you only have to complete the function given below.
Node is defined as */

class Node {
    int data;
    Node left;
    Node right;
}


    void postOrder(Node root) {

        if(root == null)
            return;

        if(root.left != null)
            postOrder(root.left);
        if(root.right!=null)
            postOrder(root.right);

        System.out.print(root.data + " ");

    }
}
