package javaTest2;

	import java.util.Scanner;
	import java.util.*;

public class JavaTest2 {

			public static void main(String[] args) {
				String studentResponse = "Yes";
				Scanner scan= new Scanner(System.in);
				Scanner option = new Scanner(System.in);
				
				List<Integer> Grade=new ArrayList<Integer>();
				
				while(!studentResponse.equals("no")) {
				
				System.out.println("Hello, Could you enter a grade please?");
				
				Grade.add(scan.nextInt());
				
				System.out.println("Do you like to enter another grade Yes/No: ");
				studentResponse = option.next().toLowerCase();
				
					}		
					System.out.println(Grade);
					Collections.sort(Grade);
					System.out.println("Lowest Score : " + Grade.get(0));
					int lastItem = Grade.get(Grade.size()-1);
					System.out.println("Highest Score : " + lastItem);

					double Sum = 0;
					int A = 0;
					int B = 0;
					int C = 0;
					int F = 0;
						
					for (int i=0; i<Grade.size();i++) {
						Sum = Sum+Grade.get(i);
					if(Grade.get(i) >=90)
							 A++;
					else if (Grade.get(i)>=80)
								B++;
					else if (Grade.get(i)>=70)
									C++;
						else
								F++;
					}

					System.out.println("Average is : " +Sum/Grade.size());
					System.out.println("A Student : " + A);
					System.out.println("B Student : " + B);
					System.out.println("C Student : " + C);
					System.out.println("F Student : " + F);

					// ----
			}
		}
