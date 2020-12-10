public class ObjectClassStack<T> implements Stack<T> {
    private Node<T> topo;

    private class Node<T> {
        private Node<T> next;
        private T data;

        public Node(T data) {
            this.data = data;
            next = null;
        }
    }

    public ObjectClassStack() {
        topo = null;
    }

    public boolean isEmpty() {
        return (topo == null);
    }

    public void push(T data) {
        Node<T> aux = new Node<>(data);
        if (isEmpty()) {
            topo = aux;
        }else {
            aux.next = topo;
            topo = aux;
        }
    }

    public T pop() {
        Node<T> aux;
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Pilha vazia! Impossível desempilhar!");
        }
        aux = topo;
        topo = topo.next;
        aux.next = null;
        T data = aux.data;
        return data;
    }
}

