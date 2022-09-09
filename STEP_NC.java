import  java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.*;
 
import java.lang.String;
import java.sql.*;

import STEP_NC.Help;


import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.BorderFactory.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.event.*;
import java.io.FileReader;
import java.awt.geom.*;
import javax.imageio.*;
import java.awt.image.*;





//========
import java.awt.BorderLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//========


public class STEP_NC extends JFrame implements ActionListener
{

   
//================



FileDialog fd=null;


 




//===============
  
       int i,xcoord,ycoord,v=0,fiw,fih,len;
char c;


JScrollPane jScrollPane1 = new JScrollPane();
JScrollPane jScrollPane2 = new JScrollPane();
JScrollPane jScrollPane3 = new JScrollPane();
JScrollPane jScrollPane4 = new JScrollPane();
JScrollPane jScrollPane5 = new JScrollPane();
JScrollPane jScrollPane6 = new JScrollPane();


JTextArea jTextArea1 = new JTextArea();
JTextArea jTextArea2 = new JTextArea();
public static JTextArea jTextArea3 = new JTextArea();
JTextArea jTextArea4 = new JTextArea();
JTextArea jTextArea5 = new JTextArea();
JTextArea jTextArea6 = new JTextArea();




       JMenuBar menuBar;
       JMenu file,edit,Watermarking,help;
       JMenuItem open,save,saveas,close,openwm,insrting1,insrting2,extracting,copyrighting,Authentic,organisation,university,wm,ewm;

       JPanel tools,panel1,panel2,panel3,panel4,panel5,position,select,slider,Bpanel1,Bpanel2,Rpanel,text,Rpanel2;
       JTabbedPane jtabbedpane1,jtabbedpane2;
       
       
       JTextField x,y,twm;
       JCheckBox LT,RT,C,LB,RB,copyr,auth;
       JRadioButton Selectpos, Fixed, textwm,imgwm;
       ButtonGroup radio,radio2;

       JLabel l1,l2,l7;
       BufferedImage bimg;

       File file1;
       String s="",str="";
      
       JButton insert1,insert2,insert3,insert4,insert5,insert6,insert7,insert8,insert9,insert10,insert11,insert12,extract;
       
       

       Help hdesk;

       Container con;
	

       public STEP_NC()
       {
		
               setTitle("STEP-PDM/GEOMETRY INTERPRETER");

               con=getContentPane();

               con.setLayout(null);
                              
               

               hdesk = new Help();

               hdesk.Display(2);

              
		
               tools=new JPanel();
               tools.setBorder(BorderFactory.createRaisedBevelBorder());
               tools.setLayout(new BorderLayout());
               con.add(tools);
               
tools.setBounds(0,10,990,420);

               select=new JPanel();
               select.setBorder(BorderFactory.createEtchedBorder());
               tools.add(select,BorderLayout.NORTH);

               panel1=new JPanel();
               panel2=new JPanel();

               panel1.setLayout(null);
               panel2.setLayout(null);

               panel1.setBorder(BorderFactory.createEtchedBorder());
               panel2.setBorder(BorderFactory.createEtchedBorder());

               



try{
              
               
               
jScrollPane1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLoweredBevelBorder(),"STEP FILE"));

jScrollPane2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLoweredBevelBorder(),"PDM/GEOMETRY-DATA"));

                
               jScrollPane3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLoweredBevelBorder(),"XML-DATA"));
               
                
           // jScrollPane4.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLoweredBevelBorder(),"STEP FILE"));

//jScrollPane5.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLoweredBevelBorder(),"PDM-DATA"));

                
             //  jScrollPane6.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLoweredBevelBorder(),"XML-DATA"));

               hdesk.setBorder(BorderFactory.createTitledBorder(BorderFactory.createRaisedBevelBorder(),"Help"));

               }
               catch(Exception e){}
               



               position=new JPanel();
               position.setLayout(null);



	insert1 = new JButton(" Open STEP file ");
               	position.add( insert1 );
               	insert1.addActionListener(this);
              	insert1.setBounds(30,10,220,35);

insert2 = new JButton("EXTRACT PDM/GEOMETRY DATA ");
               	position.add( insert2 );
               	insert2.addActionListener(this);
	        insert2.setBounds(30,60,220,35);
	insert2.setEnabled(false);


		insert3 = new JButton("INSERT PDM/GEOMETRY DATA ");
               	position.add( insert3 );
               	insert3.addActionListener(this);
	        insert3.setBounds(30,110,220,35);
	insert3.setEnabled(false);


insert4 = new JButton(" EXTRACT XML Data ");
               	position.add( insert4 );
               	insert4.addActionListener(this);
	        insert4.setBounds(30,160,220,35);
insert4.setEnabled(false);

insert5 = new JButton(" SAVE PDM/GEOMETRY DATA ");
               	position.add( insert5 );
               	insert5.addActionListener(this);
	        insert5.setBounds(30,210,220,35);
 insert5.setEnabled(false);
		
insert6 = new JButton("Save XML Data ");
               	position.add( insert6 );
               	insert6.addActionListener(this);
	        insert6.setBounds(30,260,220,35);
insert6.setEnabled(false);

		insert7 = new JButton(" EXIT ");
               	position.add( insert7 );
               	insert7.addActionListener(this);
	        insert7.setBounds(30,310,220,35);




		






	
		

















               panel3=new JPanel();



                

              panel4=new JPanel();
                




               position.setBorder(BorderFactory.createEtchedBorder());

               text = new JPanel();
               text.setLayout(null);








 





               text.setBorder(BorderFactory.createEtchedBorder());

               jtabbedpane2=new JTabbedPane();
               jtabbedpane2.addTab("PDM/GEOMETRY-DATA",position);
             

               position.add(panel3);
              panel3.setBounds(20,35,150,100);
   
  
               position.add(panel4);
               panel4.setBounds(180,35,150,100);
  
 
               panel1.add(jtabbedpane2);
              











tools.add(jtabbedpane2,BorderLayout.CENTER);
               tools.add(jtabbedpane2);

jtabbedpane2.setBounds(15,70,990,180);
 




              



//====MILLING==//
 
jScrollPane1.setName("jScrollPane1");  

jTextArea1.setColumns(20);
jTextArea1.setRows(5);
jTextArea1.setName("jTextArea1");  
jScrollPane1.setViewportView(jTextArea1);
position.add(jScrollPane1);
jScrollPane1.setBounds(350,5,290,170);


jScrollPane2.setName("jScrollPane2");  
 
jTextArea2.setColumns(20);
jTextArea2.setRows(5);
jTextArea2.setName("jTextArea2");  
jScrollPane2.setViewportView(jTextArea2);
position.add(jScrollPane2);
jScrollPane2.setBounds(680,5,290,170);


jScrollPane3.setName("jScrollPane3");  
 
jTextArea3.setColumns(20);
jTextArea3.setRows(5);
jTextArea3.setName("jTextArea3");  
jScrollPane3.setViewportView(jTextArea3);
position.add(jScrollPane3);
jScrollPane3.setBounds(350,175,500,170);
//====MILLING==//







 

 


          
              
               

               con.add(hdesk);
               hdesk.setBounds(5,430,990,250);

               
              
               

              JLabel label = new JLabel("STEP-PDM/GEOMETRY file to XML interpreter",JLabel.CENTER);
              
              
              label.setFont(new Font("Arial", Font.BOLD, 17));
              
              label.setForeground(Color.blue);

              select.add(label);

 	
             







		
               

               
               jtabbedpane2.setVisible(true);
       }
 

       public void actionPerformed(ActionEvent ae)
       {
              
     //For Close

       if( ae.getSource()==insert7)

 
               {
/*try{
 String text = jTextArea2.getText();
    int totalLines = jTextArea2.getLineCount();
JOptionPane.showMessageDialog(null,totalLines);
  for (int i=1; i < totalLines; i++) {
        int start =  jTextArea2.getLineStartOffset(i);
        int end   = jTextArea2.getLineEndOffset(i);
        String line = text.substring(start, end);
        //JOptionPane.showMessageDialog(null,line);
        //outputArea.append(line + "\n");
    }
JOptionPane.showMessageDialog(null,totalLines);

 
}
catch(Exception e)
{
System.out.println(e);
}*/

                       
		try{ 
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con_del=DriverManager.getConnection("jdbc:odbc:step_pdm");
			String sql1="delete from PDM_DATA";
			Statement delete1=con_del.createStatement();
			int i=delete1.executeUpdate(sql1);
			con_del.commit();
delete1.close();
con_del.close();
			

 if(i>0)
{
 
System.out.println("Deleted Successfully");
//System.exit(0);
}
else
{
 
System.out.println("Not Deleted");
//System.exit(0);
}

			
		}
		catch(Exception e)
		{
		System.out.println("Error at EXIT:"+e); 
		}

		System.exit(0);


               }
               
    

   







    else if(ae.getSource()==insert1)
               {
      
try
    {
        fd=new FileDialog(this,"Open Image...",FileDialog.LOAD);
        
 fd.show();
       
String s = fd.getFile();
    int i = s.lastIndexOf('.');

    if (i > 0 && i < s.length() - 1)
      if (s.substring(i + 1).toLowerCase().equals("stp"))
 


{

 FileInputStream fis=new FileInputStream(fd.getDirectory()+fd.getFile());
        while((i=fis.read())!=-1)
        {
            c=(char)i;
            str+=Character.toString(c);


        }
        

         jTextArea1.append(str);
insert1.setEnabled(false);
insert2.setEnabled(true);


}
else

JOptionPane.showMessageDialog(null,"Please Select STEP File and Try again");
 
       
//System.out.print(str);
        
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
 
 

 


}









 




   

           


 else if(ae.getSource()==insert2)
{

                    
                //JOptionPane.showMessageDialog(null,"Please Select Image");



 Connection con_m=null;


Statement st_m=null;
ResultSet rs_m=null;

try{

 
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con_m=DriverManager.getConnection("jdbc:odbc:step_pdm");

  



 




    
  
     FileInputStream fstream = new FileInputStream(fd.getDirectory()+fd.getFile());
    DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
    String strLine=null;
 

    while ((strLine = br.readLine()) != null)   {

//System.out.println(strLine);


if(strLine.startsWith("#"))
{



StringTokenizer st511 =new StringTokenizer(strLine,"(");
String token511 = st511.nextElement().toString();
StringTokenizer st521 =new StringTokenizer(token511,"=");
String token521 = st521.nextElement().toString();
String token531 = st521.nextElement().toString().trim();
 
 
int result=0;
 
st_m=con_m.createStatement();
rs_m=st_m.executeQuery("select * from PDM_EXPRESS_ENTITIES where pdm_entity='"+token531+"'");



if(rs_m.next()) 
 //=====111======//
jTextArea2.append(strLine+"\n");
 //=====111======//
 
}
}
con_m.commit();
con_m.close();
}
catch(Exception e)
{
System.out.println("Error in separation:==>"+e);
}
insert2.setEnabled(false);
insert3.setEnabled(true);

}


    else if(ae.getSource()==insert3)
            

{
       


 
 
//========================

String[] a10= new String[1000];   

 int i=1;
StringBuffer sb0=null;
StringBuffer sb1=null;
StringBuffer sb2=null;
StringBuffer sb3=null;
StringBuffer sb4=null;
sb0 = new StringBuffer();
sb3 = new StringBuffer();
sb4 = new StringBuffer();


 PreparedStatement selectAllPeople = null;

 PreparedStatement insertNewPerson = null;

  int insert1=0;
  int index=0;
  
 Connection con_m3=null;
 
 



 

String token21=null;








int entity1=0;
String entitylist[]=new String[1000];
int abc=0;
int abc1=0;
 

//============================//
try{

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con_m3=DriverManager.getConnection("jdbc:odbc:step_pdm");

 String text = jTextArea2.getText();
    int totalLines = jTextArea2.getLineCount();
 
  for (int im=0; im < totalLines; im++) {
        int start =  jTextArea2.getLineStartOffset(im);
        int end   = jTextArea2.getLineEndOffset(im);
        String strLine = text.substring(start, end);
//jTextArea3.append(strLine);
 //System.out.println(strLine);
       
//======91=====//
i=1;
sb1 = new StringBuffer("insert into ");
sb1.append("PDM_DATA(id,entity,");
sb2 = new StringBuffer(" values("); 
index=0;
insert1=1;
token21=null;
abc=0;
abc1=0;
//======91=====//

//=========222=============//
StringTokenizer st51 =new StringTokenizer(strLine,"=");
String token51 = st51.nextElement().toString();

//=====92=====//
abc++;
a10[index]=token51;
//System.out.println("cse-csr--1-->"+a10[index]);
 index++;
sb1.append("sub_entity" + i + ",");
i++;
sb2.append("?,");
//=====92=====//

//jTextArea2.append(token51+"\n");
//System.out.println("Token-->51"+token51);


String token52 = st51.nextElement().toString();
//System.out.println("Token 52  "+token52);

StringTokenizer st52 =new StringTokenizer(token52,",");
String token53 = st52.nextElement().toString();

//System.out.println("Token 53  "+token53);

StringTokenizer st53 =new StringTokenizer(token53,"(");
String token54 = st53.nextElement().toString().trim();


//====93=====//
abc++;
a10[index]=token54;
//System.out.println("cse-csr---2->"+a10[index]);
 index++;
sb1.append("sub_entity" + i + ",");
i++;
sb2.append("?,");
//====93=====//
//jTextArea2.append(token54+"\n");
//System.out.println("Token 54  "+token54);



String illegals1 = "[]^*\"^’+%&/“=?!½{}\\|~`;,´:<>\n\r";
String pattern1 = "[" + Pattern.quote(illegals1) + "]";
String token55 = st53.nextElement().toString().trim();
String token551=token55.replaceAll(pattern1, "");

//========94=====//
abc++;
a10[index]=token551;
//System.out.println("cse-csr--3-->"+a10[index]);
  index++;
sb1.append("sub_entity" + i + ",");
i++;
sb2.append("?,");
//========94=====//

//jTextArea2.append(token551+"\n"); 
//System.out.println("Token 55  "+token55);


 
while (st52.hasMoreElements())
	{
		String token1 = st52.nextElement().toString();
		String illegals2 = "([])^*\"^’+%&/“=?!½{}\\|~`;,´:<>\n\r";
		String pattern2 = "[" + Pattern.quote(illegals2) + "]";

		String illegals3 = ";";
		String pattern3 = "[" + Pattern.quote(illegals3) + "]";

			//System.out.println("token122==>"+token1);
 //String str1=""+"())";
//System.out.println(str1);

String token211=token1.replaceAll(pattern3, "");
//System.out.println("token211==>"+token211);

			/*if(token211.equals("()"))
			{
			System.out.println("token1==in if===>"+token1);
			 abc++;
			//======95========//
			 String token_sub=token211.substring(0,1);
			System.out.println("token_sub==>"+token_sub);
			a10[index]=token_sub;
			//System.out.println("token1==>"+token1);
			
			index++;
			sb1.append("sub_entity" + i++ + ",");
			//i++;
			sb2.append("?,");
			//======95========//			

			 
			
			}*/
			if(token211.startsWith("()"))
			{

			 abc++;
			//======95========//
			 //String token_sub=token1.substring(0,2);
			//System.out.println("token_sub==>"+token_sub);
			//a10[index]=token211;
			a10[index]=token211.substring(0,2);

			//System.out.println("hello===>"+ab009);
			
			index++;
			sb1.append("sub_entity" + i++ + ",");
			//i++;
			sb2.append("?,");
			//======95========//			

			 
			
			}
			else
			{  



 
			abc++;
			//======96========//
			token21=token211.replaceAll(pattern2, "");
			a10[index]=token21;
			index++;
			sb1.append("sub_entity" + i++ + ",");
			//i++;
			sb2.append("?,");
			//======96========//
			 

			 }  

			

		 
	}

//========222=============//


//========333=============//

 
if(i<9){sb1.replace(sb1.length()-25,sb1.length(),"");  }
if(i==9){sb1.replace(sb1.length()-25,sb1.length(),"");  }
if(i==10){sb1.replace(sb1.length()-25,sb1.length(),"");  }
 if(i>10){sb1.replace(sb1.length()-27,sb1.length(),"");  }
 
 
sb1.append(")");
sb2.replace(sb2.length()-1,sb2.length(),"");
sb2.append(");");
sb1.append(sb2.toString());
//System.out.println(sb1.toString());
 try{
insertNewPerson = con_m3.prepareStatement(sb1.toString());
}
catch(Exception e)
{
System.out.println("preapared statement error==1"+e);
}
//========333=============//

//========444=============//
 
 	while(abc1<abc)
	{ 

		 
		 
		
try{
//System.out.println("Data-->"+insert1+"  "+a10[abc1]);
insertNewPerson.setString(insert1, a10[abc1] );
}
catch(Exception e)
{
System.out.println("preapared statement error==2"+e);
}
		insert1++;
		abc1++;
 
	}
 
 try{
insertNewPerson.executeUpdate();
}
catch(Exception e)
{
System.out.println("preapared statement error==3"+e);
}
sb2.delete(0, sb2.length());
sb1.delete(0, sb1.length()); 

//========444=============//


    }
 
//====================//
 con_m3.commit();
con_m3.close();
 
}
catch(Exception e)
{
System.out.println("Error at Insertion  "+e);
}



 insert3.setEnabled(false);
 insert4.setEnabled(true);

//============================//

}
 
    
 
 
 

 



else if(ae.getSource()==insert4)
{

//========================================//
  Connection con_m1=null;
 Connection con_m2=null;
 
try{


 


String si20,datai20;



//==========

jTextArea3.append("<?xml version="+'"'+"1.0"+'"'+" encoding="+'"'+"ISO-8859-1"+'"'+"?>"+"\n");
jTextArea3.append("<PDMDATA>"+"\n");

//==========
try{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con_m1=DriverManager.getConnection("jdbc:odbc:step_pdm");
}
 catch(Exception e)
{
System.err.println("Error: con_m1 " + e.getMessage());
}

Statement st49=con_m1.createStatement();
ResultSet rs49=st49.executeQuery("select * from PDM_DATA");
while(rs49.next())
{

String str1=rs49.getString(2);
jTextArea3.append("<"+str1+">"+"\n");

try{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con_m2=DriverManager.getConnection("jdbc:odbc:step_pdm");

}
 catch(Exception e)
{
System.err.println("Error: con_m2 " + e.getMessage());
}

Statement st41=con_m2.createStatement();
ResultSet rs41=st41.executeQuery("select * from PDM_ENTITIES where Entity='"+str1+"'");

if(rs41.next())
{


 for(int i20=2,i21=3;i20<=22 && i21<=40; i20=i20+2, i21++)
{
si20=rs41.getString(i20);
datai20=rs49.getString(i21);
if(si20!=null && datai20!=null)
{
Recurisve_STEP_NC_Main(si20,datai20);
}
}





}

jTextArea3.append("</"+str1+">"+"\n");

		


}//while close
  


jTextArea3.append("</PDMDATA>"+"\n");

con_m2.commit();
con_m2.close(); 
con_m1.commit();
con_m1.close(); 

}
catch(Exception e)
{
System.err.println("Error: 71 " + e.getMessage());
}

 
 

//========================================//


insert4.setEnabled(false);
insert5.setEnabled(true);
insert6.setEnabled(true);

}



 else if(ae.getSource()==insert5)
               {
    

                       JFileChooser saveasChooser = new JFileChooser();

                       try{
                       int i=saveasChooser.showSaveDialog(this);
                       if(i==JFileChooser.APPROVE_OPTION)
                       {
                               String pname,fname;
                               pname=saveasChooser.getSelectedFile().getParent();
                               fname="\\"+saveasChooser.getSelectedFile().getName();

                               
				String wrmillingdata = jTextArea2.getText();
				//System.out.println(wrmillingdata);
				FileWriter fstream1 = new FileWriter(pname+fname,true);
        			BufferedWriter out = new BufferedWriter(fstream1);
    				out.write(wrmillingdata);
				out.newLine();

				out.close(); 
                   

insert5.setEnabled(false);

                       }//if





                       }//try
                       catch(Exception se){ System.out.println("Error:"+se);}

                      
 			JOptionPane.showMessageDialog(null,"PDM Data Saved");

               }




 else if(ae.getSource()==insert6)
               {
                           
                JFileChooser saveasChooser = new JFileChooser();

                       try{
                       int i=saveasChooser.showSaveDialog(this);
                       if(i==JFileChooser.APPROVE_OPTION)
                       {
                               String pname,fname;
                               pname=saveasChooser.getSelectedFile().getParent();
                               fname="\\"+saveasChooser.getSelectedFile().getName();

                               
				String wrmillingdata = jTextArea3.getText();
				//System.out.println(wrmillingdata);
				FileWriter fstream1 = new FileWriter(pname+fname,true);
       	 			BufferedWriter out = new BufferedWriter(fstream1);
    				out.write(wrmillingdata);
				out.newLine();

				out.close(); 
                   


insert6.setEnabled(false);
                       }//if





                       }//try
                       catch(Exception se){ System.out.println("Error:"+se);}

 JOptionPane.showMessageDialog(null,"XML Data Saved");


               }






  



       }
      




//============MILLING_DATA=================//

//********************Recursive_STEP_NC_main******************************//

public void Recurisve_STEP_NC_Main(String s1,String data1)
{
String si201,datai201;
try{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con1=DriverManager.getConnection("jdbc:odbc:step_pdm");

if(data1.startsWith("#"))
             {
	     
	
 
	Statement st42=con1.createStatement();      
              ResultSet rs42=st42.executeQuery("select * from PDM_DATA where id='"+data1+"'");
	      if(rs42.next())
		{
		jTextArea3.append("<" + s1 + " " +"ref=" +'"'+data1+'"'+">"+"\n");

		
     	     String p1=rs42.getString(2);if(p1==null){p1="";}
	Statement st43=con1.createStatement(); 	
	      ResultSet rs43=st43.executeQuery("select * from PDM_ENTITIES where Entity='"+p1+"'");
	      if(rs43.next())
	      {

		 
		String s1111=rs43.getString(1);		

		//=========================//
		if (s1111!=null){
		jTextArea3.append("<" + s1111 + ">"+"\n");
		}
		//=========================//

		for(int i20=2,i21=3;i20<=22 && i21<=40; i20=i20+2, i21++)
		{
				si201=rs43.getString(i20);
				datai201=rs42.getString(i21);
				if(si201!=null && datai201!=null)
				{
				STEP_Recursive(datai201,si201);
				}
		}

		
		

		//=========================//
		if (s1111!=null){
		jTextArea3.append("</" + s1111 + ">"+"\n");
		}
		//=========================//

	     

		jTextArea3.append("</" + s1 + "> "+"\n");
		  
		 
		

		}
	else
	  {
		jTextArea3.append("<" + s1 + ">");
		jTextArea3.append(data1);
		jTextArea3.append("</" + s1 + "> "+"\n");
	  
	   }

		

		
	  }
		




	 
         else
	  {
		jTextArea3.append("<" + s1 + ">");
		jTextArea3.append(data1);
		jTextArea3.append("</" + s1 + "> "+"\n");
	  
	   }    


 	
 				

}




else
	  {
		jTextArea3.append("<" + s1 + ">");
		jTextArea3.append(data1);
		jTextArea3.append("</" + s1 + "> "+"\n");
	  
	   }

 
con1.commit();
con1.close();
}//try
catch(Exception e)
{
System.out.println("Error: Main_Recursive    "+e);
}




}

//********************END-of-Recursive_STEP_NC_main******************************//







//**********************RECURSIVE***************************//       
public void STEP_Recursive(String data11,String s11)
{
String si202,datai202;
try{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con2=DriverManager.getConnection("jdbc:odbc:step_pdm");
if(data11.startsWith("#"))
			{
			Statement st421=con2.createStatement();	
			ResultSet rs421=st421.executeQuery("select * from PDM_DATA where id='"+data11+"'");	
				if(rs421.next())
					{
					jTextArea3.append("<" + s11 + " " + "ref=" +'"'+data11+'"'+">"+"\n");
					String p1=rs421.getString(2);if(p1==null){p1="";}
					Statement st422=con2.createStatement();
					ResultSet rs422=st422.executeQuery("select * from PDM_ENTITIES where Entity='"+p1+"'");
						if(rs422.next())
							{
				
								String s11111=rs422.getString(1);
								//=========================//
								if (s11111!=null){
								jTextArea3.append("<" + s11111 + ">"+"\n");
								}
								//=========================//

								
								for(int i20=2,i21=3;i20<=22 && i21<=40; i20=i20+2, i21++)
								{
									si202=rs422.getString(i20);
									datai202=rs421.getString(i21);
									if(si202!=null && datai202!=null)
									{
									STEP_Recursive1(datai202,si202);
									}
								}


								//=========================//
								if (s11111!=null){
								jTextArea3.append("</" + s11111 + ">"+"\n");
								}
								//=========================//

								jTextArea3.append("</" + s11 + "> "+"\n");
							 
  
							}


						}


			}
				else
			{
				
				jTextArea3.append("<" + s11 + ">");
				jTextArea3.append(data11);
				jTextArea3.append("</" + s11 + "> "+"\n");
			}



 
 con2.commit();
con2.close();
}
catch(Exception e)
{
System.out.println("Error : 72 "+e);
}



}
//**************END-of-RECURSIVE********************************************//

//***********************STEP-RECURSIVE1**************************//

  
public void STEP_Recursive1(String data11,String s11)
{
String si203,datai203;
try{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con3=DriverManager.getConnection("jdbc:odbc:step_pdm");
if(data11.startsWith("#"))
			{
			Statement st421=con3.createStatement();	
			ResultSet rs421=st421.executeQuery("select * from PDM_DATA where id='"+data11+"'");	
				if(rs421.next())
					{
					jTextArea3.append("<" + s11 + " " + "ref=" +'"'+data11+'"'+">"+"\n");
					String p1=rs421.getString(2);if(p1==null){p1="";}
					Statement st422=con3.createStatement();
					ResultSet rs422=st422.executeQuery("select * from PDM_ENTITIES where Entity='"+p1+"'");
						if(rs422.next())
							{
				
								String s11111=rs422.getString(1);
								//=========================//
								if (s11111!=null){
								jTextArea3.append("<" + s11111 + ">"+"\n");
								}
								//=========================//


								for(int i20=2,i21=3;i20<=22 && i21<=40; i20=i20+2, i21++)
								{
									si203=rs422.getString(i20);
									datai203=rs421.getString(i21);
									if(si203!=null && datai203!=null)
									{
									STEP_Recursive2(datai203,si203);
									}
								}


								//=========================//
								if (s11111!=null){
								jTextArea3.append("</" + s11111 + ">"+"\n");
								}
								//=========================//

								jTextArea3.append("</" + s11 + "> "+"\n");
							 
  
							}
						}

			
			}
				else
			{
				
				jTextArea3.append("<" + s11 + ">");
				jTextArea3.append(data11);
				jTextArea3.append("</" + s11 + "> "+"\n");
			}

 
 con3.commit();
con3.close();
}
catch(Exception e)
{
System.out.println("Error : 72 "+e);
}



}
//*********************************************************************//

//************END OF STEP-RECURSIVE1*************************//


//============STEP_Recursive2================//

public void STEP_Recursive2(String data11,String s11)
{
String si204,datai204;
try{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con4=DriverManager.getConnection("jdbc:odbc:step_pdm");
if(data11.startsWith("#"))
			{
			Statement st421=con4.createStatement();	
			ResultSet rs421=st421.executeQuery("select * from PDM_DATA where id='"+data11+"'");	
				if(rs421.next())
					{
					jTextArea3.append("<" + s11 + " " + "ref=" +'"'+data11+'"'+">"+"\n");
					String p1=rs421.getString(2);if(p1==null){p1="";}
					Statement st422=con4.createStatement();
					ResultSet rs422=st422.executeQuery("select * from PDM_ENTITIES where Entity='"+p1+"'");
						if(rs422.next())
							{
				
								String s11111=rs422.getString(1);
								//=========================//
								if (s11111!=null){
								jTextArea3.append("<" + s11111 + ">"+"\n");
								}
								//=========================//


								//======================//
								for(int i20=2,i21=3;i20<=22 && i21<=40; i20=i20+2, i21++)
								{
									si204=rs422.getString(i20);
									datai204=rs421.getString(i21);
									if(si204!=null && datai204!=null)
									{
									jTextArea3.append("<" + si204 + ">");
									jTextArea3.append(datai204);
									jTextArea3.append("</" + si204 + "> "+"\n"); 
									}
								} 

								//======================//								

 


								//=========================//
								if (s11111!=null){
								jTextArea3.append("</" + s11111 + ">"+"\n");
								}
								//=========================//

								jTextArea3.append("</" + s11 + "> "+"\n");
							 
  
							}
						


						}

			
			}
				else
			{
				
				jTextArea3.append("<" + s11 + ">");
				jTextArea3.append(data11);
				jTextArea3.append("</" + s11 + "> "+"\n");
			}


 

con4.commit();
con4.close();
}
catch(Exception e)
{
System.out.println("Error : 72 "+e);
}



}

//============MILLING_DATA=================//




 

       public static void main(String a[])
       {
	       
               STEP_NC app = new STEP_NC();
               app.setDefaultCloseOperation(EXIT_ON_CLOSE);
               app.setSize(1024,768);
               app.setVisible(true);  
               app.setResizable(false);
       }
     
}//main STEP_NC_Gui class





