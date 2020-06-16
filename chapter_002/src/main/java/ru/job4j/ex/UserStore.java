package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        return null;
    }

    public static boolean validate(User user) throws UserInvalidException {
        return false;
    }

    public static void main(String[] args) {
//        User[] users = {
//                new User("Petr Arsentev", true)
//        };
//        User user = findUser(users, "Petr Arsentev");
//        if (validate(user)) {
//            System.out.println("This user has an access");
//        }
    }
}
