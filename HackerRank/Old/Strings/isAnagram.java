    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length() != b.length())
            return false;
        // Complete the function
        java.util.HashMap<Character, Integer> map = new java.util.HashMap<>();
        for (int i = 0; i < a.length(); i++ ) {
            map.put(a.charAt(i), map.getOrDefault(a.charAt(i), 0) + 1);
        }
        for (int i = 0; i < b.length(); i++) {
            if ((map.getOrDefault(b.charAt(i), 0) - 1) < 0)
                return false;
            map.put(b.charAt(i), map.get(b.charAt(i))-1);
        }
        return true;
    }
