package gymbuddy1;
import java.util.*;

public class userTree {
	TreeSet<user> tree;
	Scanner scan;
	
	public userTree()
	{
		tree=new TreeSet<>();
	}
	
	public boolean addUser()
	{
		scan =new Scanner(System.in);
		
		System.out.println("Registering new user. Please enter your username.");
		String u= scan.nextLine();
		System.out.println("Please enter your password.");
		String p=scan.nextLine();
		System.out.println("Please enter your first name.");
		String f=scan.nextLine();
		System.out.println("Please enter your last name.");
		String l=scan.nextLine();
		user u1= new user(u,p,f,l);
		u1.id=tree.size()+1;
		return tree.add(u1);
		
		

		
	}
	public void close()
	{
		scan.close();
	}
	
	@SuppressWarnings("unused")
	public void logIn()// implement binary search later!!!!
	{
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Logging in. Please enter your username.");
		String u= scan.nextLine();
		System.out.println("Please enter your password.");
		String p=scan.nextLine();
		scan.close();
		ArrayList<user> list=new ArrayList<>(tree);
		int ct;
		if(list.size()%2==0)
		{
			ct=list.size()/2;
		}
		else
		{
			ct=(list.size()/2)+1;
		}
		
		
			
			
			
		for(user k: tree)
		{
			if(k.username.compareTo(u)==0)
			{
				if(k.password.compareTo(p)==0)
				{
					System.out.println("Login successful!");
					return;
				}
				else
				{
					System.out.println("Incorrect login credentials.");
					return;
				}
				
			}
			
			
					
				
			
		}
		System.out.println("User does not exist");
		return;
	}
	
	private class  user implements Comparable
	{
		private String username;
		private String password;
		private String firstN;
		private String lastN;
		private int id;
		
		private user(String u, String p, String f, String l)
		{
			username=u;
			password=p;
			firstN=f;
			lastN=l;
		}
		
		public int compareTo(Object u)
		{
			user x=(user)u;
			if(this.username.compareTo(x.username)!=0)
			{
				return this.username.compareTo(x.username);
			}
			else
			return this.password.compareTo(x.password);
		}
	}

	
	public static void main(String[] args) {
		userTree tree1 = new userTree();
		tree1.addUser();
		
		
		tree1.logIn();
		
		tree1.close();
		// TODO Auto-generated method stub

	}
}
