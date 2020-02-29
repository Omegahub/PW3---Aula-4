import java.util.Date;

public class Feriado {
	public static void main(String[] args) {
			
	}
	
	public Long id;
	public String TipoFeriado;
	public String descricao;
	public Date data;	
	
	public String toString(){
		return String.format("tipo : %s \n  descricao : %s \n  data : %s \n ", TipoFeriado, descricao, data);
	}

}
