package com.discover.service;

import java.util.List;

import com.discover.entity.Services;

public interface ServicesService {

	public Services getService(Long serviceId);

	public Services addService(Services services);

	public Services updateService(Services services);

	public List<Services> getAllService();

}
