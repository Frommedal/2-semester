
package opgave_1;

/**
 *
 * @author MFA
 *
 */

public class opgave1 {
    public static class BankAccount {
        private double balance;
        private int uniqueAccountNumber;
        private static int accountNumber = 10000;

        /**
         * <pre></pre>
         * 
         * initialBalance must be &gt; 0
         * </pre>
         *
         * @param initialBalance
         *            Ændrer balancen så den bliver opdateret med det nye beløb der
         *            bliver sat ind.
         */

        public BankAccount(double initialBalance) {
            balance = initialBalance;
            setUniqueAccountNumber(accountNumber);
            accountNumber++;
        }

        /**
         * <pre>
         *
         * </pre>
         *
         * @param amount
         *            ligger penge ind på balancen.
         */
        public void deposit(double amount) {
            balance += amount;
        }

        /**
         * <pre>
         * Balancen skal værre større end >=0 efter withdrawal.
         * </pre>
         *
         * @param amount
         *            Trækker penge ud af balancen såfremt der er penge på kontoen.
         */
        public void withdraw(double amount) {
            balance -= amount;
        }

        /**
         *
         * @return returnerer balancen som double.
         */

        public double getBalance() {
            return balance;
        }

		public int getUniqueAccountNumber() {
			return uniqueAccountNumber;
		}

		public void setUniqueAccountNumber(int uniqueAccountNumber) {
			this.uniqueAccountNumber = uniqueAccountNumber;
		}
    }
}
