# Array Manipulation

Beginner-friendly Java console programs for finding the smallest and largest elements in an integer array and reversing an array.

## Programs

- `ArrayMinMax.java` — reads integers and prints the smallest and largest values.
- `ArrayReverse.java` — reads integers and prints the array in reverse order.

## Requirements

- Java Development Kit (JDK) 8 or later

## Compile and run

Open a terminal in the project root.

### Find minimum and maximum

```bash
javac -d out src/com/internship/array/ArrayMinMax.java
java -cp out com.internship.array.ArrayMinMax
```

### Reverse an array

```bash
javac -d out src/com/internship/array/ArrayReverse.java
java -cp out com.internship.array.ArrayReverse
```

## Example

For input `5` followed by `12 4 9 -2 7`, the minimum and maximum program prints:

```text
Smallest element: -2
Largest element: 12
```

The reverse program prints:

```text
Reversed array: 7 -2 9 4 12
```
