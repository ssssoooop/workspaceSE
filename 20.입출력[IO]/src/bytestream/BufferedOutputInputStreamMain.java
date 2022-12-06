package bytestream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
public class BufferedOutputInputStreamMain {

	public static void main(String[] args) throws Exception {
		/*******************BufferedOutputStream************************/
		FileOutputStream fos=new FileOutputStream("bufferedOut.dat");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		
		bos.write(65);
		bos.write(66);
		bos.write(67);
		bos.write(214783647);
		for(int i=0;i<256;i++) {
			bos.write(i);
		}
		bos.close();
		System.out.println("BufferedOutputStream.write --> bufferedOut.dat");
		/*******************BufferedInputStream**********************/
		BufferedInputStream bis=
				new BufferedInputStream(
						new FileInputStream("bufferedOut.dat"));
		
		int readByte=bis.read();
		System.out.println("1.byte:"+Integer.toHexString(readByte));
		while(true) {
			readByte=bis.read();
			if(readByte==-1) break;
			System.out.println(Integer.toBinaryString(readByte));
				
		}
		bis.close();
		System.out.println();
		System.out.println("BufferedInputStream.read() <-- bufferedOut.dat");
		
	}

}
