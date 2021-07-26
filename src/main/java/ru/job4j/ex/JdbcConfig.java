package ru.job4j.ex;

public class JdbcConfig {
    public static void load(String url) {
        if (url == null) {
            try {
                throw new UserInputException("Url could not be null");
            } catch (UserInputException e) {
                e.printStackTrace();
            }
        }
        /*load jdbc*/
    }

    public static void main(String[] args) throws UserInputException {
        load(null);
    }
}
