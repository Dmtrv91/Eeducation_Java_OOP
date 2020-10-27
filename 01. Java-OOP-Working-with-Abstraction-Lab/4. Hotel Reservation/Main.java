package Test;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));
        String[] tokens = reader.readLine().split(" ");

        double price = Double.parseDouble(tokens[0]);
        int days = Integer.parseInt(tokens[1]);
        Season season = Season.valueOf(tokens[2].toUpperCase());
        Discount discount = discountParser(tokens[3]);

        Reservation reservation = new Reservation(price, days, season, discount);
        double result = PriceCalculator.calculate(reservation);

        System.out.println(String.format("%.2f", result));
    }

    public static Discount discountParser(String discount) {
        Pattern pattern = Pattern.compile("([A-Z]+[a-z]*)");
        Matcher matcher = pattern.matcher(discount);

        StringBuilder enumToUpper = new StringBuilder();
        int count = 0;
        while (matcher.find()) {
            if (count > 0) {
                enumToUpper.append("_");
            }
            enumToUpper.append((matcher.group(1).toUpperCase()));
            count++;
        }
        return Discount.valueOf(enumToUpper.toString());
    }
}
