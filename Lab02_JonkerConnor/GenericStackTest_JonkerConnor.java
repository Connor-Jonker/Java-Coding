//import java.util.ArrayList;

public class GenericStackTest_JonkerConnor {
	public static void main(String args[]) {
		GenericStack<String> stack1 = new GenericStack<>();
		stack1.push("London");
		stack1.push("Paris");
		stack1.push("Berlin");
		
	    while (!stack1.isEmpty()){
	        System.out.print(stack1.pop() + " ");  
	    }  
	    System.out.println();
	     GenericStack<Aggregates> stack = new GenericStack<Aggregates>();

	     stack.push(new Aggregates("Gravel"));
	     stack.push(new Aggregates("Sand"));
	     while (!stack.isEmpty()) {


	     System.out.print(stack.pop().getName() + " ");

	     }
	    }	
	   }	