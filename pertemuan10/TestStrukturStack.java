package pertemuan10;

public class TestStrukturStack {

	 public static void main(String[] args) {
	        StrukturStack Stack = new StrukturStack(3);


	        
	            //sebelum push
	            System.out.println("\n ##sebelum push");
	            System.out.println("Size :" + Stack.Size());
	            System.out.println("Empty : " + Stack.isEmpty());
	            System.out.println("Full : " + Stack.isFull());
	            System.out.println("TOP : " + Stack.top());

	            //sesudah push
	            System.out.println("\n ##melakukan push 3x");
	            Stack.Push(2);
	            Stack.Push(4);
	            Stack.Push(1);
	            System.out.println("Size :" + Stack.Size());
	            System.out.println("Empty : " + Stack.isEmpty());
	            System.out.println("Full : " + Stack.isFull());
	            System.out.println("TOP : " + Stack.top());
	            Stack.DisplayElement();

	            //sesudah di pop
	            System.out.println( " \n ##sesudah melakukan Pop Satu Kali");
	            Stack.Pop(0);
	            System.out.println("Size :" + Stack.Size());
	            System.out.println("Empty : " + Stack.isEmpty());
	            System.out.println("Full : " + Stack.isFull());
	            System.out.println("TOP : " + Stack.top());
	            Stack.DisplayElement();

	            //sesudah di pop semua
	            System.out.println("\n ##sesudah di pop semua");
	            Stack.Pop(0);
	            Stack.Pop(0);
	            Stack.Pop(0);
	            System.out.println("Size :" + Stack.Size());
	            System.out.println("Empty : " + Stack.isEmpty());
	            System.out.println("Full : " + Stack.isFull());
	            System.out.println("TOP : " + Stack.top());
	            Stack.DisplayElement();
	    }
	
}
