public class Test {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Q3:");
        Node p = list.search(2);
        System.out.println(p);
        System.out.println("-----");

        System.out.println("Q4:");
        System.out.println(list.set(p, 22));
        System.out.println(p);
        System.out.println("-----");

        System.out.println("Q5:");
        System.out.println(list.insertAfter(p, 23));
        System.out.println(p.getNext());
        System.out.println("-----");

        System.out.println("Q6:");
        System.out.println(list.search(22));
        System.out.println(list.remove(22));
        System.out.println(list.search(22));
        System.out.println("-----");

        System.out.println("Q7:");
        System.out.println(list.size());
        System.out.println("-----");

        System.out.println("Q8:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-----");

        System.out.println("--------------------");

        // 测试1
        System.out.println("测试1:");
        LinkedList list1 = new LinkedList();
        System.out.println(list1.size());
        System.out.println(list1.get(0));
        System.out.println(list1.search(1));
        System.out.println(list1.remove(1));
        System.out.println("--------------------");

        // 测试2
        System.out.println("测试2:");
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1.size());
        System.out.println("--------------------");

        // 测试3
        System.out.println("测试3:");
        p = list1.search(22);
        System.out.println(p);
        System.out.println("--------------------");

        // 测试4
        System.out.println("测试4:");
        p = list1.search(2);
        System.out.println(p);
        System.out.println("--------------------");

        // 测试5
        System.out.println("测试5:");
        System.out.println(list1.set(null, 22));
        System.out.println("--------------------");

        // 测试6
        System.out.println("测试6:");
        System.out.println(list1.set(p, 22));
        System.out.println(p);
        System.out.println("--------------------");

        // 测试7
        System.out.println("测试7:");
        System.out.println(list1.insertAfter(p, 23));
        System.out.println(list1.size());
        System.out.println("--------------------");

        // 测试8
        System.out.println("测试8:");
        System.out.println(list1.insertAfter(null, 23));
        System.out.println("--------------------");

        // 测试9
        System.out.println("测试9:");
        System.out.println(list1.remove(12));
        System.out.println("--------------------");

        // 测试10
        System.out.println("测试10:");
        System.out.println(list1.remove(22));
        System.out.println("--------------------");

        // 测试11
        System.out.println("测试11:");
        p = list1.get(0);
        System.out.println(p);
        System.out.println("--------------------");

        // 测试12
        System.out.println("测试12:");
        p = list1.get(-1);
        System.out.println(p);
        System.out.println("--------------------");

        // 测试13
        System.out.println("测试13:");
        p = list1.get(100);
        System.out.println(p);
        System.out.println("--------------------");
    }
}
