package zigzagPattern;

import java.util.Scanner;

public class ZigZagPatternLogic2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String word=scanner.next();
		int numRows=scanner.nextInt();
		System.out.println(generateZigZagPattern(word,numRows));
	}
	public static String generateZigZagPattern(String word, int numRows) {
    		char [][] array=new char[numRows][word.length()];
    		boolean isGoDown=true;
    		StringBuilder answer=new StringBuilder();
    		int m=0,i=0,j=0;
    		while(m<word.length()) {
    			if(isGoDown) {
    				array[i++][j]=word.charAt(m++);
    				if(i==numRows) {
    					isGoDown=false;
    					i=numRows-2;
    					j++;
    				}
    			}else {
    				array[i--][j++]=word.charAt(m++);
    				if(i==-1) {
    					isGoDown=true;
    					j--;
    					i=1;
    				}		
    			}
    		}
    		for(int i1=0;i1<array.length;i1++) {
    			for(int j1=0;j1<array[i1].length;j1++) {
    				if(Character.isAlphabetic(array[i1][j1])) answer.append(array[i1][j1]);
    			}
    		}
		return answer.toString();
    	}
}


//zcoioooprtohran
