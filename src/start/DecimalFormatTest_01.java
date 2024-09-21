package start;

import java.text.DecimalFormat;
public class DecimalFormatTest_01 {
    public static void main(String[] args) {
        double total = 123456789.77789;
        double sum = 431000.0;
        double tax = 0.045;

        int countValue = 1000000;
        int zeroValue = 0;

        DecimalFormat df_01 = new DecimalFormat("#,###.000 $");
        System.out.println(df_01.format(total));
        System.out.println(df_01.format(sum));

        DecimalFormat df_02 = new DecimalFormat("#,###.00 %");
        System.out.println(df_02.format(tax));

        DecimalFormat df_03 = new DecimalFormat("#,##0 개");
        System.out.println(df_03.format(countValue));
        System.out.println(df_03.format(zeroValue));
    }
}
