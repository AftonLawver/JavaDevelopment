public class LinkedListClass<T> implements LinkedListInterface<T>{
    private int numberOfElements = 0;
    private Node<T> head = null;

    public boolean isEmpty() {

    }


    private class Node<T> {
        private T nodeData;
        private Node<T> nextNode = null;

        public Node() {

        }
        public Node(T nodeData) {
            this.nodeData = nodeData;
        }

        public Node(T nodeData, Node<T> nextNode) {
            this.nodeData = nodeData;
            this.nextNode = nextNode;
        }

        public T getNodeData() {
            return nodeData;
        }

        public void setNodeData(T nodeData) {
            this.nodeData = nodeData;
        }

        public Node<T> getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node<T> nextNode) {
            this.nextNode = nextNode;
        }
    }
}
