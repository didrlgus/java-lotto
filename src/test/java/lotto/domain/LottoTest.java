package lotto.domain;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LottoTest {

	@DisplayName("당첨넘버와 선택한 로또 넘버 간 일치하는 넘버가 몇개인지 계산한다.")
	@Test
	void test1() {
		Lotto lotto = new Lotto(Arrays.asList(
			new LottoNumber(1), new LottoNumber(3), new LottoNumber(5),
			new LottoNumber(14), new LottoNumber(22), new LottoNumber(45)
		));
		assertThat(lotto.calculateScore(new WinNumbers("1, 2, 3, 4, 5, 6"))).isEqualTo(new Score(3));
	}

	@DisplayName("로또 넘버에 보너스 넘버가 있는 경우.")
	@Test
	void test2() {
		Lotto lotto = new Lotto(Arrays.asList(
			new LottoNumber(1), new LottoNumber(3), new LottoNumber(5),
			new LottoNumber(14), new LottoNumber(22), new LottoNumber(45)
		));
		Score score = lotto.calculateScore(new WinNumbers("1, 3, 5, 22, 45, 40"), new LottoNumber(14));
		assertThat(score).isEqualTo(new Score(5, 1));
	}

	@DisplayName("로또 넘버에 보너스 넘버가 없는 경우.")
	@Test
	void test3() {
		Lotto lotto = new Lotto(Arrays.asList(
			new LottoNumber(1), new LottoNumber(3), new LottoNumber(5),
			new LottoNumber(14), new LottoNumber(22), new LottoNumber(45)
		));
		Score score = lotto.calculateScore(new WinNumbers("1, 3, 5, 22, 45, 40"), new LottoNumber(23));
		assertThat(score).isEqualTo(new Score(5, 0));
	}
}
