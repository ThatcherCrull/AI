import java.util.Stack;

public class dfs<T> {
    //This is DFS using recursive
    public void dfsRecursive(Node<T> startNode) {
        if (startNode == null || startNode.isVisited()) return;

        //Visit the first node
        System.out.print(startNode.getData() + " ");
        startNode.setVisited(true);

        for (Node<T> neighbor : startNode.getConnected()) {
            if (!neighbor.isVisited()) {
                dfsRecursive(neighbor);
            }
        }
    }

    //This is DFS using Iteration
    public void dfsIterative(Node<T> startNode) {
        if (startNode == null) return;

        Stack<Node<T>> stack = new Stack<>();
        stack.push(startNode);

        while (!stack.isEmpty()) {
            Node<T> current = stack.pop();

            if (!current.isVisited()) {
                System.out.print(current.getData() + " ");
                current.setVisited(true);

                for (Node<T> neighbor : current.getConnected()) {
                    if (!neighbor.isVisited()) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }
}
