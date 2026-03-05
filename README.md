# Palindrome Checker App
The objective of the Palindrome Checker App is to design and implement a console-based Java application that validates whether a given string is a palindrome under different conditions, while strengthening core programming fundamentals and data structure concepts.

## UC1: Application Entry & Welcome Message

### Goal:
Display a welcome message and app details at startup.

### Actor:
User

### Flow:
1. Program starts.
2. JVM invokes the `main()` method.
3. Application name is displayed.
4. Application version is displayed.
5. Program continues to next use case or exits.

### Key Concepts Used in UC1:

#### 1. Class
Acts as a container for the Palindrome Checker application logic.

#### 2. Main Method
Entry point of the Java application with the signature:  
`public static void main(String[] args)`

#### 3. Static Keyword
Allows the JVM to invoke the `main()` method without creating an object.

#### 4. Console Output
`System.out.println()` is used to display messages on the console.

#### 5. Application Flow Control
Defines the startup behavior before palindrome processing begins.

## UC2: Print a Hardcoded Palindrome Result

### Goal:
Display whether a hardcoded string is a palindrome.

### Actor:
User

### Flow:
1. Program starts.
2. Hardcoded string is checked.
3. Result is printed.
4. Program exits.

### Key Concepts Used in UC2:

#### 1. Class
In Java, even the simplest program must be written inside a class, as a class acts as a container to hold program logic.

#### 2. Main Method
Entry point of the Java application with the signature:  
`public static void main(String[] args)`

#### 3. Static Keyword
Allows the JVM to invoke the `main()` method without creating an object of the class.

#### 4. String
A built-in Java class used to store and manipulate textual data. Here, it stores the word to be checked for a palindrome.

#### 5. String Literal
Text enclosed within double quotes (e.g., `"madam"`), stored in the String constant pool.

#### 6. Conditional Statement (if-else)
Used to evaluate whether the given string satisfies the palindrome condition.

#### 7. Console Output
`System.out.println()` is used to display the result on the console.

### Data Structure:
String

## UC3: Palindrome Check Using String Reverse

### Goal:
Check whether a string is a palindrome by reversing it.

### Flow:
1. Reverse the string using a loop.
2. Compare the original and reversed strings.
3. Display the result.

### Key Concepts Used in UC3:

#### 1. Loop (for loop)
Used to iterate through the characters of the string in reverse order.

#### 2. String Immutability
In Java, String objects are immutable; every modification creates a new String object.

#### 3. String Concatenation (+)
Used to build the reversed string character by character (introduced here to later discuss drawbacks).

#### 4. equals() Method
Used to compare the actual content of two String objects instead of memory references.

### Data Structure:
String

## UC4: Character Array Based Palindrome Check

### Goal:
Convert a string to a character array and compare characters to check for a palindrome.

### Flow:
1. Convert the string to `char[]`.
2. Use a two-pointer approach.
3. Compare start and end characters.

### Key Concepts Used in UC4:

#### 1. Character Array (char[])
A primitive array used to store individual characters of a string for index-based access.

#### 2. Array Indexing
Accessing elements using index positions starting from 0.

#### 3. Two-Pointer Technique
One pointer starts from the beginning and the other from the end, reducing unnecessary comparisons.

#### 4. Time Complexity Awareness
Demonstrates efficient comparison without creating extra objects.

### Data Structure:
`char[]`

## UC5: Stack-Based Palindrome Checker

### Goal:
Use a stack to reverse characters and validate a palindrome.

### Flow:
1. Push characters into the stack.
2. Pop characters and compare with the original string.
3. Print the result.

### Key Concepts Used in UC5:

#### 1. Stack
A linear data structure that follows the Last In First Out (LIFO) principle.

#### 2. Push Operation
Used to insert characters into the stack.

#### 3. Pop Operation
Used to remove characters from the stack in reverse order.

#### 4. Reversal Logic
Stack naturally reverses the order of elements, making it suitable for palindrome validation.

### Data Structure:
Stack

## UC6: Queue + Stack Based Palindrome Check

### Goal:
Demonstrate FIFO vs LIFO behavior using a Queue and a Stack.

### Flow:
1. Enqueue characters into the queue.
2. Push characters onto the stack.
3. Compare dequeue (queue) vs pop (stack) output.

### Key Concepts Used in UC6:

#### 1. Queue
A linear data structure that follows the First In First Out (FIFO) principle.

#### 2. Enqueue & Dequeue Operations
Used to insert and remove elements from the queue.

#### 3. Stack vs Queue
Demonstrates the behavioral difference between LIFO and FIFO structures.

#### 4. Logical Comparison
Matching dequeue (queue) output with pop (stack) output to validate palindrome logic.

### Data Structures:
Queue, Stack

## UC7: Deque-Based Optimized Palindrome Checker

### Goal:
Use a Deque to compare front and rear elements.

### Flow:
1. Insert characters into the deque.  
2. Remove first and last elements.  
3. Compare characters until the deque becomes empty.  

### Key Concepts Used in UC7:

#### 1. Deque (Double Ended Queue)
A data structure that allows insertion and deletion from both front and rear ends.

#### 2. Front and Rear Access
Enables direct comparison of first and last characters.

#### 3. Optimized Data Handling
Eliminates the need for separate reversal data structures.

### Data Structure:
Deque

## UC8: Linked List Based Palindrome Checker

### Goal:
Check whether a string is a palindrome using a singly linked list.

### Flow:
1. Convert the string into a linked list.  
2. Reverse the second half of the list.  
3. Compare both halves.  

### Key Concepts Used in UC8:

#### 1. Singly Linked List
A dynamic data structure where elements are connected using node references.

#### 2. Node Traversal
Sequential access to elements using `next` references.

#### 3. Fast and Slow Pointer Technique
Used to find the middle of the linked list efficiently.

#### 4. In-Place Reversal
Reverses the second half of the list without using extra memory.

### Data Structure:
Singly Linked List

## UC9: Recursive Palindrome Checker

### Goal:
Check whether a string is a palindrome using recursion.

### Flow:
1. Recursive call compares start and end characters.  
2. Base condition exits the recursion.  

### Key Concepts Used in UC9:

#### 1. Recursion
A technique where a method calls itself to solve smaller subproblems.

#### 2. Base Condition
Prevents infinite recursion and terminates the recursive calls.

#### 3. Call Stack
Memory structure used to manage method calls during recursion.

### Data Structure:
Call Stack

## UC10: Case-Insensitive & Space-Ignored Palindrome Checker

### Goal:
Ignore spaces and case while checking whether a string is a palindrome.

### Flow:
1. Normalize the string (remove spaces and convert to a common case).
2. Apply the previously implemented palindrome checking logic.

### Key Concepts Used in UC10:

#### 1. String Preprocessing
Preparing the string by removing unnecessary characters and standardizing letter case.

#### 2. Regular Expressions
Used to remove spaces or unwanted characters from the input string.

### Data Structure:
String / Array

## UC11: Object-Oriented Palindrome Service

### Goal:
Encapsulate palindrome logic inside a dedicated class.

### Flow:
1. Create a `PalindromeChecker` class.
2. Expose a `checkPalindrome()` method to perform the palindrome validation.

### Key Concepts Used in UC11 (OOPS):

#### 1. Encapsulation
Wrapping the palindrome checking logic inside a class and exposing only the necessary methods.

#### 2. Single Responsibility Principle
Ensures that the `PalindromeChecker` class is responsible only for palindrome validation.

### Data Structure:
Internal (Stack / Array)

## UC12: Strategy Pattern for Palindrome Algorithms (Advanced)

### Goal:
Choose a palindrome algorithm dynamically at runtime.

### Flow:
1. Define a `PalindromeStrategy` interface.
2. Implement strategies such as `StackStrategy` and `DequeStrategy`.
3. Inject and execute the selected strategy at runtime.

### Key Concepts Used in UC12:

#### 1. Interface
Defines a common contract for different palindrome checking algorithms.

#### 2. Polymorphism
Allows different strategy implementations to be used interchangeably.

#### 3. Strategy Pattern
A design pattern that enables selecting an algorithm’s behavior at runtime.

### Data Structure:
Varies per strategy

## UC13: Performance Comparison

### Goal:
Compare the performance of different palindrome checking approaches.

### Flow:
1. Run multiple palindrome algorithms.
2. Capture execution time.
3. Display the results.

### Key Concepts Used in UC13:

#### 1. System.nanoTime()
Used to measure the precise execution time of each algorithm.

#### 2. Algorithm Comparison
Evaluates and compares the performance of different palindrome checking techniques.
