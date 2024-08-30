package AddTwoNumbers;


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummyHead = new ListNode(0);
            ListNode tail = dummyHead;
            int carry = 0;

            while (l1 != null || l2 != null || carry != 0) {
                int digit1 = (l1 != null) ? l1.val : 0;
                int digit2 = (l2 != null) ? l2.val : 0;

                int sum = digit1 + digit2 + carry;
                int digit = sum % 10;
                carry = sum / 10;

                ListNode newNode = new ListNode(digit);
                tail.next = newNode;
                tail = tail.next;

                l1 = (l1 != null) ? l1.next : null;
                l2 = (l2 != null) ? l2.next : null;
            }

            ListNode result = dummyHead.next;
            dummyHead.next = null;
            return result;
        }

        public static void main(String[] args) {
            ListNode l1 = new ListNode(2);
            ListNode l11 = new ListNode(4);
            ListNode l12 = new ListNode(9);
            l1.next = l11;
            l11.next = l12;

            ListNode l2 = new ListNode(5);
            ListNode l21 = new ListNode(6);
            ListNode l22 = new ListNode(4);
            ListNode l23 = new ListNode(9);
            l2.next = l21;
            l21.next = l22;
            l22.next = l23;

            Solution solution = new Solution();
            ListNode res = solution.addTwoNumbers(l1, l2);
        }
        }
