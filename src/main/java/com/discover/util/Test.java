package com.discover.util;

public class Test {
	
	public static void main(String[] args)
	{
		
		MainBranch[] brh = new MainBranch[5];
		brh[0]=new MainBranch(1,"Tampa","John Deo", "DISC0028",9,"Inactive","9999999999");
		brh[1]=new MainBranch(2,"Missouri","Carlos", "DISC0009",9,"Active","7777777777");
		brh[2]=new MainBranch(3,"Houston","Roy", "DISC0062",6,"Active","8888888888");
		brh[3]=new MainBranch(4,"Sunnyvale","chris", "DISC0003",9,"Active","1111111111");
		brh[4]=new MainBranch(5,"Tampa","ben", "DISC0012",9,"Active","2222222222");
		
		
		
		String BranchName = "Tampa";
		
		// Demonstration do while
		int j=0;
		do {
			System.out.println(brh[j].getBranchCodeName());
			j++;
		}while(j<5);
		
		// Demonstration for
		System.out.println();
		System.out.println("=====================================");
		
		System.out.println("Details of all Discover branch");
		for(int i=0;i<brh.length;i++)
		{
			System.out.println(brh[i]);
		}
		
		
		//Demonstration for each
		System.out.println();
		System.out.println("=====================================");
		
		System.out.println("Total branches in "+BranchName);
		for(MainBranch b:brh)
		{	
			if(b.getBranchName()==BranchName)
			{
				System.out.println(b.getTimings());
			}
			
		}
		
		
		//Demonstration while
		System.out.println();
		System.out.println("=====================================");
		
		System.out.println("Open branches in "+BranchName);
		int i=0;
		while(i<brh.length)
		{
			// if and if-else
			if(brh[i].getBranchName()==BranchName)
			{
				if(brh[i].getStatus() !="Inactive" || brh[i].knowOpenClose()!=0)
				{
					System.out.println(brh[i].getTimings());
				}
				else
				{
					System.out.println("Please contact this Number "+brh[i].getContact());
				}

				
			}
			i++;
		}
		

		System.out.println();
		System.out.println("=====================================");
		
		
		SubBranch sub_brch = new SubBranch(1,"Tampa","John Deo", "DISC0028",9,"Inactive","9999999999",1,"valrico",6);
		System.out.println(sub_brch.getTimings());
		
	}
}
