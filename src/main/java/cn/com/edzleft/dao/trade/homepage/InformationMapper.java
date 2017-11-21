package cn.com.edzleft.dao.trade.homepage;

import cn.com.edzleft.entity.Information;

/**
 * Created by ibmtech on 2017/11/21.
 */
public interface InformationMapper {
    /**
     * 基本信息查询
     */
    public Information selectBaseInformation();

    /**
     * 高级信息查询
     */
    public Information selectAdvancedInforation();

    /**
     * 修改基本信息
     * param :id
     */
    public void updateInformation(Information info);

}
