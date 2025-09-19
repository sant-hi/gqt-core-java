package core.gqt.corejava.Thread;

	 class MSWord1 extends Thread {
		@Override
		public void run() {
		if(Thread.currentThread().getName().equals("typing")) {
			typing();	
		}
		else if(Thread.currentThread().getName().equals("checking")) {
			checking();
		}
		else {
			saving();
		}
		}
		
		public void typing() {
			try {
				for(int i=1;i<=5;i++) {
					System.out.println("Typing in progress........");
					Thread.sleep(2000);
				}
			}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		public void saving() {
			try {
				for(int i=1;i<=5;i++) {
					System.out.println("Saving in progress........");
					Thread.sleep(2000);
				}
			}
				catch(Exception e) {
					e.printStackTrace();
				}
		}
		
		public void checking() {
			try {
				for(int i=1;i<=5;i++) {
					System.out.println("Checking in progress........");
					Thread.sleep(2000);
				}
			}
				catch(Exception e) {
					e.printStackTrace();
				}
		}
	}

	public class ThreadCode6 extends Thread{
		public static void main(String[] args) {
			MSWord1 ms1= new MSWord1();
			ms1.setName("typing");
			MSWord1 ms2= new MSWord1();
			ms2.setName("checking");
			ms2.setPriority(8);
			ms2.setDaemon(true);
			MSWord1 ms3= new MSWord1();
			ms3.setName("saving");
			ms2.setPriority(9);
			ms2.setDaemon(true);
			System.out.println(ms1);
			System.out.println(ms2);
			System.out.println(ms3);
			System.out.println("------------------");
			ms1.start();
			ms2.start();
			ms3.start();
			
		}
	}

