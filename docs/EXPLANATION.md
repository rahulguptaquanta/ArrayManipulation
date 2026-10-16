# Explanation

## Finding the smallest and largest elements

The program reads the array size and then reads each integer. It initializes both `smallest` and `largest` to the first element, then visits the remaining elements once. Each value is compared with the current minimum and maximum. This takes O(n) time and O(n) space for the input array.

## Reversing an array

The reverse program uses two indexes: `left` starts at the first element and `right` at the last. It swaps those values and moves both indexes toward the center until they meet. This takes O(n) time and uses O(1) extra space beyond the array.
