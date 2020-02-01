package com.sorting;

public class subSequence {
    public static String[] findSubSequence(String str){


        if(str.length() == 0){
            String[] ans = {""};
            return ans;
        }
        String[] smallAns = findSubSequence(str.substring(1));
        String[] ans = new String[2*smallAns.length];

        for(int i = 0;i<smallAns.length;i++){
            ans[i] = smallAns[i];
        }

        for(int i = 0; i< smallAns.length;i++){
        ans[i+smallAns.length] = str.charAt(0)+smallAns[i];
        }

        return ans;
    }
    public static void main(String[] args) {
        String[] subsequence = findSubSequence("surya");
        for(int i = 0; i<subsequence.length;i++){
            System.out.println(subsequence[i]);
        }
    }
}
