package utilities;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
public class ReadTxt {
    public static List<String> getSSNIDs(){
        List <String > list = new ArrayList<>();
        try{
            //identify file location
            FileReader fileReader = new FileReader(ConfigurationReader.getProperty("database_registrant_data"));
            //Read the records of the file in given location
            BufferedReader br = new BufferedReader(fileReader);
            String line = br.readLine();//856-45-6789,
            while(line != null){
                String ssn = line.split(",")[0];
                list.add(ssn);
                line = br.readLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
    public static List<String> getAPISSNIDs(){
        List <String > list = new ArrayList<>();
        try{
            //identify file location
            FileReader fileReader = new FileReader(ConfigurationReader.getProperty("api_all_registrant_data"));
            //Read the records of the file in given location
            BufferedReader br = new BufferedReader(fileReader);
            String line = br.readLine();//856-45-6789,
            while(line != null){
                String ssn = line.split(",")[2];
                list.add(ssn);
                line = br.readLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
    public static List<String> getPatients(){
        List <String > list = new ArrayList<>();
        try{
            //identify file location
            FileReader fileReader = new FileReader(ConfigurationReader.getProperty("patients_All_records"));
            //Read the records of the file in given location
            BufferedReader br = new BufferedReader(fileReader);
            String line = br.readLine();//856-45-6789,
            while(line != null){
                String ssn = line.split(",")[2];
                list.add(ssn);
                line = br.readLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
    public static List<String> getPatientsNames(){
        List<String> list=new ArrayList<>();
        try {
            //We are just identifying file location to read
            FileReader fileReader=new FileReader(ConfigurationReader.getProperty("patients_records"));
            // we are reading the records of the file in given location here
            BufferedReader br=new BufferedReader(fileReader);
            String line=br.readLine();
            while (line !=null){
                String name=line.split(",")[0];
                list.add(name);
                line=br.readLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

}

