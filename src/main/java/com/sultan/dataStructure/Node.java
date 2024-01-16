package com.sultan.dataStructure;

import lombok.Data;

@Data
public class Node <T> {
    private int index;
    private T value;

    public Node(int index, T value){
        this.index = index;
        this.value = value;
    }
}
