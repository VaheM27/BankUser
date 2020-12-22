import java.util.*;

public class BankAccountService {

    Map<User,Account> accountMap = new HashMap<>();
    List<User> users = new LinkedList<>();
    List<Account> accounts = new LinkedList<>();

    public User createUser(String name, String sName, String passportNumber){
        User user = new User(name, sName, passportNumber);
        users.add(user);
        return user;
    }

    public Account register(User user,String accountNumber,
                            String cardNumber){
        Account account = new Account(user,accountNumber,cardNumber);
        accounts.add(account);
        return account;
    }

    public User findByNameAndSName(String name,String sName){
        User user= new User();
        for (User user1 : users) {
            if((user1.getName().equals(name))&&user1.getsName().equals(sName))
                user = user1;
        }
        if(user== null)
            System.out.println("User not found");

        else
            System.out.println(user);
        return user;
    }

    public Account findByCardNumber(String cardNumber){

        Account account = new Account();
        for (Account account1 : accounts) {
            if(account1.getCardNumber().equals(cardNumber))
                account = account1;
        }
        if(account== null)
            System.out.println("Account not found");

        else
            System.out.println(account);
        return account;
    }
    public Account findByAccountNumber(String accountNumber){

        Account account = new Account();
        for (Account account1 : accounts) {
            if(account1.getAccountNumber().equals(accountNumber))
                account = account1;
        }
        if(account== null)
            System.out.println("Account not found");

        else
            System.out.println(account);
        return account;
    }

    public  boolean deleteAccount(User user){
        for (Account account : accounts) {
            if(account.getUser().equals(user)) {
                account=null;
                return true;
            }
        }
        return false;

    }
}