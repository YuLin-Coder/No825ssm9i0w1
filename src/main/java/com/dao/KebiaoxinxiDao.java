package com.dao;

import com.entity.KebiaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KebiaoxinxiVO;
import com.entity.view.KebiaoxinxiView;


/**
 * 课表信息
 * 
 * @author 
 * @email 
 * @date 2021-03-27 09:42:06
 */
public interface KebiaoxinxiDao extends BaseMapper<KebiaoxinxiEntity> {
	
	List<KebiaoxinxiVO> selectListVO(@Param("ew") Wrapper<KebiaoxinxiEntity> wrapper);
	
	KebiaoxinxiVO selectVO(@Param("ew") Wrapper<KebiaoxinxiEntity> wrapper);
	
	List<KebiaoxinxiView> selectListView(@Param("ew") Wrapper<KebiaoxinxiEntity> wrapper);

	List<KebiaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<KebiaoxinxiEntity> wrapper);
	
	KebiaoxinxiView selectView(@Param("ew") Wrapper<KebiaoxinxiEntity> wrapper);
	
}
