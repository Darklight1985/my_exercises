package exercises.bfs;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Node<T> {
    private T value;
    private Set<Node<T>> neighbors;

    public Node(T value) {
        this.value = value;
        this.neighbors = new HashSet<>();
    }

    public void connect(Node<T> node) {
        if (this == node) throw new IllegalArgumentException("Can't connect node to itself");
        this.neighbors.add(node);
        node.neighbors.add(this);
    }
}

