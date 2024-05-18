import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Marking will be based upon producing a readable, well engineered solution rather than factors
 * such as speed of processing or other performance-based optimizations, which are less
 * important.
 * <p>
 * Implement in single class. Don't chane constructor and signature method.
 */

public class DataSorter {

    /**
     * The implementation of this method should sort dates.
     * The output should be in the following order:
     * Dates with an 'r' in the month,
     * sorted ascending (first to last),
     * then dates without an 'r' in the month,
     * sorted descending (last to first).
     * For example, October dates would come before May dates,
     * because October has an 'r' in it.
     * thus: (2004-07-01, 2005-01-02, 2007-01-01, 2032-05-03)
     * would sort to
     * (2005-01-02, 2007-01-01, 2032-05-03, 2004-07-01)
     *
     * @param unsortedDates - an unsorted list of dates
     * @return the collection of dates now sorted as per the spec
     */

    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {

        // EnumSet of month names that contain the letter 'R'
        EnumSet<Month> monthsWithR = EnumSet.of(
                Month.JANUARY, Month.FEBRUARY, Month.MARCH, Month.APRIL,
                Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER, Month.DECEMBER
        );

        // Stream to filter, sort and collect dates with 'R' in ascending order
        List<LocalDate> datesWithR = unsortedDates.stream()
                .filter(date -> monthsWithR.contains(date.getMonth()))
                .sorted()
                .collect(Collectors.toList());

        // Stream to filter, sort and collect dates without 'R' in descending order
        List<LocalDate> datesWithoutR = unsortedDates.stream()
                .filter(date -> !monthsWithR.contains(date.getMonth()))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        // Combine both lists: dates with 'R' first, followed by dates without 'R'
        List<LocalDate> sortedDates = new ArrayList<>(datesWithR);
        sortedDates.addAll(datesWithoutR);

        // Return sorted list
        return sortedDates;
    }
}