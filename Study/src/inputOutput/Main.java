package inputOutput;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.Buffer;

import javax.imageio.ImageIO;

public class Main {

	public static void main(String[] args) throws IOException {

		File file = new File("from.txt");
//		file.createNewFile();
//		
//		File file1 = new File("to.txt");
//		file.createNewFile();
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file1.getAbsolutePath());
//		file.createNewFile();
//		System.out.println(file.getAbsolutePath());
//		FileOutputStream fileOutputStream = new FileOutputStream(file);
//		fileOutputStream.write(65);
//		for (int i = 0; i < 1000; i++) {
//			fileOutputStream.write(i);
//		}
//		fileOutputStream.write("some text".getBytes());
//		FileInputStream fileInputStream = new FileInputStream(file);
//		int tmp;
//		while ((tmp = fileInputStream.read())!=-1) {
//			
//			System.out.print(Character.toChars(tmp));
			
//		}
		
//		FileInputStream fileInputStream = new FileInputStream(file);
//		FileOutputStream fileOutputStream = new FileOutputStream(file1);
//		int tmp;
//		while ((tmp = fileInputStream.read())!=-1){
//			fileOutputStream.write(tmp);
//		}
//		fileInputStream.close();
//		fileOutputStream.close();
//		fileOutputStream.write(fi);
//		FileReader fileReader = new FileReader(file);
//		BufferedReader bufferedReader = new BufferedReader(fileReader);
//		String tmp = "";
//		while (!(tmp = bufferedReader.readLine()).equals(null)){
//			System.out.println(tmp);
//		}
//		bufferedReader.close();
		
		String url = "http://www.mountainguides.com/photos/everest-south/ev06-chortens-terminal-moraine.jpg";
		String fileName = "pic.png";
		BufferedImage img = ImageIO.read(new URL(url));
		File pic = new File(fileName);
		pic.createNewFile();
		ImageIO.write(img, "png", pic);
		
		
		
		
		
		
		
		
		
	}

}
