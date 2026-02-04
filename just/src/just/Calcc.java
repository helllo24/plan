package just;

@FunctionalInterface
interface greeting {
	 void say(String name);
	
}

@FunctionalInterface

interface sadding {
	void bye(String last);
}







public class Calcc {

	public static void main(String[] args) {

		greeting ge = (name) -> System.out.println(name);
		
		ge.say("java");
		
		sadding s = (last) -> System.out.println(last);
		s.bye("python");
		
		
		
	}
	
	
	
}
