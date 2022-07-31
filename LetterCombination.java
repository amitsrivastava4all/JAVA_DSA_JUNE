class Solution {
    String [] keyPad = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
       
        if(digits.length()==0){
            
                 return  new ArrayList<>();
        }
        return letterCombinations2(digits);
    }
    public List<String> letterCombinations2(String digits) {
        // Each Recursion call create a copy of Local Variables
        // Termination Case
        if(digits.length() ==0){
            ArrayList<String> list = new ArrayList<>();
                list.add("");
            return list;
        }
        
        //digit get first character
        char singleDigit = digits.charAt(0);  // '2'
        
        //convert a char into int (this treat as keypad index)
            int index = singleDigit - '0';
        //lookup the index and get the string
            String letters = keyPad[index];
        // e.g assume we get abc
        // now loop each char and then do the recursion (digits small Hint substring)
        ArrayList<String> finalList = new ArrayList<>();
        for(int i = 0; i<letters.length(); i++){
            char singleChar = letters.charAt(i);
            List<String> tempList = letterCombinations2(digits.substring(1)); 
            // After this line means stack fall
            for(int j = 0; j<tempList.size(); j++){
                    finalList.add(singleChar+ tempList.get(j));
}   
        }
        return finalList;
    }
}
