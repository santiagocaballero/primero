 class santiago1 { 
	public static void main(String[] args) { 
		System.out.println("el numero de participantes"); 
		String z=System.console().readLine();
		int[] values = new int[z];
		double j = 0 ;
		double m =0 ;
		double p =0 ;
		for (int i = 0; i =< z ; i++) { 
			System.out.println("digite su tiempo");
			String l=System.console().readLine();
			l = values[i];
			if (j < l) {
				j=l;
			}
		}
           for ( int i = 0; i =< z ; i++) { 
              if ( values[i] > m ){
                 if ( values[i] > j ){
                      p = values[i] ;
                    }
                }
            }
    }
}	