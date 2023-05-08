import java.beans.Encoder;
import java.util.Base64;
import java.util.Base64.Decoder;

public class EncodingDemo {
public static void main(String[] args) {
	String password="p@ssw0rd123";
	System.out.println(password);
	java.util.Base64.Encoder encoder=Base64.getEncoder();
	String encoded = ((java.util.Base64.Encoder) encoder).encodeToString(password.getBytes());
	System.out.println(encoded);
	
	Decoder decoder=Base64.getDecoder();
	byte[] decoded = decoder.decode(encoded.getBytes());
	System.out.println(new String(decoded));
	
}
}
