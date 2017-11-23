package ru.job4j.tree;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class TreeNode {
    public static class Node {
        List<Node> children;
        int value;

        public Node(int value, List<Node> children) {
            this.children = children;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" + "value=" + value + '}';
        }
    }

    public static void main(String[] args) {
        Node tree = new Node(1,
                Arrays.asList(
                        new Node(2,
                                Arrays.asList(
                                        new Node(4, Collections.EMPTY_LIST),
                                        new Node(5, Collections.EMPTY_LIST)
                                )
                        ),
                        new Node(3,
                                Arrays.asList(
                                        new Node(6, Collections.EMPTY_LIST),
                                        new Node(7, Collections.EMPTY_LIST)
                                )
                        )
                ));

        Iterator<Integer> it = new Iterator<Integer>() {
            Node parent = tree;
            Iterator<Node> cit = tree.children.iterator();

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                int value = -1;
                if (cit.hasNext()) {
                    Node child = cit.next();
                    if (child.children.isEmpty()) {
                        value = child.value;
                    } else {
                        parent = child;
                        cit = child.children.iterator();
                        value = this.next();
                    }
                } else {
                    cit = parent.children.iterator();
                }
                return value;
            }
        };

        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

    }

}
