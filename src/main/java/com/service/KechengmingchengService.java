package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KechengmingchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KechengmingchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengmingchengView;


/**
 * 课程名称
 *
 * @author 
 * @email 
 * @date 2021-03-27 09:42:06
 */
public interface KechengmingchengService extends IService<KechengmingchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KechengmingchengVO> selectListVO(Wrapper<KechengmingchengEntity> wrapper);
   	
   	KechengmingchengVO selectVO(@Param("ew") Wrapper<KechengmingchengEntity> wrapper);
   	
   	List<KechengmingchengView> selectListView(Wrapper<KechengmingchengEntity> wrapper);
   	
   	KechengmingchengView selectView(@Param("ew") Wrapper<KechengmingchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KechengmingchengEntity> wrapper);
   	
}

