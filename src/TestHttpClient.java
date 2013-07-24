import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class TestHttpClient
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//		a a;
//		i i;
//		i = new a();
//		System.out.println(getFunctionUrl("0", "433", "333", "222"));
//		System.out.println("====="+"002053181".length());
//		PrintTest(new String[] {"1", "2", "3", "a", "b", "c", "12", "ab", "1a", "2b", });
		
		SimpleDateFormat sDateFormat = new SimpleDateFormat(
		"yyyy-MM-dd   HH:mm E");
		String date = sDateFormat
		.format(new java.util.Date());
		System.out.println(date);
//		byteCopy();
//		subString();
	}
	
	private static void byteCopy ()
	{
		byte[] b = new byte[]{'1','a','2','b',};
		byte[] a = new byte[3];
		try
		{
			System.arraycopy(b, 2, a, 0, 3);
		} catch (Exception e)
		{
			// TODO: handle exception
		}
		String str = new String(a);
//		for ( byte c : a )
//		{
//			str += c;
//		}
		System.out.println(str);
		
		 byte bb = 0;
		 byte[] bbb = new byte[256];
		           for ( int i = 0; i <= 0xff; ++i )
		           {
		               bb = (byte)i;
		               System.out.print(" "+i+":"+bb+", ");
		               bbb[i] = bb;
		          }
		           str = new String(bbb);
		System.out.println("\n"+new String(bbb));
		byte[] tempb = str.getBytes();
		int i = 0;
		for ( byte bc : tempb )
		{
			System.out.print(" " + i + ":" + bc + ":" + str.subSequence(i, i + 1) +", ");
			i++;
			if ( bc == 77 )
			{
				System.out.println("OK");
			}
		}
	}
	
	private static void PrintTest (String... strings )
	{
		for ( int i = 0; i < strings.length; i++ )
		{
			System.out.println(strings[i]);
		}
	}
	
	public static String getFunctionUrl(String time, String vid, String uid,
			String code) {
		StringBuffer sb = new StringBuffer();
		sb.append("http://");
		sb.append("bbtv_api.php?act=add_tvplay&vid=");
		sb.append(vid);
		sb.append("&uid=");
		sb.append(uid);
		sb.append("&code=");
		sb.append(code);
		if (time.length() > 0) {
			sb.append("&starttime=");
			sb.append(time);
		}
		return sb.toString();
	}
	
	public static void subString()
	{
		String s = "12345";
		System.out.println(s.substring(0, 2));
	}
	

}
