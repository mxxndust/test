package test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Te {
	
	public static void main(String[] args) {
		
		
		Te te = new Te();
		te.run();
	}
		
	public void run() {
		String p = "WRWWLWWLWWLWLWRRWRWWWRWWRWLW";
		String o = "WWRRWLWLWWLWWLWWRWWRWWLW";	
		
		//String p = "WW";
		//String o = "WW";	
		int angle = 180;
		Ce[][] arr = new Ce[p.length()*2][p.length()*2];
		for(int k = 0; k < arr.length; k++) {
			for(int z = 0; z < arr[k].length; z++) {		
				arr[k][z] = new Ce("0");
			}
		}
		
		int n = p.length();
		int m = p.length();
		arr[n][m].setProi("y");
		arr[n][m].setN(true);
		for (int i = 1; i < p.length()-1; i++) {
			if (p.charAt(i) == 'W') {
				if (angle == 180) {
					arr[n][m].setProi("y");
					arr[n][m].setS(true);
					n++;
				}
				else if (angle == 270) {
					arr[n][m].setProi("y");
					arr[n][m].setW(true);
					m--;
				}
				else if (angle == 0) {
					
					arr[n][m].setProi("y");
					arr[n][m].setN(true);
					n--;
				}
				else if (angle == 90) {
					arr[n][m].setProi("y");
					arr[n][m].setE(true);
					m++;
				}
			}

			else if (p.charAt(i) == 'L') {
				if (angle == 0) {
					angle = 270;
				}
				else if (angle == 90) {
					angle-=90;
				}
				else if (angle == 180) {
					angle-=90;
				}
				else if (angle == 270) {
					angle-=90;
				}
			}
			else if (p.charAt(i) == 'R') {
				if (angle == 0) {
					angle+=90;
				}
				else if (angle == 90) {
					angle+=90;
				}
				else if (angle == 180) {
					angle+=90;
				}
				else if (angle == 270) {
					angle = 0;
				}
			}
		}
		
		
		if (angle == 0) {
			arr[n][m].setN(true);
		}
		else if (angle == 90) {
			arr[n][m].setE(true);
		}
		else if (angle == 180) {
			arr[n][m].setS(true);
		}
		else if (angle == 270) {
			arr[n][m].setW(true);
		}
		
		//System.out.println(angle);
		switch (angle) {
		case 0:
			angle = 180;
		case 90:
			angle = 270;
		case 180:
			angle = 0;
		case 270:
			angle = 90;
		}
		//System.out.println(angle);
		
		int g = n;
		int f = m;
		
		for (int i = 1; i < o.length()-2; i++) {
			if (o.charAt(i) == 'W') {
				if (angle == 180) {
					arr[g][f].setProi("y");
					arr[g][f].setS(true);
					g++;

				}
				else if (angle == 270) {
					arr[g][f].setProi("y");
					arr[g][f].setW(true);
					f--;

				}
				else if (angle == 0) {
					
					arr[g][f].setProi("y");
					arr[g][f].setN(true);
					g--;

				}
				else if (angle == 90) {
					arr[g][f].setProi("y");
					arr[g][f].setE(true);
					f++;

				}
			}

			else if (o.charAt(i) == 'L') {
				if (angle == 0) {
					angle = 270;
				}
				else if (angle == 90) {
					angle-=90;
				}
				else if (angle == 180) {
					angle-=90;
				}
				else if (angle == 270) {
					angle-=90;
				}
			}
			else if (o.charAt(i) == 'R') {

				if (angle == 0) {
					angle+=90;
				}
				else if (angle == 90) {
					angle+=90;
				}
				else if (angle == 180) {
					angle+=90;
				}
				else if (angle == 270) {
					angle = 0;
				}
			}
		}
		arr[g][f].setN(true);
		
		List<String> fin = new ArrayList<>();
		//String str = "";
		String u = "4444";
		System.out.print(u);
		for(int k = 0; k < arr.length; k++) {
			//ArrayList <String> arr1=new ArrayList<>();
			for(int z = 0; z < arr[k].length; z++) {
				if (arr[k][z].getProi().equals("y")) {
					if (arr[k][z].isN() && !arr[k][z].isS() && !arr[k][z].isW() && !arr[k][z].isE()) {
						//System.out.print("1"+" ");
						//arr.add("1");
						u = u + "1";
					}
					if (!arr[k][z].isN() && arr[k][z].isS() && !arr[k][z].isW() && !arr[k][z].isE()) {
						//System.out.print("2"+" ");
						u = u + "2";
					}
					if (arr[k][z].isN() && arr[k][z].isS() && !arr[k][z].isW() && !arr[k][z].isE()) {
						//System.out.print("3"+" ");
						u = u + "3";

					}
					if (!arr[k][z].isN() && !arr[k][z].isS() && arr[k][z].isW() && !arr[k][z].isE()) {
						//System.out.print("4"+" ");
						u = u + "4";

					}
					if (arr[k][z].isN() && !arr[k][z].isS() && arr[k][z].isW() && !arr[k][z].isE()) {
						//System.out.print("5"+" ");
						u = u + "5";

					}
					if (!arr[k][z].isN() && arr[k][z].isS() && arr[k][z].isW() && !arr[k][z].isE()) {
						//System.out.print("6"+" ");
						u = u + "6";

					}
					if (arr[k][z].isN() && arr[k][z].isS() && arr[k][z].isW() && !arr[k][z].isE()) {
						//System.out.print("7"+" ");
						u = u + "7";

					}
					if (!arr[k][z].isN() && !arr[k][z].isS() && !arr[k][z].isW() && arr[k][z].isE()) {
						//System.out.print("8"+" ");
						u = u + "8";

					}
					if (arr[k][z].isN() && !arr[k][z].isS() && !arr[k][z].isW() && arr[k][z].isE()) {
						//System.out.print("9"+" ");
						u = u + "9";

					}
					if (!arr[k][z].isN() && arr[k][z].isS() && !arr[k][z].isW() && arr[k][z].isE()) {
						//System.out.print("a"+" ");
						u = u + "a";

					}
					if (arr[k][z].isN() && arr[k][z].isS() && !arr[k][z].isW() && arr[k][z].isE()) {
						//System.out.print("b"+" ");
						u = u + "b";

					}
					if (!arr[k][z].isN() && !arr[k][z].isS() && arr[k][z].isW() && arr[k][z].isE()) {
						//System.out.print("c"+" ");
						u = u + "c";

					}
					if (arr[k][z].isN() && !arr[k][z].isS() && arr[k][z].isW() && arr[k][z].isE()) {
						//System.out.print("d"+" ");
						u = u + "d";
					}
					if (!arr[k][z].isN() && arr[k][z].isS() && arr[k][z].isW() && arr[k][z].isE()) {
						//System.out.print("e"+" ");
						u = u + "e";

					}
					if (arr[k][z].isN() && arr[k][z].isS() && arr[k][z].isW() && arr[k][z].isE()) {
						//System.out.print("f"+" ");
						u = u + "f";

					}
					System.out.print(u);
				}
				fin.add(u);
			}
			
		}
		
		//for(int k = 0; k < fin.size(); k++) {
			System.out.println(fin);
		//}
		/*for(int k = 0; k < arr.length; k++) {
			for(int z = 0; z < arr[k].length; z++) {
				if (arr[k][z].getProi().equals("y")) {
					if (arr[k][z].isN()) {
						System.out.print(k+"n"+z+" ");
					}
					if (arr[k][z].isS()) {
						System.out.print(k+"s"+z+" ");
					}
					if (arr[k][z].isW()) {
						System.out.print(k+"w"+z+" ");
					}
					if (arr[k][z].isE()) {
						System.out.print(k+"e"+z+" ");
					}
					
				}	
			}
			System.out.println();
		}	*/	
	}
}
