package exercises.bfs;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Tree<T> {
    private T value;
    private List<Tree<T>> children;

    private Tree(T value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

    public static <T> Tree<T> of(T value) {
        return new Tree<>(value);
    }

    public Tree<T> addChild(T value) {
        Tree<T> newChild = new Tree<>(value);
        children.add(newChild);
        return newChild;
    }
}

