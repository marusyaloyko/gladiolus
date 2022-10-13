package practice2;

import java.util.Arrays;

public class VosimoeZadanie {
    public static void main(String[] args) {
        SomeSorter vz = new SomeSorter();

        System.out.println(Arrays.toString(vz.reverse()));
    }
}
class SomeSorter {
    public String[] a = {
        "a", "b", "c", "d", "e", "f", "g"
    };
    
    public String[] get() {
        return a;
    }

    public String[] reverse() {
        int n = a.length;
        String temp;

        for (int i=0; i < n / 2; i ++) {
            temp = a[n - i - 1];
            a[n - i - 1] = a[i];
            a[i] = temp;
        }

        return a;
    }
}