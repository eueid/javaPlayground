package aula3;

import java.io.IOException;
import java.util.Scanner;

public class desafio {
	 public static void main(String[] args) throws IOException {
	        @SuppressWarnings("resource")
			Scanner leitor = new Scanner(System.in);	        
	        int cont = 0;
	        int q = 0;

	//continue a solucao de acordo com o solicitado no enunciado

	        while (cont <  6) {
	        	 int x = leitor.nextInt();
	        	 if (x > 0){
	        	   q++;
	        	 }
	        	 cont++;
	        }
	        System.out.println(q + "valores positivos");
	    }
		
	}

