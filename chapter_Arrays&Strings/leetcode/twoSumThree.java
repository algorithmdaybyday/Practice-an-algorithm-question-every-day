/*
Question:
Design and implement a TwoSum class. It should support the following operation: add and find

add(input) - Add the number input into an internal data structure

find(value) - Find if there exist any pair of numbers which sum is equal to the value

for example; add(1); add(3); add(5); find(4)->true; find(7)->false;
*/

/*
Solution 1:
add-O(n) runtime, find-O(1) runtime, O(n^2) space - store pair sums in hash table

Solution 2:
add-O(n) runtime, find-O(n) runtime, O(n) space - Binary Search + Two Pointers

Solution 3:
store each input into a hash table with the input as key and its count as value. To find if a pair sum exists, just iterate through the hash table in O(n) run time
*/

public class twoSum{
	private Map<Integer, Integer>table = new HashMap<>();

	public void add(int input){
		int count = table.containsKey(input)? table.get(input):0;
		table.put(input, count+1)
	}

	public boolean find(int val){
		for(Map.Entry<Integer, Integer> entry : table.entrySet()){
			int num = entry.getKey();
			int y = val - num;
			if(y == num){
				if(entry.getValue() >= 2) return false;
			}else if(table.cotainsKey(y)){
				return true
			}
		}
		return false;
	}
	
}









