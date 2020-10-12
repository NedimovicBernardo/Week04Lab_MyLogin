package Domain;

public class AccountService 
{
    
    public User login(String username, String password)
    {
        if((username.equals("adam")) && (password.equals("password")))
        {
            return new User(username, null);
        }
        if((username.equals("betty")) && (password.equals("password")))
        {
            return new User(username, null);
        }
        return null;
    }
}
