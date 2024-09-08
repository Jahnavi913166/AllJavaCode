package com.practice.java.Strings;

import java.util.*;

/*
2
3[a]2[bc]
a1[b]1[cc]
Sample Output 1:
aaabcbc
abcc
Explanation for sample 1:
For the first test case, "a" is encoded 3 times and "bc" is encoded 2 times.
After combining these two strings after decoding, we'll get "aaa" + "bcbc" = "aaabcbc".
*/
public class DecodeString {
    //if you have any bracket que think about stack how u will solve that que as stack
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        Stack<String> stringStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        StringBuilder finalStr = new StringBuilder(" ");
        for (int i = 0; i < s.length(); i++) {
            if (']' != s.charAt(i)) {
                if (s.charAt(i) > '0' && s.charAt(i) <= '9') {
                    numStack.push((int) s.charAt(i) - 48);//ascii value
                } else {
                    stringStack.push(String.valueOf(s.charAt(i)));
                }

            } else {
                String str = "";
                while (!stringStack.isEmpty()) {
                    String tempStr = stringStack.pop();
                    if (!tempStr.equals("[")) {
                        str += (tempStr);
                    }
                }
                int occuranceCount = numStack.pop();
                while (occuranceCount > 0) {
                    finalStr = finalStr.append(str);
                    occuranceCount--;
                }
            }
        }
        System.out.println(numStack);
        System.out.println(stringStack);
        System.out.println(finalStr);
    }

}
