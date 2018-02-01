package jejune5;

import java.util.TreeSet;
/*
 * TreeSet： 能够对元素进行排序。
 * 排序有两种方式：（取决于构造方法，参考API）
 *      A:自然排序
 *      B:比较器排序
 */
public class TreeSetDemo {
	public static void main(String[] args) {

		// 创建集合,TreeSet的无参构造,排序方式A,可删除重复元素。
		TreeSet<Integer> ts = new TreeSet<Integer>();

		// 添加元素
		ts.add(13);
		ts.add(10);
		ts.add(17);
		ts.add(11);
		ts.add(18);
		ts.add(19);
		ts.add(11);
		ts.add(10);

		// 增强for
		for (Integer s : ts) {
			System.out.println(s);
		}
	}
}
