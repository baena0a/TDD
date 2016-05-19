import java.util.Hashtable;

public class TDD {
private Hashtable <String, String> tabla = new Hashtable <String, String>();

	public void put (String clave, String valor){
		if(tabla.contains(clave)){
			tabla.replace(clave, valor);
		} else {
			tabla.put(clave, valor);
		}
	}
}
