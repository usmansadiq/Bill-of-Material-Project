/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataSource;
import DataEntites.BillOfMaterial;
import DataEntites.Operation;
import DataEntites.Parts;
import java.util.*;
import java.util.Random;

/**
 *
 * @author usman
 */
public class LocalDataSource {
    
    private String _BomName = "vertimountv3s-500p-";
    //-----------------------------------------------------------------------------------------------------------------------------------------
    private String[] _PartName = {  "Bottom Assembled", "Base Plate", "Side Bracket", "Spring Location Ring", "Noise Pad",
                                    "Spring", "Load Plate", "Top Plate Assembly", "Top Plate", "Stud", "Top Screw Assembly",
                                    "Nut Full", "Washer Flat", "Hex Set Screw", "Nutt Nylon", "Washer Spring", "Vertimount" };
    //-----------------------------------------------------------------------------------------------------------------------------------------
    private String[] _MaterialName = { "Steel Sheet Black", "Galvanised Steel Sheet", "Circular Hallow Section Black" };
    //-----------------------------------------------------------------------------------------------------------------------------------------
    private String[] _OperationName = { "Paint", "Cut", "Fold", "Saw", "Weld", "Punch", "Tap", "Drill", "Assemble" };
    //-----------------------------------------------------------------------------------------------------------------------------------------
    private String[] _EquipmentName = { "Welder", "Plasma cutter", "Guillotine", "Punch", "Press Break" };
    //-----------------------------------------------------------------------------------------------------------------------------------------
    private String[] _ContractorName = { "PLB ltd", "BLT ltd" };
    //-----------------------------------------------------------------------------------------------------------------------------------------
    
    public List<BillOfMaterial> LoadBom(int totalBom)
    {
        List<BillOfMaterial> list;
        list = new ArrayList<>();
        Random rand = new Random();

        for (int index = 1; index < totalBom + 1; index++)
        {
            BillOfMaterial bom = new BillOfMaterial();
            //--------------------------------------------------------------------------------------------------------
            //<editor-fold defaultstate="collapsed" desc="Populating BOM...">
            bom.setBOM_ID(index);
            bom.setBOM_Name(_BomName+index);
            bom.setStock(rand.nextInt(3));
            bom.setLevel(rand.nextInt(2));
            //</editor-fold>
            //--------------------------------------------------------------------------------------------------------
            for(int i = 0; i < 17; i++)
            {
                Parts part = new Parts();
                //--------------------------------------------------------------------------------------------------------
                // <editor-fold defaultstate="collapsed" desc="Populating Parts...">
                part.setPart_ID(i+1);
                part.setPart_Name((i < _PartName.length) ? _PartName[i] : "None" + i);
                part.setArea(rand.nextDouble());
                part.setDept(rand.nextDouble());
                part.setDiameter(rand.nextInt(5));
                part.setQuantity(rand.nextInt(2));
                //</editor-fold>
                //--------------------------------------------------------------------------------------------------------
                // <editor-fold defaultstate="collapsed" desc="Populating Material...">
                if(part.getPart_Name().equals(_PartName[1]))
                {
                    part.setMaterial_ID(1);
                    part.setMaterial_Name(_MaterialName[0]);
                }
                else if(part.getPart_Name().equals(_PartName[2]))
                {
                    part.setMaterial_ID(2);
                    part.setMaterial_Name(_MaterialName[1]);
                }
                else if(part.getPart_Name().equals(_PartName[3]))
                {
                    part.setMaterial_ID(3);
                    part.setMaterial_Name(_MaterialName[2]);
                }
                else
                {
                    part.setMaterial_ID(0);
                    part.setMaterial_Name("None");
                }
                //</editor-fold>
                //--------------------------------------------------------------------------------------------------------
                bom.partList.add(part);
                
                //--------------------------------------------------------------------------------------------------------
                // <editor-fold defaultstate="collapsed" desc="Populating Operations with Switch Statement...">
                switch (part.getPart_Name()) 
                {
                    case "Bottom Assembled":
                        // <editor-fold defaultstate="collapsed" desc="Populating Operations...">
                        Operation opt = new Operation();
                        opt.setOperation_ID(1);
                        opt.setOperation_Name(_OperationName[0]);
                        opt.setEquipment_Name("None");
                        opt.setContractor_ID(1);
                        opt.setContractor_Name(_ContractorName[0]);
                        opt.setOperation_Time(0, rand.nextInt(4), rand.nextInt(60));
                        opt.setSet_Up_Time(0, rand.nextInt(3), rand.nextInt(60));
                        opt.setAssembly_Time(0, rand.nextInt(3), rand.nextInt(60));
                        opt.setNo_of_Staff(rand.nextInt(2));
                            
                        Operation opt1 = new Operation();
                        opt1.setOperation_ID(5);
                        opt1.setOperation_Name(_OperationName[4]);
                        opt1.setEquipment_Name(_EquipmentName[0]);
                        opt1.setContractor_ID(0);
                        opt1.setContractor_Name("None");
                        opt1.setOperation_Time(0, rand.nextInt(4), rand.nextInt(60));
                        opt1.setSet_Up_Time(0, rand.nextInt(3), rand.nextInt(60));
                        opt1.setAssembly_Time(0, rand.nextInt(3), rand.nextInt(60));
                        opt1.setNo_of_Staff(rand.nextInt(2));
                        //</editor-fold>    
                        part.optList.add(opt);
                        part.optList.add(opt1);
                        break;
                    case "Base Plate":
                        // <editor-fold defaultstate="collapsed" desc="Populating Operations...">
                        Operation opt2 = new Operation();
                        opt2.setOperation_ID(2);
                        opt2.setOperation_Name(_OperationName[1]);
                        opt2.setEquipment_Name(_EquipmentName[2]);
                        opt2.setContractor_ID(0);
                        opt2.setContractor_Name("None");
                        opt2.setOperation_Time(0, rand.nextInt(4), rand.nextInt(60));
                        opt2.setSet_Up_Time(0, rand.nextInt(3), rand.nextInt(60));
                        opt2.setAssembly_Time(0, rand.nextInt(3), rand.nextInt(60));
                        opt2.setNo_of_Staff(rand.nextInt(2));
                            
                        Operation opt3 = new Operation();
                        opt3.setOperation_ID(6);
                        opt3.setOperation_Name(_OperationName[5]);
                        opt3.setEquipment_Name(_EquipmentName[3]);
                        opt3.setContractor_ID(0);
                        opt3.setContractor_Name("None");
                        opt3.setOperation_Time(0, rand.nextInt(4), rand.nextInt(60));
                        opt3.setSet_Up_Time(0, rand.nextInt(3), rand.nextInt(60));
                        opt3.setAssembly_Time(0, rand.nextInt(3), rand.nextInt(60));
                        opt3.setNo_of_Staff(rand.nextInt(2));
                        //</editor-fold>    
                        part.optList.add(opt2);
                        part.optList.add(opt3);
                        break;
                    case "Side Bracket":
                        // <editor-fold defaultstate="collapsed" desc="Populating Operations...">
                        Operation opt4 = new Operation();
                        opt4.setOperation_ID(2);
                        opt4.setOperation_Name(_OperationName[1]);
                        opt4.setEquipment_Name(_EquipmentName[1]);
                        opt4.setContractor_ID(1);
                        opt4.setContractor_Name(_ContractorName[0]);
                        opt4.setOperation_Time(0, rand.nextInt(4), rand.nextInt(60));
                        opt4.setSet_Up_Time(0, rand.nextInt(3), rand.nextInt(60));
                        opt4.setAssembly_Time(0, rand.nextInt(3), rand.nextInt(60));
                        opt4.setNo_of_Staff(rand.nextInt(2));
                        
                        Operation opt5 = new Operation();
                        opt5.setOperation_ID(3);
                        opt5.setOperation_Name(_OperationName[2]);
                        opt5.setEquipment_Name(_EquipmentName[4]);
                        opt5.setContractor_ID(0);
                        opt5.setContractor_Name("None");
                        opt5.setOperation_Time(0, rand.nextInt(4), rand.nextInt(60));
                        opt5.setSet_Up_Time(0, rand.nextInt(3), rand.nextInt(60));
                        opt5.setAssembly_Time(0, rand.nextInt(3), rand.nextInt(60));
                        opt5.setNo_of_Staff(rand.nextInt(2));
                        //</editor-fold>    
                        part.optList.add(opt4);
                        part.optList.add(opt5);
                        break;
                    case "Spring Location Ring":
                        // <editor-fold defaultstate="collapsed" desc="Populating Operations...">
                        Operation opt6 = new Operation();
                        opt6.setOperation_ID(2);
                        opt6.setOperation_Name(_OperationName[1]);
                        opt6.setEquipment_Name(_EquipmentName[2]);
                        opt6.setContractor_ID(0);
                        opt6.setContractor_Name("None");
                        opt6.setOperation_Time(0, rand.nextInt(4), rand.nextInt(60));
                        opt6.setSet_Up_Time(0, rand.nextInt(3), rand.nextInt(60));
                        opt6.setAssembly_Time(0, rand.nextInt(3), rand.nextInt(60));
                        opt6.setNo_of_Staff(rand.nextInt(2));
                        //</editor-fold>    
                        part.optList.add(opt6);
                        break;
                    case "Top Plate":
                        // <editor-fold defaultstate="collapsed" desc="Populating Operations...">
                        Operation opt7 = new Operation();
                        opt7.setOperation_ID(8);
                        opt7.setOperation_Name(_OperationName[7]);
                        opt7.setEquipment_Name("None");
                        opt7.setContractor_ID(0);
                        opt7.setContractor_Name("None");
                        opt7.setOperation_Time(0, rand.nextInt(4), rand.nextInt(60));
                        opt7.setSet_Up_Time(0, rand.nextInt(3), rand.nextInt(60));
                        opt7.setAssembly_Time(0, rand.nextInt(3), rand.nextInt(60));
                        opt7.setNo_of_Staff(rand.nextInt(2));
                        
                        Operation opt8 = new Operation();
                        opt8.setOperation_ID(4);
                        opt8.setOperation_Name(_OperationName[3]);
                        opt8.setEquipment_Name("None");
                        opt8.setContractor_ID(0);
                        opt8.setContractor_Name("None");
                        opt8.setOperation_Time(0, rand.nextInt(4), rand.nextInt(60));
                        opt8.setSet_Up_Time(0, rand.nextInt(3), rand.nextInt(60));
                        opt8.setAssembly_Time(0, rand.nextInt(3), rand.nextInt(60));
                        opt8.setNo_of_Staff(rand.nextInt(2));
                        
                        Operation opt9 = new Operation();
                        opt9.setOperation_ID(7);
                        opt9.setOperation_Name(_OperationName[6]);
                        opt9.setEquipment_Name("None");
                        opt9.setContractor_ID(0);
                        opt9.setContractor_Name("None");
                        opt9.setOperation_Time(0, rand.nextInt(4), rand.nextInt(60));
                        opt9.setSet_Up_Time(0, rand.nextInt(3), rand.nextInt(60));
                        opt9.setAssembly_Time(0, rand.nextInt(3), rand.nextInt(60));
                        opt9.setNo_of_Staff(rand.nextInt(2));
                        //</editor-fold>
                        part.optList.add(opt7);
                        part.optList.add(opt8);
                        part.optList.add(opt9);
                        break;
                    case "Top Plate Assembly":
                        // <editor-fold defaultstate="collapsed" desc="Populating Operations...">
                        Operation opt10 = new Operation();
                        opt10.setOperation_ID(1);
                        opt10.setOperation_Name(_OperationName[0]);
                        opt10.setEquipment_Name("None");
                        opt10.setContractor_ID(2);
                        opt10.setContractor_Name(_ContractorName[1]);
                        opt10.setOperation_Time(0, rand.nextInt(4), rand.nextInt(60));
                        opt10.setSet_Up_Time(0, rand.nextInt(3), rand.nextInt(60));
                        opt10.setAssembly_Time(0, rand.nextInt(3), rand.nextInt(60));
                        opt10.setNo_of_Staff(rand.nextInt(2));
                            
                        Operation opt11 = new Operation();
                        opt11.setOperation_ID(5);
                        opt11.setOperation_Name(_OperationName[4]);
                        opt11.setEquipment_Name(_EquipmentName[0]);
                        opt11.setContractor_ID(0);
                        opt11.setContractor_Name("None");
                        opt11.setOperation_Time(0, rand.nextInt(4), rand.nextInt(60));
                        opt11.setSet_Up_Time(0, rand.nextInt(3), rand.nextInt(60));
                        opt11.setAssembly_Time(0, rand.nextInt(3), rand.nextInt(60));
                        opt11.setNo_of_Staff(rand.nextInt(2));
                        //</editor-fold>    
                        part.optList.add(opt10);
                        part.optList.add(opt11);
                        break;
                    case "Top Screw Assembly":
                        // <editor-fold defaultstate="collapsed" desc="Populating Operations...">
                        Operation opt12 = new Operation();
                        opt12.setOperation_ID(9);
                        opt12.setOperation_Name(_OperationName[8]);
                        opt12.setEquipment_Name("None");
                        opt12.setContractor_ID(0);
                        opt12.setContractor_Name("None");
                        opt12.setOperation_Time(0, rand.nextInt(4), rand.nextInt(60));
                        opt12.setSet_Up_Time(0, rand.nextInt(3), rand.nextInt(60));
                        opt12.setAssembly_Time(0, rand.nextInt(3), rand.nextInt(60));
                        opt12.setNo_of_Staff(rand.nextInt(2));
                        //</editor-fold>        
                        part.optList.add(opt12);
                        break;    
                    default: 
                        // <editor-fold defaultstate="collapsed" desc="Populating Operations...">
                        Operation opt13 = new Operation();
                        opt13.setOperation_ID(0);
                        opt13.setOperation_Name("None");
                        opt13.setEquipment_Name("None");
                        opt13.setContractor_ID(0);
                        opt13.setContractor_Name("None");
                        opt13.setOperation_Time(0, rand.nextInt(4), rand.nextInt(60));
                        opt13.setSet_Up_Time(0, rand.nextInt(3), rand.nextInt(60));
                        opt13.setAssembly_Time(0, rand.nextInt(3), rand.nextInt(60));
                        opt13.setNo_of_Staff(rand.nextInt(2));
                        //</editor-fold>        
                        part.optList.add(opt13);
                        break;
                }
                //</editor-fold>
                //--------------------------------------------------------------------------------------------------------
            }
            list.add(bom);
        }
        return list;
    }
}
