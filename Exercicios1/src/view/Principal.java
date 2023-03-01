package view;

import javax.swing.JOptionPane;

import controller.OperacoesController;

public class Principal {
	
	public static void main(String[] Args) {
		
		OperacoesController op = new OperacoesController();
		int opc = 0;
		while(opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("EScolha:\n1 - Ex1\n2 - Ex2\n3 - Ex3\n4 - Ex4\n5 - Ex5\n6 - Ex5\n9 - FIM\n"));
			switch(opc) {
			case 1:
			//EXEC 1
			int a = 5;
			int Res = op.Naturais(a);
		    System.out.println(Res);
		    break;
		    //EXEC 2
			case 2:
			int Test = 5;
			String Resultado = op.Binario(Test);
			System.out.println(Resultado);
			break;
			case 3:
			//EXEC 3
			int b = 3;
			double Res2 = op.SomaFracao(b);
			System.out.println(Res2);
			break;
			//EXEC 4
			case 4:
			int num1 = 5555;
			int num2 = 5;
			int Resu = op.QuantosNum(num1, num2);
			System.out.println(Resu);
		    break;
			case 5:
			//EXEC 5
			int c = 5;
			int Res4 = op.Fibbonaci(c);
			System.out.println(Res4);
		    break;
		    //EXEC 6
			case 6:
		    double n = 3;
			double Res3 = op.SomaFracaoFatorial(n);
			System.out.println(Res3);
			break;
			case 9:JOptionPane.showMessageDialog(null, "FIM");
			break;
			default:JOptionPane.showMessageDialog(null, "Escolha uma opção válida");	
			}
			
			
		}
		
		
		
		
		
		
	}

}
