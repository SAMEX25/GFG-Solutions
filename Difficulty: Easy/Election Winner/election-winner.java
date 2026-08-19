import java.util.*;

class Solution {
    public ArrayList<String> winner(String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();

        // Count votes
        for (String name : arr) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        String winner = "";
        int maxVotes = 0;

        // Find winner
        for (String name : map.keySet()) {
            int votes = map.get(name);

            if (votes > maxVotes || 
                (votes == maxVotes && name.compareTo(winner) < 0)) {
                winner = name;
                maxVotes = votes;
            }
        }

        ArrayList<String> ans = new ArrayList<>();
        ans.add(winner);
        ans.add(String.valueOf(maxVotes));

        return ans;
    }
}