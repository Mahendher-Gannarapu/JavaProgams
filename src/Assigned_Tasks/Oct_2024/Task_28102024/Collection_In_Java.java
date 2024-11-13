
//Research about the Collection Framework
package Assigned_Tasks.Oct_2024.Task_28102024;

public class Collection_In_Java {
    /*
    The Java Collection Framework is a comprehensive architecture that provides
    a set of classes and interfaces to handle groups of objects, also known as collections.
    It is part of the java.util package and includes data structures such as
    lists, sets, queues, and maps, as well as algorithms for searching, sorting,
    and manipulation.

1. Key Interfaces in the Collection Framework
The framework is based on a few key interfaces that define the types of collections:

Interface	Description
Collection	The root interface that represents a group of objects known as elements.
List	An ordered collection that allows duplicate elements, indexed access.
Set	A collection that does not allow duplicate elements.
Queue	A collection designed for holding elements prior to processing (FIFO).
Map	A collection of key-value pairs with unique keys (not part of Collection).
2. Common Classes in the Collection Framework
Here are some of the commonly used classes that implement these interfaces:

List Implementations
ArrayList: A resizable array implementation of the List interface.
It provides fast access to elements but slower insertions/deletions at the middle.
LinkedList: Implements List as well as Queue.
It uses a doubly linked list to store elements, providing efficient insertions and deletions.
Vector: A synchronized version of ArrayList, useful in multithreaded applications.
It is generally less preferred due to performance overhead.
Stack: A subclass of Vector that follows the LIFO (Last In, First Out) principle.
Set Implementations
HashSet: Implements the Set interface using a hash table. It does not guarantee the
order of elements.
LinkedHashSet: Extends HashSet with predictable iteration order (insertion order).
TreeSet: Implements Set using a Red-Black tree, maintaining elements in ascending order.
Queue Implementations
PriorityQueue: An unbounded queue based on a priority heap, which orders elements according
to their natural ordering or by a Comparator.
LinkedList: Also implements Queue in addition to List, making it suitable for use as a queue.
Map Implementations
HashMap: A hash table-based implementation of the Map interface. It allows null values and
one null key.
LinkedHashMap: Extends HashMap with predictable iteration order, typically insertion order.
TreeMap: Implements Map using a Red-Black tree, storing entries in ascending order of keys.
Hashtable: A synchronized hash table implementation of Map. It does not allow null keys or
values.
3. Basic Operations in Collection Framework
Adding Elements: add(E element), addAll(Collection<? extends E> c)
Removing Elements: remove(Object o), removeAll(Collection<?> c), clear()
Accessing Elements: iterator(), get(int index) (for List)
Searching: contains(Object o), containsAll(Collection<?> c)
Size & Emptiness Check: size(), isEmpty()
Sorting: Collections.sort(List<T> list) for lists
Iterating: Using for-each, iterator, or ListIterator
4. Iteration Methods in Collection Framework
Using for-each Loop:

java
Copy code
for (String element : list) {
    System.out.println(element);
}
Using Iterator:

java
Copy code
Iterator<String> iterator = list.iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
Using ListIterator (for List collections):

java
Copy code
ListIterator<String> listIterator = list.listIterator();
while (listIterator.hasNext()) {
    System.out.println(listIterator.next());
}
Using Streams:

java
Copy code
list.stream().forEach(System.out::println);
5. Advantages of Java Collection Framework
Efficiency: Provides high-performance implementations of commonly used data structures.
Interoperability: Ensures collections can work together using a common interface.
Thread Safety: Provides classes like Vector, Hashtable, and Collections.synchronizedList()
for thread-safe operations.
Flexibility: Provides a variety of data structures and algorithms to suit different needs.
6. Example Program Using the Collection Framework
Here is a simple program demonstrating the use of ArrayList, HashSet, and HashMap:

java
Copy code
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class CollectionExample {
    public static void main(String[] args) {

        // List example
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple"); // Allows duplicate
        System.out.println("ArrayList: " + list);

        // Set example
        Set<String> set = new HashSet<>(list);
        System.out.println("HashSet (no duplicates): " + set);

        // Map example
        Map<String, Integer> map = new HashMap<>();
        for (String fruit : list) {
            map.put(fruit, map.getOrDefault(fruit, 0) + 1);
        }
        System.out.println("HashMap (frequency count): " + map);
    }
}
Output
css
Copy code
ArrayList: [Apple, Banana, Apple]
HashSet (no duplicates): [Apple, Banana]
HashMap (frequency count): {Apple=2, Banana=1}
     */
}
