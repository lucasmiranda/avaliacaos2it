
public class Questao9 extends  BinaryTree {

    BinaryTree root;

       public Questao9(int valor){
        this.valor = valor;
        left = null;
        right = null;
    }

    public void insert(int key) {
        root = insert(root, key);

    }

    public int sum(int val){

           BinaryTree node = getNode(val);
           if(node==null) return 0;

            return calcTotal(node);
    }

    private BinaryTree getNode(int value) {
        return searchNode(value, root);
    }

    private int calcTotal(BinaryTree node){

        int resp = 0;
        if(node.left != null){
            resp= resp + calcTotal(node.left);
        }
        if(node.right != null){
            resp= resp +  calcTotal(node.right);
        }
        resp = resp + node.valor;
        return resp;
    }

    private BinaryTree searchNode(int value,BinaryTree node){

        if (node == null) {
            return null;
        }

        if (value == node.valor) {
            return node;
        }

        return value < node.valor
                ? searchNode(value,node.left)
                : searchNode(value,node.right);
    }

    private BinaryTree insert(BinaryTree root, int key) {

        if (root == null) {
            root = new Questao9(key);
            return root;
        }

        if (key < root.valor)
            root.left = insert(root.left, key);
        else if (key > root.valor)
            root.right = insert(root.right, key);

        return root;
    }



}

