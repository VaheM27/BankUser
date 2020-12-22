import java.util.Objects;

public class Account {

    private  User user;
    private String accountNumber;
    private String cardNumber;

    public Account(User user, String accountNumber,  String cardNumber) {
        this.user = user;
        this.accountNumber = accountNumber;
        this.cardNumber = cardNumber;
    }

    public Account() {

    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public User getUser() {
        return user;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return Objects.equals(getUser(), account.getUser()) && Objects.equals(getAccountNumber(), account.getAccountNumber()) && Objects.equals(getCardNumber(), account.getCardNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUser(), getAccountNumber(), getCardNumber());
    }

    @Override
    public String toString() {
        return "Account{" +
                "user=" + user +
                ", accountNumber='" + accountNumber + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                '}';
    }
}