import java.util.Date;

public class TarefaTeste {
	public static void main(String[] args) {
		
		Tarefa objT = new Tarefa();
		
		objT.titulo = "Funcao";
		objT.descricao = "tetse";
		Date dataTarefa = DateTimeUtils.toDate(4, 5, 2020);
		objT.dataPrevisao = dataTarefa;
		
		System.out.println(objT.dataPrevisao);
		System.out.println(objT.toString());
	}

}
