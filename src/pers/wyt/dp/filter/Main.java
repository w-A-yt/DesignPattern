package pers.wyt.dp.filter;

public class Main {
/**
 * ��д������д����
 * @param args
 */
	public static void main(String[] args) {
		String msg = "��Һã�����<script>�����У���������";

		MsgProcessor mp = new MsgProcessor();
		mp.setMsg(msg);
		String result = mp.process();
		System.out.println(result);
	}

}
