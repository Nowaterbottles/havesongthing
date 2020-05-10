package mantou;

public class GetThread extends Thread{
	private Mantou mt;

	public GetThread(Mantou mt) {
		this.mt = mt;
	}
	public void run() {
		while(true) {
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			mt.get();
		}
	}
}
