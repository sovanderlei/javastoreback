package com.api.javastoreback.example;

public class ThreadExemple2 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 10000; i++)
				System.out.println(i+": t1");
			}

		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 10000; i++)
					System.out.println(i+": t2");
			}

		};

		t1.start();
		t2.start();
		
		
		
	}
	
	public static void threadControleExecucao() {
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				 for(int i = 0; i < 10000; i++)
				 System.out.println(i+": t1");
			}

		};

		Thread t2 = new Thread() {
			@Override
			public void run() {
				 for(int i = 0; i < 10000; i++)
				 System.out.println(i+": t2");
			}

		};



		t1.start();
		t2.start();
		System.out.println("NOME THREAD MAIN: "
		+ Thread.currentThread().getName() + " | isAlive: "
		+ Thread.currentThread().isAlive());
		System.out.println("NOME THREAD T1: " + t1.getName() + " | isAlive: "
		+ t1.isAlive());
		System.out.println("NOME THREAD T2: " + t2.getName() + " | isAlive: "
		+ t2.isAlive());
		
		
		
		
	}
	
	
	public static void threadJoin() throws InterruptedException {
		
		/* Olha que interessante, quando a Thread main executar o “t1.start()” ele vai começar a mostrar 
		  os valores de t1 (0,12,3,4,5...), então a Thread main executa o “t1.join()” e para por ali, 
		  ela é congelada até que o método run() da Thread t1 finalize. Finalizado o processamento de t1, 
		  a Thread main continua sua execução agora fazendo “t2.start()” e logo em seguida executa os “System.out.println”.
		 */
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				 for(int i = 0; i < 10000; i++)
				 System.out.println(i+": t1");
			}

		};

		Thread t2 = new Thread() {
			@Override
			public void run() {
				 for(int i = 0; i < 10000; i++)
				 System.out.println(i+": t2");
			}

		};



		t1.start();
		t1.join();
		t2.start();
		System.out.println("NOME THREAD MAIN: "
		+ Thread.currentThread().getName() + " | isAlive: "
		+ Thread.currentThread().isAlive());
		System.out.println("NOME THREAD T1: " + t1.getName() + " | isAlive: "
		+ t1.isAlive());
		System.out.println("NOME THREAD T2: " + t2.getName() + " | isAlive: "
		+ t2.isAlive());
		
		
		
	}
	
	
	

}
