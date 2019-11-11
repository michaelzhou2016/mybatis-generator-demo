package ai.guiji.mybatisgeneratordemo.mapper;

import ai.guiji.mybatisgeneratordemo.model.TOssAuthComcode;

public interface TOssAuthComcodeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TOssAuthComcode record);

    int insertSelective(TOssAuthComcode record);

    TOssAuthComcode selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TOssAuthComcode record);

    int updateByPrimaryKey(TOssAuthComcode record);
}