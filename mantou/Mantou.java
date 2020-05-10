package mantou;
/*
 * 馒头类
 */
public class Mantou {
		//买卖出的馒头编号应该对应
		private static int number1=0;//生产馒头的编号标记
		private static int number2=1;//卖出馒头的编号标记
		
		private int maxsize=100;//馒头的容器最大容量
		private int index=0;
		
		//开始没有馒头
		//装馒头
		public synchronized void set() {
		
			
			if(index==maxsize) {//馒头满了停止向容器里放
				System.out.println("容器已经装满了100个馒头啦");
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				this.notify();
			}
			
			this.notify();
			index++;
			number1++;
			System.out.println(Thread.currentThread().getName()+"生产了1个馒头----馒头编号("+number1+")"+"当前还有"+index+"个");
			
		}
		public synchronized void get() {  
			if(index==0) {
				System.out.println(Thread.currentThread().getName()+"馒头卖完了，等待制作中~~~");
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			this.notify();//没有馒头了-->唤醒做馒头的线程
			}
			this.notify();
			if(index>0) {
				index--;
				System.out.println(Thread.currentThread().getName()+"卖出1个馒头----馒头编号("+number2+")"+"当前还有"+index+"个");		
				number2++;		
			}
			
		}
}
