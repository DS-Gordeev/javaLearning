package Lambdas.ex2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("sdsdfsd");
        al.add("sdsdfsd64563");
        al.add("sdsd");
        al.add("sdsd456fsd");
        al.add("sds");

        al.removeIf(s -> s.length() > 2);

        System.out.println(al);
    }


}





