package lotto.domain;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class LottoMachineTest {

	@DisplayName("구매한 만큼의 로또를 생성한다.")
	@Test
	void test1() {
		assertThat(new LottoMachine(14000).purchasedCount()).isEqualTo(14);
	}

	@DisplayName("구매한 만큼의 로또를 생성한다. - 예외 케이스")
	@ValueSource(longs = {800, 1400})
	@ParameterizedTest
	void test2(long purchaseAmount) {
		assertThatIllegalArgumentException().isThrownBy(() -> new LottoMachine(purchaseAmount));
	}

	@DisplayName("상금 현황 목록을 작성한다.")
	@Test
	void test8() {
		List<Lotto> lottos = Arrays.asList(
			new Lotto(0), new Lotto(0),
			new Lotto(3), new Lotto(3),
			new Lotto(6)
		);
		LottoMachine lottoMachine = new LottoMachine(lottos);
		List<RankSituation> rankSituations = lottoMachine.makeRankSituations();

		assertThat(rankSituations).containsExactlyInAnyOrder(
			new RankSituation(Rank.FIFTH, 2), new RankSituation(Rank.FOURTH, 0),
			new RankSituation(Rank.THIRD, 0), new RankSituation(Rank.SECOND, 0),
			new RankSituation(Rank.FIRST, 1)
		);
	}

	@DisplayName("상금 현황 목록을 상금순으로 오름차순 정렬한다.")
	@Test
	void test9() {
		List<RankSituation> rankSituations = Arrays.asList(
			new RankSituation(Rank.FOURTH, 0), new RankSituation(Rank.FIRST, 1),
			new RankSituation(Rank.THIRD, 0), new RankSituation(Rank.FIFTH, 2)
		);
		LottoMachine lottoMachine = new LottoMachine(1000);
		List<RankSituation> sortedRankSituations = lottoMachine.sortInOrderScore(rankSituations);
		assertThat(sortedRankSituations).containsExactly(
			new RankSituation(Rank.FIFTH, 2), new RankSituation(Rank.FOURTH, 0),
			new RankSituation(Rank.THIRD, 0), new RankSituation(Rank.FIRST, 1)
		);
	}
}
