package ru.job4j.algo;


import java.util.*;

public class Merger2 {
    public static Map<String, Set<String>> merge(List<User> users) {
        Map<String, Set<String>> keysUsers = new TreeMap<>();
        Map<String, String> keysMails = new HashMap<>();
        for (User user : users) {
            keysUsers.put(user.getName(), user.getMailAddresses());
            for (String mail : user.getMailAddresses()) {
                if (keysMails.containsKey(mail)) {
                    Set<String> newSetMails = keysUsers.get(keysMails.get(mail));
                    newSetMails.addAll(user.getMailAddresses());
                    keysUsers.remove(user.getName());
                    keysUsers.put(keysMails.get(mail), newSetMails);
                } else {
                    keysMails.put(mail, user.getName());
                }
            }
        }
        return keysUsers;
    }

    public static void main(String[] args) {
        var rsl = merge(
                List.of(
                        new User("parsentev", Set.of("1, 2")),
                        new User("ivan", Set.of("2, 3"))
                )
        );
        System.out.println(rsl);
    }
}
