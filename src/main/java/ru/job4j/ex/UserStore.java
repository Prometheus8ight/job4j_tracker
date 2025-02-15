package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User u : users) {
            if (u.getUsername().equals(login)) {
                return u;
            }
        }
        throw new UserNotFoundException("User not found!");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername().length() > 3 && user.isValid()) {
            return true;
        }
        throw new UserInvalidException("User is not valid!");
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
