package com.raohui;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * Hello world!
 *
 */
class FileTest{
    public void fileTest(){
        File file = new File("word.txt");
        if(file.exists()){
            System.out.println("文件名:"+file.getName());
            System.out.println("文件大小:"+file.length());
            System.out.println("文件的绝对路径:"+file.getAbsolutePath());

            System.out.println("使用FileOutputStream和FileInputStream读取写入");
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file,false);
                byte[] wbytes = "饶辉,好学生,努力加油,别放弃自己!".getBytes();
                fileOutputStream.write(wbytes);
                fileOutputStream.flush();
                fileOutputStream.close();
                
            } catch(Exception e){
                e.printStackTrace();
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[]  rbytes = new byte[1024];
                int lenth = fileInputStream.read(rbytes);
                System.out.println("文件中的信息为:"+new String(rbytes,0,lenth));
                fileInputStream.close();
            } catch(Exception e){
                e.printStackTrace();
            }


            System.out.println("使用BufferedOutputStream和BufferedInputStream读取写入");
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                byte[]  rbytes = new byte[1024];
                int lenth = bufferedInputStream.read(rbytes);
                System.out.println("文件中的信息为:"+new String(rbytes,0,lenth));
                bufferedInputStream.close();
            } catch(Exception e){
                e.printStackTrace();
            }
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                byte[] wbytes = "饶辉,好学生,努力加油,别放弃自己!".getBytes();
                bufferedOutputStream.write(wbytes);
                bufferedOutputStream.flush();
                bufferedOutputStream.close();

            } catch(Exception e){
                e.printStackTrace();
            }

            System.out.println("使用FileWriter和FileReader读取写入");
            try {
                FileWriter fileWriter = new FileWriter(file,true);
                String str= "饶辉,好学生,努力加油,别放弃自己!";
                fileWriter.write(str);
                fileWriter.close();
            } catch(Exception e){
                e.printStackTrace();
            }
            try {
                FileReader fileReader = new FileReader(file);
                char[] strs = new char[1024];
                int lenth = fileReader.read(strs);
                System.out.println("文件中的信息为:"+new String(strs,0,lenth));
                fileReader.close();
            } catch(Exception e){
                e.printStackTrace();
            }

            System.out.println("使用BufferedWriter和BufferedReader读取写入");
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
                String str= "饶辉,好学生,努力加油,别放弃自己!";
                bufferedWriter.write(str);
                bufferedWriter.flush();
                bufferedWriter.close();
            } catch(Exception e){
                e.printStackTrace();
            }
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                char[] strs = new char[1024];
                int lenth = bufferedReader.read(strs);
                System.out.println("文件中的信息为:"+new String(strs,0,lenth));
                bufferedReader.close();
            } catch(Exception e){
                e.printStackTrace();
            }

        }else{
            try {
                file.createNewFile();
                System.out.println("创建新文件!");
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}

class MyZip{
    public void zip(String zipName,File inputFile) throws Exception{
        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(zipName));
        zip(zipOutputStream,inputFile,"");
        System.out.println("压缩中");
        zipOutputStream.close();
    }

    private void zip(ZipOutputStream out,File f,String base) throws Exception{
        if(f.isDirectory()){
            File[] files = f.listFiles();
            if(base.length()!=0){
                out.putNextEntry(new ZipEntry(base+"/"));
            }else{
                for (File file : files) {
                    zip(out,file,base+file);
                }
            }
        }else{
            out.putNextEntry(new ZipEntry(base));
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(f));
            int lenth;
            byte[] Bytes = new byte[1024];
            System.out.println(base);
            while((lenth=bufferedInputStream.read(Bytes))!=-1){
                out.write(Bytes,0,lenth);
            }
            bufferedInputStream.close();
        }
        

    }
    public void unzip(String zipDir,String zipName){
        File file = new File(zipName);
        ZipInputStream zipInputStream;
        try {
            ZipFile zipFile = new ZipFile(file);
            zipInputStream = new ZipInputStream(new FileInputStream(file));
            ZipEntry zipEntry;
            //ZipEntry zipEntry =  zipInputStream.getNextEntry();
            //System.out.println(zipEntry);
            while((zipEntry=zipInputStream.getNextEntry())!=null && !zipEntry.isDirectory()){
                File tmp = new File(zipDir + zipEntry.getName());
                //System.out.println(tmp);
                if(!tmp.exists()){
                    tmp.getParentFile().mkdirs();
                    FileOutputStream fileOutputStream = new FileOutputStream(tmp);
                    InputStream inputStream = zipFile.getInputStream(zipEntry);
                    int lenth = 0;
                    byte[] Bytes = new byte[1024];
                    while((lenth = inputStream.read(Bytes))!=-1){
                        //System.out.println(lenth);
                        fileOutputStream.write(Bytes,0,lenth);
                    }
                    fileOutputStream.close();
                    inputStream.close();
                }
                zipInputStream.closeEntry();
            }
            zipFile.close();
            System.out.println("解压成功!");
        } catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
public class App 
{
    public static void main( String[] args )
    {
        new FileTest().fileTest();
        try {
            //new MyZip().zip("./test_zip.zip",new File("./test_zip"));
            //System.out.println("压缩完成!");
            new MyZip().unzip("./","./test_zip.zip");
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
