import java.util.Objects;

public class pan
{
    public static String cuantosComen (String[] asientos)
    {

        String[] panes = new String[asientos.length*2];
        String res ="";
        for (int i = 0; i < panes.length; i++)
        {
            panes[i] ="1";
        }
        for (int i = 1; i < panes.length; i+=2) {
            for (int j = 0; j < asientos.length; j++) {
                panes[i] = asientos[j];
            }
        }
        for (int x = 0; x < panes.length; x++)
        {
            if (panes[x].equals("I"))
            {
                panes[x-1]="0";
            } else if (panes[x].equals("D"))
            {
                panes[x+1]="0";
            }
        }

        //comprobar si todas las posiciones de I pares hay ceros.

        return res;
    }
}
