## What is functional style programming ?
Functional programming is a programming concept i.e. style of writing code where we focus on         what to do, not how to do .

## What is lambda expression ?
A Lambda Expression in Java is a short way to write anonymous functions—functions without a name.
They were introduced in Java 8 to make code cleaner, especially when working with functional interfaces, collections, and streams.

## Name of functional interfaces 
1.	public interface Function<I,R>
{
    R apply(I,i)
      //R  return type(output)
    // I input type
}



2.	public interface Predicate<I>
     {
         boolean test(I i);

    }
    
3.	public interface Consumer<I>
{
     void  accept(I i);
}
4.	public interface  Supplier<R>
{
   R  get();
}
5.	public interface BiFunction<I1,I2,R>
{
  R apply(I1 , I2  )
}
6.	public interface BiPredicate<I1 , I2 >
{
   boolean test(I1 i1, I2 i2);
}  
7.	public interface BiConsumer(I1,I2)
{
  void accept(I1 i1, I2 i2);
}



Note -> We cannot throw checked exception through  default functional interface directly ,instead we have  to wrap the checked exception into unchecked exception.

##  What is method reference ?
 Method reference in Java provide a way to refer to an existing method by its name instead of providing a lambda expression to define the implementation of the method.

     Method reference are particularly useful when the lambda expression would only invoke on        existing method without performing any additional logic.

Note : “Yes, Java’s built-in functional interfaces can be directly mapped to existing methods using method references, provided the method’s signature matches the abstract method of the interface.”

•	Introduced in Java 8.
•	Works only with functional interfaces.
•	Makes code more readable and concise when the lambda just calls an existing method.

## Types of Method references 
1. Reference to a Static Method
👉 Syntax: ClassName::  staticMethodName

2. Reference to an Instance Method of a Particular Object
👉 Syntax: instance::instanceMethodName

3. Reference to an Instance Method of an Arbitrary Object of a Particular Type
You are referring to an instance method, but not of ANY specific object → instead, of ANY object of that class.
👉 Syntax: ClassName::instanceMethodName

4. Reference to a Constructor
👉 Syntax: ClassName::new


##   Scene before java 8 without  lambda expression :
1.	BEFORE Java 8 — Anonymous Inner Class
➤ Example: Runnable without lambda
Runnable r = new Runnable() {
@Override
public void run() {
        System.out.println("Running...");
    }
};
 Problems Before Lambda
•	 Lengthy boilerplate code
•	Repeated code
•	Readability low
•	Functional-style programming impossible
🟢 2. AFTER Java 8 — Lambda Expression
Same example using Lambda:
Runnable r = () -> System.out.println("Running...");
✔ Benefits:
•	Short & clean
•	No boilerplate
•	Functional programming support


Real Example: Sorting
BEFORE (Java 7 or earlier)
Collections.sort(list, new Comparator<Integer>() {
    public int compare(Integer a, Integer b) {
        return a - b;
    }
});
AFTER (Java 8 – Lambda)
Collections.sort(list, (a, b) -> a - b);


                                                  Stream API
Stream API is a Java 8 feature used to process collections of data in a functional style.It helps us to perform operations like filtering, sorting, mapping, reducing, etc.It makes our code cleaner, faster, and more readable.

🔥 Key Points (Easy to Remember)
✔ 1. Stream is NOT a data structure
It does not store data.
It only provides a pipeline to process data.

✔ 2. Supports Functional Programming
You write logic using lambda expressions.
✔ 3. Processes data in pipelines
Typical flow:
1️⃣ Source → (collection, array, list)
2️⃣ Intermediate operations → filter(), map(), sorted()
3️⃣ Terminal operation → collect(), forEach().

✔ 4. Internal iteration
Instead of writing loops, Java does the iteration internally.

Streams have become a fundamental part of Java programming since Java 8 and are lazy in nature.

## Collection V/S Streams
Collection are data structures that store and organize a group of objects like List, Set , Queue and Maps.

Streams provide a functional and declarative way to process collections or other data sources. 

## Stream are lazy in nature means :

“By lazy, we understand that a stream generates results only when the terminal operation requests them.”

## Stateless Operation 
A stateless operation is a stream operation that works on each element independently without needing to remember anything about previous or future elements.
-It only needs the current element
- Does NOT store or track any extra data
- Works element-by-element
Examples: map(), filter(), peek()

## Stateful Operation — Simple Definition
A stateful operation is a stream operation that needs information about multiple elements or the whole stream before it can produce a result.
- Needs to remember previous elements
- Needs to collect all elements
-Cannot work one element at a time
Examples: sorted(), distinct(), limit(), skip(),count(),reduce()



## Parallel Stream :
A parallel stream is a stream that runs our work in multiple threads at the same time,
so the task finishes faster when you have a lot of data.
________________________________________
Simple Explanation
•	Normal stream → works one by one
•	Parallel stream → works on many elements at the same time



-Stream.of()
public static <T> Stream<T> of(T t)
public static <T> Stream<T> of(T... values)
              
                                                                             ---------------
-Stream.empty()
public static <T> Stream<T> empty()
-- Returns an empty Stream (contains no elements)
-- Used to avoid returning null
--Helps prevent NullPointerException
                                                                            ----------------



##    long count = employeeList.stream()
		.peek(System.out::println)
		.count();
		System.out.println(count);

In Java 9+, if a stream originates from a SIZED source (like a List) and no intermediate operation changes the element count, count() returns the size directly without running the pipeline — therefore, peek() does not execute.


## long count2 = employeeList.stream()
		.peek(System.out::println)
		.filter(employee -> employee.getMarks() > -1)
		.count();
		System.out.println(count2);


- Filter DOES NOT CHANGE the size in your case, BUT…
❗ Filter might change the size in general — so Java cannot assume the size is fixed.
That is why filter removes the SIZED flag.

                                              -----------------------

filter() is used when you want to REMOVE unwanted data from the stream.
It keeps only those elements that satisfy a true / false condition.

Stream<T> filter(Predicate<? super T> predicate)

•	T → type of elements in the stream
•	Predicate<? super T> → a functional interface that takes an element and returns boolean
•	Returns a new Stream<T> containing elements that match the condition
Predicate functional method
boolean test(T t);
                                             -----------------------------------------


map() is used to transform (change) each element into a new form.
It does not remove anything, it changes the values.
<R> Stream<R> map(Function<? super T, ? extends R> mapper)
Explanation
T → type  of  elements  in  the original stream
R → type of elements in the resulting stream

Function<? super T, ? extends R> → a functional interface that:

takes an input of type T

returns a value of type R

Returns a new Stream<R>

Functional interface method
R apply(T t); 
                                             -------------------------------------------

flatMap() is used to break nested data (like List<List>) into a single flat stream.
It converts many small streams into one big stream.
<R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)
                                               
                                                          ----------------------

skip(n), Skips (ignores) the first n elements of the stream.
Stream<T> skip(long n)
                                                              ---------------------


limit(n), Takes ONLY the first n elements of the stream.
Stream<T> limit(long maxSize)

                                                                 -----------


Comparator.reverseOrder() gives you a comparator that sorts elements in descending order (highest → lowest).
It is used when you want to sort a list in reverse natural order.
                                                               -------------

Stream<T> dropWhile(Predicate<? super T> predicate)
dropWhile() — drop elements until the condition becomes false
👉 It skips (drops) elements from the start.
👉 When the condition fails for the first time, stop dropping.
👉 Then print everything else.

                                                               ----------

Stream<T> takeWhile(Predicate<? super T> predicate)
takeWhile() — keep taking elements until the condition becomes false
👉 It takes elements from the beginning
👉 Stops as soon as one element fails the condition
                                                                    -------------

long count()
count() returns how many elements are present in the stream.

                                                                    -------------
-peek() Method
--Stream<T> peek(Consumer<? super T
peek() is an intermediate stream operation that performs an action on each element for debugging or logging without modifying the stream.

                                                                             ----------------
allMatch()
🔹 Method Signature
boolean allMatch(Predicate<? super T> predicate)
🔹 Purpose
•	Checks whether ALL elements of the stream satisfy the given condition
•	Returns true only if every element matches
•	Short-circuit operation (stops early if one element fails)

                                                   ----------------

anyMatch()
🔹 Method Signature
boolean anyMatch(Predicate<? super T> predicate)
🔹 Purpose
•	Checks whether AT LEAST ONE element satisfies the condition
•	Returns true if any single element matches
•	Short-circuit operation (stops once a match is found)
                                              
                                                                   ----------------

noneMatch()
🔹 Method Signature
boolean noneMatch(Predicate<? super T> predicate)
🔹 Purpose
•	Checks whether NO elements satisfy the condition
•	Returns true if all elements fail the condition
•	Short-circuit operation

min() Method
Purpose
The min() method is used to find the smallest (minimum) element in a stream based on a given Comparator.

Method Signature
Optional<T> min(Comparator<? super T> comparator)
                                                                 --------------------

max() Method
Purpose
The max() method is used to find the largest (maximum) element in a stream based on a given Comparator.

Method Signature
Optional<T> max(Comparator<? super T> comparator)
                                                                    ----------------

findFirst() Method
Purpose
Returns the first element of the stream based on its encounter order.

Method Signature
Optional<T> findFirst()

                                                                    -----------------



findAny() Method
Purpose
Returns any  element  from  the  stream.
It does not guarantee order, especially in parallel streams.

Method Signature
Optional<T> findAny()
                                                          --------------

Purpose
The reduce() method is used to combine stream elements into a single result using an accumulator function.
In simple words:
It reduces many elements into one value.
________________________________________
Method Signatures
1️⃣ Without Identity
Optional<T> reduce(BinaryOperator<T> accumulator)
________________________________________
2️⃣ With Identity
T reduce(T identity, BinaryOperator<T> accumulator)
________________________________________
3️⃣ With Identity, Accumulator & Combiner (Parallel)
<U> U reduce(U identity,
             BiFunction<U, ? super T, U> accumulator,
             BinaryOperator<U> combiner)
                                                  
 
What is an Accumulator?
An accumulator is a function that combines values step by step while processing a stream.
👉 It takes the current result and the next element, then produces a new result.

                                                           ------------------
toArray() Method
Purpose
Converts a stream into an array.

Method Signatures
Object[] toArray()
<A> A[] toArray(IntFunction<A[]> generator)

                                                          ---------------------
collect() Method
Purpose
Transforms a stream into a collection or any other mutable result (List, Set, Map, etc.).

Method Signatures
<R, A> R collect(Collector<? super T, A, R> collector)
<R> R collect(
    Supplier<R> supplier,
    BiConsumer<R, ? super T> accumulator,
    BiConsumer<R, R> combiner

                                                            ------------------
groupingBy() (Group By)
Purpose
Groups stream elements into a Map based on a key.
👉 Similar to SQL GROUP BY.

Method Signature (Common)
Map<K, List<T>> groupingBy(Function<? super T, ? extends K> classifier)

                                                           ------------------
partitioningBy() (Partition By)
Purpose
Divides elements into exactly two groups based on a boolean condition.
👉 True / False partition.
Method Signature
Map<Boolean, List<T>> partitioningBy(Predicate<? super T> predicate)
                               
                                                       ----------------------------
















  




findFirst() — Definition
✔ Returns the first element of the stream (wrapped in Optional).
✔ It is a short-circuiting terminal operation.
It stops as soon as it finds the first element.
✔ Order-dependent:
It always respects the encounter order (the order of the list).
Use when:
You need the FIRST element in an ordered stream.


findAny() — Definition
✔ Returns any one element from the stream (Optional).
✔ Also short-circuiting.
✔ In sequential streams, findAny usually returns the first element
(but not guaranteed).
✔ In parallel streams, findAny may return
The first, the middle, or any random element
(whichever thread completes first).
Use when:
You don’t care which element you get — you want FASTEST result.









## Optional class :
Optional<T> is a container object introduced in Java 8 that may or may not contain a non-null value. It is mainly used to avoid NullPointerException (NPE) and and to represent the presence or absence of a value more clearly.

Advantages :
   Traditionally in Java, when a method might not return anything, we return null.
    But that can lead to NullPointerException (NPE) if the caller forgets to check.

  Think of it like a box:
	The box may have a value → value is present.
	  The box may be empty → value is absent.

  Example :
Optional[Employee [id=129, name=John, marks=60]]
Optional.empty


##  Methods :

public T get()
  Returns: the value contained inside the Optional
 Throws: NoSuchElementException if the Optional is empty

                                                      ---------------
public T orElse(T other)
orElse() returns:
•	👉 The value inside Optional if it is present
•	👉 Otherwise returns the provided default value (other)

                                                        ------------------

public T orElseGet(Supplier<? extends T> supplier)
orElseGet() returns:
•	👉 The value inside Optional if it is present
•	👉 Otherwise calls the Supplier function and returns its value

                                                        --------------------

public T orElseThrow()
-  Returns the value if present
-If empty → throws NoSuchElementException

                                                            --------------------

public <X extends Throwable> T orElseThrow(Supplier<? extends X> exceptionSupplier)
        throws X
-Returns the value if present
- If empty → uses Supplier to create and throw your custom exception

                                                          -----------------------

public boolean isPresent()
isPresent() returns:
•	true → if Optional contains a value
•	false → if Optional is empty

                            --------------------------------

public boolean isEmpty()
isEmpty() returns:
•	true → if Optional has no value (empty)
•	false → if Optional contains a value

                                                  -----------------------------

public void ifPresent(Consumer<? super T> action)
ifPresent() executes the given Consumer only if Optional contains a value.
•	If value exists → runs the action
•	If value is empty → does nothing

                                              -------------------------------------

public void ifPresentOrElse(Consumer<? super T> action, Runnable emptyAction)
ifPresentOrElse() performs:
•	action → if Optional contains a value
•	emptyAction → if Optional is empty
    
                                      ---------------------------------------------

public static <T> Optional<T> of(T value)
Optional.of() is used to create an Optional containing a non-null value.

IMPORTANT RULE
Optional.of() does NOT allow null.
If you pass null, it will throw:
NullPointerException

Optional<String> opt = Optional.of("Hello");
System.out.println(opt.isPresent());  // true

Optional<String> opt = Optional.of(null);  // ❌ Throws NullPointerException

                                             --------------------------------------------

public static <T> Optional<T> ofNullable(T value)
ofNullable() creates an Optional that may or may not contain a value.
•	If value is non-null → returns Optional.of(value)
•	If value is null → returns Optional.empty()

                                     ------------------------------------------------------

public static <T> Optional<T> empty()
empty() creates an Optional with no value inside — an empty Optional.

                                          ----------------------------------------------------
public Optional<T> filter(Predicate<? super T> predicate)
filter() applies a condition (Predicate) to the value inside the Optional.
•	If value exists AND satisfies the condition → returns the same Optional
•	If value exists but does NOT satisfy the condition → returns Optional.empty()
•	If Optional is already empty → returns Optional.empty()


                        ---------------------------------------------------------------

public <U> Optional<U> map(Function<? super T, ? extends U> mapper)
map() is used to transform the value inside an Optional.
•	If Optional has a value → applies the function and wraps the result in Optional
•	If Optional is empty → returns Optional.empty()

                                            ---------------------------------
public <U> Optional<U> flatMap(Function<? super T, ? extends Optional<? extends U>> mapper)
flatMap() is used when the mapping function itself returns an Optional.
•	If Optional has a value → it applies the function and returns the Optional directly (no double Optional)
•	If Optional is empty → returns Optional.empty()



Feature	map()	flatMap()
Mapper returns	Value (U)	Optional
Output	Optional	Optional
Avoids Optional inside Optional	❌ No	✔ Yes
Use when	Simple transformation	Function returns Optional
		




public Optional<T> or(Supplier<? extends Optional<? extends T>> supplier)
or() returns:
•	👉 The current Optional if it contains a value
•	👉 Otherwise, it returns the Optional provided by the Supplier



public Stream<T> stream()
stream() converts an Optional into a Stream with:
•	1 element → if Optional contains a value
•	0 elements → if Optional is empty










## DateTimeAPI

History
1 Date :
-It  was introduced in java 1.0 as part of java.util.package
- Confusion during import between java.util.Date and java.util.sql
-Year started form 1900 and month from 0.
- Date and Time were combined.
- Difficult to calculate difference between two date instances.
- No time Zone information.
-Difficult to map to database using Hibenate. @Temporal was needed to map.

2 Calender
It was  introduced  in  Java  1.1  as  part  of  the  java.util  package. 
Month started from 0.
Lot of information was provided in instance.
Difficult to calculate difference between two Calendar instances.
Difficult to map to database using Hibernate. @Temporal was needed to map.

3   Date/TimeAPI.
    It was introduced in Java 8 as part of the java.time package.
No confusion with Year and Month start point.
Various classes hence separation of concern.
Separate classes for zonal information.
Separate classes for calculating difference between two instances.
Mapping to database using Hibernate is direct and easy.


## LocalDate :

public static LocalDate now()
LocalDate.now() is used to get the current date from the system clock without any time or timezone information.

                                                                  ------------
LocalDate.of() Method
Purpose
Creates a LocalDate object by explicitly specifying year, month, and day.

Method Signature :
public static LocalDate of(int year, int month, int dayOfMonth) and many more overloaded versions.

                                                                  ------------------
1 isAfter()
Purpose
Checks whether the current date is after the specified date.
Method Signature
public boolean isAfter(ChronoLocalDate other)

2 isBefore()
Purpose
Checks whether the current date is before the specified date.
Method Signature
public boolean isBefore(ChronoLocalDate other)

3  isEqual()
Purpose
Checks whether both dates are exactly the same (year, month, day).
Method Signature
public boolean isEqual(ChronoLocalDate other)

                                                                   -------------------------------
1 plusYears()
Purpose
Adds years to a date.
Method Signature
public LocalDate plusYears(long yearsToAdd)

2 plusMonths()
Purpose
Adds months to a date.
Method Signature
public LocalDate plusMonths(long monthsToAdd)


3  plusWeeks()
Purpose
Adds weeks to a date.
Method Signature
public LocalDate plusWeeks(long weeksToAdd)

4  plusDays()
Purpose
Adds days to a date.
Method Signature
public LocalDate plusDays(long daysToAdd)

Note : Same method are available for minus also.


## LocalTime :
The above story of LocalDate same applicable in LocalTime except for isEqual() method.

## LocalDateTime
Same now () and of()  ,isBefore() , isAfter() and also plus and minus methods.

                                                        ------------
toLocalDate()
Purpose
Extracts only the date part (year, month, day) from a LocalDateTime.
Method Signature
public LocalDate toLocalDate()
       
                                                          ---------------
toLocalTime()
Purpose
Extracts only the time part (hour, minute, second, nanosecond) from a LocalDateTime.
Method Signature
public LocalTime toLocalTime()


## We have 24-hour format and 12-hour format .

## What is UTC ?
 It is world primary time standard the reference clock that all the time zones are based on.
Co-ordinated universal time.

## What is offset(ZoneoffSet)
An offset tells us how far a local time is ahead of or behind  UTC .
UTC
UTC +05:30
UTC -04:00

                                                          -------------------
## What is Zone(ZoneId)
A zone is a real -world location with time rules.

## What is time zone ?
A time zone defines the local time for a specific region of the world.
