package hr.dataStructure.linkeList.getNodeValue;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class MyListTest {
    @Test
    void getNodeExample() {
        MyList ml = new MyList(new int[]{0, 1, 2, 3});
        int expected = 2;
        int actual = ml.getNode(2);

        assertThat(actual, is(expected));
    }
}