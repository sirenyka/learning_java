import ru.rtech.internship.domain.Node;

public class Tree {
    public static Node createRoot() {
        Node root = new Node(
                new Node(
                        new Node(null, null, "1"),
                        new Node(null, null, "2"),
                        "3"),
                new Node(
                        null,
                        new Node(
                                new Node(null, null, "4"),
                                null,"5"),
                        "6"),
                "7");

//        Node root = new Node(
//                new Node(null, null, "1"),
//                new Node(null, null, "3"),
//                "2");

        return root;
    }
}


