package pkgCore;

import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();

	public Round() {
		// TODO: Execute Come Out roll, value ComeOutScore
		Roll Rnd = new Roll();
		ComeOutScore = Rnd.getScore();
		rolls.add(Rnd);

		// TODO: Create a loop that will execute a roll until point is made, or
		int LoopCounter = 0;
		while (LoopCounter < 1) {
			if (ComeOutScore == 7 || ComeOutScore == 11) {
				eGameResult gameresult = eGameResult.NATURAL;
				System.out.println(gameresult + "! \n");
				break;
			} else if (ComeOutScore == 2 || ComeOutScore == 3 || ComeOutScore == 12) {
				eGameResult gameresult = eGameResult.CRAPS;
				System.out.println(gameresult + "! \n");
				break;
			} else {
				Roll NewRoll = new Roll();
				rolls.add(NewRoll);
				if (NewRoll.getScore() == ComeOutScore) {
					eGameResult gameresult = eGameResult.POINT;
					System.out.println(gameresult + "! \n");
					break;
				} else if (NewRoll.getScore() == 7) {
					eGameResult gameresult = eGameResult.SEVEN_OUT;
					System.out.println(gameresult + "! \n");
					break;
				}
			}
		}
		for (Roll r : rolls) {
			System.out.println(r.getScore() + "\n");

		}
	}

	public int RollCount() {
		// Return the roll count
		return rolls.size();
	}

}
