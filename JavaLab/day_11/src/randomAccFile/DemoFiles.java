package randomAccFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class DemoFiles {

	public static void main(String[] args) throws IOException {

		List<String> li = Files.readAllLines(Path.of("data\\info1.txt"));
		System.out.println();
		
//		li.forEach(x->{System.out.println(x);});
		for(String line : li) 
		{
			System.out.println(line);
		}
//		for(int i = 0; i < li.size(); i++)
//		{
//			System.out.println(li.get(i));
//		}
		
		Files.write(Paths.get("data\\info2.txt"), li);
		
//		Files.write(Path.of("data\\info2.txt"), Arrays.asList("Hello", "World"));
		System.out.println("Success");
	}
}
