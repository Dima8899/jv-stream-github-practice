package practice;

import java.util.function.Predicate;
import model.Candidate;

public class CandidateValidator implements Predicate<Candidate> {
    @Override
    public boolean test(Candidate candidate) {
        String[] periods = candidate.getPeriodsInUkr().split("-");
        int a = Integer.parseInt(periods[0]);
        int b = Integer.parseInt(periods[1]);
        int yearsUkr = b - a;

        return candidate.getAge() >= 35 && candidate.isAllowedToVote()
                && yearsUkr >= 10 && "Ukrainian".equals(candidate.getNationality());
    }
}
