package Lab3;

public class SavingsAccount {

		public static int number;
	    private int id;
	    private double savingsBalance;
		public static double annualInterestRate;
		double interestRate;



	    public SavingsAccount() {
	        this.savingsBalance = savingsBalance;
	        this.annualInterestRate = 0;
	        this.id = number;
	        number++;
	    }

	    public int getId() {
	        return this.id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public double getSavingsBalance() {
	        return this.savingsBalance;
	    }

	    public void setSavingsBalance(double savingsBalance) {
	        this.savingsBalance = savingsBalance;
	    }

	    public double getAnnualInterestRate() {
	        return this.annualInterestRate;
	    }

	    public void setAnnualInterestRate(double annualInterestRate) {
	        this.annualInterestRate = annualInterestRate;
	    }

	    public double getInterestRate() {
	        return this.interestRate;
	    }

	    public void setInterestRate(double interestRate) {
	        this.interestRate = interestRate;
	    }
	    
	    public double calculateMonthlyInterest() 
		{
			double interestRate = (savingsBalance * annualInterestRate/12);
			savingsBalance = savingsBalance + interestRate;
			return interestRate;
		}

		public static void modifyInterestRate(double newInterestRate) 
		{
			annualInterestRate = newInterestRate;
		}

	    @Override
	    public String toString() {
	        return "{" +
	            " id='" + getId() + "'" +
	            ", savingsBalance='" + getSavingsBalance() + "'" +
	            ", interestRate='" + getInterestRate() + "'" +
	            "}";
	    }
	

	}


