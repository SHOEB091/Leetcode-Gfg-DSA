package Recursion;
import java.util.*;
public class LetterCombinationOfPhone {

    String []keys ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits){
        if(digits.length()==0)
        {
            return new ArrayList<>();
        }else{
            return helper(digits);
        }
    }
    public List<String> helper(String digits) {

        //base case
        if(digits.length()==0)
        {
            List<String> list = new ArrayList<>();
            list.add("");
            return list;
        }

        char firstDigit = digits.charAt(0);//'2'
        int index = firstDigit - '0';
        String str = keys[index];//eg 'abc'
        List<String> newList = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            List<String> oldList= helper(digits.substring(1));
            for(int j=0;j<oldList.size();j++){
                newList.add(str.charAt(i)+oldList.get(j));
            }
        }
        return newList;
    }

}
