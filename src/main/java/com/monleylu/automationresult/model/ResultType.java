package com.monleylu.automationresult.model;

/**
 * 订单结果类型
 * Created by lujian on 2017/11/8.
 */
public interface ResultType {

    //which type automation is
    interface AutomationType{
        //UI test
        final static int UI =1;
        final static String UIName="UI自动化";

        //interface test
        final static int Interface =2;
        final static String InterfaceName="接口自动化";

        //security test
        final static int Security=3;
        final static String SecurityName="安全测试";
    }

    //which paltform autotest is running
    interface AutomationPlatform{
        //PC
        final static int Pc=1;
        final static String PcName="PC";

        //wireless
        final static int Wireless=2;
        final static String WirelessName="无线";

        //wireless android
        final static int WirelessAndroid=3;
        final static String WirelessAndroidName="无线安卓";

        //wireless ios
        final static int WirelessIOS=4;
        final static String WirelessIOSName="无线IOS";

        //linux
        final static int Linux=5;
        final static String LinuxName="Linux";
    }

}
