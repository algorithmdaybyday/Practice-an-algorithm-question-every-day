public int[] twoSum(int[] numbers, int target) {
   Map<Integer, Integer> map = new HashMap<>();
   for (int i = 0; i < numbers.length; i++) {
      int x = numbers[i];
      if (map.containsKey(target - x)) {
         return new int[] { map.get(target - x) + 1, i + 1 };
      }
      map.put(x, i);
   }
   throw new IllegalArgumentException("No two sum solution");
}
