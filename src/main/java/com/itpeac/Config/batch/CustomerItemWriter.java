package com.itpeac.Config.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itpeac.RepositoryEs.ElasticsearchCustomerRepository;
import com.itpeac.domain.Customer;

@Component
public class CustomerItemWriter implements ItemWriter<Customer> {

    private ElasticsearchCustomerRepository elasticsearchCustomerRepository;
 
    @Autowired
    public CustomerItemWriter(ElasticsearchCustomerRepository elasticsearchCustomerRepository) {
        this.elasticsearchCustomerRepository = elasticsearchCustomerRepository;
    }
 

	@Override
	public void write(List<? extends Customer> items) throws Exception {
		
/*		for(int i=0;i<items.size();i++)
		 System.out.println(">>"+items.get(i).getBirthdate().toString());*/
		 this.elasticsearchCustomerRepository.saveAll(items);
		 
	}

}