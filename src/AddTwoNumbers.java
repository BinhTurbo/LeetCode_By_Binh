import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- NHẬP LIST 1 ---
        System.out.print("Nhập số lượng phần tử List 1: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.print("Nhập các số của List 1 (cách nhau bởi dấu cách): ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // --- NHẬP LIST 2 ---
        System.out.print("Nhập số lượng phần tử List 2: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.print("Nhập các số của List 2 (cách nhau bởi dấu cách): ");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        // Tạo Linked List và Tính toán
        ListNode list1 = createListFromArray(arr1);
        ListNode list2 = createListFromArray(arr2);

        System.out.print("List 1: "); printList(list1);
        System.out.print("List 2: "); printList(list2);

        ListNode result = addTwoNumbers(list1, list2);
        System.out.print("Kết Quả: ");
        printList(result);
    }

    public static ListNode createListFromArray(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int num : arr) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }

    // Sửa lại hàm in cho đẹp (dùng print thay vì println)
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val); // In số
            if (node.next != null) {    // Nếu còn số sau thì in mũi tên
                System.out.print(" -> ");
            }
            node = node.next;
        }
        System.out.println(); // Xuống dòng khi in xong hết
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            // Sửa Lỗi 1: Check l1 lấy l1, check l2 lấy l2
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0; // Đã sửa dòng này

            int sum = x + y + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;

            // Sửa Lỗi 2: Cập nhật l2 chứ không phải l1
            if (l2 != null) l2 = l2.next; // Đã sửa dòng này
        }
        return dummyHead.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}