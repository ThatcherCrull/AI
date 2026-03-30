import java.util.HashMap;
import java.util.Map;

public class Graph<T> {
    private Map<T, Node<T>> nodes = new HashMap<>();

    public void addNode(T data) {
        nodes.putIfAbsent(data, new Node<>(data));
    }

    public void addEdge(T source, T destination) {
        Node<T> from = nodes.get(source);
        Node<T> to = nodes.get(destination);

        if (from != null && to != null) {
            from.connected.add(to);
        }
    }

    public void resetVisited() {
        for (Node<T> n : nodes.values()) {
            n.visited = false;
        }
    }

    public Node<T> getNode(T data) {
        return nodes.get(data);
    }
}
