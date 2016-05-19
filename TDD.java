import java.util.Hashtable;

public class TDD {
	private Hashtable<String, String> tabla = new Hashtable<String, String>();

	public void put(String clave, String valor) {
		if (tabla.contains(clave)) {
			tabla.replace(clave, valor);
		} else {
			tabla.put(clave, valor);
		}
	}

	public String get(String clave) {
		String dar = "";

		if (tabla.containsKey(clave)) {
			dar = tabla.get(clave);
		} else {
			throw new TDDException(tabla.toString());
		}
		return dar;
	}
	public String getOrElse (String clave, String valorPorDefecto){
		String dar = "";

		if (tabla.containsKey(clave)) {
			dar = tabla.get(clave);
		} else {
			dar = tabla.get(valorPorDefecto);
		}
		return dar;
	}
	public boolean containsKey (String clave){
		boolean esta = false;
		if(tabla.containsKey(clave) == esta){
			esta = true;
		}
		return esta;
	}
	public boolean remove (String clave){
		boolean exito = false;
		if(tabla.containsKey(clave)){
			tabla.remove(clave);
			exito = true;
		}
		return exito;
	}
	public int size(){
		return tabla.size();
	}
}
