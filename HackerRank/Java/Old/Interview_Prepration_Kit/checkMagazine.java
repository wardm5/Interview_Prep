static void checkMagazine(String[] mag, String[] randsom) {
    HashMap<String, Integer> map = new HashMap<>();
    for (int i = 0; i < mag.length; i++) {
        map.put(mag[i], map.getOrDefault(mag[i], 0) + 1);
    }
    for (String ran : randsom) {
        if (!map.containsKey(ran) || map.get(ran) == 0) {
            System.out.println("No");
            return;
        }
        map.put(ran, map.get(ran) - 1);
    }
    System.out.println("Yes");
}
