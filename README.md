# Project README

## List vs. ListOfArrays Performance Test

This project compares the performance of two data structures, `LinkedList` and `ListOfArrays`, in fetching an item at a specific index. The goal is to analyze the efficiency of these data structures when dealing with a large number of elements.

### Table of Contents

- [Overview](#overview)
- [Usage](#usage)
- [Performance Test](#performance-test)
- [List Implementation](#list-implementation)
- [ListOfArrays Implementation](#listofarrays-implementation)
- [Conclusion](#conclusion)

### Overview

The project contains two implementations in Java:
1. **List Implementation:** Uses `LinkedList` to store and retrieve items.
2. **ListOfArrays Implementation:** Introduces a custom data structure, `ListOfArrays`, that links sets of arrays to optimize item retrieval.

### Usage

To run the performance test, execute the `Main` class. The test involves populating both data structures with 40 million elements and fetching the element at index 20 million.

### Performance Test

The performance test involves fetching an item at index 20 million from both data structures and measuring the time it takes for each operation. The results are printed to the console.

### List Implementation

- **Data Structure:** `LinkedList`
- **Population:** Populates the list with 40 million elements.
- **Fetch Operation:** Fetches the item at index 20 million.
- **Duration Measurement:** Calculates and prints the duration of the fetch operation.

### ListOfArrays Implementation

- **Data Structure:** `ListOfArrays`
- **Population:** Populates the ListOfArrays with 40 million elements.
- **Fetch Operation:** Fetches the item at index 20 million.
- **Duration Measurement:** Calculates and prints the duration of the fetch operation.

### Conclusion

The project aims to provide insights into the performance differences between the standard `LinkedList` and the custom `ListOfArrays` data structure. Developers can use this information to make informed decisions based on their specific use cases and performance requirements.

Feel free to explore and modify the code to suit your needs. If you have any questions or suggestions, please don't hesitate to reach out. Happy coding!
