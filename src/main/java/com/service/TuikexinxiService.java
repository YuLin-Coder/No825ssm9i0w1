package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TuikexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TuikexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TuikexinxiView;


/**
 * 退课信息
 *
 * @author 
 * @email 
 * @date 2021-03-27 09:42:06
 */
public interface TuikexinxiService extends IService<TuikexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TuikexinxiVO> selectListVO(Wrapper<TuikexinxiEntity> wrapper);
   	
   	TuikexinxiVO selectVO(@Param("ew") Wrapper<TuikexinxiEntity> wrapper);
   	
   	List<TuikexinxiView> selectListView(Wrapper<TuikexinxiEntity> wrapper);
   	
   	TuikexinxiView selectView(@Param("ew") Wrapper<TuikexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TuikexinxiEntity> wrapper);
   	
}

