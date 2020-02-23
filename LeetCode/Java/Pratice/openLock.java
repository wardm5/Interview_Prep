// https://leetcode.com/explore/learn/card/queue-stack/231/practical-application-queue/1375/

class Solution {
        public int openLock(String[] deadends, String target) {
        HashMap<Character, Character> incre = new HashMap<>();
        HashMap<Character, Character> decre = new HashMap<>();
        setUpIncre(incre);
        setUpDecre(decre);

        Queue<String> q = new LinkedList<>();
        HashSet<String> visited = new HashSet<>();
        for (int i = 0; i < deadends.length; i++)
            visited.add(deadends[i]);
        if (visited.contains("0000"))
            return -1;

        int count = 0;
        q.add("0000");
        visited.add("0000");
        int size = q.size();
        while (!q.isEmpty()) {
            for (int i = 0; i < size; i++) {
                String curr = q.remove();
                if (curr.equals(target))
                    return count;
                combo(curr, q, visited, incre, decre);
            }
            count++;
            size = q.size();
        }
        return -1;
    }
    public void combo(String curr, Queue<String> q, HashSet<String> visited, HashMap<Character, Character> incre, HashMap<Character, Character> decre) {
        for (int i = 0; i < curr.length(); i++) {
            StringBuilder build = new StringBuilder(curr);
            build.setCharAt(i, incre.get(curr.charAt(i)));
            String up = build.toString();
            if (!visited.contains(up)) {
                q.add(up);
                visited.add(up);
            }

            build = new StringBuilder(curr);
            build.setCharAt(i, decre.get(curr.charAt(i)));
            String down = build.toString();
            if (!visited.contains(down)) {
                q.add(down);
                visited.add(down);
            }
        }
    }
    public void setUpIncre(HashMap<Character, Character> map) {
        map.put('0', '1');
        map.put('1', '2');
        map.put('2', '3');
        map.put('3', '4');
        map.put('4', '5');
        map.put('5', '6');
        map.put('6', '7');
        map.put('7', '8');
        map.put('8', '9');
        map.put('9', '0');
    }
    public void setUpDecre(HashMap<Character, Character> map) {
        map.put('0', '9');
        map.put('9', '8');
        map.put('8', '7');
        map.put('7', '6');
        map.put('6', '5');
        map.put('5', '4');
        map.put('4', '3');
        map.put('3', '2');
        map.put('2', '1');
        map.put('1', '0');
    }
}

// Runtime: 1 ms    59.04% of all Java submissions
// Memory Usage: 44.5 MB   79% of all Java submissions
