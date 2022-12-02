public class Node {
    private int value;
    private Node left;
    private Node right;

    public Node(int value){
        this.value = value;
    }

    public Node getLeft() {
        return this.left;
    }

    public Node getRight(){
        return this.right;
    }

    public void setLeft(Node gg){
        this.left = gg;
    }

    public void setRight(Node right){
        this.right = right;
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int a){
        this.value = a;
    }

    @Override
    public String toString() {
        return "" + this.value;
    }
}
