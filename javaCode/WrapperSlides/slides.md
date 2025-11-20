% Wrapper Classes, Autoboxing & Unboxing in Java
% Student Submission
% Oct 21, 2025

# Slide 1: Title
Wrapper Classes, Autoboxing & Unboxing in Java

- Name: (Your name)
- Course: (Course name)
- Date: Oct 21, 2025

---

# Slide 2: Outline
- Part 1: Wrapper Classes — definition, list, purpose, examples
- Part 2: Autoboxing & Unboxing — what, examples, benefits
- Part 3: Application & Critical Thinking — scenario and limitations
- Part 4: Conclusion
- References

---

# Slide 3: Part 1 — What are wrapper classes?
- Wrapper classes are object-based representations of Java's primitive types.
- Each primitive (like `int`) has a corresponding wrapper (`Integer`).
- Why they are needed:
  - Collections and many APIs require objects, not primitives.
  - Wrapper classes supply utility methods (parsing, comparison, constants).

---

# Slide 4: Common wrapper classes
- byte -> Byte
- short -> Short
- int -> Integer
- long -> Long
- float -> Float
- double -> Double
- char -> Character
- boolean -> Boolean

---

# Slide 5: Purpose and usage
- Store primitive values where objects are required (e.g., `List<Integer>`).
- Use utility and helper methods (e.g., `Integer.parseInt`, `Double.isNaN`).
- Provide constants (`MAX_VALUE`, `MIN_VALUE`) and useful helpers.

---

# Slide 6: Example — creating Integer and Double objects
```java
// Create wrapper objects explicitly
Integer i1 = new Integer(42); // discouraged in modern Java
Double d1 = new Double(3.14);

// Preferred (autoboxing) way:
Integer i2 = 42;      // autoboxes int -> Integer
Double d2 = 3.14;     // autoboxes double -> Double

// Using methods:
int compare = i2.compareTo(100); // compareTo returns negative/zero/positive
boolean eq = i2.equals(42);      // true
```

Notes: prefer `Integer.valueOf(...)` or autoboxing over `new Integer(...)`.

---

# Slide 7: MAX_VALUE and MIN_VALUE (Integer)
- `Integer.MAX_VALUE` = 2147483647 (largest `int` value)
- `Integer.MIN_VALUE` = -2147483648 (smallest `int` value)

Significance:
- Useful for bounds checking, initialization of min/max algorithms, and guarding against overflow.

---

# Slide 8: Part 2 — Autoboxing (what & when)
- Autoboxing: automatic conversion from primitive to its wrapper.
  - Example: `Integer x = 5;` converts `int` 5 to `Integer.valueOf(5)`.
- Happens when a primitive is assigned to a variable of wrapper type or passed to a method expecting an object.

---

# Slide 9: Autoboxing examples
```java
void addToList(List<Integer> list, int value) {
    list.add(value); // autoboxes int -> Integer
}

Integer boxed = 10; // autoboxing
```
Advantages:
- Cleaner code, fewer explicit conversions.
- Works naturally with collections.

---

# Slide 10: Unboxing (what & when)
- Unboxing: automatic conversion from wrapper back to primitive.
  - Example: `int n = new Integer(7);` unboxes `Integer` to `int`.
- Happens when a wrapper is used where a primitive is expected (arithmetic, comparisons, assignment to primitive variable).

---

# Slide 11: Unboxing examples
```java
Integer a = Integer.valueOf(5);
int b = a + 3; // unboxing a -> 5, then arithmetic

// Caution:
Integer maybe = null;
int x = maybe; // throws NullPointerException on unboxing
```

---

# Slide 12: Part 3 — Practical scenario
Scenario: working with data from a CSV where some fields may be missing. You want to store numeric IDs in a collection but also allow nulls to indicate "missing".

- Use `List<Integer>` (wrapper) so `null` is valid.
- Autoboxing lets you add primitives directly: `list.add(123);`
- Unboxing occurs when you read values back into primitives for calculations.

---

# Slide 13: Part 3 — Limitations & cautions
- NullPointerException risk when unboxing `null` wrappers.
- `==` vs `.equals()`:
  - `Integer a = 128; Integer b = 128; a == b` may be `false`. Use `a.equals(b)`.
- Performance: boxing/unboxing allocate objects (or use caches), which can cost time and memory when done heavily.
- Precision and conversion pitfalls (widening conversions, e.g., `int` -> `double`).

---

# Slide 14: Part 4 — Conclusion (key takeaways)
- Wrapper classes let you treat primitives as objects and provide useful utilities.
- Autoboxing/unboxing make code concise but can hide performance or null-safety issues.
- Use primitives when performance-critical; use wrappers for collections and when `null` is meaningful.

---

# Slide 15: References
- Oracle Java Documentation — Wrapper Classes. https://docs.oracle.com/javase/8/docs/api/
- Bloch, J. (Effective Java) — item on boxing/unboxing.
- Oracle Java Tutorials — Autoboxing and Unboxing. https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html

---

# Slide 16: Acknowledgements / Questions
- Thank you — any questions?

