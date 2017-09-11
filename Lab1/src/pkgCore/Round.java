package pkgCore;

import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();

	public Round() {

		Roll r = new Roll();
		ComeOutScore = r.getScore();
		rolls.add(r);

		int LoopCounter = 0;
		while (LoopCounter < 1) {
			if (ComeOutScore == 7 || ComeOutScore == 11) {
				eGameResult = pkgCore.eGameResult.NATURAL;
				break;
			} else if (ComeOutScore == 2 || ComeOutScore == 3 || ComeOutScore == 12) {
				eGameResult = pkgCore.eGameResult.CRAPS;
				break;
			} else {
				Roll NewRoll = new Roll();
				rolls.add(NewRoll);
				if (NewRoll.getScore() == ComeOutScore) {
					eGameResult = pkgCore.eGameResult.POINT;
					break;
				} else if (NewRoll.getScore() == 7) {
					eGameResult = pkgCore.eGameResult.SEVEN_OUT;
					break;
				}
			}
		}
		for (Roll roll : rolls) {
			System.out.println(roll.getScore());

		}
	}

	public int RollCount() {
		// Return the roll count
		return rolls.size();
	}

}
