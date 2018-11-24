package com.siletti.contab.app01;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import com.healthmarketscience.jackcess.Database;
import com.healthmarketscience.jackcess.DatabaseBuilder;
import com.healthmarketscience.jackcess.Table;
import com.healthmarketscience.jackcess.util.ExportUtil;

public class DemoAppDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Database db = DatabaseBuilder.open(new File("C:\\GESTIONE\\REPORTS\\2018.11.16.21610.mdb"));
			Set<String> tableNames = db.getTableNames();
			tableNames.stream().forEach(element -> System.out.println(element));
			ExportUtil.exportAll(db, new File("C:\\GESTIONE\\REPORTS"),"csv", true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Database db2 = DatabaseBuilder.create(Database.FileFormat.V2016 ,new File("C:\\GESTIONE\\REPORTS\\temp2018"));
			//db2.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("ciao sono qua, HO FINITO!");
	}

}
