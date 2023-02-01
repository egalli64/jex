package org.exercism.track;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CarsAssembleTest {
    private final CarsAssemble instance = new CarsAssemble();

    @Test
    void productionRatePerHour6() {
        Assertions.assertThat(instance.productionRatePerHour(6)).isEqualTo(1193.4);
    }

    @Test
    void workingItemsPerMinute() {
        Assertions.assertThat(instance.workingItemsPerMinute(6)).isEqualTo(19);
    }
}