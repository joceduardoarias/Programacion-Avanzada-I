package Objetos;

public class StringUtils {
	
	/**
	 * 
	 * @param str string parameter 
	 * @return char count 
	 */
	public int cantidadDeCaracteres(String str) {
		return str.length();
	}
	//FIXME review method
	public String subString(String str) {
		int length = cantidadDeCaracteres(str)/2;
		
		return str.substring(length);
	}
	
	public String lastChar(String str) {
		return str.substring(5, 5);
	}
	//TODO finish practice
}
