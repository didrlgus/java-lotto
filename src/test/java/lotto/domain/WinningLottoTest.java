package lotto.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WinningLottoTest {

	@DisplayName("당첨 번호 목록과 보너스 번호 예외 케이스 - 중복")
	@Test
	void test1() {
		WinningLotto winningLotto = new WinningLotto("1, 2, 3, 4, 5, 6", LottoNumber.of(1));
		PurchasedLottos purchasedLottos = new PurchasedLottos();
		assertThatIllegalArgumentException().isThrownBy(() -> winningLotto.calculateScore(purchasedLottos));
	}
}
