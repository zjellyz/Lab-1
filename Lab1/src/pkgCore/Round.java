package pkgCore;

import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();

	public Round() {

		Roll Rnd = new Roll();
		ComeOutScore = Rnd.getScore();
		rolls.add(Rnd);

		int LoopCounter = 0;
		while (LoopCounter < 1) {
			if (ComeOutScore == 7 || ComeOutScore == 11) {
				eGameResult = pkgCore.eGameResult.NATURAL;
				System.out.println(eGameResult);
				break;
			} else if (ComeOutScore == 2 || ComeOutScore == 3 || ComeOutScore == 12) {
				eGameResult = pkgCore.eGameResult.CRAPS;
				System.out.println(eGameResult);
				break;
			} else {
				Roll NewRoll = new Roll();
				rolls.add(NewRoll);
				if (NewRoll.getScore() == ComeOutScore) {
					eGameResult = pkgCore.eGameResult.POINT;
					System.out.println(eGameResult);
					break;
				} else if (NewRoll.getScore() == 7) {
					eGameResult = pkgCore.eGameResult.SEVEN_OUT;
					System.out.println(eGameResult);
					break;
				}
			}
		}
		for (Roll r : rolls) {
			System.out.println(r.getScore());

		}
	}

	public int RollCount() {
		// Return the roll count
		return rolls.size();
	}

}
