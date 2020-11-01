package dev.amcosta.servlet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class DataSource {
	
	private static Map<Integer, Company> list = new HashMap<Integer, Company>();
	private static AtomicInteger index = new AtomicInteger();
	
	static {
		for (int i = 1; i <= 2; i++) {
			Integer id = DataSource.index.getAndIncrement();
			Company company = new Company("Empresa " + i);
			company.setId(id);
			DataSource.list.put(id, company);
		}
	}
	
	public Company save(Company company) {
		Integer id = DataSource.index.getAndIncrement();
		company.setId(id);
		
		DataSource.list.put(id, company);
		
		System.out.print("Empresa salva: ");
		System.out.println(company);
		
		return company;
	}
	
	public Company findById(Integer id) {
		return DataSource.list.get(id);
	}

	public static List<Company> findAll() {
		return new ArrayList<Company>(DataSource.list.values());
	}

	
	public Company update(Company company) {
		DataSource.list.replace(company.getId(), company);
		return company;
	}

	public void remove(Integer id) {
		DataSource.list.remove(id);
	}
}
