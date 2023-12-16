public class User {
    private String login;
    private String password;
    User(String login, String password) {
        this.login = login;
        this.password = password;
    }
    private class Query {
        void printToLog() {
            System.out.println("Пользователь с логином: "+login+" и паролем: "+password+" отправил запрос");
        }
    }
    public void createQuery(){
        Query query = new Query();
        query.printToLog();
    }
    public static void main(String args[]) {
        User user = new User("Anna","123");
        user.createQuery();

        Query query = user.new Query();
        query.printToLog();

        Query query1 = new User("Sasha","456").new Query();
        query1.printToLog();
    }

}