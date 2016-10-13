package docker.task.docker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @uc209259
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "*****Task for deployment Engineer position*****" );
        
       /* System.out.println("FilePath: "+args[0]);
        
        File file = new File(args[0]);
        
        if(file.exists()){
			
			System.out.println("File exists");
			FileReader reader = new FileReader(file);
			StringBuilder fileContent = new StringBuilder();
			BufferedReader br = new BufferedReader(reader);
			String line = br.readLine();
			while(line!="End"){
				fileContent = fileContent.append(line);
				fileContent.append(System.lineSeparator());
				line = br.readLine();
			}
			br.close();
			System.out.println(fileContent);
		}*/
    }
}
