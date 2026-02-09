package practice;

import model.*;

import java.util.function.*;

public class CandidateValidator implements Predicate<Candidate> {
    @Override
    public boolean test(Candidate candidate) {
        String[] periods = candidate.getPeriodsInUkr().split("-");
        int a = Integer.parseInt(periods[0]);
        int b = Integer.parseInt(periods[1]);
        int yearsUkr = b - a;

        return candidate.getAge() > 35 && candidate.isAllowedToVote()
        && yearsUkr >= 10 && "Ukraine".equals(candidate.getNationality());
    }
}
