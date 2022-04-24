package binarytree;

import org.w3c.dom.Node;

//kelas generic node tree
public class NodeTree<E> {
    NodeTree left, right; // link reference
    E data;

    // constructor
    public NodeTree() {
        left = null;
        right = null;
        data = null;
    }
    public NodeTree(E item) {
        left = null;
        right = null;
        data = item;
    }
    // fungsi untuk menetapkan node sebelah kiri
    public void setLeft (NodeTree n) {
        left = n;
    }
    // fungsi untuk menetapkan node sebelah kanan
    public void setRight (NodeTree n)
    {
        right = n;
    }
    // fungsi untuk mendapatkan node kiri
    public NodeTree getLeft() {
        return left;
    }
    // fungsi untuk mendapatkan nodek kanan
    public NodeTree getRight()
    {
        return right;
    }
    // fungsi untuk set data ke dalam node
    public void setData (E d) {
        data = d;
    }
    // fungsi untuk mendapatkan data dari node
    public E getData() {

        return data;
    }
}
