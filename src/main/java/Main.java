import java.time.LocalDate;
import java.util.Collection;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        DataSorter dataSorter = new DataSorter();

        // Test 1
        List<LocalDate> unsortedDates = List.of(
                LocalDate.of(2004, 7, 1), // 1 July 2004
                LocalDate.of(2005, 1, 2), // 2 January 2005
                LocalDate.of(2007, 1, 1), // 1 January 2007
                LocalDate.of(2032, 5, 3) // 3 May 2032
        );
        Collection<LocalDate> sortedDates = dataSorter.sortDates(unsortedDates);
        System.out.println("Unsorted Dates: " + unsortedDates);
        System.out.println("Sorted Dates:   " + sortedDates + "\n");

        // Test 2
        List<LocalDate> unsortedDates1 = List.of(
                LocalDate.of(2004, 7, 1),  // 1 July 2004
                LocalDate.of(2005, 1, 2),  // 2 January 2005
                LocalDate.of(2007, 1, 1),  // 1 January 2007
                LocalDate.of(2032, 5, 3),  // 3 May 2032
                LocalDate.of(2020, 2, 29), // 29 February 2020
                LocalDate.of(2019, 4, 15), // 15 April 2019
                LocalDate.of(2018, 6, 10), // 10 June 2018
                LocalDate.of(2021, 3, 3),  // 3 March 2021
                LocalDate.of(2022, 8, 8),  // 8 August 2022
                LocalDate.of(2023, 9, 9),  // 9 September 2023
                LocalDate.of(2024, 10, 10),// 10 October 2024
                LocalDate.of(2025, 11, 11),// 11 November 2025
                LocalDate.of(2026, 12, 12),// 12 December 2026
                LocalDate.of(2027, 7, 7),  // 7 July 2027
                LocalDate.of(2028, 5, 5),  // 5 May 2028
                LocalDate.of(2029, 8, 8)   // 8 August 2029
        );
        Collection<LocalDate> sortedDates1 = dataSorter.sortDates(unsortedDates1);
        System.out.println("Unsorted Dates: " + unsortedDates1);
        System.out.println("Sorted Dates:   " + sortedDates1);
    }
}