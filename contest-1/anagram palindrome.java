class Sol
{
    int isPossible (String s)
    {
       HashMap<Character,Integer> Map= new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Map.put(c, Map.getOrDefault(c, 0) + 1);
        }
       int count=0;
       for(int i=0;i<s.length();i++){
           int c = Map.get(s.charAt(i));
           if(c%2!=0){
               count++;
           }
       }
    return count<=1?1:0;
    }
}