package gymbuddy1;
import java.util.*;
import java.io.*;
public class userTree {
	TreeSet<user> tree;
	
	public userTree()
	{
		tree=new TreeSet<>();
	}
	
	public boolean addUser()
	{
		
	}
	
	private class  user implements Comparable
	{
		private String username;
		private String password;
		private String firstN;
		private String lastN;
		
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

}
