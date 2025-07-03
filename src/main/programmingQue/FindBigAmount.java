package main.programmingQue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Logic here is use Collections sort method, it will do ascending sort and then use getLast method of a list to
// get a big amount
public class FindBigAmount {
    public static void main(String[] args) {

        List<Integer> bigCountLst = new ArrayList<>();
        bigCountLst.add(100);
        bigCountLst.add(322);
        bigCountLst.add(123);
        bigCountLst.add(2134);
        bigCountLst.add(532);
        bigCountLst.add(132);

        Collections.sort(bigCountLst);
        System.out.println(bigCountLst);
        System.out.println(bigCountLst.getLast());
    }
}
