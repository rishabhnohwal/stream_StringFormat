package com.stackroute.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StringFormat {

    //write logic to find the format for given list and return result
    public String findStringFormat(List<Integer> input) {
        if (input==null||input.isEmpty()){
            return "Give proper input not empty list";
        }

        if (input.stream().anyMatch(a->a<0)){
            return "Give proper input not negative values";
        }

       List<String> list = input.stream().map(a->a%2!=0?",odd"+a:",even"+a).collect(Collectors.toList());
        String ans="";
        for (String ele:list){
            ans+=ele;
        }
        return ans.substring(1);

    }
}
