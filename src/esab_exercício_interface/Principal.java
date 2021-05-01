package esab_exercício_interface;

import javax.swing.JOptionPane;

public class Principal implements Resultado {
	
	public String a = "Parabéns, você atingiu todos os indicadores de avaliação com excelência";
	public String b = "Parabéns, você obteve aproveitamento satisfatório nos indicadores de avaliação";
	public String c = "Você não atingiu o mínimo esperado para aprovação";

	public String result;
	
	@Override
	public String getResult() {
		return result;
	}

	public static void main(String[] args) {
	
		String opt = JOptionPane.showInputDialog("Digite sua nota (a, b ou c):");
		
		String result = null;
		switch (opt){
		case "a":
			result = "Parabéns, você atingiu todos os indicadores de avaliação com excelência";
			break;
		case "b":
			result = "Parabéns, você obteve aproveitamento satisfatório nos indicadores de avaliação";
			break;
		case "c":
			result = "Você não atingiu o mínimo esperado para aprovação";
			break;
		default:
			result = "nota inválida";
		}
		System.out.println(result);
	}
}
