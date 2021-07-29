package aula3;

import aula3.Carregamento.Carregamento2;

public class Thread_Exemplo {
public static void main(String[] args) {
	Carregamento2 carregamento2 = new Carregamento2();
	carregamento2.start();
  }

}

class GerarPDF implements Runnable {
	@Override
	public void run() {
		System.out.println("Gerar PDF");
	}  
}

class Carregamento implements Runnable {
	@Override
	public void run() {
		System.out.println("Loading ...");
	}

class Carregamento2 extends Thread {
	@Override
	public void run() {
		super.run();
		System.out.print("carregado" + this.getName());
	}
  }
}
