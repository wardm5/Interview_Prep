//-------------------------------------------------------------------------------
//    Misha Ward
//-------------------------------------------------------------------------------

/*-------------------------------------------------------------------------------

Problem:
TinyURL is a URL shortening service where you enter a URL such as
https://leetcode.com/problems/design-tinyurl and it returns a short URL such
as http://tinyurl.com/4e9iAk.

Design the encode and decode methods for the TinyURL service. There is no
restriction on how your encode/decode algorithm should work. You just need to
ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded
to the original URL.

-------------------------------------------------------------------------------*/

//-------------------------------------------------------------------------------
//    Approach
//-------------------------------------------------------------------------------

/*
    1)  create constructor that creates hashmap
    2) when encoding, create StringBuilder and append the tiny url to it
    3) then append the hashcode of the longUrl
    4) put the long url as the key then the short url as the value into the map
    5) put the short url as the key and long as the value into the map
    6) for the decode, just look up the map for the key of the short url and return the value
*/

//-------------------------------------------------------------------------------
//    Soluton
//-------------------------------------------------------------------------------

public class Codec {
    private HashMap<String, String> map;
    public Codec() {
        this.map = new HashMap<>();
    }

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        StringBuilder build = new StringBuilder();
        build.append("http://tinyurl.com/").append(longUrl.hashCode());
        map.put(longUrl, build.toString());
        map.put(build.toString(), longUrl);
        return build.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));

/*
    Runtime: 2 ms, faster than 92.64% of Java online submissions for Encode and Decode TinyURL.
    Memory Usage: 39.1 MB, less than 6.00% of Java online submissions for Encode and Decode TinyURL.
*/
