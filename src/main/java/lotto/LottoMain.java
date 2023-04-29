package lotto;

import java.util.List;

import lotto.domain.BenefitResult;
import lotto.domain.LottoMachine;
import lotto.domain.PrizeSituation;
import lotto.domain.WinNumbers;
import lotto.ui.InputView;
import lotto.ui.ResultView;

public class LottoMain {

	public static void main(String[] args) {
		long purchaseAmount = InputView.inputPurchaseAmount();
		LottoMachine lottoMachine = new LottoMachine(purchaseAmount);
		ResultView.printPurchasedCount(lottoMachine.purchasedCount());
		ResultView.printCurrentSituation(lottoMachine.getPurchasedLottos());

		lottoMachine.calculateScore(new WinNumbers(InputView.inputWinNumbers()));
		List<PrizeSituation> prizeSituations = lottoMachine.makePrizeSituations();
		ResultView.printPrizeSituations(lottoMachine.sortInOrderScore(prizeSituations));

		BenefitResult benefitResult = new BenefitResult(prizeSituations, purchaseAmount);
		ResultView.printTotalProfitRate(benefitResult);
	}
}
