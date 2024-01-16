# Project README

## LinkedList vs. CustomizedListOfArrays Performance Test

This project compares the performance of two data structures, `LinkedList` and `CustomizedListOfArrays`, in fetching an item at a specific index. The goal is to analyze the efficiency of these data structures when dealing with a large number of elements.

### Table of Contents

- [Overview](#overview)
- [Usage](#usage)
- [Performance Test](#performance-test)
- [List Implementation](#linkedlist-implementation)
- [CustomizedListOfArrays Implementation](#customizedlistOfArrays-implementation)
- [Conclusion](#conclusion)

### Overview

The project contains two implementations for LinkedList :
1. **LinkedList Implementation:** Uses `LinkedList` to store and retrieve items with the default implementation.
2. **CustomizedListOfArrays Implementation:** Introduces a custom data structure, `CustomizedListOfArrays`, that links sets of arrays to optimize item retrieval.

### Usage

To run the performance test, execute the `Main` class. The test involves populating both data structures with 40 million elements and fetching the element at index 20 million and calculate the duration to find this item.

### Performance Test

The Test to Fetch the item at index 20 million:  
The performance test results are as follows:

- **LinkedList Implementation:**
    - **Duration in second:** 3.678849 S

- **CustomizedListOfArrays Implementation:**
    - **Duration in second:** 0.052341 S

### LinkedList Implementation

Has implemented with the  default implementation of LinkedList

### CustomizedListOfArrays Implementation

Implemented to compile both implementation of Arrays and LinkedList to get advantage of fast random accesses and the ability of increasing the list length or capacity

So How we did this:

The CustomizedListOfArrays structure is initialized with a specified loading factor, which determines the capacity of each internal array within the list.

Each array linked to the next array by the end of the array

00010001000 -> pointer to next array  
01001000010 -> pointer to next array  
00000000000
  
### Conclusion

In the realm of Object-Oriented Programming (OOP), the "Open/Closed" principle stands as a potent guideline. This principle advocates for code to be open for extension while closed for modification. By embracing this principle, we gain the ability to tailor various elements, including data structures, to align seamlessly with our unique use cases. The introduction of the CustomizedListOfArrays represents a swift application of this principle, and there exists a multitude of ideas for further enhancements that can expedite operations such as fetching, adding, sorting, and more, making it an agile and adaptable solution.  

And Remember that:
### `The Result : CustomizedListOfArrays was faster than LinkedList by 74.67 times faster`

Feel free to explore and modify the code to suit your needs. If you have any questions or suggestions, please don't hesitate to reach out. Happy coding!
