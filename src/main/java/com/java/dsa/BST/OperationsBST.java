package com.java.dsa.BST;

public class OperationsBST {

    //Search BST

    public Node RSearch(Node node, int key){
        if (node==null){
            return null;
        }
        if (key==node.data){
            return node;
        } else if (key< node.data) {
            return RSearch(node.left,key);
        }
        else {
            return RSearch(node.right,key);
        }
    }

    //Insert BST

    public Node InsertIntoBST(Node node,int val){
        if (node==null)return new Node(val);
        Node cur=node;
        while (true){
            if (cur.data<=val){
                if (cur.right!=null)cur=cur.right;
                else {
                    cur.right=new Node(val);
                    break;
                }
            }else {
                if (cur.left!=null)cur=cur.left;
                else {
                    cur.left=new Node(val);
                    break;
                }
            }
        }
        return node;
    }
    //Delete Noe in BST
    public Node Delete(Node node,int key){
        if(node==null){
            return null;
        }
        if (node.data==key){
            return helper(node);
        }
        Node dummy=node;
        while (node!=null){
            if (node.data>key){
                if (node.left!=null && node.left.data==key){
                    node.left=helper(node.left);
                    break;
                }
                else {
                    node=node.left;
                }
            }else {
                if (node.right!=null && node.right.data==key){
                    node.right=helper(node.right);
                    break;
                }
                else {
                    node=node.right;
                }
            }
        }
        return dummy;
    }
    public Node helper(Node node){
        if (node.left==null){
            return node.right;
        } else if (node.right==null) {
           return node.left;
        }
        else {
            Node rightchild=node.right;
            Node lastRight=FindasRight(node.left);
            lastRight.right=rightchild;
            return node.left;
        }
    }
    public Node FindasRight(Node node){
        if (node.right==null){
            return node;
        }
        return FindasRight(node.right);
    }
}
