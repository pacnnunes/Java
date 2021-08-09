package revisao;

import java.util.Scanner;

public class tabuada {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("escolha qual tabuada você quer:");
	Integer numero = scanner.nextInt();
	Integer tabuada0 = numero*0;
	Integer tabuada1 = numero*1;
	Integer tabuada2 = numero*2;
	Integer tabuada3 = numero*3;
	Integer tabuada4 = numero*4;
	Integer tabuada5 = numero*5;
	Integer tabuada6 = numero*6;
	Integer tabuada7 = numero*7;
	Integer tabuada8 = numero*8;
	Integer tabuada9 = numero*9;
	Integer tabuada10 = numero*10;
	
	scanner.close();

for(numero = numero ; numero <= 1000 ; ++numero) {
	if(numero==1)
	System.out.println(numero+" x 00 = " + tabuada0 );	
		
	System.out.println(numero+" x 01 = " + tabuada1 );
	
	System.out.println(numero+" x 02 = " + tabuada2 );
	
	System.out.println(numero+" x 03 = " + tabuada3 );
	
	System.out.println(numero+" x 04 = " + tabuada4 );
	
	System.out.println(numero+" x 05 = " + tabuada5 );
	
	System.out.println(numero+" x 06 = " + tabuada6 );
	
	System.out.println(numero+" x 07 = " + tabuada7 );
	
	System.out.println(numero+" x 08 = " + tabuada8 );
	
	System.out.println(numero+" x 09 = " + tabuada9 );
	
	System.out.println(numero+" x 10 = " + tabuada10 );
	break;
}
}}



