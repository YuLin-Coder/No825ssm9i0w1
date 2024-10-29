package com.dao;

import com.entity.KechengmingchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechengmingchengVO;
import com.entity.view.KechengmingchengView;


/**
 * 课程名称
 * 
 * @author 
 * @email 
 * @date 2021-03-27 09:42:06
 */
public interface KechengmingchengDao extends BaseMapper<KechengmingchengEntity> {
	
	List<KechengmingchengVO> selectListVO(@Param("ew") Wrapper<KechengmingchengEntity> wrapper);
	
	KechengmingchengVO selectVO(@Param("ew") Wrapper<KechengmingchengEntity> wrapper);
	
	List<KechengmingchengView> selectListView(@Param("ew") Wrapper<KechengmingchengEntity> wrapper);

	List<KechengmingchengView> selectListView(Pagination page,@Param("ew") Wrapper<KechengmingchengEntity> wrapper);
	
	KechengmingchengView selectView(@Param("ew") Wrapper<KechengmingchengEntity> wrapper);
	
}
