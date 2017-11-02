package pers.wyt.dp.filter;

public class MsgProcessor {
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String process() {
		//process the html tag <>
		String r = msg.replace('<', '[').replace('>', ']');
		
		//process the sensitive words
		r = r.replace("����", "");
		return r;
	}
}
