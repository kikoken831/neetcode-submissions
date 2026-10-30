class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(var s : strs){
            int len = s.length();
            sb.append(len);
            sb.append("#");
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        //keep going until #
        //create loop with numerical value
        //start from after # and convert to a string
        //add to list
        //repeat
        List<String> out = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){

            StringBuilder sLen = new StringBuilder();
            while(str.charAt(i) != '#'){
                sLen.append(str.charAt(i++));
            }
            i++;// add one to skip the #
            int len = Integer.parseInt(sLen.toString());
            StringBuilder sWord = new StringBuilder();
            for(int j = 0; j < len; j++){
                sWord.append(str.charAt(i++));
            }
            out.add(sWord.toString());
            i--;
            
        }


        return out;
    }
}
