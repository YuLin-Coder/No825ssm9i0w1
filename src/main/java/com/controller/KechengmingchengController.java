package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.KechengmingchengEntity;
import com.entity.view.KechengmingchengView;

import com.service.KechengmingchengService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 课程名称
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-27 09:42:06
 */
@RestController
@RequestMapping("/kechengmingcheng")
public class KechengmingchengController {
    @Autowired
    private KechengmingchengService kechengmingchengService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,KechengmingchengEntity kechengmingcheng, 
		HttpServletRequest request){

        EntityWrapper<KechengmingchengEntity> ew = new EntityWrapper<KechengmingchengEntity>();
		PageUtils page = kechengmingchengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kechengmingcheng), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,KechengmingchengEntity kechengmingcheng, HttpServletRequest request){
        EntityWrapper<KechengmingchengEntity> ew = new EntityWrapper<KechengmingchengEntity>();
		PageUtils page = kechengmingchengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kechengmingcheng), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( KechengmingchengEntity kechengmingcheng){
       	EntityWrapper<KechengmingchengEntity> ew = new EntityWrapper<KechengmingchengEntity>();
      	ew.allEq(MPUtil.allEQMapPre( kechengmingcheng, "kechengmingcheng")); 
        return R.ok().put("data", kechengmingchengService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KechengmingchengEntity kechengmingcheng){
        EntityWrapper< KechengmingchengEntity> ew = new EntityWrapper< KechengmingchengEntity>();
 		ew.allEq(MPUtil.allEQMapPre( kechengmingcheng, "kechengmingcheng")); 
		KechengmingchengView kechengmingchengView =  kechengmingchengService.selectView(ew);
		return R.ok("查询课程名称成功").put("data", kechengmingchengView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        KechengmingchengEntity kechengmingcheng = kechengmingchengService.selectById(id);
        return R.ok().put("data", kechengmingcheng);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        KechengmingchengEntity kechengmingcheng = kechengmingchengService.selectById(id);
        return R.ok().put("data", kechengmingcheng);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KechengmingchengEntity kechengmingcheng, HttpServletRequest request){
    	kechengmingcheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kechengmingcheng);

        kechengmingchengService.insert(kechengmingcheng);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KechengmingchengEntity kechengmingcheng, HttpServletRequest request){
    	kechengmingcheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kechengmingcheng);

        kechengmingchengService.insert(kechengmingcheng);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody KechengmingchengEntity kechengmingcheng, HttpServletRequest request){
        //ValidatorUtils.validateEntity(kechengmingcheng);
        kechengmingchengService.updateById(kechengmingcheng);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        kechengmingchengService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<KechengmingchengEntity> wrapper = new EntityWrapper<KechengmingchengEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = kechengmingchengService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
