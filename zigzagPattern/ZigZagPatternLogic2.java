package zigzagPattern;

import java.util.Scanner;

public class ZigZagPatternLogic2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int numRows=sc.nextInt();
		System.out.println(generateZigZagPattern(s,numRows));
	}
public static String generateZigZagPattern(String s, int numRows) {
    	
    	char [][] arr=new char[numRows][s.length()];
    	boolean isGoDown=true;
    	StringBuilder sb=new StringBuilder();
    	int m=0,i=0,j=0;
    	while(m<s.length()) {
    		if(isGoDown) {
    			arr[i++][j]=s.charAt(m++);
    			if(i==numRows) {
    				isGoDown=false;
    				i=numRows-2;
    				j++;
    			}
    		}else {
    			arr[i--][j++]=s.charAt(m++);
    			if(i==-1) {
    				isGoDown=true;
    				j--;
    				i=1;
    			}		
    		}
    	}
    	for(int i1=0;i1<arr.length;i1++) {
    		for(int j1=0;j1<arr[i1].length;j1++) {
    			if(Character.isAlphabetic(arr[i1][j1])) sb.append(arr[i1][j1]);
    		}
    	}
		return sb.toString();
    }
}


//zcoioooprtohran