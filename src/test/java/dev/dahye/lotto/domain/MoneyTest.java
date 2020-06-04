package dev.dahye.lotto.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Money 객체 테스트")
class MoneyTest {
    @ParameterizedTest(name = "금액 = {0}")
    @ValueSource(ints = {100, 101, 222, 33333, 0})
    @DisplayName("돈은 1000원 단위가 아닌 경우 IllegalArgument Exception throw")
    void validate_money(int money) {
        assertThrows(IllegalArgumentException.class, () -> new Money(money),
                "로또는 1000원 단위로 구입할 수 있습니다.");
    }
}