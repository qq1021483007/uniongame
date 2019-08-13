package com.woniuxy.dao;

import com.woniuxy.domin.Playeracc;
import com.woniuxy.domin.PlayeraccExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlayeraccMapper {
    long countByExample(PlayeraccExample example);

    int deleteByExample(PlayeraccExample example);

    int insert(Playeracc record);

    int insertSelective(Playeracc record);

    List<Playeracc> selectByExample(PlayeraccExample example);

    int updateByExampleSelective(@Param("record") Playeracc record, @Param("example") PlayeraccExample example);

    int updateByExample(@Param("record") Playeracc record, @Param("example") PlayeraccExample example);
}