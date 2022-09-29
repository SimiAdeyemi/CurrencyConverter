import java.util.*;
import java.text.DecimalFormat;

public class CurrencyConverter
{
    public static void main(String[] args)
    {
        double amount;
        double rupee, dollar, pound, euro, yen, ringgit, cDollar, franc, renminbi, aDollar;
        int choice;

        DecimalFormat f = new DecimalFormat("##.##");

        Scanner sc = new Scanner(System.in);


        System.out.println("Hello, Welcome to the Currency Converter");

        System.out.println("Here are the Choices:");
        System.out.println("Enter 1: Indian Rupee");
        System.out.println("Enter 2: US Dollar");
        System.out.println("Enter 3: British Pound");
        System.out.println("Enter 4: European Euro");
        System.out.println("Enter 5: Japanese Yen");
        System.out.println("Enter 6: Malaysian Ringgit");
        System.out.println("Enter 7: Canadian Dollar");
        System.out.println("Enter 8: Swiss Franc");
        System.out.println("Enter 9: Chinese Renminbi");
        System.out.println("Enter 10: Australian Dollar");



        System.out.print("\nChoose from above options: ");
        choice = sc.nextInt();

        System.out.println("Please enter the amount you want to convert? \n" );
        amount = sc.nextFloat();
        System.out.println("");

        switch (choice)
        {
            case 1:  // Rupee Conversion
                dollar = amount * 0.012;
                System.out.println(amount + " Rupee = " + f.format(dollar) + " Dollars");

                pound = amount * 0.011;
                System.out.println(amount + " Rupee = " + f.format(pound) + " Pounds");

                euro = amount * 0.013;
                System.out.println(amount + " Rupee = " + f.format(euro) + " Euros");

                yen = amount * 1.37;
                System.out.println(amount + " Rupee = " + f.format(yen) + " Yen");

                ringgit = amount * 0.057;
                System.out.println(amount + " Rupee = " + f.format(ringgit) + " Ringgit");

                cDollar = amount * 0.017;
                System.out.println(amount + " Rupee = " + f.format(cDollar) + " Canadian Dollars");

                franc = amount * 0.012;
                System.out.println(amount + " Rupee = " + f.format(franc) + " Francs");

                renminbi = amount * 0.087;
                System.out.println(amount + " Rupee = " + f.format(renminbi) + " Renminbi");

                aDollar = amount * 0.019;
                System.out.println(amount + " Rupee = " + f.format(aDollar) + " Australian Dollars");
                break;

            case 2:  // Dollar Conversion
                rupee = amount * 81.55;
                System.out.println(amount + " Dollar = " + f.format(rupee) + " Rupees");

                pound = amount *0.90;
                System.out.println(amount + " Dollar = " + f.format(pound) + " Pounds");

                euro = amount *1.02;
                System.out.println(amount + " Dollar = " + f.format(euro) + " Euros");

                yen = amount *144.41;
                System.out.println(amount + " Dollar = " + f.format(yen) + " Yen");

                ringgit = amount *4.64;
                System.out.println(amount + " Dollar = " + f.format(ringgit) + " ringgit");

                cDollar = amount * 1.37;
                System.out.println(amount + " Dollar = " + f.format(cDollar) + " Canadian Dollars");

                franc = amount * 0.98;
                System.out.println(amount + " Dollar = " + f.format(franc) + " Francs");

                renminbi = amount * 7.12;
                System.out.println(amount + " Dollar = " + f.format(renminbi) + " Renminbi");

                aDollar = amount * 1.54;
                System.out.println(amount + " Dollar = " + f.format(aDollar) + " Australian Dollars");
                break;

            case 3:  // Pound Conversion
                rupee = amount * 90.22;
                System.out.println(amount + " pound = " + f.format(rupee) + " Rupees");

                dollar = amount * 1.11;
                System.out.println(amount + " pound = " + f.format(dollar) + " Dollars");

                euro = amount * 1.13;
                System.out.println(amount + " pound = " + f.format(euro) + " Euros");

                yen = amount * 159.83;
                System.out.println(amount + " pound = " + f.format(yen) + " Yen");

                ringgit = amount * 5.13;
                System.out.println(amount + " pound = " + f.format(ringgit) + " ringgit");

                cDollar = amount * 1.52;
                System.out.println(amount + " pound = " + f.format(cDollar) + " Canadian Dollars");

                franc = amount * 1.08;
                System.out.println(amount + " pound = " + f.format(franc) + " Francs");

                renminbi = amount * 7.89;
                System.out.println(amount + " pound = " + f.format(renminbi) + " Renminbi");

                aDollar = amount * 1.71;
                System.out.println(amount + " pound = " + f.format(aDollar) + " Australian Dollars");
                break;

            case 4:  // Euro Conversion
                rupee = amount * 79.84;
                System.out.println(amount + " euro = " + f.format(rupee) + " Rupees");

                dollar = amount * 0.98;
                System.out.println(amount + " euro = " + f.format(dollar) + " Dollars");

                pound = amount * 0.89;
                System.out.println(amount + " euro = " + f.format(pound) + " Pounds");

                yen = amount * 141.46;
                System.out.println(amount + " euro = " + f.format(yen) + " Yen");

                ringgit = amount * 4.54;
                System.out.println(amount + " euro = " + f.format(ringgit) + " ringgit");

                cDollar = amount * 1.34;
                System.out.println(amount + " euro = " + f.format(cDollar) + " Canadian Dollars");

                franc = amount * 0.96;
                System.out.println(amount + " euro = " + f.format(franc) + " Francs");

                renminbi = amount * 6.98;
                System.out.println(amount + " euro = " + f.format(renminbi) + " Renminbi");

                aDollar = amount * 1.51;
                System.out.println(amount + " euro = " + f.format(aDollar) + " Australian Dollars");
                break;

            case 5:  // Yen Conversion
                rupee = amount * 0.56;
                System.out.println(amount + " yen = " + f.format(rupee) + " Rupees");

                dollar = amount * 0.0069;
                System.out.println(amount + " yen = " + f.format(dollar) + " Dollars");

                pound = amount *0.0063;
                System.out.println(amount + " yen = " + f.format(pound) + " Pounds");

                euro = amount *0.0071;
                System.out.println(amount + " yen = " + f.format(euro) + " Euros");

                ringgit = amount * 0.032;
                System.out.println(amount + " yen = " + f.format(ringgit) + " ringgit");

                cDollar = amount * 0.0095;
                System.out.println(amount + " yen = " + f.format(cDollar) + " Canadian Dollars");

                franc = amount * 0.0068;
                System.out.println(amount + " yen = " + f.format(franc) + " Francs");

                renminbi = amount * 0.049;
                System.out.println(amount + " yen = " + f.format(renminbi) + " Renminbi");

                aDollar = amount * 0.011;
                System.out.println(amount + " yen = " + f.format(aDollar) + " Australian Dollars");
                break;


            case 6:  // Ringgit Conversion
                rupee = amount * 17.57;
                System.out.println(amount + " ringgit = " + f.format(rupee) + " Rupees");

                dollar = amount * 0.22;
                System.out.println(amount + " ringgit = " + f.format(dollar) + " dollars");

                pound = amount * 0.19;
                System.out.println(amount + " ringgit = " + f.format(pound) + " pounds");

                euro = amount * 0.22;
                System.out.println(amount + " ringgit = " + f.format(euro) + " euros");

                yen = amount * 31.14;
                System.out.println(amount + " ringgit = " + f.format(yen) + " yen");

                cDollar = amount * 0.30;
                System.out.println(amount + " ringgit = " + f.format(cDollar) + " Canadian Dollars");

                franc = amount * 0.21;
                System.out.println(amount + " ringgit = " + f.format(franc) + " Francs");

                renminbi = amount * 1.54;
                System.out.println(amount + " ringgit = " + f.format(renminbi) + " Renminbi");

                aDollar = amount * 0.34;
                System.out.println(amount + " ringgit = " + f.format(aDollar) + " Australian Dollars");
                break;

            case 7:  // Canadian Dollars Conversion
                rupee = amount * 59.48;
                System.out.println(amount + " Canadian Dollars = " + f.format(rupee) + " Rupees");

                dollar = amount * 0.73;
                System.out.println(amount + " Canadian Dollars = " + f.format(dollar) + " dollars");

                pound = amount * 0.66;
                System.out.println(amount + " Canadian Dollars = " + f.format(pound) + " pounds");

                euro = amount * 0.74;
                System.out.println(amount + " Canadian Dollars = " + f.format(euro) + " euros");

                yen = amount * 105.46;
                System.out.println(amount + " Canadian Dollars = " + f.format(yen) + " yen");

                ringgit = amount * 3.38;
                System.out.println(amount + " Canadian Dollars = " + f.format(ringgit) + " ringgit");

                franc = amount * 0.71;
                System.out.println(amount + " Canadian Dollars = " + f.format(franc) + " Francs");

                renminbi = amount * 5.20;
                System.out.println(amount + " Canadian Dollars = " + f.format(renminbi) + " Renminbi");

                aDollar = amount * 1.12;
                System.out.println(amount + " Canadian Dollars = " + f.format(aDollar) + " Australian Dollars");
                break;

            case 8:  // swiss Franc Conversion
                rupee = amount * 83.34;
                System.out.println(amount + " franc = " + f.format(rupee) + " Rupees");

                dollar = amount * 1.02;
                System.out.println(amount + " franc = " + f.format(dollar) + " dollars");

                pound = amount * 0.92;
                System.out.println(amount + " franc = " + f.format(pound) + " pounds");

                euro = amount * 1.04;
                System.out.println(amount + " franc = " + f.format(euro) + " euros");

                yen = amount * 147.79;
                System.out.println(amount + " franc = " + f.format(yen) + " yen");

                ringgit = amount * 4.74;
                System.out.println(amount + " franc = " + f.format(ringgit) + " ringgit");

                cDollar = amount * 1.40;
                System.out.println(amount + " franc = " + f.format(cDollar) + " Canadian Dollars");

                renminbi = amount * 7.29;
                System.out.println(amount + " franc = " + f.format(renminbi) + " Renminbi");

                aDollar = amount * 1.57;
                System.out.println(amount + " franc = " + f.format(aDollar) + " Australian Dollars");
                break;

            case 9:  // renminbi Conversion
                rupee = amount * 11.43;
                System.out.println(amount + " Renminbi = " + f.format(rupee) + " Rupees");

                dollar = amount * 0.14;
                System.out.println(amount + " Renminbi = " + f.format(dollar) + " dollars");

                pound = amount * 0.13;
                System.out.println(amount + " Renminbi = " + f.format(pound) + " pounds");

                euro = amount * 0.14;
                System.out.println(amount + " Renminbi = " + f.format(euro) + " euros");

                yen = amount * 20.27;
                System.out.println(amount + " Renminbi = " + f.format(yen) + " yen");

                ringgit = amount * 0.65;
                System.out.println(amount + " Renminbi = " + f.format(ringgit) + " ringgit");

                cDollar = amount * 0.19;
                System.out.println(amount + " Renminbi = " + f.format(cDollar) + " Canadian Dollars");

                franc = amount * 0.14;
                System.out.println(amount + " Renminbi = " + f.format(franc) + " Francs");

                aDollar = amount * 0.22;
                System.out.println(amount + " Renminbi = " + f.format(aDollar) + " Australian Dollars");
                break;

            case 10:  // Australian Dollars Conversion
                rupee = amount * 52.91;
                System.out.println(amount + " Australian Dollars = " + f.format(rupee) + " Rupees");

                dollar = amount * 0.65;
                System.out.println(amount + " Australian Dollars = " + f.format(dollar) + " dollars");

                pound = amount * 0.59;
                System.out.println(amount + " Australian Dollars = " + f.format(pound) + " pounds");

                euro = amount * 0.66;
                System.out.println(amount + " Australian Dollars = " + f.format(euro) + " euros");

                yen = amount * 93.82;
                System.out.println(amount + " Australian Dollars = " + f.format(yen) + " yen");

                ringgit = amount * 3.01;
                System.out.println(amount + " Australian Dollars = " + f.format(ringgit) + " ringgit");

                cDollar = amount * 0.89;
                System.out.println(amount + " Australian Dollars = " + f.format(cDollar) + " Canadian Dollars");

                franc = amount * 0.63;
                System.out.println(amount + " Australian Dollars = " + f.format(franc) + " Francs");

                renminbi = amount * 4.63;
                System.out.println(amount + " Australian Dollars = " + f.format(renminbi) + " Renminbi");

            //Default case
            default:
                System.out.println("Invalid Input, enter a correct valid choice number please");
        }
    }
}



