//
///*
//This is a simple Java program.
//Call this file "Example.java".
//*/
//class Example implements Runnable{
//// Your program begins with a call to main().
//	Thread t ;
//	
//	Example() {
//		// Create a new, Second Thread
//		t = new Thread(this, "Demo Thread");
//		System.out.println("Second Thread: " + t);
//		t.start();
//	}
//
//@Override
//public void run() {
//	// TODO Auto-generated method stub
//	try {
//		for(int i = 5; i > 0; i--){
//		  System.out.println("Second Thread: " + i);
//		  Thread.sleep(500);
//		}
//	}catch (InterruptedException e){
//		System.out.println("Child interrupted. " + e);
//	}
//	System.out.println("Exiting child Thread");
//}
//}
//
