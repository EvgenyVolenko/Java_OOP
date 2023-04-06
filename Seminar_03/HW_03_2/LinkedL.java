package Seminar_03.HW_03_2;

public class LinkedL<E> {
    private Node<E> fstNode;
    private Node<E> lstNode;
    private int size = 0;

    private class Node<E>{
        private E currentElement;
        private Node<E> nextElement;
        private Node<E> prevElement;
        
        public Node(E currentElement, LinkedL<E>.Node<E> nextElement, LinkedL<E>.Node<E> prevElement) {
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
}
