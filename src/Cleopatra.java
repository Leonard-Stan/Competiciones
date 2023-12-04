import java.util.Scanner;
public class Cleopatra
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        int veces = sc.nextInt();
        int A,B,C,year1,year2,year3, resultado=0,candidato;
        do
        {
            if (veces<= 0) break;
            A = año("A");
            B = año("B");
            C = año("C");
            year1 = Math.abs(A);
            year2 = Math.abs(B);
            year3 = Math.abs(C);
            resultado = year3-year2;
            candidato = year1-year2;

            if(year3-year2==0)
            {
                resultado = 1;
            } else if (year1-year2==0)
            {
                candidato=1;
            }
            if(Math.abs(resultado)>Math.abs(candidato))
            {
                System.out.println(A);
            } else if (Math.abs(candidato)>Math.abs(resultado))
            {
                System.out.println(C);
            }else
            {
                System.out.println("EMPATE");
            }
            veces--;
        }while(true);
        sc.close();
    }
    public static int año(String nombre)
    {
        int dato = sc.nextInt();
        if (dato == 0 || dato >10000 || dato<-10000)
        {
            dato = año(nombre);
        }
        return dato;
    }
}