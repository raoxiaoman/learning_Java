package com.raohui.dao.base;

import java.util.List;

import com.raohui.model.sc;
/**
*  @author author
*/
public interface scBaseMapper {

    int insertsc(sc object);

    int updatesc(sc object);

    List<sc> querysc(sc object);

    sc queryscLimit1(sc object);

}