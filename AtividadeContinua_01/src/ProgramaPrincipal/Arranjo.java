package ProgramaPrincipal;

public class Arranjo {
	
	Integer[] a = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};

	public Object menor() {
		
		int menor = a[0];
		
		for (int i = 1; i < a.length; i++) {
			
			if (a[i] < menor) {
				
				menor = a[i];				
				
			}		
		}
		System.out.println(menor);
		return menor;		
	}

	public Object maior() {
		
		int maior = a[0];
		
		for (int i = 1; i < a.length; i++) {
			
			if (a[i] > maior) {
				
				maior = a[i];
				
			}
		}		
		System.out.println(maior);
		return maior;
	}

	public Object soma() {
		
		int soma = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			soma += a[i];
			
		}
		System.out.println(soma);
		return soma;
	}

	public Object repeticoes(int i) {
		
		int quant = 0;
		
		for (int j = 0; j < a.length; j++) {
			
			if (a[j] == i) {
				
				quant += 1;
				
			}						
		}		
		System.out.println(quant);
		return quant;
	}

}
