package ch18.sec11;

import java.io.File;

public class FileExample {
    public static void main(String[] args) throws Exception{
        File file = new File("C:/temp/file1.txt");

        if(file.exists()){
            if(file.isFile()){
                System.out.println("파일 경로: "+file.getPath());
                System.out.println("파일 크기: "+file.length());
            }else if(file.isDirectory()){
                System.out.println("<dir>"+file.getPath());
            }
        }
        else{
            System.out.println("해당 파일은 없는 파일입니다.");
        }
    }
}
