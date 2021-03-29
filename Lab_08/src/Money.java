/**
   This class represents nonnegative amounts of money.
*/

public class Money
{
   // The number of dollars
   private long dollars;

   // The number of cents
   private long cents;

   /**
      Constructor
      @param amount The amount in decimal format.
   */

   public Money(double amount)
   { 
      if (amount < 0)
      {
         System.out.println("Error: Negative amounts " +
                            "of money are not allowed.");
         System.exit(0);
      }
      else
      {
         long allCents = Math.round(amount * 100);
         dollars = allCents / 100;
         cents = allCents % 100;
         
      }
   }

   // ADD LINES FOR TASK #1 HERE
   // Document and write a copy constructor
   // Copy constructor takes a parameter of Money object
   public Money(Money moneyObj1) {
	   //Creating a deep copy of a Money object
	   // this keyword will take the attributes of the object passed as an argument
	   // and copy them to the new object. 
	   this.dollars = moneyObj1.dollars;
	   this.cents = moneyObj1.cents;
	   
   }

   /**
      The add method
      @param otherAmount The amount of money to add.
      @return The sum of the calling Money object
              and the parameter Money object.
   */

   public Money add(Money otherAmount)
   {
      Money sum = new Money(0);

      sum.cents = this.cents + otherAmount.cents;

      long carryDollars = sum.cents / 100;

      sum.cents = sum.cents % 100;

      sum.dollars = this.dollars +
                    otherAmount.dollars +
                    carryDollars;

      return sum;
   }

   /**
      The subtract method
      @param amount The amount of money to subtract.
      @return The difference between the calling Money
              object and the parameter Money object.
   */

   public Money subtract (Money amount)
   {
      Money difference = new Money(0);

      if (this.cents < amount.cents)
      {
         this.dollars = this.dollars - 1;
         this.cents = this.cents + 100;
      }

      difference.dollars = this.dollars - amount.dollars;
      difference.cents = this.cents - amount.cents;

      return difference;
   }

   /**
      The compareTo method
      @param amount The amount of money to compare against.
      @return -1 if the dollars and the cents of the
              calling object are less than the dollars and
              the cents of the parameter object.
              0 if the dollars and the cents of the calling
              object are equal to the dollars and cents of
              the parameter object.
              1 if the dollars and the cents of the calling
              object are more than the dollars and the
              cents of the parameter object.
   */

   public int compareTo(Money amount)
   {
      int value;

      if(this.dollars < amount.dollars)
         value = -1;
      else if (this.dollars > amount.dollars)
         value = 1;
      else if (this.cents < amount.cents)
         value = -1;
      else if (this.cents > amount.cents)
         value = 1;
      else
         value = 0;

      return value;
   }

   // ADD LINES FOR TASK #2 HERE
   // Here is the method equals()
   // This method compares the attributes of two Money objects.
   // If statement checks to see whether the created object has the 
   // same amount of cents and dollars as the passed object. 
   // If it does, then return true.
   // If the two objects do not have the same amount of dollars and cents, then
   // return false. 
   public boolean equals(Money money) {
	   if(this.cents == money.cents && this.dollars == money.dollars) {
		   return true;
	   }
	   else {
		   return false;
	   }
   }
   
   @Override 
   // Must use override method toString()
   // This allows us to modify it to do what we need it to 
   // instead of its default functionality
   // Here, when this method is called, it converts the dollars 
   // and cents to a currency format. 
   // If the cents are greater than or equal to 10, then
   // we return the dollars and the cents with a decimal in between them.
   // If the cents are less than 10, then we will add a zero after the decimal 
   // point to show that there is a single digit of cents. 
   public String toString() {
	   if (cents >= 10) {
		   return "$" + dollars + "." + cents;
	   }
	   else {
		   return "$" + dollars + "." +"0" + cents;
	   }
	   
   }
}