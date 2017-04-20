package edu.formation;
public class Convertir {
	
	public static String convertirMinuscule(String ch1){
		char caractere;
		int indice;
		String resultat;
		
		resultat = new String(ch1);
		indice = 0;
		while(indice < resultat.length()){
			caractere = resultat.charAt(indice);
			if(caractere >= 'A' && caractere <= 'Z'){
				caractere = (char) (caractere + ('a' - 'A'));
				// première méthode
				char[] tmp = resultat.toCharArray();
				tmp[indice] = caractere;
				resultat = String.valueOf(tmp);
			}
			indice = indice + 1;
		}		
		return resultat;
	}

	public static void main(String[] args) {
		String ch1;
		String ch2;
		ch1 = new String("DuPoNd");
		ch2 = Convertir.convertirMinuscule(ch1);
		
		System.out.println(ch2);
	}

}
