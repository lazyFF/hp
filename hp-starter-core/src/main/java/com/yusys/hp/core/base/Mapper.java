package com.yusys.hp.core.base;

import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.base.insert.InsertMapper;

/**
 * BaseMapper
 *
 * @name BaseMapper
 * @version 1.0
 * @author hp
 */
public interface Mapper<T> extends BaseMapper,ConditionMapper,IdsMapper,InsertMapper {
}
