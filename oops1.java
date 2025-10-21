package CBCLASS;

import java.util.*;

public class oops1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.err.println(st.size());
        System.out.println(st.capacity());

    }

}
