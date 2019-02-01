package ru.job4j.queue;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Queue<T> {
    private Node<T> head;
    private Node<T> tail;

    public void add(T value) {
        Node<T> node = new Node<>(value);
        if (this.head == null) {
            this.head = node;
        } else if (this.tail == null) {
            this.tail = node;
            this.head.next = this.tail;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
    }

    public T remove() {
        if (this.head == null) {
            throw new IllegalStateException("Queue is empty");
        }
        Node<T> el = this.head;
        this.head = this.head.next;
        el.next = null;
        return el.value;
    }

    public Iterator<T> iterator() {
        return new TraversalInner();
    }

    private static final class Node<V> {
        V value;
        Node<V> next;

        public Node(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{"
                    + "value=" + value
                    + ", next=" + next
                    + '}';
        }
    }

    private final class TraversalInner implements Iterator<T> {
        Queue.Node<T> el = Queue.this.head;

        @Override
        public boolean hasNext() {
            return this.el != null;
        }

        @Override
        public T next() {
            if (!this.hasNext()) {
                throw new NoSuchElementException("Queue is empty");
            }
            T value = this.el.value;
            this.el = el.next;
            return value;
        }
    }

    private final static class TraversalNested<E> implements Iterator<E> {
        Queue.Node<E> el;

        private TraversalNested(Node<E> head) {
            this.el = head;
        }

        @Override
        public boolean hasNext() {
            return this.el != null;
        }

        @Override
        public E next() {
            if (!this.hasNext()) {
                throw new NoSuchElementException("Queue is empty");
            }
            E value = this.el.value;
            this.el = el.next;
            return value;
        }
    }
}
