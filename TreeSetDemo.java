package jejune5;

import java.util.TreeSet;
/*
 * TreeSet�� �ܹ���Ԫ�ؽ�������
 * ���������ַ�ʽ����ȡ���ڹ��췽�����ο�API��
 *      A:��Ȼ����
 *      B:�Ƚ�������
 */
public class TreeSetDemo {
	public static void main(String[] args) {

		// ��������,TreeSet���޲ι���,����ʽA,��ɾ���ظ�Ԫ�ء�
		TreeSet<Integer> ts = new TreeSet<Integer>();

		// ���Ԫ��
		ts.add(13);
		ts.add(10);
		ts.add(17);
		ts.add(11);
		ts.add(18);
		ts.add(19);
		ts.add(11);
		ts.add(10);

		// ��ǿfor
		for (Integer s : ts) {
			System.out.println(s);
		}
	}
}
