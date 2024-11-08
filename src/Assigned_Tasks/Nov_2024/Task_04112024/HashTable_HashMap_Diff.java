/*
 **What is a Hashtable in Java, and how does it differ from HashMap?**
 */

package Assigned_Tasks.Nov_2024.Task_04112024;

import java.util.Hashtable;
import java.util.HashMap;
import java.util.Map;


public class HashTable_HashMap_Diff {
    public static void main(String[] args) {
        // Hashtable example
        Map<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("Apple", 3);
        hashtable.put("Banana", 2);
        // hashtable.put(null, 1);  // Throws NullPointerException

        System.out.println("Hashtable: " + hashtable);

        // HashMap example
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 3);
        hashMap.put("Banana", 2);
        hashMap.put(null, 1);  // Allowed in HashMap
        hashMap.put("Orange", null);  // Allowed in HashMap

        System.out.println("HashMap: " + hashMap);
    }
}
/*
### 1. **Synchronization**
- **Hashtable**: Synchronized, meaning it is thread-safe.
- **HashMap**: Not synchronized, so it is not thread-safe by default.
### 2. **Null Keys and Values**
- **Hashtable**: Does **not allow null** keys or values. Attempting to insert a `null`  key or value will throw a `NullPointerException` .
- **HashMap**: Allows one `null`  key and multiple `null`  values, making it more flexible in cases where null values are needed.
### 3. **Legacy vs. Modern**
- **Hashtable**: A legacy class from the early versions of Java (part of Java 1.0). It has been retrofitted to implement the `Map`  interface, but many of its methods are now considered outdated.
- **HashMap**: Introduced in Java 1.2 as part of the Collections Framework. It is a modern, more flexible, and generally preferred implementation of the `Map`  interface.
### 4. **Performance**
- **Hashtable**: Generally slower due to synchronized methods, which add a performance overhead.
- **HashMap**: Faster in non-threaded environments since it is unsynchronized. It’s the preferred choice for single-threaded applications.
### 5. **Subclassing**
- **Hashtable**: Extends the `Dictionary`  class, which is also a legacy class. This makes it part of the older Java API design.
- **HashMap**: Extends `AbstractMap` , part of the modern Java Collections Framework, which brings additional flexibility.
### 6. **Iterators**
- **Hashtable**: Uses an enumerator for iterating elements, which is not as flexible as the `Iterator`  used by modern collections.
- **HashMap**: Uses an `Iterator` , which allows the use of enhanced `for-each`  loops and supports the `fail-fast`  mechanism (if the map is structurally modified after creating the iterator, it will throw a `ConcurrentModificationException` ).

 */