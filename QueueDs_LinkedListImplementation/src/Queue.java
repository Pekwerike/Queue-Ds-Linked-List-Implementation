import org.jetbrains.annotations.Contract;

public class Queue {
    Node first, last;

    /**Function to check if the linked list is empty**/
    @Contract(pure = true)
    private Boolean isEmpty(){
        return (first == null);
    }

    public void enqueue(String inputData){
        /**Hold a reference to the last node**/
        Node oldLast = last;

        /**Create a new node**/
        last = new Node();
        last.item = inputData;
        last.next = null;

        /**check if the first node is null**/
        if(first == null) first = last;
        /**Else add the last node to the linked list**/
        else oldLast.next = last;
    }

    public String dequeue(){
        /**If linked list is not empty, dequeue**/
        if(!isEmpty()){
            String itemToOutput = first.item;
            first = first.next;
            return itemToOutput;
        }
        else return "Empty Queue";
    }

    /**Data class for the nodes in the list**/
    private class Node{
        String item;
        Node next;
    }
}
