//  13. Roman to Integer
//  For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. 
//  The number twenty seven is written as XXVII, which is XX + V + II.

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = setupMap();
        int value = 0;
        int max = 0;
        for (int i = s.length() -1; i >= 0; i--) {
            int temp = map.get(s.charAt(i));
            if (temp >= max) {
                value += map.get(s.charAt(i));
                max = temp;
            } else {
                value -= map.get(s.charAt(i));
            }
        }
        return value;
    }
    public Map<Character, Integer> setupMap() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        return map;
    }
}
