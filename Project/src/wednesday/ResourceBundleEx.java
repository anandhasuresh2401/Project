package wednesday;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class ResourceBundleEx {
//String resourceName;
	public static void main(String[] args) throws MissingResourceException {
    
		String resourceName ="wednesday.RBEx";
		ResourceBundle rb;
		
		rb =ResourceBundle.getBundle(resourceName);
		System.out.println("Default : " + rb.getString("Hello.text"));
		
		rb =ResourceBundle.getBundle(resourceName, Locale.GERMANY);
		System.out.println("German : " + rb.getString("Hello.text"));
		
		rb =ResourceBundle.getBundle(resourceName, Locale.CHINESE);
		System.out.println("Chinese : " + rb.getString("Hello.text"));
		
		Locale.setDefault(Locale.FRANCE);
		rb = ResourceBundle.getBundle(resourceName);
		System.out.println("French : " + rb.getString("Hello.text"));
	}

}
