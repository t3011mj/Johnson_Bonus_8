import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by mpjoh on 2/14/2017.
 */
    public class DisplayMenu {

        public static StringBuilder readTextFromMenuFile() {

            Path moviePath = Paths.get("MovieCategoryMenu.txt");
            File movieFile = moviePath.toFile();
            StringBuilder menuResult = new StringBuilder();

            try {
                FileReader rMenu = new FileReader(movieFile);
                BufferedReader readerMenu = new BufferedReader(rMenu);

                String menuLine = readerMenu.readLine();
                while (menuLine != null) {
                    menuResult.append(menuLine + "\n");
                    menuLine = readerMenu.readLine();
                }
                readerMenu.close();
                System.out.println(menuResult);
            }

            catch (FileNotFoundException ex) {
                System.out.println("Error: File Not Found");
                return null;
            }
            catch (IOException ex) {
                System.out.println("error 2");
                return null;
            }
            return menuResult;
        }
    }

