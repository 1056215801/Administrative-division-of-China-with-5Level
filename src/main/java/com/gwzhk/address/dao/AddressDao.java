package com.gwzhk.address.dao;

import com.gwzhk.address.bean.Address;

import java.util.List;
import java.util.Map;

/**
 * Created by gwzhk on 2017/6/2.
 */
public interface AddressDao {

    public List<Address> findAllProvince();

    public List<Address> findByFather(String fatherCode);

    int insertOneAddress(Address address);

    void insertAddressPatch(List<Address> insertList);

}
