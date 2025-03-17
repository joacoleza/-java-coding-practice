package com.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseLinkedListTest {

    @Test
    public void testReverseLinkedList() {
        // Create nodes
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        // Connect the nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // The list now is: 1 -> 2 -> 3 -> 4 -> 5

        ListNode reversedHead = ReverseLinkedList.reverse(node1);

        // The list should be: 5 -> 4 -> 3 -> 2 -> 1

        assertEquals(node5, reversedHead);
        assertEquals(node4, node5.next);
        assertEquals(node3, node4.next);
        assertEquals(node2, node3.next);
        assertEquals(node1, node2.next);
        assertEquals(null, node1.next);
    }

    @Test
    public void testReverseLinkedListSingleElement() {
        ListNode node1 = new ListNode(1);
        ListNode reversedHead = ReverseLinkedList.reverse(node1);
        assertEquals(node1, reversedHead);
        assertEquals(null, node1.next);
    }

    @Test
    public void testReverseLinkedListEmpty() {
        ListNode reversedHead = ReverseLinkedList.reverse(null);
        assertEquals(null, reversedHead);
    }
}
