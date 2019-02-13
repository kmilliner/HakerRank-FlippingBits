package twostrings;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TwoStrings {
	
	//https://www.hackerrank.com/challenges/two-strings/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
	public static void main(String[] args) {
		
	}
	
    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
    	String[] wordOne = s1.split("");    	
    	List<String> a = Arrays.asList(wordOne);
    	Set<String> temp = new HashSet<String>(a);
    	
    	for (String string : temp) {
			if(s2.contains(string)) {
				return "YES";
			}
		}
    	return "NO";
    }
	
}
