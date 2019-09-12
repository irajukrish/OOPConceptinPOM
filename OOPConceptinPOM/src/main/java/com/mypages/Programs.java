package com.mypages;

public class Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String s="Raju";
//		System.out.println(s.substring(3));
//		
//		for(int i=s.length()-1; i>=0 ;i--) {
//			System.out.print(s.charAt(i));
//		}
		
		
		
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int t=a[0][0];
		int jcolumn=0;
		
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<3; j++) {
				
				System.out.print(a[i][j] + " ");
				if(a[i][j] < t){
					t=a[i][j];		
					jcolumn=j;				
				}
							
			}
			System.out.println("");
			}
		
		System.out.println(t);
		System.out.println(jcolumn);
		
		for(int k=0;k<3;k++) {
			
			System.out.println("Column" + a[k][jcolumn]);
			if(a[k][jcolumn]>t) {
				t=a[k][jcolumn];
				
			}
			System.out.println(t);
			
			
		}
		
		
		
	}

}
