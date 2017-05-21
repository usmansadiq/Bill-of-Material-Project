/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bom;
import DataEntites.BillOfMaterial;
import DataEntites.Operation;
import DataEntites.Parts;
import DataSource.LocalDataSource;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.ServerAddress;
import com.mongodb.WriteConcern;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
/**
 *
 * @author Usman Sadiq
 */
public class BOM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
         try
         {  
             
            MongoClient mongoClient = new MongoClient( "localhost" , 5000 );
            // Now connect to your databases
            //mongod --port 5000 --dbpath D:\mongodbdata\ (please mention above created path)
            //mongo --port 5000
            DB db = mongoClient.getDB( "bomdb" );
            System.out.println("Connect to database successfully");
            
            //DBCollection col1 = db.createCollection("Parts",p1);
            DBCollection col2 = db.getCollection("BOM");
            System.out.println("Collection created successfully");
            
            List<BillOfMaterial> list;
            LocalDataSource ds = new LocalDataSource();
            list = ds.LoadBom(1000);
            // To connect to mongodb server
            
           for (BillOfMaterial Element:list)
           {
               for(Parts ElementPart: Element.partList)
               {
                   for(Operation ElementOp: ElementPart.optList)
                   {
                        BasicDBObject doc = new BasicDBObject("BOM_Name", Element.getBOM_Name()).
                        append("Level", Element.getLevel()).        
                        append("Stock", Element.getStock()).
                                
                        append("Parts",new BasicDBObject("Part_ID", ElementPart.getPart_ID()).
                        append("Part_Name", ElementPart.getPart_Name()).
                        append("Diameter",ElementPart.getDiamter()).
                        append("Dept", ElementPart.getDept()).
                        append("Area", ElementPart.getArea()).
                        append("Quantity", ElementPart.getQuantity()).
                                
                        append("Material", new BasicDBObject("Material_ID", ElementPart.getMaterial_ID()).
                        append("Material_Name",ElementPart.getMaterial_Name()).
                                
                        append("Operation", new BasicDBObject("Operation_ID", ElementOp.getOperation_ID()).
                        append("Operation_Name", ElementOp.getOperation_Name()).
                        append("Equipment_Name", ElementOp.getEquipment_Name()).
                        append("No_of_Staff", ElementOp.getNo_of_Staff()).
                        append("Operation_Time", ElementOp.getOperation_Time().get(Calendar.MINUTE)* ElementOp.getOperation_Time().get(Calendar.SECOND)).
                        append("Assembly_Time", ElementOp.getAssembly_Time().get(Calendar.MINUTE)* ElementOp.getAssembly_Time().get(Calendar.SECOND)).
                        append("Set_Up_Time", ElementOp.getSet_Up_Time().get(Calendar.MINUTE)* ElementOp.getSet_Up_Time().get(Calendar.SECOND)).
                                
                        append("Contractor", new BasicDBObject("Contractor_ID", ElementOp.getContractor_ID()).
                        append("Contractor_Name", ElementOp.getContractor_Name())))));
                        
                        col2.insert(doc);
                   }
               }
           }
            
            System.out.println("Document inserted successfully");
        }
         catch(Exception e)
         {
	     System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	 }
        
    }
    
}
