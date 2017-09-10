package co.id.payment.corporate.corporateh2h.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import co.id.payment.corporate.corporateh2h.entity.Client;

public interface Clientdao extends PagingAndSortingRepository<Client, String> {

}
