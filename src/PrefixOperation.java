import java.util.ArrayList;

import com.sun.tools.javac.util.List;

public class PrefixOperation {
	char operandStack[], operatorStack[];
	String word = "";
	
	void initWord(String word) {
		this.word = word;
	}
	
	void isOperator(char letter) {
		char[] operands = new char[]{'+', '-', '$', '*', '/', '(', ')'};
		List<Character> intList = new ArrayList<>(Arrays.asList(char operands));
	}
	
	
	public static void main(String[] args) {
		PrefixOperation PF = new PrefixOperation();
		String word = "HEY";
		PF.initWord(word);
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if c
			
		}
	}

}
