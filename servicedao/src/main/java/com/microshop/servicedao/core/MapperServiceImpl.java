package com.microshop.servicedao.core;


import com.microshop.servicedao.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MapperServiceImpl {

    @Autowired
    MallbannerMapper mallbannerMapper;
    @Autowired
    MallcategoryMapper mallcategoryMapper;
    @Autowired
    MallgoodskindMapper mallgoodskindMapper;
    @Autowired
    MallgoodslogMapper mallgoodslogMapper;
    @Autowired
    MallgoodsMapper mallgoodsMapper;
    @Autowired
    MallgoodspictureMapper mallgoodspictureMapper;
    @Autowired
    MallorderdetailsMapper mallorderdetailsMapper;
    @Autowired
    MallorderlogMapper mallorderlogMapper;
    @Autowired
    MallorderMapper mallorderMapper;
    @Autowired
    MallorderpaylogMapper mallorderpaylogMapper;
    @Autowired
    MallorderpayMapper mallorderpayMapper;
    @Autowired
    MallshopdetailsMapper mallshopdetailsMapper;
    @Autowired
    MallshoplicenseMapper mallshoplicenseMapper;
    @Autowired
    MallshoplogMapper mallshoplogMapper;
    @Autowired
    MallshopMapper mallshopMapper;
    @Autowired
    MalluserbaseMapper malluserbaseMapper;
    @Autowired
    MalluserloginMapper malluserloginMapper;

    public MallbannerMapper getMallbannerMapper() {
        return mallbannerMapper;
    }

    public MallcategoryMapper getMallcategoryMapper() {
        return mallcategoryMapper;
    }

    public MallgoodskindMapper getMallgoodskindMapper() {
        return mallgoodskindMapper;
    }

    public MallgoodslogMapper getMallgoodslogMapper() {
        return mallgoodslogMapper;
    }

    public MallgoodsMapper getMallgoodsMapper() {
        return mallgoodsMapper;
    }

    public MallgoodspictureMapper getMallgoodspictureMapper() {
        return mallgoodspictureMapper;
    }

    public MallorderdetailsMapper getMallorderdetailsMapper() {
        return mallorderdetailsMapper;
    }

    public MallorderlogMapper getMallorderlogMapper() {
        return mallorderlogMapper;
    }

    public MallorderMapper getMallorderMapper() {
        return mallorderMapper;
    }

    public MallorderpaylogMapper getMallorderpaylogMapper() {
        return mallorderpaylogMapper;
    }

    public MallorderpayMapper getMallorderpayMapper() {
        return mallorderpayMapper;
    }

    public MallshopdetailsMapper getMallshopdetailsMapper() {
        return mallshopdetailsMapper;
    }

    public MallshoplicenseMapper getMallshoplicenseMapper() {
        return mallshoplicenseMapper;
    }

    public MallshoplogMapper getMallshoplogMapper() {
        return mallshoplogMapper;
    }

    public MallshopMapper getMallshopMapper() {
        return mallshopMapper;
    }

    public MalluserbaseMapper getMalluserbaseMapper() {
        return malluserbaseMapper;
    }

    public MalluserloginMapper getMalluserloginMapper() {
        return malluserloginMapper;
    }




}
