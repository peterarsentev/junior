package ru.job4j.lambda;

import java.util.Comparator;

public class AttachmentComp implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Attachment left = (Attachment) o1;
        Attachment right = (Attachment) o2;
        return left.getSize() - right.getSize();
    }
}
