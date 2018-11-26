package com.zhijunwoo.structures.trees;

/**
 * @author wuzhijun on 2018/11/26
 */
public class Node {

    private int data;
    private Node left;
    private Node right;
    private Node parent;

    public Node(int data, Node leftNode, Node rightNode) {
        this.data = data;
        this.left = leftNode;
        this.right = rightNode;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }
}