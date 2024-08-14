package exercises.bfs;

import java.util.Optional;

public class Search {

    public static void main(String[] args) {


        Tree<Integer> root = Tree.of(10);
        Tree<Integer> rootFirstChild = root.addChild(2);
        Tree<Integer> depthMostChild = rootFirstChild.addChild(3);
        Tree<Integer> rootSecondChild = root.addChild(4);

        Optional<Tree<Integer>> look = BreadthFirstSearchAlgorithm.search(4, root);
        System.out.println(look.get().getValue());
    }
}
