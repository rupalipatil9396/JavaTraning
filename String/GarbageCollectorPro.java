package StringAss;

/*WAP to demonstrate how garbage collector work when any memory is not referenced by string 
object.*/

public class GarbageCollectorPro {
	 public void finalize() {
	        System.out.println("Garbage Collection");
	    }
	public static void main(String[] args) {
		GarbageCollectorPro gc=new  GarbageCollectorPro();
		GarbageCollectorPro gc1=new  GarbageCollectorPro();
	   // gc=null; unrefrence
	   // gc1=null; reference
	    
	    gc1=gc;
	    System.gc();// it is an inbuild method which is work internally by JVM
	}

}
