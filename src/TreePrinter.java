import ru.rtech.internship.domain.Node;

public class TreePrinter {

    public static void printTree(Node currentNode) {
        if (currentNode != null) {
            printTree(currentNode.left());
            System.out.println(currentNode.value());
            printTree(currentNode.right());
        }
    }

    public static void main(String[] args) { ;
        TreePrinter.printTree(Tree.createRoot());
    }
}
