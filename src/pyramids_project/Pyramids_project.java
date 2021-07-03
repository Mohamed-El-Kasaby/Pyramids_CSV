/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids_project;

import java.util.Iterator;
import java.util.List;
import pyramids_project.DAO.DAOImp;
import pyramids_project.DAO.pyramids;

/**
 *
 * @author User
 */
public class Pyramids_project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        String path =   "D:\\ITI AI-Pro\\JAVA\\session 2 JAVA\\pyramids.csv" ; 
        
        DAOImp dataset = new DAOImp();
        List<pyramids> lst = dataset.getAllPyramidsFromCsv(path);
        
        for (Iterator<pyramids> iterator = lst.iterator(); iterator.hasNext();) {
            pyramids next = iterator.next();
            System.out.println(next);
            
        }
    }
    
}
