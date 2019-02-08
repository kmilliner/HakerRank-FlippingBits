package elections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Election {

	//["jeo", "mary", "mary", "joe"]
	
	public static void main(String arg[]) {
		
		String[] votes = new String[] {"joe", "mary", "mary", "joe", "juan", "juan","zoe", "zoe"};
		String winner = winner(votes);
		System.out.println(winner);
		
	}
	
	public static String winner(String[] votes) {
		
		//1.Count the votes
		Map<String, Integer> count = countVotes(votes);
		
		/*for(Map.Entry<String, Integer> entry: count.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " value: " + entry.getValue());
		}*/
		
		//2. Order votes 
		List<Map.Entry<String, Integer>>  listOfVotes = sortVotes(count.entrySet());
		
		/*for(Map.Entry<String, Integer> entry: listOfVotes) {
			System.out.println("Key: " + entry.getKey() + " value: " + entry.getValue());
		}*/
		
		//3. check Same Number Of Votes
		List<String> result = checkSameNumberOfVotes(listOfVotes);
		
		//4. winner
		Collections.sort(result);
		return (result.get(result.size()-1));

	}
	
	public static Map<String, Integer> countVotes(String votes[]) {
		//1.Count the votes
		Map<String, Integer> count = new HashMap<String, Integer>();
				
		for (int i = 0; i < votes.length; i++) {
			if(count.containsKey(votes[i])) {
				int numberOfVotes = count.get(votes[i]);
				count.put(votes[i], ++numberOfVotes);
			}else{
				count.put(votes[i], 1);
			}
		}
		return count;
	}
	
	public static List<Map.Entry<String, Integer>> sortVotes(Set<Map.Entry<String, Integer>> votes) {
		//2. Order votes 
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String,Integer>>(votes);

		Collections.sort(list, 
			new Comparator<Map.Entry<String, Integer>>() {
				public int compare(Map.Entry<String, Integer> candidate1, Map.Entry<String, Integer> candidate2) {
					return(candidate2.getValue()).compareTo(candidate1.getValue());
				}
			}
		);
		return list;
	}
	
	public static List<String> checkSameNumberOfVotes(List<Map.Entry<String, Integer>> votes) {
		List<String> result = new ArrayList<String>();
		int maxVotes = 0;
		
		for (Map.Entry<String, Integer> candidate : votes) {
			if( maxVotes <= candidate.getValue()) {
				maxVotes = candidate.getValue();
				result.add(candidate.getKey());
			}else{
				return result;
			}
		}
		return result;
	}
}
