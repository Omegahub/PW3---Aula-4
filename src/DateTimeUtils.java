import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DateTimeUtils {
	public static void main(String[] args) {
		
	}
	
	public static Date toDate(int dia, int mes, int ano) {
		LocalDate Ld = LocalDate.of(ano, mes, dia);
		return Date.from(Ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
	}
}
