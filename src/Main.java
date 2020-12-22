public class Main {

    public static void main(String[] args) {
        // write your code here
        BankAccountService bankAccountService = new BankAccountService();
        User user1 = bankAccountService.
                createUser("Vahe","Mnatsakanyan","I715526");
        Account account1 = bankAccountService
                .register(user1,"526320582363","4555632111115236");

        User user2 = bankAccountService.
                createUser("Hayk","Mnatsakanyan","A4585666");
        Account account2 = bankAccountService
                .register(user2,"2569886633200","20066953336965");

        User user3 = bankAccountService.
                createUser("Ani","Hakobyan","A5666686");
        Account account3 = bankAccountService
                .register(user3,"203365958632","4555632100236598");
        User user4 = bankAccountService.
                createUser("Tatevik","Vardanyan","A55698223");
        Account account4 = bankAccountService
                .register(user4,"896531623523","2255563280014595");

        User findUserByNameAndSname = bankAccountService.findByNameAndSName("Vahe","Mnatsakanyan");

        Account findAccountByCardNumber = bankAccountService.findByCardNumber("4555632100236598");
        Account findAccountByAccountNumber = bankAccountService.findByAccountNumber("896531623523");

        System.out.println(bankAccountService.deleteAccount(user1));


    }
}

