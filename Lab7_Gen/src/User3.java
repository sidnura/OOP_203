public class User3 {
    private String login;
    private String password;
    User3(String login, String password) {
        this.login = login;
        this.password = password;
    }
    private static class Query {
        private String login;
        private String password;

        Query(String login, String password) {
            this.login = login;
            this.password = password;
        }

        void printToLog() {
            System.out.println("Пользователь с логином: " + login + " и паролем: " + password + " отправил запрос");
        }
    }

    public void createQuery() {
        Query query = new Query(login, password);
        query.printToLog();
    }

    public static void main(String args[]) {

        Query query = new Query("Anna", "123");
        query.printToLog();

    }
}