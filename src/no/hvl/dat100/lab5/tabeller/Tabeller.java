package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.println(" [ ");
		for(int i = 0; i < tabell.length; i++) {
		}
			System.out.println(" ] ");

	}

	// b)
	public static String tilStreng(int[] tabell) {

		 String vTxt = "";
	        for (int i=0; i<tabell.length; i++) {
	            int v = tabell[i];

	            if (i<tabell.length-1) {
	                vTxt += v + ",";
	            }else {
	                vTxt += "" + v;
	            }
	        }
	        return "[" + vTxt + "]";	
	}


	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		int i = 0;
		
		for(i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		
		while(i<tabell.length) {
			sum += tabell[i];
			i++;
		}
		for (int j : tabell) {
			sum += j;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean funnet = false;
		int i = 0;
		
		while ( i < tabell.length && (!funnet)) {
			if(tabell[i] == tall) {
				funnet = true;
			}
			i++;
		}
		return funnet;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int forstetall = -1;
        int i = 0;

        for (i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                forstetall = i;
            }
        }
        return forstetall;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] reverser= new int[tabell.length];
		int a = tabell.length;
		
		for(int i =0; i < tabell.length; i++) {
			reverser [a-1] = tabell[i];
			a--;
		}
		return reverser;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
boolean sortert = true;
int i = 0;

/*for (i = 0; i < tabell.length; i++) {
	if(tabell[i] > tabell[i+1])
		sortert = false;
}*/

while (sortert && i < tabell.length -1) {
	if(tabell[i] > tabell[i+1]) 
		sortert = false;
		
		i++;
	}
		return sortert;
}
	

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {


        int length = tabell1.length + tabell2.length;

        int[] resultat = new int[length];
        int pos = 0;
        for (int element : tabell1) {
            resultat[pos] = element;
            pos++;
        }

        for (int element : tabell2) {
            resultat[pos] = element;
            pos++;
        }
        return resultat;

	}
}
