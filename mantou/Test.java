package mantou;

public class Test {

	public static void main(String[] args) {
		Mantou mantou=new Mantou();
		//两个做馒头
		SetThread s1=new SetThread(mantou);
		SetThread s2=new SetThread(mantou);
		s1.setName("做馒头窗口1:");
		s2.setName("做馒头窗口2:");
		//三个卖馒头
		GetThread g1=new GetThread(mantou);
		GetThread g2=new GetThread(mantou);
		GetThread g3=new GetThread(mantou);
		g1.setName("卖馒头窗口1:");
		g2.setName("卖馒头窗口2:");
		g3.setName("卖馒头窗口3:");
	
		s1.start();
		s2.start();
		g1.start();
		g2.start();
		g3.start();
	}

}
