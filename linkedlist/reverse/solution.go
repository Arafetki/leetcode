/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */

 func reverseList(head *ListNode) *ListNode {

    var prev,curr,currNext *ListNode

    prev = nil

    curr = head

    for curr!=nil {

        // Save the ref to the next node in currNext variable

        currNext = curr.Next

        // Point the "next" pointer of the curr node to the
        // prev node
        
        curr.Next = prev

        // Move the prev pointer to the curr node

        prev = curr

        // Move the curr pointer to the currNext node

        curr = currNext


    }

    return prev


    
}


// Read My article written in leetcode's solutions thread

// Link : https://leetcode.com/problems/reverse-linked-list/solutions/3704970/iterative-solution-with-visualization-written-in-go-beats-100/