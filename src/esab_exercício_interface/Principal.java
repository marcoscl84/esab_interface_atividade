package esab_exerc�cio_interface;

import javax.swing.JOptionPane;

public class Principal implements Resultado {
	
	public String a = "Parab�ns, voc� atingiu todos os indicadores de avalia��o com excel�ncia";
	public String b = "Parab�ns, voc� obteve aproveitamento satisfat�rio nos indicadores de avalia��o";
	public String c = "Voc� n�o atingiu o m�nimo esperado para aprova��o";

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
			result = "Parab�ns, voc� atingiu todos os indicadores de avalia��o com excel�ncia";
			break;
		case "b":
			result = "Parab�ns, voc� obteve aproveitamento satisfat�rio nos indicadores de avalia��o";
			break;
		case "c":
			result = "Voc� n�o atingiu o m�nimo esperado para aprova��o";
			break;
		default:
			result = "nota inv�lida";
		}
		System.out.println(result);
	}
}
