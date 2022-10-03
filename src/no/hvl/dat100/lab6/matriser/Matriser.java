package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int i = 0; i < matrise.length; i++) {

			for (int j = 0; j < matrise[i].length; j++) {
				System.out.print(matrise[i][j]);

			}

		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		
		String a = "";
		for(int i = 0; i< matrise.length; i++) {
			
			for(int j = 0; j < matrise.length; j++) {
				int b = matrise[i][j];
				a += b + " ";
				
			}
			a+= "\n";
		}
return a;
			
		}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		  int[][] nyTab = new int[matrise.length][matrise.length];

	        for (int i = 0; i < matrise.length; i++) {
	    for (int a = 0; a < matrise.length; a++) {
	        nyTab[i][a] = (matrise[i][a])*tall;
	    }
	
	}
	        return nyTab;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		
		 boolean lik = false; 
		    int i = 0; 
		    int c = 0;
		    while(!lik && i < a.length) {

		        for (i = 0; i < b.length; i++) {
		            for (c = 0; c < b.length; c++) {

		            if (a[i][c] == b[i][c]) {
		                lik = true;

		            }
		          }
		        }
		      }
		    return lik;
		    }
	
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
