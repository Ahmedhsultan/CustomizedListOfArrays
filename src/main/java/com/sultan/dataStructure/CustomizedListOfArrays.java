package com.sultan.dataStructure;

import java.util.LinkedList;

/**
 * ListOfArrays is datastructue that link between sets of arrays
 * @param <T>
 */
public final class CustomizedListOfArrays<T extends Object> extends LinkedList<Node<T>[]>{
    private int loadingFactor;
    private int currentLocalIndex;
    private int currenGlobalIndex;

    public CustomizedListOfArrays(int loadingFactor){
        this.loadingFactor = loadingFactor;
        this.addNewArrayToRepository(loadingFactor);
        this.currenGlobalIndex = -1;
    }
    public void addItem(T object){
        //Check if repository is full
        if (isRepositoryFull())
            addNewArrayToRepository(loadingFactor);

        //Get next empty node
        getLastArray()[++currentLocalIndex] = new Node<>(++currenGlobalIndex, object);
    }
    public T getItem(int index){
        int localIndex = index % loadingFactor;

        for (Node<T>[] array: super.stream().toList()) {
            if (isIndexWithinArray(array, index))
                continue;

            Node<T> node = array[localIndex];
            return node.getValue();
        }

        throw new RuntimeException("Out of Range");
    }

    private boolean isIndexWithinArray(Node<T>[] array, int index) {
        return array[0].getIndex() < index-loadingFactor-1;
    }
    private boolean isRepositoryFull() {
        return currentLocalIndex == loadingFactor - 1;
    }
    private void addNewArrayToRepository(int loadingFactor){
        super.add(new Node[loadingFactor]);
        currentLocalIndex = -1;
    }
    private Node<T>[] getLastArray(){
        return super.get(super.size()-1);
    }
}