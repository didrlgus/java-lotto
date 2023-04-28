package lotto.domain;

import java.util.Arrays;

public enum PrizeType {

	THREE(3, 5_000),
	FOUR(4, 50_000),
	FIVE(5, 1_500_000),
	SIX(6, 2_000_000_000);

	public final Score score;
	public final PrizeMoney prizeMoney;

	PrizeType(int score, long prizeMoney) {
		this.score = new Score(score);
		this.prizeMoney = new PrizeMoney(prizeMoney);
	}

	public static PrizeType of(Score score) {
		return Arrays.stream(values())
			.filter(e -> e.score.equals(score))
			.findAny()
			.orElseThrow(() -> new IllegalArgumentException("존재하지 않는 상금 타입입니다."));
	}
}
