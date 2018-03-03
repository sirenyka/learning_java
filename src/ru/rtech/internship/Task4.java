package ru.rtech.internship;

import ru.rtech.internship.domain.Node;

import java.util.LinkedList;
import java.util.List;

public class Task4 {

    /**
     * На вход идет корень бинарного дерева(node), каждый элемент дерева содержит значение (node.value) - строка, в которой записано целое число.
     * На выходе получить строку со всеми элементами дерева, разделенными точкой с запятой. После последнего элемента ; быть не должно.
     * Элементы должны быть отсортированы по возрастанию как числа.
     * <p>
     * Пример:
     * Если в дереве элементы [1, 10, 2, 110], необходимо вывести строку 1;2;10;110
     */
    public String sortedTreeValues(Node root) {

        List<Node> nodes = new LinkedList<>();
        List<Integer> integers = new LinkedList<>();

        nodes.add(root);

        while (nodes.size() > 0) {
            List<Node> childNode = new LinkedList<>();
            for (Node node : nodes) {
                if (!(node.left() == null)) {
                    childNode.add(node.left());
                }
                if (!(node.right() == null)) {
                    childNode.add(node.right());
                }
                integers.add(Integer.parseInt(node.value()));
            }
            nodes = childNode;
        }
        integers.sort(Integer::compareTo);
        String result = integers.get(0).toString();
        for (int i = 1; i < integers.size(); i++) {
            result = result.concat(";" + integers.get(i).toString());
        }
        return result;
    }
}


