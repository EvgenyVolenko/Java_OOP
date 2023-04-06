package Seminar_03.HW_03_2;

import java.util.Iterator;

public class LinkedL<E> implements Iterable<E> {

    private Node<E> fstNode;
    private Node<E> lstNode;
    private int size = 0;

    public LinkedL() {
        this.fstNode = new Node<E>(null, null, lstNode);
        this.lstNode = new Node<E>(null, fstNode, null);
    }

    public void addLast(E e) {
        Node<E> prev = lstNode;
        prev.setCurrentElement(e);
        lstNode = new Node<E>(null, prev, null);
        prev.setNextElement(lstNode);
        size++;
    }

    public void addFirst(E e) {
        Node<E> next = fstNode;
        next.setCurrentElement(e);
        fstNode = new Node<E>(null, null, next);
        next.setPrevElement(fstNode);
        size++;
    }

    public E getElementByIndex(int counter) {
        Node<E> res = lstNode.getPrevElement();
        for (int i = 0; i < counter; i++) {
            res = getNextElementNode(res);
        }
        return res.getCurrentElement();
    }

    private Node<E> getNextElementNode(Node<E> current){
        return current.getPrevElement();
    }

    public int size() {
        return size;
    }

    private class Node<P> {

        private E currentElement;
        private Node<E> nextElement;
        private Node<E> prevElement;

        public Node(E currentElement, Node<E> prevElement, Node<E> nextElement) {
            this.currentElement = currentElement;
            this.nextElement = nextElement;
            this.prevElement = prevElement;
        }

        public E getCurrentElement() {
            return currentElement;
        }

        public void setCurrentElement(E currentElement) {
            this.currentElement = currentElement;
        }

        public Node<E> getNextElement() {
            return nextElement;
        }

        public void setNextElement(Node<E> nextElement) {
            this.nextElement = nextElement;
        }

        public Node<E> getPrevElement() {
            return prevElement;
        }

        public void setPrevElement(Node<E> prevElement) {
            this.prevElement = prevElement;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public E next() {
                return getElementByIndex(counter++);
            }
        };
    }
}
