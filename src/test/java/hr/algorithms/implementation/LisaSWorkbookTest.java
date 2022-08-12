package hr.algorithms.implementation;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LisaSWorkbookTest {
    @Test
    void workbookSample0() {
        int actual = LisaSWorkbook.workbook(5, 3, List.of(4, 2, 6, 1, 10));
        assertThat(actual).isEqualTo(4);
    }
}