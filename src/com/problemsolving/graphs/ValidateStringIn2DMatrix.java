package com.problemsolving.graphs;

import java.util.Arrays;

public class ValidateStringIn2DMatrix {

    public static void main(String[] args) {
        String[][] strarr = {{"a","b","c","e"},
			     {"s","f","c","s"},
			     {"a","d","e","e"}
			    };
	// "a","b","c","e"
	// "s","f","c","s"
	// "a","d","e","e"
	// abcced -> should print Yes if string matches else print No.......

	String str = "abcced";
	String visited = "-1";
    int ptr;
	String ans = "";

    int k=0;

	for(int i=0; i < strarr.length; i++) {
		for (int j=0; j < strarr[i].length; j++){
			if(strarr[i][j].matches(str.charAt(k)+"") && k<str.length()){
				ans += strarr[i][j];
                System.out.print(strarr[i][j]+" ");
				strarr[i][j] = visited;
//                System.out.println(strarr[i][j]);
				k++;
			}
//			else{
//				break;
//			}
		}
	}

        System.out.println((str.matches(ans) ? "\nYes\n" : "\nNo\n") + ans+"\n" + Arrays.toString(strarr[0]) + Arrays.toString(strarr[1]) + Arrays.toString(strarr[2]));
    }
}
