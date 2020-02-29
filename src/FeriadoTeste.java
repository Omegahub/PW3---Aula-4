import java.util.Date;

public class FeriadoTeste {
	public static void main(String[] args) {
		Feriado objF = new Feriado();
		
		objF.TipoFeriado = "Natal";
		objF.descricao = "Natal";
		Date dataFeriado = DateTimeUtils.toDate(25, 12, 2020);
		objF.data = dataFeriado;
		
		System.out.println(objF.data);
		System.out.println(objF.toString());
		
	}
}
