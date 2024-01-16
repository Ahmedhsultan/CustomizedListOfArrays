# Project README

## LinkedList vs. ListOfArrays Performance Test

This project compares the performance of two data structures, `LinkedList` and `ListOfArrays`, in fetching an item at a specific index. The goal is to analyze the efficiency of these data structures when dealing with a large number of elements.

### Table of Contents

- [Overview](#overview)
- [Usage](#usage)
- [Performance Test](#performance-test)
- [List Implementation](#LinkedList-implementation)
- [ListOfArrays Implementation](#listofarrays-implementation)
- [Conclusion](#conclusion)

### Overview

The project contains two implementations for LinkedList :
1. **LinkedList Implementation:** Uses `LinkedList` to store and retrieve items with the default implementation.
2. **ListOfArrays Implementation:** Introduces a custom data structure, `ListOfArrays`, that links sets of arrays to optimize item retrieval.

### Usage

To run the performance test, execute the `Main` class. The test involves populating both data structures with 40 million elements and fetching the element at index 20 million and calculate the duration to find this item.

### Performance Test

The Test to Fetch the item at index 20 million:  
The performance test results are as follows:

- **LinkedList Implementation:**
    - **Duration:** PT3.678849S

- **ListOfArrays Implementation:**
    - **Duration:** PT0.052341S

### LinkedList Implementation

Has implemented with the  default implementation of LinkedList

### ListOfArrays Implementation

Implemented to compile both implementation of Arrays and LinkedList to get advantage of fast random accesses and the ability of increasing the list length or capacity

So How we did this:

The ListOfArrays structure is initialized with a specified loading factor, which determines the capacity of each internal array within the list.

Each array linked to the next array by the end of the array

00010001000 -> pointer to next array  
01001000010 -> pointer to next array  
00000000000
  
### Conclusion

The project aims to provide insights into the performance differences between the standard `LinkedList` and the custom `ListOfArrays` data structure. Developers can use this information to make informed decisions based on their specific use cases and performance requirements.

Feel free to explore and modify the code to suit your needs. If you have any questions or suggestions, please don't hesitate to reach out. Happy coding!

### `The Result : ListOfArrays was faster than LinkedList by 74.67 times faster`