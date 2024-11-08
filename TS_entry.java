import java.util.ArrayList;
/**
 * Write a description of class Paciente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TS_entry
{
   private String id;
   private ClasseID classe;  
   private String escopo;
   private TS_entry tipo;


   // construtor para arrays
   public TS_entry(String umId, TS_entry umTipo, ClasseID umaClasse, String umEscopo) {
      id = umId;
      tipo = umTipo;
      classe = umaClasse;
      escopo = umEscopo;
   }


   public String getId() {
       return id; 
   }

   public TS_entry getTipo() {
       return tipo; 
   }

   public String getEscopo() {
    return escopo; 
}
   
    
   public String toString() {
       StringBuilder aux = new StringBuilder("");
       if(escopo != "")
        aux.append("\t");
       aux.append("Id: ");
       aux.append(String.format("%-10s", id));

       aux.append("\tClasse: ");
       aux.append(classe);
       aux.append("\tEscopo: ");
       aux.append(escopo);
       aux.append("\tTipo: "); 
       aux.append(tipo2str(this.tipo)); 
       
      return aux.toString();

   }

  public String getTipoStr() {
       return tipo2str(this); 
   }

    public String tipo2str(TS_entry tipo) {
      if (tipo == null)  return "null"; 
      else if (tipo==Parser.Tp_INT)    return "int"; 
      else if (tipo==Parser.Tp_BOOL)   return "boolean"; 
      else if (tipo==Parser.Tp_DOUBLE)  return "double";
      else if (tipo==Parser.Tp_STRUCT)  return "struct";
      else if (tipo==Parser.Tp_STRING)  return "string";
      else if (tipo==Parser.Tp_ERRO)  return  "_erro_";
      else                             return tipo.getId();
   }

}






