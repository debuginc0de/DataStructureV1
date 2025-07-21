package com.java.dsa.BST;

public class KthSmallest {
    public Node Ksmall(Node node,int key){
        int cnt=0;
        if (node==null){
            return null;
        }
        Ksmall(node.left,key);
        cnt++;
        if (cnt==key){
            System.out.println(node.data);
        }
        return Ksmall(node.right,key);

    }
    //isValid BST or not

    public boolean isValidBST(Node node,long max,long min){
        if (node==null)return true;
        if (node.data>=max || node.data<=min)return false;
        return isValidBST(node.left,min,node.data) &&
                isValidBST(node.right,node.data,max);
    }
}
