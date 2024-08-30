// Lab09astv100.java
// Janee Yeak
// 10 December 2020
// This program manipulates rational number operations

import java.util.Scanner;

public class Lab09astv100
{
   public static int num, den;   // numerator and denominator of the rational number

   public static void main (String[] args)
   {
      enterData();

      Rational r = new Rational(num,den);

      r.displayData();
   }
   
	 public static void enterData()
   {
      Scanner input = new Scanner(System.in);
      System.out.print("\nEnter the numerator ----> ");
      num = input.nextInt();
      System.out.print("\nEnter the denominator --> ");
      den = input.nextInt();
     
   }
}


class Rational
{
   private int den;
   private double decimal;
   private int num;
   private int gcf;

   public Rational(int n1, int n2)
   {
      num = n1;
      den = n2;
   }


   public void displayData()
	{
		System.out.println();
		System.out.println(getOriginal() + " equals " + getDecimal());
		System.out.println();
		System.out.println("and reduces to " + getReduced());
		System.out.println();
	}

    public String getReduced()
   {
      int gcf = getGCF(num, den);
      num = num / gcf;
      den = den / gcf;
      String reduced = num + "/" + den;
      return reduced;
   }

    public String getOriginal()
   {
      String original = num + "/" + den;
      return original;
   }


   public int getDen()
   {
      return den;
   }

   public int getNum()
   {
      return num;
   }
   
   public double getDecimal()
   {
      double num1 = getNum();
      double den1 = getDen();
      double decimal = num1 / den1;
      return decimal;
   }

   private int getGCF(int n1,int n2)
   {
      int rem = 0;
      do
      {
         rem = n1 % n2;
         if (rem == 0)
            gcf = n2;
         else
         {
            n1 = n2;
            n2 = rem;
        }
      }
      while (rem != 0);
      
      return gcf;
   }
}




