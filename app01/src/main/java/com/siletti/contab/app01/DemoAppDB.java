package com.siletti.contab.app01;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import com.healthmarketscience.jackcess.Database;
import com.healthmarketscience.jackcess.DatabaseBuilder;
//import com.healthmarketscience.jackcess.Table;
import com.healthmarketscience.jackcess.util.ExportUtil;

public class DemoAppDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Database db = DatabaseBuilder.open(new File("C:\\GESTIONE\\REPORTS\\FATTUR-58-60.mdb"));
			System.out.println("DB Charset: "+db.getCharset());
			System.out.println("DB FileFormat: "+db.getFileFormat());
			System.out.println("DB Properties: "+db.getDatabaseProperties());
			
			Set<String> tableNames = db.getTableNames();
			tableNames.stream().forEach(element -> System.out.println(element));
			ExportUtil.exportAll(db, new File("C:\\GESTIONE\\REPORTS"),"csv", true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
