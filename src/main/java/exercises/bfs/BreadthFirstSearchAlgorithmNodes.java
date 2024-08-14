package exercises.bfs;

import java.util.*;

public class BreadthFirstSearchAlgorithmNodes {

    public static <T> Optional<Node<T>> search(T value, Node<T> start) {

        Queue<Node<T>> queue = new ArrayDeque<>();
        queue.add(start);

        Node<T> currentNode;
        Set<Node<T>> alreadyVisited = new HashSet<>();

        while (!queue.isEmpty()) {
            currentNode = queue.remove();
            System.out.println(currentNode.getValue());

            if (currentNode.getValue().equals(value)) {
                return Optional.of(currentNode);
            } else {
                alreadyVisited.add(currentNode);
                queue.addAll(currentNode.getNeighbors());
                queue.removeAll(alreadyVisited);
            }
        }
        return Optional.empty();
    }
}
