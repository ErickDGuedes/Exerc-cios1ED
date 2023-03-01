package controller;

public class OperacoesController {
	
	public OperacoesController() {
		super();
	}
	//Ex 1
	public int Naturais(int x) {
		//Ponto de Parada, quando valor de x for igual a 0
		if(x == 0) {
			return 0;
		}else {
		//função irá retornar os valores, somando um a um,
		//e retornando o resultado das somas.
			return x + Naturais(x-1);	
		}
	}
	//Ex 3
	public double SomaFracao(double num) {
		//Ponto de parada, quando o valor de num for Menor que 2,
		if(num < 2) {
			return 1;
		}else {
		//A função irá retornar os valores
		//Diminuindo no valor do dividendo e somando com 1.
			return SomaFracao(num-1) + 1/num;
		}
		
	}
	//Ex 6
	public double Fatorial(double num) {
		if(num == 0) {
			return 1;
		}else {
			return num*Fatorial(num-1);
		}
	}
	//Ex 6
	public double SomaFracaoFatorial(double num) {
		//ponto de parada, quando o num for menor que 2,
		if(num < 2) {
			return 1;
		}else {
		//retorna a expressão(1/num de fatorial) somando a cada chamada da função
			return 1/Fatorial(num) + SomaFracaoFatorial(num-1);
		}
	}
	//Ex 5
	public int Fibbonaci(int num) {
		//ponto de parada, quando o valor de num for menor que 2,
		if(num < 2) {
			return num;
		}else {
		//retorna o valor de num somado do valor de num-1 e num-2
			return Fibbonaci(num-1) + Fibbonaci(num-2);
		}
	}
	//Ex 4
    public int QuantosNum(int num, int param) {
    	//ponto de parada, quando o num for menor que 1, a função irá
    	//retornar 0
    	if(num < 1) {
    		return 0;
    	}else if(num%10 == param) {
    	//retorna somando em 1, o valor de num divido por 10, e verifica quantas
    	//vezes aparece o valor de param 
    		return 1 + QuantosNum(num/10, param);
    	}
    	return QuantosNum(num/10, param);
    	
    	
    }
    //EX 2
    public String Binario(int num) {
    	//ponto de parada, quando o valor de num for igual a 0,
    	if(num == 0) {
    		return "";
    	}else {
    	//Retorna o valor de num, somando com o valor de Res
    		int Res = num % 2;
    		num = num/2;
    		return Binario(num)+Res;
    	}
    }
    
    
    
}
		
		

     
