class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strs.size(); i++) {
            String curr = strs.get(i);
            sb.append(curr.length());
            sb.append(",");
            sb.append(curr);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {
            int comma = str.indexOf(",", i);

            int len = Integer.parseInt(str.substring(i, comma));

            String word = str.substring(comma + 1, comma + 1 + len);
            decoded.add(word);

            i = comma + 1 + len;
        }

        return decoded;
    }
}