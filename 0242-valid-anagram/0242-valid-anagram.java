class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length())  return false;
        HashMap<Character,Integer> m=new HashMap<>();
        for(char c:t.toCharArray()){
            m.put(c,m.getOrDefault(c,0)+1);
        }
        for(char c:s.toCharArray()){
            if(!m.containsKey(c))   return false;
            m.put(c,m.get(c)-1);
            if(m.get(c)==0)	 m.remove(c);

        }
        return m.isEmpty();
    }
}