package com.dao;

import com.entity.TuikexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TuikexinxiVO;
import com.entity.view.TuikexinxiView;


/**
 * 退课信息
 * 
 * @author 
 * @email 
 * @date 2021-03-27 09:42:06
 */
public interface TuikexinxiDao extends BaseMapper<TuikexinxiEntity> {
	
	List<TuikexinxiVO> selectListVO(@Param("ew") Wrapper<TuikexinxiEntity> wrapper);
	
	TuikexinxiVO selectVO(@Param("ew") Wrapper<TuikexinxiEntity> wrapper);
	
	List<TuikexinxiView> selectListView(@Param("ew") Wrapper<TuikexinxiEntity> wrapper);

	List<TuikexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<TuikexinxiEntity> wrapper);
	
	TuikexinxiView selectView(@Param("ew") Wrapper<TuikexinxiEntity> wrapper);
	
}
