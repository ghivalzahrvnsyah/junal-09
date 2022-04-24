package binarytree;

import org.w3c.dom.Node;

public class BinnaryTree<E> {
    private NodeTree root;

    // constructor
    public BinnaryTree() {
        root = null;
    }
    // fungsi jika tree kosong
    public boolean isEmpty () {
        return root == null;
    }
    // fungsi insert data
    public void insert (E data) {

        root = insert(root, data);
    }
    // fungsi insert data secara rekursif
    private NodeTree insert (NodeTree node, E data) {
        if (node == null)
            node = new NodeTree<>(data);
        else {
            if (node.getLeft() == null)
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);
        }
        return node;
    }
    // fungsi menghitung jumlah node
    public int countNodes () {
        return countNodes(root);
    }
    // fungsi menghitung jumlah nodes secara rekursif
    private int countNodes (NodeTree r) {
        if (r == null)
            return 0;
        else {
            int i = 1;
            i += countNodes(r.getLeft());
            i += countNodes(r.getRight());
            return i;
        }
    }
    // fungsi mencari sebuah element
    public boolean search (E val) {
        return search(root, val);
    }
    // fungsi mencari sebuah element secara rekursif
    private boolean search(NodeTree r, E val) {
        if (r. getData() == val)
            return true;
        if (r.getLeft() != null)
            if (search(r.getLeft(), val))
                return true;
        if (r.getRight() != null)
            if (search(r.getRight(), val))
                return true;
        return false;
    }
    // left -> root/visit -> right
    // fungsi untuk inorder traversal
    public void inorder () {
        inorder(root);
    }
    private void inorder(NodeTree r) {
        if (r != null) {
            inorder(r.getLeft());
            System.out.println(r.getData() + " ");
            inorder(r.getRight());
        }
    }
    //root/visit -> left -> right
    // fungsi untuk preorder traversal
    public void preorder () {
        preorder(root);
    }
    private void preorder (NodeTree r) {
        if (r != null) {
            System.out.println(r.getData() + " ");
            preorder(r.getLeft());
            preorder(r.getRight());
        }
    }
    // left -> right -> visit/root
    // fungsi untuk postorder traversal
    public void postorder (){
        postorder(root);
    }
    private void postorder (NodeTree r) {
        if (r != null) {
            postorder(r.getLeft());
            postorder(r.getRight());
            System.out.println(r.getData() + " ");
        }
    }

}
