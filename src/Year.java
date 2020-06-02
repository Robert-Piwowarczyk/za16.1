import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Year {
    public static void main(String[] args) {

        Month march = new Month("'Marzec'", Season.SPRING);
        Month april = new Month("'Kwiecień'", Season.SPRING);
        Month may = new Month("'Maj'", Season.SPRING);
        Month june = new Month("'Czerwiec'", Season.SUMMER);
        Month july = new Month("'Lipiec'", Season.SUMMER);
        Month august = new Month("'Sierpień'", Season.SUMMER);
        Month september = new Month("'W'rzesień'", Season.AUTUMN);
        Month october = new Month("'P'aździernik'", Season.AUTUMN);
        Month november = new Month("'Listopad'", Season.AUTUMN);
        Month december = new Month("'Grudzień'", Season.WINTER);
        Month january = new Month("'Styczeń'", Season.WINTER);
        Month february = new Month("'Luty'", Season.WINTER);

        List<Month> months = Arrays.asList(january, february, march, april, may, june, july, august, september, october,
                november, december);

        System.out.println("Podaj nazwę pory roku. Dostępne pory roku:");
        Season[] seasons = Season.values();
        System.out.println(Arrays.toString(seasons));
        Scanner sc = new Scanner(System.in);
        String userImput = sc.nextLine();

        Season season = null;
        try {
            season = Season.valueOf(userImput);
            for (Season season1 : seasons) {
                if (season1.getTranslation().equalsIgnoreCase(userImput)) {
                    season = season1;
                    break;
                }
            }
        } catch (IllegalArgumentException e) {

            if (season != null) {
                System.out.println("MIesiące należące do tej pory roku:");
                for (Month month : months) {
                    if (month.getSeason() == season) {
                        System.out.println(month);
                    }
                }
            } else {
                System.out.println("Nie znaleziono takiego miesiąca");
            }
        }

    }
}