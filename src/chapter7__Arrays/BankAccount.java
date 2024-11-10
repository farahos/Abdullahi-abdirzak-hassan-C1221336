package chapter7__Arrays;


        public class BankAccount {
            private String accountNumber;
            private double balance;

            public BankAccount(String accountNumber, double balance) {
                this.accountNumber = accountNumber;
                this.balance = balance;
            }

            public String checkBalance() {
                return "Koontada " + accountNumber + ", hadhay: " + balance + " USD.";
            }

            public String transfer(double amount, BankAccount targetAccount) {
                if (this.balance >= amount) {
                    this.balance -= amount;
                    targetAccount.balance += amount;
                    return amount + " USD ayaa laga wareejiyay koontada " + this.accountNumber + " kuna wareejiyay koontada " + targetAccount.accountNumber + ". Hadhay: " + this.balance + " USD.";
                } else {
                    return "Ku guuldareystay: Koontada " + this.accountNumber + " ma laha lacag ku filan. Hadhay: " + this.balance + " USD.";
                }
            }

            public static void main(String[] args) {
                // Predefined accounts
                BankAccount account1 = new BankAccount("123456", 1000);
                BankAccount account2 = new BankAccount("654321", 500);
                BankAccount account3 = new BankAccount("112233", 1500);

                // Checking balance
                System.out.println(account1.checkBalance());
                System.out.println(account2.checkBalance());
                System.out.println(account3.checkBalance());

                // Successful transfer
                System.out.println(account1.transfer(200, account2));

                // Unsuccessful transfer
                System.out.println(account2.transfer(700, account3));

                // Checking balance after transfers
            }
        }


