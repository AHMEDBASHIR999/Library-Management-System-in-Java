
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;




public class Main {

	
		public static void Display() {
			System.out.println("____________________________________________________________________");
			
			System.out.println("|"+"................WELCOME T0 LIBRARY MANGEMENT SYSTEM................"+"|" );
			
			System.out.println("____________________________________________________________________");
			System.out.println("Enter 1 to check out a Book");
			
			System.out.println("Enter 2 to return a Book");
			
			System.out.println("Enter 3 To clear All log File History");
			
			System.out.println("Enter 4 Add new Books in LMS");
			System.out.println("Enter 5 For Print Data Base Class Data");
			System.out.println("Enter 6 For Register new Members");
			System.out.println("Enter 7 For Reissue Book");
			System.out.println("Enter 0 to exit the system");
			
			
		}
		
		
		public static int Choice()
		{
			Scanner tem=new Scanner(System.in);
			int True =-1;
			int choice=-1;
			while(True!=0) {
				try {
					System.out.print("Enter your choice: ");
					choice = tem.nextInt();
					if(choice>=0 && choice<=7)
						True = 0;
					else {
						System.out.println(".....................Enter Only 0 To 7 Digit..............................");
					}
				} catch (InputMismatchException e) {
					tem.next();
					System.out.println("Entered Invalid Input..."+e);
				}
			}
			
			return choice;
		}
	
	

	public static ArrayList<Book> list;
	
	public static ArrayList<Member> member = new ArrayList<>();

	
	
	
	public static void main(String[] args)throws Exception {
		
		// TODO Auto-generated method stub

		
		Queue<Integer> list1 = new LinkedList<Integer>(RegisterMember.LoadFile1());
		 
		 
		 //Register members....
		
		 
	
			list = new ArrayList<>(Data_Base.loadData("Load-Data.txt"));
			Data_Base.storeData(list, "src/database.txt");			
				Scanner input=new Scanner(System.in);
						
			
				int choice =-1;
				while(choice != 0) {
					Display();
					int True =-1;
					choice = Choice();
					if(choice == 1) {
						String title = "";
						while(True!=0) {
							try {
								System.out.print("Enter the title of the Book for Checkout: ");
								title = input.nextLine();
								True=0;
							} catch(Exception e) {
								input.next();
								System.out.println("................................Wrong Input Please Try Again........................."+e);
							}
						}
					
						int mId = 0; True = -1;
						while(True!=0) {
							try {
								System.out.print("Enter the 4-Digit Id of the member: ");
								mId = input.nextInt();
							
								if(mId >=1000 && mId <=9999 && list1.contains(mId))
									{True=0;
								
							
									}
								else {
									System.out.println("Enter only  4-Digits Id of the member && Enter only Vlaid id " );
								}
								
//									if(list1.contains(mId)){
//									
//									System.out.println("...............id Found is Dta base....");
//								}	
								
								
								
								
							} catch(Exception e) {
								input.next();
								System.out.println("................................Wrong Input Please Try Again........................."+e);
							}
						}
						
						
				
						True = -1; String mName = "";
						while(True!=0) {
							try {
								
								input.nextLine();
								System.out.print("Enter the Name of the member: ");
								mName = input.nextLine();
								
									if(!mName.isBlank())
			
										True=0;
								else {
									System.out.println("\n***Do Not Enter Blank Name****\n");
								}
							} catch(Exception e) {
								input.next();
								System.out.println("................................Wrong Input Please Try Again........................."+e);
							}
						}
						
					
						True=-1; String mGender = "";
						while(True!=0) {
							try {
								System.out.print("Enter the Gender of the member: ");
								mGender = input.nextLine();
								
								if(!mGender.isEmpty())
									True=0;
								else {
									System.out.println(".................Please Enter Valid Gender............");
								}
							} catch(InputMismatchException e) {
								input.next();
								System.out.println("................................Wrong Input Please Try Again........................."+e);
							}
						}				
						Member m = new Member(mId, mName, mGender);
						
						member.add(m);
						
						Book_Check_out.checkOut(title, m);
					}
					else if(choice == 2) {
						
						System.out.println("choise ."+choice);
						True = -1; String Title2 = "";
						while(True!=0) {
							try {
								System.out.print("Return Book By Enter Book Title: ");
								Title2 = input.nextLine();
								True=0;
							} catch(InputMismatchException e) {
								input.next();
								System.out.println("................................Wrong Input Please Try Again........................."+e);
							}
							
						}
						Book_Return.returnBook(Title2);
														
					}
					
									
					else if(choice == 0) {
					
						
						input.close();
					}
					else if(choice==3) {
						FileWriter flr=new FileWriter("log.txt");
						flr.write("");
					}
					
					
					else if(choice==4) {
						
					FileWriter flr=new FileWriter("Load-Data.txt",true);		
				
						System.out.print("Enter Book id ");
						
						int bookid=input.nextInt();
						input.nextLine();
						System.out.print("Enter Book ISBN Number :");
						String Isbn=input.nextLine();
						
						
						System.out.print("Enter Book Title :");
						
						String Title=input.nextLine();
						System.out.print("Enter Book Author :");

						String Auther=input.nextLine();
						System.out.print("Enter Book Publish Date in That Format 8/12/2021:");

						String Date=input.nextLine();
//						System.out.println("Enter Book Member ID ");
//						String mID=input.nextLine();
						
			
						flr.write("\n"+bookid);
						flr.write("\n"+Isbn);
						flr.write("\n"+Title);
						flr.write("\n"+Auther);
						flr.write("\n"+Date);
						flr.write("\n"+0);	
						flr.close();
						
						list = new ArrayList<>(Data_Base.loadData("Load-Data.txt"));
						
						Data_Base.storeData(list, "src/database.txt");
						
					
					}
					else if(choice == 5) {
						
						 LinkedList<String> ll  = new LinkedList<String>();
						 
						 FileReader flrr=new FileReader("Data-Base.txt");
						 
						 Scanner uu=new Scanner(flrr);
						 
						 while (uu.hasNext()) {
							 
							 String tem=uu.nextLine();
							 ll.add(tem);
							
						}
						 
						 while(!ll.isEmpty()) {
							 System.out.println(ll.getFirst());
							 ll.remove();
						 }
						 
						 
					}
					
					
					else if(choice == 6) {
						FileWriter flr22=new FileWriter("MemberIdLog.txt",true);
						Scanner RMID=new Scanner(System.in);
						
						System.out.println("ENTER 4 Digit Memeber Id");
						int MID=RMID.nextInt();
						
						flr22.write("\n"+MID);
					
						flr22.close();
					
						
					}
					else if(choice ==7) {
							String title = "";
							while(True!=0) {
								try {
									System.out.print("Enter the title of the Book for Reissue: ");
									title = input.nextLine();
									True=0;
								} catch(Exception e) {
									input.next();
									System.out.println("................................Wrong Input Please Try Again........................."+e);
								}
							}
						
							int mId = 0; True = -1;
							while(True!=0) {
								try {
									System.out.print("Enter the 4-Digit Id of the member: ");
									mId = input.nextInt();
								
									if(mId >=1000 && mId <=9999 && list1.contains(mId))
										{True=0;
									
								
										}
									else {
										System.out.println("Enter only  4-Digits Id of the member && Enter only Vlaid id " );
									}
									
//										if(list1.contains(mId)){
//										
//										System.out.println("...............id Found is Dta base....");
//									}	
									
									
									
									
								} catch(Exception e) {
									input.next();
									System.out.println("................................Wrong Input Please Try Again........................."+e);
								}
							}
							
							
					
							True = -1; String mName = "";
							while(True!=0) {
								try {
									
									input.nextLine();
									System.out.print("Enter the Name of the member: ");
									mName = input.nextLine();
									
										if(!mName.isBlank())
				
											True=0;
									else {
										System.out.println("\n***Do Not Enter Blank Name****\n");
									}
								} catch(Exception e) {
									input.next();
									System.out.println("................................Wrong Input Please Try Again........................."+e);
								}
							}
							
						
							True=-1; String mGender = "";
							while(True!=0) {
								try {
									System.out.print("Enter the Gender of the member: ");
									mGender = input.nextLine();
									
									if(!mGender.isEmpty())
										True=0;
									else {
										System.out.println(".................Please Enter Valid Gender............");
									}
								} catch(InputMismatchException e) {
									input.next();
									System.out.println("................................Wrong Input Please Try Again........................."+e);
								}
							}				
							Member m = new Member(mId, mName, mGender);
							
							member.add(m);
							
							Book_Check_out.recheckOut(title, m);
						}
						
						
					}
					
				}//while
				
				

}
