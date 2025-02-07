package Recursion;

import java.util.ArrayList;
import java.util.List;
public class subsequenceString {

    static List<String> generateAllSubSeq(String str)
    {   //base Case
        if(str.length() ==0){
            List<String> list = new ArrayList<>();
            list.add(" ");
            return list;
        }

        //Recursive Call (Small Problem)
        List<String> newList = new ArrayList<>();
        List<String> oldList = generateAllSubSeq(str.substring(1));
        for(int i=0;i<oldList.size();i++){
            newList.add(oldList.get(i)); //Not included
            newList.add(str.charAt(0)+oldList.get(i));
        }
        return newList;
    }

    public static void main(String[] args) {
        List<String> result = generateAllSubSeq("amit");
        System.out.println(result);
    }

}
