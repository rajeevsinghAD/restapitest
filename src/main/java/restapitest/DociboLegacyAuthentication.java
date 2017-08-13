package restapitest;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;

import sun.misc.BASE64Decoder;

public class DociboLegacyAuthentication {

	
	public String getDociboXAuth(String apiKey, String apiSecret){
		String toEncodeWithSHA1 = String.format("{0},{1}", String.join(",", "0","null"),apiSecret);
		
		String code = getSha1HashData(toEncodeWithSHA1);
		
		String toEncodeWithBase64 = String.format("{0}:{1}", apiKey, code);

		code = Base64Encode(toEncodeWithBase64);
		
		String xAuthorisation = String.format("Docebo {0}", code);
		
		return xAuthorisation; 
	}

	private String Base64Encode(String toEncodeWithBase64) {
		BASE64Decoder decoder = new BASE64Decoder();
		byte[] decodedBytes =null;
		try {
			decodedBytes = decoder.decodeBuffer(toEncodeWithBase64);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String str = new String(decodedBytes, StandardCharsets.UTF_8);
		return str;

	}
	
	private static String getSha1HashData(String toEncodeWithSHA1)
	{
	    String sha1 = "";
	    try
	    {
	        MessageDigest crypt = MessageDigest.getInstance("SHA-1");
	        crypt.reset();
	        crypt.update(toEncodeWithSHA1.getBytes("UTF-8"));
	        sha1 = byteToHex(crypt.digest());
	    }
	    catch(NoSuchAlgorithmException e)
	    {
	        e.printStackTrace();
	    }
	    catch(UnsupportedEncodingException e)
	    {
	        e.printStackTrace();
	    }
	    return sha1;
	}

	private static String byteToHex(final byte[] hash)
	{
	    Formatter formatter = new Formatter();
	    for (byte b : hash)
	    {
	        formatter.format("%02x", b);
	    }
	    String result = formatter.toString();
	    formatter.close();
	    return result;
	}
	
}
