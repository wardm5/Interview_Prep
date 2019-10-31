    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        java.util.List<String> sub = new java.util.ArrayList<String>();  
        for(int i=0; i<=(s.length()-k); i++ ){
            sub.add(s.substring(i, k+i));
        }
        java.util.Collections.sort(sub);
        smallest = sub.get(0);
        largest = sub.get(sub.size()-1);
        return smallest + "\n" + largest;
    }
