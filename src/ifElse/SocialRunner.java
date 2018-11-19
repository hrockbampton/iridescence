package ifElse;

import static java.lang.System.*;

public class SocialRunner {
	public static void main(String args[]) {
		Social demo = new Social("456-56-234");
		demo.chopAndAdd();
		System.out.println(demo);
		demo.cleanSum();
		
		demo.setWord("1-1-1");
		demo.chopAndAdd();
		System.out.println(demo);
		demo.cleanSum();

		demo.setWord("102-2-12");
		demo.chopAndAdd();
		System.out.println(demo);
		demo.cleanSum();

		demo.setWord("0-0-0");
		demo.chopAndAdd();
		System.out.println(demo);
		demo.cleanSum();

	}
}