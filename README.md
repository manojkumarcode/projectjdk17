# Project JDK17

## Table of Contents

- [Getting Started](#getting-started)
- [API Documentation](#api-documentation)
    - [OpenAPI Specification](#openapi-specification)
    - [Swagger UI](#swagger-ui)
- [Coding Problems & Solutions](#coding-problems--solutions)
    - [Arrays & Strings](#arrays--strings)
    - [Trees & Graphs](#trees--graphs)
    - [Design & Concurrency](#design--concurrency)
    - [Java Stream API Practice](#java-stream-api-practice)

## Getting Started

To get started with this project, clone the repository and follow the installation instructions below.

This project is a demonstration of a Spring Boot application using JDK 17 and Gradle 8.5, with Swagger UI enabled for API documentation.

## Features

- **Spring Boot 3.2.2**
- **JDK 17**
- **Gradle 8.5**
- **Swagger UI for API documentation**

## Dependencies

The key dependency added for enabling Swagger UI is:

```groovy
implementation 'org.springdoc:springdoc-openapi-starter-webmvc-ui:2.5.0'
```

## API Documentation

Our API is documented using the OpenAPI specification. You can explore and test the endpoints interactively using Swagger UI.

### OpenAPI Specification

You can access the OpenAPI specification in JSON format using the following URL:
http://localhost:8080/v3/api-docs

### Swagger UI

Swagger UI provides an interactive interface to explore and test the API endpoints. Access it using the following URL:

http://localhost:8080/v3/api-docs

## Coding Problems & Solutions

This repository also contains a collection of DSA / interview-style coding problems solved in Java. Each entry below lists the problem statement and the class(es) containing the solution.

### Arrays & Strings

1. **Two Sum** — Given an array of integers and a target value, return the indices of the two numbers that add up to the target.
   Solution: `TwoSumProblem.java`, `TwoSumProblemRunner.java` (`com.manoj.projectjdk17.leetcode.twosum`)

2. **Add Two Numbers** — Given two non-negative numbers represented as linked lists (digits stored in reverse order), add the two numbers and return the sum as a linked list.
   Solution: `AddTwoNumbers.java` (`com.manoj.projectjdk17.google`)

3. **Trapping Rain Water (Snow Fill)** — Given an array of non-negative integers representing the elevation map of a cross-section of hills, compute how many units of snow/water can be trapped between the hills.
   Solution: `SnowFill.java` (`com.interview.twentysix`)

4. **Longest Word in Dictionary** — Given a string of letters and a dictionary, find the longest word (or words) in the dictionary that can be formed using the given letters.
   Solution: `LongestWordInDictionary.java` (`com.interview.twentysix`)

5. **Longest Consecutive Sequence** — Given an unsorted array of integers, find the length of the longest run of consecutive integers.
   Solution: `LongestConsecutiveSequence.java`, `LongestConsecutiveSequenceOrdered.java` (`com.manoj.projectjdk17.ds`)

6. **Monotonic Array** — Determine whether an array is monotonic, i.e. entirely non-increasing or entirely non-decreasing.
   Solution: `MonotonicArrays.java` (`com.manoj.projectjdk17.ds.arrays`)

7. **Valid Mountain Array** — Determine whether an array forms a valid "mountain": it strictly increases to a peak and then strictly decreases.
   Solution: `MountainArray.java` (`com.manoj.projectjdk17.ds.arrays`)

8. **Move Zeroes to End of Array** — Given an array, move all zeros to the end while preserving the relative order of the non-zero elements.
   Solution: `PushAllZerosToEndOfArray.java` (`com.manoj.projectjdk17.ds.arrays`)

9. **Reverse an Array** — Reverse the elements of an array in place.
   Solution: `ReverseAnArray.java` (`com.manoj.projectjdk17.ds.arrays`)

10. **Rotate an Array by K** — Rotate the elements of an array to the right by `k` steps.
    Solution: `RotateAnArrayKtimes.java` (`com.manoj.projectjdk17.ds.arrays`)

11. **Smallest Element in an Array** — Find the smallest element in an unsorted array.
    Solution: `SmallestElementInArray.java` (`com.manoj.projectjdk17.ds.arrays`)

12. **Binary Search** — Search for a target element's index in a sorted array using the binary search algorithm.
    Solution: `BinarySearch.java` (`com.manoj.projectjdk17.ds`)

13. **First Non-Repeating Element** — Given an array of integers, find the first element that does not repeat.
    Solution: `FirstNonRepeatingElement.java` (`com.manoj.projectjdk17.ds.hashing`)

14. **First Repeating Element** — Given an array of integers, find the first element that repeats (has a duplicate later in the array).
    Solution: `FirstRepeatingElementInArray.java` (`com.manoj.projectjdk17.ds.hashing`)

15. **Most Frequent Element in an Array** — Find the element that occurs most frequently in an array.
    Solution: `MostFrequentElementInArray.java` (`com.manoj.projectjdk17.ds.hashing`)

16. **One Array is a Subset of Another** — Given two arrays, determine whether all elements of one array are present in the other.
    Solution: `OneArrayIsSubsetOfAnother.java` (`com.manoj.projectjdk17.ds.hashing`)

17. **First Non-Repeating Character in a String** — Given a string, find the first character that appears exactly once.
    Solution: `MyTest1.java` (`com.test`)

18. **Elements Appearing Exactly Once in an Array** — Given an array of integers, identify the elements that occur exactly once using a marker/count array.
    Solution: `TestMain.java` (`com.test`)

### Trees & Graphs

19. **BFS Traversal of a Graph** — Traverse a graph starting from a given source node using Breadth-First Search.
    Solution: `BFSTraversal.java`, `DefineGraph.java` (`com.manoj.projectjdk17.ds.graphs`)

20. **DFS Traversal of a Graph** — Traverse a graph starting from a given source node using Depth-First Search.
    Solution: `DFSTraversal.java`, `DefineGraph.java` (`com.manoj.projectjdk17.ds.graphs`)

21. **Build a Binary Search Tree** — Insert a sequence of values (interactively or from an array) into a Binary Search Tree.
    Solution: `BinarySearchTree2.java`, `BinarySearchTree3.java` (`com.manoj.projectjdk17.nomiso`)

22. **Validate Binary Search Tree** — Given the root of a binary tree, determine whether it is a valid Binary Search Tree.
    Solution: `IfTreeIsBST.java` (`com.manoj.projectjdk17.nomiso`)

23. **Height of a Binary Tree** — Compute the height (maximum depth) of a binary tree.
    Solution: `HeightOfBinaryTree.java` (`com.manoj.projectjdk17.nomiso`)

24. **Level Order Traversal of a Binary Tree** — Traverse and print a binary tree level by level.
    Solution: `LevelOrderTraversal.java` (`com.manoj.projectjdk17.nomiso`)

25. **Serialize and Deserialize a Binary Tree** — Design an algorithm to convert a binary tree to a string and convert that string back to the original tree.
    Solution: `Codec.java`, `SerializeAndDeserialize.java`, `NomisoBinaryTree.java` (`com.manoj.projectjdk17.nomiso`)

26. **Pair with Given Sum in a BST** — Given a Binary Search Tree and a target sum, determine whether a pair of nodes exists whose values add up to the target.
    Solution: `PairSumWithGivenBST.java` (`com.manoj.projectjdk17.nomiso`)

### Design & Concurrency

27. **Design an LRU Cache** — Design a fixed-capacity cache that evicts the Least Recently Used entry when it exceeds capacity, backed by `LinkedHashMap`.
    Solution: `LRUCache.java`, `CacheImplUsingLinkedHashMap.java` (`com.manoj.projectjdk17.cahceImplementation.linkedhashmap`)

28. **Design a Thread-Safe Bounded Cache** — Design a fixed-size, thread-safe cache supporting concurrent `put`/`get` operations from multiple threads.
    Solution: `Cache.java`, `CacheImpl.java`, `CacheMain.java`, `GetterTask.java`, `GetterTaskRunner.java`, `PutTaskRunner.java` (`com.manoj.projectjdk17.cahceImplementation`)

29. **Producer-Consumer Problem** — Coordinate two threads, a producer and a consumer, sharing a counter, using `wait()`/`notify()` for synchronization.
    Solution: `Producer.java`, `Consumer.java`, `Counter.java`, `MainRunner.java` (`com.manoj.projectjdk17.threads`)

30. **Singleton Design Pattern** — Implement a class that ensures only a single instance of it is ever created.
    Solution: `MySingleton.java` (`com.manoj.projectjdk17.worldline.test`)

### Java Stream API Practice

31. **Filter Out a Value from a Nested Array (flatMap)** — Given a 2D array of strings, filter out a target value and flatten the remaining elements into a single stream.
    Solution: `FilterOutA.java` (`com.manoj.projectjdk17.streamapi.flatmap`)

32. **Group and Count Customers by Type** — Given a list of customers, group them by customer type and count the customers in each group using the Stream API.
    Solution: `Java8Main.java`, `FakeCustomersDao.java`, `Customer.java` (`com.manoj.projectjdk17.streamapi.customer`)

