package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.KechengmingchengDao;
import com.entity.KechengmingchengEntity;
import com.service.KechengmingchengService;
import com.entity.vo.KechengmingchengVO;
import com.entity.view.KechengmingchengView;

@Service("kechengmingchengService")
public class KechengmingchengServiceImpl extends ServiceImpl<KechengmingchengDao, KechengmingchengEntity> implements KechengmingchengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KechengmingchengEntity> page = this.selectPage(
                new Query<KechengmingchengEntity>(params).getPage(),
                new EntityWrapper<KechengmingchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KechengmingchengEntity> wrapper) {
		  Page<KechengmingchengView> page =new Query<KechengmingchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KechengmingchengVO> selectListVO(Wrapper<KechengmingchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KechengmingchengVO selectVO(Wrapper<KechengmingchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KechengmingchengView> selectListView(Wrapper<KechengmingchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KechengmingchengView selectView(Wrapper<KechengmingchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
