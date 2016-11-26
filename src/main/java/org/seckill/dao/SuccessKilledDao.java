package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.SuccessKilled;


public interface SuccessKilledDao {

    /**
     * 
     * @param seckillId
     * @param userPhone
     * @return
     * 插入的行数
     */
    int insertSuccessKilled(@Param("seckillId") long seckillId ,@Param("userPhone") long userPhone);

    /**
     * 根据id查询
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

}
