public class binaryTree {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;

        //insert
    public void add(int data) {
        root = insert(root, data);
    }

    public Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }
        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        }
        return node;
    }
    //delete
    public void delete(int data) {
        root = deleteNode(root, data);
    }

    public Node deleteNode(Node node, int data) {
        if (node == null) return null;

        if (data < node.data) {
            node.left = deleteNode(node.left, data);
        } else if (data > node.data) {
            node.right = deleteNode(node.right, data);
        } else {
            if (node.left == null)
                return node.right;
            else if (node.right == null)
                return node.left;

            node.data = minValue(node.right);
            node.right = deleteNode(node.right, node.data);
        }
        return node;
    }

    public int minValue(Node node) {
        int min = node.data;
        while (node.left != null) {
            node = node.left;
            min = node.data;
        }
        return min;
    }
    public int maxValue(Node node){
        int max=node.data;
        while(node.right!=null){
            node = node.right;
            max=node.data;
        }
        return max;
    }
    public void inorder() {
        inorderTraversal(root);
        System.out.println();
    }

    public void preorder() {
        preorderTraversal(root);
        System.out.println();
    }

    public void postorder() {
        postorderTraversal(root);
        System.out.println();
    }

    public void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    public void preorderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    public void postorderTraversal(Node node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {    //binarySearchTREE
        binaryTree bt = new binaryTree();

        bt.add(50);
        bt.add(30);
        bt.add(70);
        bt.add(20);
        bt.add(40);
        bt.add(60);
        bt.add(80);

        System.out.print("Inorder: ");
        bt.inorder();

        System.out.print("Preorder: ");
        bt.preorder();

        System.out.print("Postorder: ");
        bt.postorder();

        bt.delete(50);

        System.out.print("Inorder after deletion: ");
        bt.inorder();
    }
}
