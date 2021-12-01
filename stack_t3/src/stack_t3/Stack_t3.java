/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack_t3;

/**
 *
 * @author GHASEM nasiri
 */
public class Stack_t3 {

    public static void main(String[] args) {
        String test = "data structure";
        String arr[] = test.split("");

        String res = "";
        Stack s1 = new Stack(test.length());

        for (String x : arr) {
            for (int i = 0; i < x.length(); i++) {
                s1.push(x.charAt(i));
            }
        }
        while (!s1.isEmpty()) {
            res += s1.pop();
        }

        System.out.println(res);

    }

}
