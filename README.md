# Fibonacci Assignment

## Assignment Description

This is an autograding assignment for implementing the Fibonacci sequence in Java. Your task is to complete the implementation of the `fibonacci(int n)` instance method in the `Fibonacci` class that calculates the nth Fibonacci number.

### The Fibonacci Sequence

The Fibonacci sequence is defined as:
- F(0) = 0
- F(1) = 1  
- F(n) = F(n-1) + F(n-2) for n > 1

The sequence starts: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...

### Requirements

Your implementation should:

1. **Calculate correct Fibonacci numbers** for the following test cases:
   - `fibCalculator.fibonacci(0)` should return `0`
   - `fibCalculator.fibonacci(1)` should return `1`
   - `fibCalculator.fibonacci(4)` should return `3`
   - `fibCalculator.fibonacci(7)` should return `13`

2. **Handle edge cases** properly:
   - Work correctly for the base cases (n=0 and n=1)
   - Handle all non-negative integers correctly

3. **Follow the existing code structure**:
   - Implement the instance method `fibonacci(int n)` in the `Fibonacci` class
   - Do not modify the test files or the constructor
   - The `Main` class should demonstrate your implementation

### System Requirements

- Java 8 or higher
- Gradle (wrapper included)

### Dependencies

- JUnit Jupiter 5.6.0 (for testing)

### Project Structure

```text
src/
├── main/java/solution/
│   ├── Fibonacci.java      # Your implementation goes here
│   └── Main.java          # Demonstrates the Fibonacci sequence
└── test/java/solution/
    └── TestFibonacci.java # Test cases (do not modify)
```

### Current Status

- ✅ Project structure is set up
- ✅ Test cases are provided and ready
- ✅ Build configuration (Gradle) is complete
- ❌ **TODO**: Implement the `fibonacci(int n)` method in the `Fibonacci` class

### Running the Tests

To run the automated tests:

```bash
gradle test
```

To build the project:

```bash
gradle build
```

To run the main class (after implementation):

```bash
gradle run
```

### Testing Strategy

The assignment includes:

- **Unit tests** for specific Fibonacci values (F(0), F(1), F(4), F(7))
- **Parameterized tests** covering the sequence from F(0) to F(8)
- **Comprehensive sequence testing** to ensure correctness across multiple values

### Grading

Your solution will be automatically graded based on:

1. Correctness of the Fibonacci calculation
2. All test cases passing
3. Code quality and following Java conventions

### Getting Started

1. Clone this repository
2. Implement the `fibonacci(int n)` instance method in `src/main/java/solution/Fibonacci.java`
3. Run `gradle test` to verify your implementation
4. Ensure all tests pass before submitting

### Implementation Tips

- Start with the base cases (n=0 and n=1)
- Consider using recursion or iteration
- Test your implementation with the provided test cases
- Remember that you need to implement an **instance method**, not a static method

### Sample Usage

Once implemented, your code should work like this:

```java
Fibonacci fibCalculator = new Fibonacci();
System.out.println("F(0) = " + fibCalculator.fibonacci(0)); // Should print: F(0) = 0
System.out.println("F(1) = " + fibCalculator.fibonacci(1)); // Should print: F(1) = 1
System.out.println("F(4) = " + fibCalculator.fibonacci(4)); // Should print: F(4) = 3
System.out.println("F(7) = " + fibCalculator.fibonacci(7)); // Should print: F(7) = 13
```

Good luck!
