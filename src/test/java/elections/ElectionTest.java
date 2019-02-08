package elections;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import elections.Election;

import org.junit.jupiter.api.Test;

class ElectionTest {
		
	@Test
	void countVotes_ok() {
		String[] votes = new String[] {"joe", "mary", "mary", "joe", "juan", "juan","zoe", "zoe", "zoe"};
		
		Map<String, Integer> goodResult = new HashMap<String, Integer>();
		goodResult.put("joe", 2);
		goodResult.put("mary", 2);
		goodResult.put("juan", 2);
		goodResult.put("zoe", 3);
		
		assertEquals(goodResult, Election.countVotes(votes));	
	}
	
	@Test
	void winner_ok(){
		String[] votes = new String[] {"joe", "mary", "mary", "joe", "juan", "juan","zoe", "zoe", "zoe"};
		assertEquals("zoe", Election.winner(votes));
	} 
	
	@Test
	void winner_withSameNumberOfVotes_ok(){
		String[] votes = new String[] {"joe", "mary", "mary", "joe", "juan", "juan","zoe"};
		assertEquals("mary", Election.winner(votes));
	} 
	
	
	void sortVotes_ok() {
		
	}
	
	void checkSameNumberOfVotes_ok() {
		
	}

}
