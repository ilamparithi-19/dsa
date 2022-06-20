class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
           Map<String, List<String>> map = new HashMap<>();
        for(String str: strs) {
            char[] tempChar = str.toCharArray();
            Arrays.sort(tempChar);
            if(map.containsKey(String.valueOf(tempChar))) {
                List<String> list = map.get(String.valueOf(tempChar));
                list.add(str);
                map.put(String.valueOf(tempChar), list);
            }
            else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(String.valueOf(tempChar), list);
            }
        }
        List<List<String>> result = new ArrayList<>();
        map.forEach((key, value)-> {
            // if(value.size() > 1) {
                result.add(value);
            // }
        });
        return result;
    }
}