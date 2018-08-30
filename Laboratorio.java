import java.util.ArrayList;

public class Laboratorio
{
    ArrayList<String> alumnos;
    
    public String inscribeAlumno()
    {
        
    }
    
    public String bajaAlumno(int claveBaja)
    {
        for(int i=0 ; i < alumnos.size(); i++)
        {
            String aux = alumnos.get(i);
            if (aux.clave == claveBaja)
            {
                
            }
        }
        
    }
    
    public void imprimeLista()
    {
        for(int i=0 ; i < alumnos.size(); i++)
        {
            System.println(i);
        }
    }
    
    
}
