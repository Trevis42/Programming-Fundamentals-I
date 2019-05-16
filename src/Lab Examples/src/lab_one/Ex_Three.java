package lab_one;

public class Ex_Three
{
    public static void main(String[] args)
    {
        int Amount1 = 100;
        int Amount2 = 2500;
        double stateTax1 = .04;
        double countryTax1 = .02;
        double totalTax1 = Amount1 * stateTax1 + Amount1 * countryTax1;
        double totalSale1 = Amount1 + totalTax1;
        double totalTax2 = Amount2 * stateTax1 + Amount2 * countryTax1;
        double totalSale2 = Amount2 + totalTax2;

        System.out.println(totalSale1);
        System.out.println(totalSale2);
    }

}