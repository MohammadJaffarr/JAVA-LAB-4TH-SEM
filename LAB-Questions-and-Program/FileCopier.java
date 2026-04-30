import java.io.*;
class FileCopyHelper {
  String SourceFilePath, backupFileName;
  FileCopyHelper(String SourceFilePath, String backupFileName){
    this.SourceFilePath = SourceFilePath;
    this.backupFileName = backupFileName;
  }


  void FileCopy(){
    
    try {
            FileInputStream fin = new FileInputStream(SourceFilePath);
            FileOutputStream fout =  new FileOutputStream(backupFileName,true);
            int data;
            while ((data = fin.read()) != -1) {
              
                fout.write(data);
            }
            System.out.println("File copy Done");
            fin.close();
            
    } catch(IOException e){
       System.out.println("Something wrong with file path"+ SourceFilePath + e);
    }
    finally{
        fin.close();
    }

  }

}

public class FileCopier {
 public static void main(String[] args) {
    FileCopyHelper fch =  new FileCopyHelper("NotificationManagerMain.java", "NotificationManagerMainCopyByProgram.java");
    fch.FileCopy();
 }
}