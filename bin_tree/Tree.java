public class Tree {
    private Node koren;

    public Tree(int[] massiv){
        koren = new Node(massiv[0]);
        int level = 0;

        Node[] nowLevel = new Node[]{koren};

        int indxOfMas = 1;

        int lenOfMas = massiv.length;

        while(indxOfMas < lenOfMas){
            Node[] nextLevel = new Node[(int) Math.pow(2, level+1)];
            int numOfNowNode = 0;
            for(int i = 0; i < nextLevel.length; i+=2){
                Node node = new Node(massiv[indxOfMas]);
                nowLevel[numOfNowNode].setLeft(node);
                nextLevel[i] = node;
                indxOfMas++;
                if(indxOfMas >= lenOfMas){
                    break;
                }
                node = new Node(massiv[indxOfMas]);
                nowLevel[numOfNowNode].setRight(node);
                nextLevel[i+1] = node;
                indxOfMas++;
                numOfNowNode++;
                if(indxOfMas >= lenOfMas){
                    break;
                }
            }
            level++;
            nowLevel = nextLevel;
        }
    }

    public void printTree(){
        printNode(koren);
    }

    public void printNode(Node node){
        System.out.println(node);

        if(node.getLeft() instanceof Node){
            printNode(node.getLeft());
        }
        if(node.getRight() instanceof Node){
            printNode(node.getRight());
        }
    }
}
