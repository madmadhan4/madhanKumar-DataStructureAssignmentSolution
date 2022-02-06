package com.greatlearning.appmain;

public class ModifyBST {
	public static Node node;
    static Node prevNode = null;
    static Node headNode = null;
   
    static void convertBSToSkewed(Node root,
                                  String order)
    {
       
        if(root == null)
        {
            return;
        }
       
        if(order == "dec" || order == "DEC")
        {
        	convertBSToSkewed(root.right, order);
        }
        else
        {
        	convertBSToSkewed(root.left, order);
        }
        Node rightNode = root.right;
        Node leftNode = root.left;
       
        if(headNode == null)
        {
            headNode = root;
            root.left = null;
            prevNode = root;
        }
        else
        {
            prevNode.right = root;
            root.left = null;
            prevNode = root;
        }
       
        if (order == "dec" || order == "DEC")
        {
        	convertBSToSkewed(leftNode, order);
        }
        else
        {
        	convertBSToSkewed(rightNode, order);
        }
    }
    static void traverseRightSkewed(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.val + " ");
        traverseRightSkewed(root.right);       
    }
    
    public static void main(String[] args) {
		ModifyBST tree = new ModifyBST();
        tree.node = new Node(50);
        tree.node.left = new Node(30);
        tree.node.right = new Node(60);
        tree.node.left.left = new Node(10);
        tree.node.right.left = new Node(55);
       
        String order = "ASC";
        convertBSToSkewed(node, order);
        traverseRightSkewed(headNode);
    }
    
}
