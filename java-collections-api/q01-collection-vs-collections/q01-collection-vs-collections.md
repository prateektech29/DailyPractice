# 📘 Q1: What is the Difference Between `Collection` and `Collections` in Java?

---

## ✅ One-Line Summary:
> 🔹 `Collection` is a **root interface** in Java Collection Framework.  
> 🔹 `Collections` is a **utility class** that provides static methods to work with collections (like sorting, searching, shuffling, etc).

---

## 🔍 Detailed Difference Table

| Feature             | `Collection` (Interface)                                 | `Collections` (Class)                              |
|---------------------|----------------------------------------------------------|----------------------------------------------------|
| **Type**            | Interface                                                | Final class                                        |
| **Package**         | `java.util`                                              | `java.util`                                        |
| **Purpose**         | Base interface for all collection types like List, Set   | Utility class for operations on collections        |
| **Inheritance**     | Super interface of `List`, `Set`, `Queue`                | Cannot be extended (final class)                   |
| **Common Uses**     | Declaring collection variables or parameters             | Sorting, searching, reversing, synchronizing etc.  |
| **Method Types**    | Only abstract method declarations                        | Only static utility methods                        |

---

## 🧪 Code Example

### 1. `Collection` Interface Example:
```java

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        System.out.println(names);
    }
}

### 2. `Collections` Utility Class Example:
```java

import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 2, 9, 1);
        Collections.sort(numbers);  // Sorting the list
        System.out.println(numbers);
    }
}


🧠 Quick Revision Points (Remember These!)
✅ Collection = Blueprint (interface) → Used to create collection types
✅ Collections = Toolbox (class) → Used to manipulate collections

❌ Don't confuse: Collection ≠ Collections (S makes a huge difference!)'
 🔹Interviewers often test this confusion.
  Best way to remember:
   Collection = Parent interface
   Collections = Helper class

