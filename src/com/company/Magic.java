package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Magic {

    public static int Solution(int[] tab){

        List<Integer> list = Arrays.stream(tab).boxed().collect(Collectors.toList());
        Collections.sort(list);
        int i = 0;
        while( i < list.size()-1){
            if(list.get(i)==list.get(i+1)){
                list.remove(i+1);
                int a = list.remove(i);

                list.add(a+1);
                Collections.sort(list);
                i=0;
            }else{
                i++;
            }
        }

        return list.size();
    }


}
