package Bridge;

public class User {
    private UserImpl realUser;
    public User(UserImpl impl)
    {
        realUser = impl;
    }
    public void toFish()
    {
        realUser = new FishImpl();
        realUser.swim();
    }
    public void toBird()
    {
        realUser = new BirdImpl();
        realUser.fly();
    }

}