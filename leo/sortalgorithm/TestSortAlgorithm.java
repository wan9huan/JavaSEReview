package leo.sortalgorithm;

import org.junit.Test;

public class TestSortAlgorithm {

    int[] orignArray = {1,656,2,48,561,77441,5321,2341,6,47,8345,834,347,5,41,13,53,3,54,465465,47,378,324687,3268,327,6374};


    @Test
    public void initObject(){

        Sort sortAlgorithm = new Sort(orignArray);
    }
    @Test
    public void testBubbleSort(){

        Sort sortAlgorithm = new Sort(orignArray);

        System.out.println(sortAlgorithm);

        sortAlgorithm.bubbleSort();

        System.out.println(sortAlgorithm);

    }

    @Test
    public void testSelectSort(){

        Sort sortAlgorithm = new Sort(orignArray);

        System.out.println(sortAlgorithm);

        sortAlgorithm.selectSort();

        System.out.println(sortAlgorithm);
    }

    @Test
    public void testFastSort(){

        Sort sortAlgorithm = new Sort(orignArray);

        System.out.println(sortAlgorithm);

       sortAlgorithm.fastSort(sortAlgorithm.getOrignArray(),0,sortAlgorithm.getOrignArray().length);

        System.out.println(sortAlgorithm);
    }
}
