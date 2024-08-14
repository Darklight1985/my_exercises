package exercises.bfs;

import java.util.Optional;

public class SearchNode {

    public static void main(String[] args) {

        Node<Integer> start = new Node<>(10);
        Node<Integer> firstNeighbor = new Node<>(2);
        start.connect(firstNeighbor);

        Node<Integer> firstNeighborNeighbor = new Node<>(3);
        firstNeighbor.connect(firstNeighborNeighbor);
        firstNeighborNeighbor.connect(start);

        Node<Integer> secondNeighbor = new Node<>(4);
        start.connect(secondNeighbor);

        Optional<Node<Integer>> look = BreadthFirstSearchAlgorithmNodes.search(4, firstNeighborNeighbor);
        System.out.println(look.get().getValue());
    }
}
