package ru.job4j;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ImageService {

    public static void main(String[] args) throws InterruptedException {
        int[] ids = {1, 2};
        loads(ids).forEach(System.out::println);
    }


    public static List<String> loads(int ... ids) throws InterruptedException {
        List<String> images = new ArrayList<>();
        for (int id : ids) {
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));
            images.add(String.valueOf(id));
        }
        return images;
    }
}
