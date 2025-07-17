package com.discover.service;


import com.discover.entity.Support;

import java.util.List;

public interface SupportService {

    public Support save(Support support);

    public Support getById(Long supportId);

    public List<Support> getAllSupports();

    public void delete(Long supportId);
}
