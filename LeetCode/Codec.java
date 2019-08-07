/*
    535. Encode and Decode TinyURL
    https://leetcode.com/problems/encode-and-decode-tinyurl/submissions/
 */

public class Codec {
    HashMap<Integer, String> map = new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int hash = longUrl.hashCode();
        map.put(hash, longUrl);
        return Integer.toString(hash);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int hash = Integer.valueOf(shortUrl);
        return map.get(hash);
        
    }
}

/*
    Runtime: 2 ms, faster than 90.07% of Java online submissions for Encode and Decode TinyURL.
    Memory Usage: 36.4 MB, less than 100.00% of Java online submissions for Encode and Decode TinyURL.
 */
