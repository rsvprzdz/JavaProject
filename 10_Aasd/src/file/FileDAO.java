package file;
import java.io.*;

public class FileDAO {

	    public static void main(String[] args) {
		    fileCopy("src.txt", "dst.txt");
	    }
	    
	    public static void fileCopy(String src, String dst) {
	        File origin = new File(src);
	        File copy = new File(dst);

	        try (FileInputStream fis = new FileInputStream(origin);
	             FileOutputStream fos = new FileOutputStream(copy)) {
	            byte[] buffer = new byte[1024];
	            int len;
	            while ((len = fis.read(buffer)) != -1) {
	                fos.write(buffer, 0, len);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    
	    }
	}
}
