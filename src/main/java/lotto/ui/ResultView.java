package lotto.ui;

import java.util.List;

import lotto.domain.BenefitResult;
import lotto.domain.Lotto;
import lotto.domain.PurchasedLottos;
import lotto.domain.Rank;
import lotto.domain.RankSituation;

public class ResultView {

	public static void printPurchasedCount(int purchaseCount) {
		System.out.printf("%d개를 구매했습니다.%n", purchaseCount);
	}

	public static void printCurrentSituation(PurchasedLottos purchasedLottos) {
		for (Lotto lotto : purchasedLottos.getLottos()) {
			System.out.println(lotto.getLottoNumbers());
		}
	}

	public static void printRankSituations(List<RankSituation> rankSituations) {
		System.out.println("당첨 통계");
		System.out.println("---------");
		for (RankSituation rankSituation : rankSituations) {
			Rank rank = rankSituation.getRank();
			int matchCount = rank.getMatchCount();
			long winningMoney = rank.getWinningMoney();
			int count = rankSituation.getCount();
			System.out.printf("%d개 일치%s(%d원)- %d개%n", matchCount, rank == Rank.SECOND ? ", 보너스 볼 일치" : " ", winningMoney, count);
		}
	}

	public static void printTotalProfitRate(BenefitResult benefitResult) {
		System.out.printf("총 수익률은 %.2f입니다.(기준이 1이기 때문에 결과적으로 %s라는 의미임)%n", benefitResult.getTotalProfitRate(), benefitResult.isBenefit() ? "이익이" : "손해");
	}
}
