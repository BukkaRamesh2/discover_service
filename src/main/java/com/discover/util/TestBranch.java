package com.discover.util;

import java.util.*;

public class TestBranch {
	
	public static void main(String[] args)
	{
		List<MainBranch> brh= new ArrayList();  
		
		brh.add(new MainBranch(1,"Tampa","John Deo", "DISC0028",9,"Inactive","9999999999"));
		brh.add(new MainBranch(2,"Missouri","Carlos", "DISC0009",9,"Active","7777777777"));
		brh.add(new MainBranch(3,"Houston","Roy", "DISC0062",6,"Active","8888888888"));
		brh.add(new MainBranch(4,"Sunnyvale","chris", "DISC0003",9,"Active","1111111111"));
		brh.add(new MainBranch(5,"Tampa","ben", "DISC0012",9,"Active","2222222222"));
		
		
		
		String BranchName = "Tampa";
		
		// Demonstration do while
		int j=0;
		do {
			System.out.println(brh.get(j).getBranchCodeName());
			j++;
		}while(j<5);
		
		// Demonstration for
		System.out.println();
		System.out.println("=====================================");
		
		System.out.println("Details of all Discover branch");
		for(int i=0;i<brh.size();i++)
		{
			System.out.println(brh.get(i));
		}
		
		
		Map<String,MainBranch> brhmap = new HashMap<>();  
		brhmap.put("Tampa",new MainBranch(1,"Tampa","John Deo", "DISC0028",9,"Inactive","9999999999"));
		brhmap.put("Missouri",new MainBranch(2,"Missouri","Carlos", "DISC0009",9,"Active","7777777777"));
		brhmap.put("Houston",new MainBranch(3,"Houston","Roy", "DISC0062",6,"Active","8888888888"));
		brhmap.put("Sunnyvale",new MainBranch(4,"Sunnyvale","chris", "DISC0003",9,"Active","1111111111"));
		brhmap.put("Tampa",new MainBranch(5,"Tampa","ben", "DISC0012",9,"Active","2222222222"));
		
		
		System.out.println();
		System.out.println("=====================================");
		
		System.out.println("Total branches in "+BranchName);
//      Demonstration for each
//		for(MainBranch b:brh)
//		{	
//			if(b.getBranchName()==BranchName)
//			{
//				System.out.println(b.getTimings());
//			}
//			
//		}
		
		for (Map.Entry<String, MainBranch> entry : brhmap.entrySet()) {  
            String key = entry.getKey();  
            MainBranch value = entry.getValue();  
            if(key==BranchName)
			{
				System.out.println(value.getTimings());
			}
            
        }  
		
		
  
		LinkedHashSet<MainBranch> brhset = new LinkedHashSet<MainBranch>();  
		
		brhset.add(new MainBranch(1,"Tampa","John Deo", "DISC0028",9,"Inactive","9999999999"));
		brhset.add(new MainBranch(2,"Missouri","Carlos", "DISC0009",9,"Active","7777777777"));
		brhset.add(new MainBranch(3,"Houston","Roy", "DISC0062",6,"Active","8888888888"));
		brhset.add(new MainBranch(4,"Sunnyvale","chris", "DISC0003",9,"Active","1111111111"));
		brhset.add(new MainBranch(5,"Tampa","ben", "DISC0012",9,"Active","2222222222"));
		brhset.add(new MainBranch(5,"Tampa","ben", "DISC0012",9,"Active","2222222222"));
		
		//Demonstration while
		System.out.println();
		System.out.println("=====================================");
		
		System.out.println("Open branches in "+BranchName);
		
		Iterator<MainBranch> itr=brhset.iterator();
		
		while(itr.hasNext())
		{
			MainBranch cur = itr.next();
			// if and if-else
			if(cur.getBranchName()==BranchName)
			{
				if(cur.getStatus() !="Inactive" || cur.knowOpenClose()!=0)
				{
					System.out.println(cur.getTimings());
				}
				else
				{
					System.out.println("Please contact this Number "+cur.getContact());
				}

				
			}
		}
		

		System.out.println();
		System.out.println("=====================================");
		
		
		SubBranch sub_brch = new SubBranch(1,"Tampa","John Deo", "DISC0028",9,"Inactive","9999999999",1,"valrico",6);
		System.out.println(sub_brch.getTimings());
		
		
		
		
		
		
		
	}
}
