import java.text.NumberFormat;

public class Main {
//
//    Write a Java program to print the following columns of values. Use \t for the tabs between the columns.
//    Cost      Quantity   Total
//    $1,000.00   4       $4,000.00
//    $   50.00   8         $400.00
//    ______________________________
//    TOTAL:      12      $4,400.00


    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance();
        double myDouble1 = 50;
        double myDouble2 = 400;
        double myDouble3 = 1000;
        double myDouble4 = 4000;

        int qty = 4;
        int sumQty = 0;
        double sumTotal = 0;

        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        //String tstString = nf.format("$" + myDouble1);
        //System.out.println("Using NumberFormat: " + tstString);

        System.out.println("Cost" + "    \t" + "Qty" + "\t" + "Total");
        String cost = String.format("$%.02f", myDouble3 );
        String total = String.format("$%.02f", myDouble4 );
        qty = 4;
        sumQty += qty;
        sumTotal += myDouble4;
        System.out.println(cost + "\t" + qty + "\t" + total);

        qty = 8;
        cost = String.format("$%.02f", myDouble1 );
        total = String.format("$%.02f", myDouble2 );

        sumQty += qty;
        sumTotal += myDouble2;


        while (cost.length() < 9){
            cost += " ";
        }

        System.out.println(cost + "\t" + qty + "\t" + total);

        total = String.format("$%.02f", sumTotal);

        System.out.println("______________________________");
        System.out.println("Total   " + "\t" + sumQty + "\t" + total);


        //String myString  = nf..getInstance.format(myNumber);

    }
}
