package zigzagPattern;

import java.util.Scanner;

public class ZigZagPatternLogic1 {
    public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	String word=scanner.next();
	int numRows=scanner.nextInt();
	System.out.println(generateZigZagPattern(word,numRows));
    }

    public static String generateZigZagPattern(String word, int numRows) {
        if (numRows == 1 || word.length() <= numRows) return word;

        StringBuilder[] rowAdder = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) rowAdder[i] = new StringBuilder();

        int currentRow = 0;
        boolean goingDown = false;

        for (char c : word.toCharArray()) {
            rowAdder[currentRow].append(c);

            if (currentRow == 0 || currentRow == numRows - 1)
                goingDown = !goingDown;

            currentRow += goingDown ? 1 : -1;
        }

        StringBuilder answer = new StringBuilder();
        for (StringBuilder row : rowAdder) answer.append(row);
        return answer.toString();
    }
	
}



























