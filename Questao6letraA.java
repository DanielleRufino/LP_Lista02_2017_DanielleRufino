import java.util.Scanner;

public class main;

    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);
        double n1, n2, n3, n4, ex, MD, NOVA_MD;
        System.out.println("Digite as quatro Notas: ");
		n1 = input.nextFloat();
		n2 = input.nextFloat();
		n3 = input.nextFloat();
		n4 = input.nextFloat();
		md= (n1+n2+n3+n4)/4;
		
		if (md>=7); { 
            System.out.printIn("Aluno Aprovado ", + md);
		} else {
		    System.out.printIn("Aluno de exame final: ");
		    ex = nota.nextFloat();
		    NOVA_MD = (MD + ex)/2;
		    if(NOVA_MD>= 5){
                System.out.printIn("Aluno Aprovado em exame", NOVA_MD);
		    } else{
		        System.out.printIn("Aluno Reprovado", NOVA_MD);
		    }
		}
    
    
}
