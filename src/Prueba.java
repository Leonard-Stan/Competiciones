import java.util.Scanner;
public class Prueba
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)

    {
        int veces = sc.nextInt();
        int A,B,C, resultado=0,candidato;
        do
        {
            if (veces<= 0) break;
            A = sc.nextInt();
            B = sc.nextInt();
            C = sc.nextInt();

            if (A/C<0)
            {
                if(B>0)
                {
                    A++;
                }else
                {
                    C++;
                }
            }
            resultado=Math.abs(A)-Math.abs(B);
            candidato=Math.abs(C)-Math.abs(B);

            if(Math.abs(resultado)<Math.abs(candidato))
            {
                System.out.println("0");
                System.out.println(A);
            } else if (Math.abs(resultado)>Math.abs(candidato))
            {
                System.out.println("1");
                System.out.println(C);
            }else
            {
                System.out.println("EMPATE");
            }
            
            veces--;
        }while(true);
        sc.close();
    }
}