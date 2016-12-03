/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defectprdx;

import static defectprdx.NewJFrame.extension;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
 
public class Compare 
{
       	public static ArrayList<String> identicalFile1=new ArrayList<String>();
        public static ArrayList<String> identicalFile2=new ArrayList<String>();
        
        ArrayList<File> fileList1 = new ArrayList<>();
        ArrayList<File> fileList2 = new ArrayList<>();
        
    
    public void listofFiles( File folder , ArrayList<File> f)
{
    for(File testfile : folder.listFiles())
    {
        if(testfile.isDirectory())
        {
            listofFiles(testfile,f);
        }
        else
        {
//            System.out.println(testfile);
//            System.out.println(testfile.getName());
//            System.out.println("Size of the file is : " + testfile.length() + "Bytes");
        
         
            String ext = null  ;
            String temp = testfile.getPath();
            int i = temp.lastIndexOf('.');
            if(i>0)
                ext = temp.substring(i+1);
            
            if(ext.equals("java"))
            {
//                
                 f.add(testfile);
                 
            }
        }
    }
} // end of listfo files function
        
        
        
        
        
        
        
        
	public void getDiff(File dirA, File dirB) throws IOException
	{
              
            
                listofFiles(dirA , fileList1);
                listofFiles(dirB , fileList2);
		
		HashMap<String, File> map1;
		if(fileList1.size() < fileList2.size())
		{
			map1 = new HashMap<String, File>();
			for(int i=0;i<fileList1.size();i++)
			{
				map1.put(fileList1.get(i).getName(),fileList1.get(i));
			}
			
			compareNow(fileList2, map1);
		}
		else
		{
			map1 = new HashMap<String, File>();
			for(int i=0;i<fileList2.size();i++)
			{
				map1.put(fileList2.get(i).getName(),fileList2.get(i));
			}
			compareNow(fileList1, map1);
		}
	}
        
     
	
	public void compareNow(ArrayList<File> fileArr, HashMap<String, File> map) throws IOException
	{
		for(int i=0;i<fileArr.size();i++)
		{
			String fName = fileArr.get(i).getName();
			File fComp = map.get(fName);
			map.remove(fName);
			if(fComp!=null)
			{
				
			
					String cSum1 = fileArr.get(i).getName();
					String cSum2 = fComp.getName();
					if(!cSum1.equals(cSum2))
					{
						System.out.println(fileArr.get(i).getName()+"\t\t"+ "different");
                                                
					}
					else
					{
						System.out.println(fileArr.get(i).getName()+"\t\t"+"identical");
                                                if(fileArr.get(i).getName().endsWith(extension))
                                                {
                                                    identicalFile1.add(fileArr.get(i).getPath());
                                                 identicalFile2.add(fComp.getPath());
                                                
                                                }
                                                
					}
				
			}
			else
			{
			
			
			System.out.println(fileArr.get(i).getName()+"\t\t"+"only in "+fileArr.get(i).getParent());
				
			}
		}
                
	}
	
	public void traverseDirectory(File dir)
	{
		File[] list = dir.listFiles();
		for(int k=0;k<list.length;k++)
		{
			if(list[k].isDirectory())
			{
				traverseDirectory(list[k]);
			}
			else
			{
				System.out.println(list[k].getName() +"\t\t"+"only in "+ list[k].getParent());
			}
		}
	}
	
	public String checksum(File file) 
	{
		try 
		{
		    InputStream fin = new FileInputStream(file);
		    java.security.MessageDigest md5er = MessageDigest.getInstance("MD5");
		    byte[] buffer = new byte[1024];
		    int read;
		    do 
		    {
		    	read = fin.read(buffer);
		    	if (read > 0)
		    		md5er.update(buffer, 0, read);
		    } while (read != -1);
		    fin.close();
		    byte[] digest = md5er.digest();
		    if (digest == null)
		      return null;
		    String strDigest = "0x";
		    for (int i = 0; i < digest.length; i++) 
		    {
		    	strDigest += Integer.toString((digest[i] & 0xff) + 0x100, 16).substring(1).toUpperCase();
		    }
		    return strDigest;
		} 
		catch (Exception e) 
		{
		    return null;
		}
	}
        
}