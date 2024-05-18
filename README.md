# DataSorter

## Overview
The `DataSorter` class provides a method to sort a list of dates according to a specific rule: 

1. Dates with an 'r' in the month name should be sorted in ascending order (earliest to latest).
2. Dates without an 'r' in the month name should be sorted in descending order (latest to earliest).

## Usage
To use the `DataSorter` class, you need to call the `sortDates` method with a list of `LocalDate` objects. The method returns a sorted collection of dates based on the specified rules.
