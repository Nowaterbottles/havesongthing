package mantou;

public class SetThread extends Thread {
	private Mantou mt;
	
	public SetThread(Mantou mt) {	
		this.mt = mt;
	}
	public void run() {
		while(true) {
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			mt.set();//一次做一个
		}
	}
}
