package pers.wyt.dp.filter;

public class Main {
/**
 * 先写测试再写程序
 * @param args
 */
	public static void main(String[] args) {
		String msg = "大家好：），<script>，敏感，哈哈哈哈";

		MsgProcessor mp = new MsgProcessor();
		mp.setMsg(msg);
		String result = mp.process();
		System.out.println(result);
	}

}
