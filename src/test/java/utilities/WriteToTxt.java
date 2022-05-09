package utilities;
import Pojos.Appointment;
import Pojos.NewPatientCreation;
import Pojos.Registrants;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;
public class WriteToTxt {
    public static void saveRegistrantData(Registrants registrant){
        try{
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("api_registrant_data"), true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(registrant+"\n");
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void saveAppointData(Appointment appointment){
        try{
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("appointment_records"), true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(appointment+"\n");
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void saveRegistrantData(List<Object> SSNIds){
        try{
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("database_registrant_data"), false);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            for(Object eachSSN: SSNIds) {
                writer.append(eachSSN + ",\n");
            }
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void saveRegistrantData(Registrants [] registrants){
        try{
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("api_all_registrant_data"), false);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            for(int i=0; i< registrants.length;i++) {
                writer.append(registrants[i].getFirstName()+","+ registrants[i].getLastName()+","+registrants[i].getSsn()+","+ registrants[i].getLogin()+
                        registrants[i].getSsn()+","+registrants[i].getEmail()+ "\n");
            }
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void savePatientData(NewPatientCreation[] np){
        try{
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("patients_records"), false);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            for(int i=0; i< np.length;i++) {
                writer.append(np[i].getFirstname()+","+ np[i].getLastname()+","+np[i].getAddress()+","+np[i].getEmail()+
                        np[i].getBloodGroup()+","+np[i].getPhone()+ "\n");
            }
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}