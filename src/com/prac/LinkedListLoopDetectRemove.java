package com.prac;

/**
 *  Floyd’s slow and fast pointers approach to detect the loop
 *
 *  The algorithm is to start two pointers, slow and fast from head of linked list.
 *  We move slow one node at a time and fast two nodes at a time. If there is a loop, then they will definitely meet.
 *  This approach works because of the following facts. 1) When slow pointer enters the loop,
 *  the fast pointer must be inside the loop. Let fast pointer be distance k from slow.
 *  2) Now if consider movements of slow and fast pointers, we can notice that distance between them (from slow to fast)
 *  increase by one after every iteration. After one iteration (of slow = next of slow and fast = next of next of fast),
 *  distance between slow and fast becomes k+1, after two iterations, k+2, and so on. When distance becomes n,
 *  they meet because they are moving in a cycle of length n. For example, we can see in below diagram,
 *  initial distance is 2. After one iteration, distance becomes 3, after 2 iterations, it becomes 4.
 *  After 3 iterations, it becomes 5 which is distance 0. And they meet.
 */
public class LinkedListLoopDetectRemove {
    NodeH head;

    public void push(int data){
        NodeH new_node=new NodeH(data);
        new_node.next=head;
        head=new_node;
    }

    /**
     *
     */
     public void detectLoop(){
        NodeH sp=head;
        NodeH fp=head;
        int flag=0;

        while(sp !=null && fp !=null && fp.next !=null){
            sp=sp.next;
            fp=fp.next.next;
            if(sp == fp){
                flag=1;
                break;
            }

        }
         if(flag == 1)
             System.out.println("Loop found");
         else
             System.out.println("Loop not found");
     }

    /* Driver program to test above functions */
    public static void main(String args[])
    {
        LinkedListLoopDetectRemove list = new LinkedListLoopDetectRemove();

        list.push(20);
        list.push(4);
        list.push(15);
        list.push(10);

        /*Create loop for testing */
        list.head.next.next.next.next = list.head;

        list.detectLoop();
    }

}
