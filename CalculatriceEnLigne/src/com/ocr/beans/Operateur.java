package com.ocr.beans;

public class Operateur {

	private double operande1;
	private String operateur;
	private double operande2;
	double resultat;
	
		/**Constructeur de l'opérateur de calcul
		 * @param operande1 valeur nombre1
		 * @param operateur valeur operande
		 * @param operande2 valeur nombre2
		 */
		public Operateur(double operande1, String operateur, double operande2) {
			this.operande1 = operande1;
			this.operateur = operateur;
			this.operande2 = operande2;
			
			 if(operateur.equals("+"))       //cas de l'addition
			    {
				       resultat = operande1 + operande2;
			    }
		        else if(operateur.equals("-"))  //cas de la soustraction
		        {
		        	resultat = operande1 - operande2;
		        }
		        else if(operateur.equals("x"))  //cas de la multiplication
		        {
		        	resultat = operande1 * operande2;
		        }
		        else if(operateur.equals("/"))  //cas de la division
		        {
		        	try {
		        		resultat = operande1 / operande2;
		        	}catch(ArithmeticException e) {
		        		
		        	}
		        }
		}
		
		/* 
		 * @see java.lang.Object#toString()
		 */
		public String toString() {
			String str = ("Résultat de l'opération "+this.getOperande1()+" "+this.getOperateur()+" "+this.getOperande2()+" = "+this.getResultat());
			return str;
		}
		
		/**
		 * @return resultat de calcul
		 */
		public Double getResultat() {
			return resultat;
		}
		public double getOperande1() {
			return operande1;
		}
	
		public void setOperande1(double operande1) {
			this.operande1 = operande1;
		}
	
		public String getOperateur() {
			return operateur;
		}
	
		public void setOperateur(String operateur) {
			this.operateur = operateur;
		}
	
		public double getOperande2() {
			return operande2;
		}
	
		public void setOperande2(double operande2) {
			this.operande2 = operande2;
		}
}
