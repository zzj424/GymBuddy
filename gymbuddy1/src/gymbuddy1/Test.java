package gymbuddy1;

import static org.junit.Assert.*;

public class Test {
 userTree tree1=new userTree();
 
 
	@org.junit.Test
	public void test() { // adding one user
		tree1.addUser();
		tree1.addUser();
		tree1.close();
		assertTrue(tree1.tree.size()==1);
	}
	
	@org.junit.Test
	public void test2() {
		//assertTrue("Not yet implemented");
	}
	
	@org.junit.Test
	public void test3() {
		//assertTrue("Not yet implemented");
	}
	
	@org.junit.Test
	public void test4() {
		//assertTrue("Not yet implemented");
	}

}
