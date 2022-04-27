import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        if (stringDate == null) {
            return null;
        }
        return LocalDateTime.from(DateTimeFormatter.ISO_DATE_TIME.parse(stringDate));
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        if (stringDate == null) {
            return null;
        }
        return LocalDate.from(DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy", Locale.FRANCE).parse(stringDate));
    }

    public static LocalTime parseTimeFormat(String stringDate) {
        if (stringDate == null) {
            return null;
        }
        return LocalTime.from(DateTimeFormatter.ofPattern("hh 'heures' B, mm 'minutes et' ss 'secondes'", Locale.FRANCE).parse(stringDate));
    }

}