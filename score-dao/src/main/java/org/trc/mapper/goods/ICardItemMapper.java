package org.trc.mapper.goods;

import org.trc.domain.goods.CardItemDO;
import org.trc.util.BaseMapper;

/**
 * author: hzwzhen
 * JDK-version:  JDK1.8
 * comments:
 * since Date： 2017/6/29
 */
public interface ICardItemMapper extends BaseMapper<CardItemDO> {

    int deleteByBatchNumber(CardItemDO cardItem);

    CardItemDO selectByParams(CardItemDO cardItem);

    int deleteById(CardItemDO cardItem);
}

