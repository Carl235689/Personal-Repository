Constructor experiments and observations

1. Circle constructors
- Circle() : default, no parameters.
- Circle(double radius) : called when passing a double.
- Circle(int radiusAsInt) : called when passing an int.

Observation: Java picks the constructor whose parameter types match exactly. When you pass an int literal to a method that has both int and double constructors, the int version is chosen. If the exact type isn't available, Java may perform widening conversions (int -> double) to match a double parameter.

2. Rectangle constructors
- Rectangle() : default
- Rectangle(double length, double width) : called when two doubles provided
- Rectangle(double widthOnly) : called when a single double provided

Observation: Overloads with different numbers of parameters are unambiguous. If you had Rectangle(int) and Rectangle(double) the int literal chooses int, otherwise widening occurs.

3. RegularPolygon constructors
- RegularPolygon() : default
- RegularPolygon(int numberOfSides, double sideLength) : normal order
- RegularPolygon(double sideLength, int numberOfSides) : swapped order

Observation: The order and types of parameters both matter for resolution. Passing (6, 2.0) calls the first overload; passing (1.5, 8) calls the swapped overload.

Challenges faced
- Ensuring constructor signatures are distinct when experimenting with overloads.
- Remembering that autoboxing and widening conversions can affect overload selection.

How to run
- Compile: javac *.java
- Run: java Main
