import java.util.ArrayList;
import java.util.List;

public class Node<T> {
    public T data;
    public List<Node<T>> connected;
    public boolean visited;

    public Node(T data) {
        this.data = data;
        this.connected = new ArrayList<>();
        this.visited = false;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setConnected(List<Node<T>> connected) {
        this.connected = connected;
    }

    public T getData() {
        return data;
    }

    public boolean isVisited() {
        return visited;
    }

    public List<Node<T>> getConnected() {
        return connected;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}