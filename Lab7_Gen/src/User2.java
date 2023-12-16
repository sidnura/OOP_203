//Local internal class

public class User2 {
    private String login;
    private String password;
    User2(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public void createQuery(){
        class Query {
            void printToLog() {
                System.out.println("Пользователь с логином: "+login+" и паролем: "+password+" отправил запрос");
            }
        }
        Query query = new Query();
        query.printToLog();
    }
    public static void main(String args[]) {
        User user = new User("Anna","123");
        user.createQuery();
    }
}