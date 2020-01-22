package test1;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Te {
	
	public static void main(String[] args) {
		
		
		Te te = new Te();
		te.run();
	}
		
		public void run() {
			String p = "WRWWLWWLWWLWLWRRWRWWWRWWRWLW";
			String o = "WWRRWLWLWWLWWLWWRWWRWWLW";		
			int angle = 180;
			Ce[][] arr = new Ce[p.length()*2][p.length()*2];
			for(int k = 0; k < arr.length; k++) {
				for(int z = 0; z < arr[k].length; z++) {		
					arr[k][z] = new Ce("0");
					//System.out.print(arr[k][z].getProi() + "\t");
				}
				System.out.println();
			}
		
		
		int n = p.length();
		int m = p.length();
		arr[n][m].setS(true);
		for (int i = 1; i < p.length()-2; i++) {
			if (p.charAt(i) == 'W') {
				if (angle == 180) {
					arr[n][m].setProi("y");
					arr[n][m].setS(true);
					n++;

					/*if (arr[n][m] == null) {
						arr[n][m] = "s";
			        }
			        else {
			        	arr[n][m] = arr[n][m] + "s";
			        }
					n++;*/
				}
				else if (angle == 270) {
					arr[n][m].setProi("y");
					arr[n][m].setW(true);
					m--;
					/*if (arr[n][m] == null) {
			        	arr[n][m] = "w";
			        }
			        else {
			        	arr[n][m] = arr[n][m] + "w";
			        }
					m--;*/
				}
				else if (angle == 0) {
					
					arr[n][m].setProi("y");
					arr[n][m].setN(true);
					n--;
					/*if (arr[n][m] == null) {
			        	arr[n][m] = "n";
			        }
			        else {
			        	arr[n][m] = arr[n][m] + "n";
			        }
					n--;*/
				}
				else if (angle == 90) {
					arr[n][m].setProi("y");
					arr[n][m].setE(true);
					m++;
					/*if (arr[n][m] == null) {
			        	arr[n][m] = "e";
			        }
			        else {
			        	arr[n][m] = arr[n][m] + "e";
			        }
					m++;*/
				}
			}

			else if (p.charAt(i) == 'L') {
				if (angle == 0) {
					arr[n][m].setN(false);
					angle = 270;
				}
				else if (angle == 90) {
					arr[n][m].setE(false);
					angle-=90;
				}
				else if (angle == 180) {
					arr[n][m].setS(false);
					angle-=90;
				}
				else if (angle == 270) {
					arr[n][m].setW(false);
					angle-=90;
				}
			}
			else if (p.charAt(i) == 'R') {
				/*if (angle == 270) {
					angle = 0;
				}
				else {
					angle+=90;
				}*/
				if (angle == 0) {
					arr[n][m].setN(false);
					angle+=90;
				}
				else if (angle == 90) {
					arr[n][m].setE(false);
					angle+=90;
				}
				else if (angle == 180) {
					arr[n][m].setS(false);
					angle+=90;
				}
				else if (angle == 270) {
					arr[n][m].setW(false);
					angle = 0;
				}
			}
			System.out.println(angle);
		}
		/*for(int k = 0; k < arr.length; k++) {
			for(int z = 0; z < arr[k].length; z++) {
				if (arr[k][z].getProi().equals("y")) {
					//System.out.print(arr[k][z].getProi() + "\t");
					System.out.println(k);
				}
				
			}
			System.out.println();
		}*/
		
		//List<List<Ce>> rtr = new ArrayList<>();
		//rtr.get(5).get(10).setAl(true);
		//System.out.println(rtr);
		
		/*//int[][] arr = new int[][];
		List<List<String>> row = new ArrayList<>();
		//for(List<String> s : row) {
		for(int n=0; n <= row.size(); n++) {
			ArrayList <String> col=new ArrayList<>();
			//for(String st : col) {
			for(int m=0; m <= row.size(); m++) {
				//String u = row.get(n).get(m);
				col.add("a");
				//col.add("s");
				//col.toArray();
				System.out.println(col);
				Ce al = (Ce) col.get(m);
				//al.setAl(true);
				//row.toArray()
			}
		}*/
		
		
		/*ArrayList<String> people = new ArrayList<String>();
	        // добавим в список ряд элементов
	        people.add("Tom");
	        people.add("Alice");
	        people.add("Kate");
	        people.add("Sam");
	        //people.get(2);
	        if (people.size() < 4)
	        	people.set(4, people.get(4)+"Bob");
	        else
	        	people.add("S");// добавляем элемент по индексу 1
	       // people.set(1, "jo");
	        System.out.println(people);
	        System.out.println(people.get(2) == null);
	        String[] arrayOfStrings = null;
	        // Создаем массив строк такого же размеры, что и входной ArrayList
	        arrayOfStrings = people.toArray(new String[people.size()]);
	        System.out.println(Arrays.toString(arrayOfStrings));
	        
	        String [][] u = new String [5][5];
	        u[1][2]="p";
	        if (u[1][2] == null) {
	        	u[1][2] = "i";
	        }
	        else {
	        	u[1][2] = u[1][2] + "o";
	        }
	        System.out.println(u[1][2]);*/
		



			/*public static void main(String[] args) {
				Maze maze = new Maze();
				maze.run();

			}*/
			
			/*public void run() {
				String p = "WRWWLWWLWWLWLWRRWRWWWRWWRWLW";
				String o = "WWRRWLWLWWLWWLWWRWWRWWLW";
				
				int angle = 0;
				//int n = 0;
				//int m = 0;
				
				/*if (angle == 0) {
					List<List<String>> row = new ArrayList<>();
					//for(List<String> s : row) {
					for(int n=0; n < row.size(); ++n) {
						ArrayList <String> col = new ArrayList<>();
						//for(String st : col) {
						for(int m=0; m < row.size(); ++m) {
							
						}
					}
				}*/
				
				/*for (int i = 0; i < p.length()-2; ++i) {
					if (p.valueOf(i).equals('W')) {
						if (angle == 180) {
							
						}
						else if (angle == 270) {
							
						}
						else if (angle == 360) {
							
						}
						else if (angle == 90) {
							
						}
						
						//Cell currentCell = row.get().get();
					}
					else if (p.valueOf(i).equals('L')) {
						if (angle == 0) {
							angle = 270;
						}
						else {
							angle-=90;
						}
					}
					else if (p.valueOf(i).equals('R')) {
						if (angle == 270) {
							angle = 0;
						}
						else {
							angle+=90;
						}
					}
				}*/
				//String d = p.valueOf(0);
				//if (d.equals('W')) {
				/*if (p.charAt(0) == 'W') { ghjdthrf hf,jnfkf
					System.out.println(p.charAt(0)+"хмм");
				}*/
				
				/*List<List<String>> row = new ArrayList<>();
				for(int n = 0; n < row.size()+1; n++) {
					ArrayList <String> col = new ArrayList<>();
					for(int m = 0; m < col.size()+1; m++) {
						for (int i = 0; i < p.length()-2; ++i) {
							if (p.charAt(i) == 'W') {
								System.out.println("хмм");
								if (angle == 180) {
									//if (row.get(n).get(m) == null) {
									if (col.get(m) == null) {
										//row.get(n).add("s");
										row.get(n).set(m, "s");
									}
									else {
										col.set(m, col.get(m)+"s");
										//row.get(n).set(m, col.get(m)+"s");
									}
								//n++;
								}
								else if (angle == 270) {
									if (m == 0) {
										//if (row.get(n).get(m) == null) {
										if (col.get(m) == null) {
											row.get(n).set(m, "w");
										}
										else {
											//row.get(n).set(m, col.get(m)+"w");
											col.set(m, col.get(m)+"w");
										}
									//m=0;
									}
									else {
										//if (row.get(n).get(m) == null) {
										if (col.get(m) == null) {
											row.get(n).set(m, "w");
										}
										else {
											//row.get(n).set(m, col.get(m)+"w");
											col.set(m, col.get(m)+"w");
										}
									//m--;
									}
								}
								else if (angle == 0) {
									if (n == 0) {
										//if (row.get(n).get(m) == null) {
										if (m==0) {
											//row.get(0).set(0, "n");
											col.add(0, "n");
										//n--;
										}
										
										else {
											//row.get(n).set(m, col.get(m)+"n");
											col.set(m, col.get(m)+"n");
										}
										//n--;
									n--;
									}
									else {
										//if (row.get(n).get(m) == null) {
										if (m==0) {
											//row.get(n).set(m, "n");
											col.add(0, "n");
										}
										else {
											//row.get(n).set(m, col.get(m)+"n");
											col.set(m, col.get(m)+"n");
											
										}
									//n--;
									}
								}
								else if (angle == 90) {
									//if (row.get(n).get(m) == null) {
									if (col.get(m) == null) {
										//row.get(n).get(m).add("s");
										row.get(n).set(m, "e");
									}
									else {
										col.set(m, col.get(m)+"s");
										//row.get(n).set(m, col.get(m)+"e");
									}
								//m++;
								}
								
								//Cell currentCell = row.get().get();
							}
							else if (p.charAt(i) == 'L') {
								if (angle == 0) {
									angle = 270;
								}
								else {
									angle-=90;
								}
								System.out.println("!!!!");
							}
							else if (p.charAt(i) == 'R') {
								if (angle == 270) {
									angle = 0;
								}
								else {
									angle+=90;
								}
								System.out.println("88888");
							}
						//}
						System.out.println(col.get(m));
					}
					//System.out.println(row.get(n).get(m));
				}
			System.out.println(row);	*/
			}
	//	}

	//}


}
