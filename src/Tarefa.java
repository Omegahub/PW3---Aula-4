import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Tarefa {
	public static void main(String[] args) {
		
	}
	
	public String titulo;
	public String descricao;
	public Date dataPrevisao;
	
	public String toString(){
		return String.format("titulo : %s \n descricao : %s \n data : %s \n ", titulo, descricao, dataPrevisao);
	}
	
	public long getDias() {
		LocalDate localDataPrevisao = dataPrevisao.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return LocalDate.now().until(localDataPrevisao, ChronoUnit.DAYS);	
				
	}
	

}
