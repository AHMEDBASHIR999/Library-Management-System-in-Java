import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Book_Return {
		
		 static int Fine(){
			 

			 Scanner input=new Scanner(System.in);
			 System.out.print("Enter The issue date :");
			 
			 int date=input.nextInt();
			 
			 
			 
			 System.out.print("Enter The Returning date :");
			 int date2=input.nextInt();
			 
			 int fine=0;
			 
			 int result=date2-date;   //12 -1 =11
			 
			
				while(result>= 10) { 
					
					
					fine =fine+10;
					result--;
					
				}
						 
			 
			 if(fine ==0) {
				 fine=0;
				 
			 }
			 	
			return fine;
 
		}
		
		

			public static void returnBook(String title)throws Exception  {
	
			int tem=Book_Search.searchBook(title);
			
			if(tem <0 || Main.list.get(tem).getMemberId() ==0) {
						
					System.out.println("...............................................Book Not issue any Student...........................................................");
				
			}
		
			else if (Main.list.get(tem).getMemberId() !=0) {
				
				
				
		//System.out.println("Tem is  bOok Title :"+tem);
		
		
		int finereturn=Fine();
		int amount=0;
		
			if (finereturn!=0 ) {
				System.out.println("Please Pay the Fine before BOOk Return ");
				
				System.out.println("Your Total Fine :"+finereturn);
				
				Scanner input=new Scanner(System.in);
				
				System.out.print("Enter Amount for pay :=");
				amount=input.nextInt();
				
				while (amount !=finereturn) {
					System.out.print("Please pay Exact Amount :=");
					amount=input.nextInt();
					
				}	
			}
			
				if (tem>=0) {
					
				FileWriter flr=new FileWriter("log.txt",true);
				

			
	
					 flr.write("\nRerurned by :"+ Main.member.get(0).getId()+"Title is :"+Main.list.get(tem).getTitle()+ "Book id :"+Main.list.get(tem).getId()+ java.time.LocalDate.now() );
	
							flr.close();		
				Main.list.get(tem).setMemberId(0);
				
			Data_Base.storeData(Main.list,"Data-Base.txt");
			
			
			
				System.out.println("............................................Book has been Returned Successfully......................................");
				
				}
				
			
				
				
	}
			
		
	}
	
	
}
