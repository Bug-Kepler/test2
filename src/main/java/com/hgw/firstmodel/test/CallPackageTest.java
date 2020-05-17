package com.hgw.firstmodel.test;

import com.hgw.firstmodel.POJO.CallPackage;
import com.hgw.firstmodel.POJO.CardTypeEnum;
import com.hgw.firstmodel.POJO.SimCard;

/**
 * @author 追风同学
 * @date 2020/05/17 8:35
 * @description
 */
public class CallPackageTest {

    public static void main(String[] args) {

        SimCard simCard=new SimCard(CardTypeEnum.SMALL_CARD, "13888888888", "拉勾", "123456", 12.58, 50, 1000);
        CallPackage callPackage=new CallPackage(25,100,25);
        callPackage.show();
        callPackage.call(5,simCard);
    }
}
