package exercises.bfs;

import java.util.ArrayDeque;
import java.util.Optional;
import java.util.Queue;

public class BreadthFirstSearchAlgorithm {

    public static <T> Optional<Tree<T>> search(T value, Tree<T> root) {

        Queue<Tree<T>> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Tree<T> currentNode = queue.remove();
            if (currentNode.getValue().equals(value)) {
                return Optional.of(currentNode);
            } else {
                System.out.println(currentNode.getValue());
                queue.addAll(currentNode.getChildren());
            }
        }
        return Optional.empty();
    }
}
