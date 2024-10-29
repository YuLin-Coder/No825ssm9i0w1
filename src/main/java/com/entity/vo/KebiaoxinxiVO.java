package com.entity.vo;

import com.entity.KebiaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 课表信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-27 09:42:06
 */
public class KebiaoxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学期
	 */
	
	private String xueqi;
		
	/**
	 * 星期
	 */
	
	private String xingqi;
		
	/**
	 * 第一节
	 */
	
	private String diyijie;
		
	/**
	 * 第二节
	 */
	
	private String dierjie;
		
	/**
	 * 第三节
	 */
	
	private String disanjie;
		
	/**
	 * 第四节
	 */
	
	private String disijie;
		
	/**
	 * 第五节
	 */
	
	private String diwujie;
				
	
	/**
	 * 设置：学期
	 */
	 
	public void setXueqi(String xueqi) {
		this.xueqi = xueqi;
	}
	
	/**
	 * 获取：学期
	 */
	public String getXueqi() {
		return xueqi;
	}
				
	
	/**
	 * 设置：星期
	 */
	 
	public void setXingqi(String xingqi) {
		this.xingqi = xingqi;
	}
	
	/**
	 * 获取：星期
	 */
	public String getXingqi() {
		return xingqi;
	}
				
	
	/**
	 * 设置：第一节
	 */
	 
	public void setDiyijie(String diyijie) {
		this.diyijie = diyijie;
	}
	
	/**
	 * 获取：第一节
	 */
	public String getDiyijie() {
		return diyijie;
	}
				
	
	/**
	 * 设置：第二节
	 */
	 
	public void setDierjie(String dierjie) {
		this.dierjie = dierjie;
	}
	
	/**
	 * 获取：第二节
	 */
	public String getDierjie() {
		return dierjie;
	}
				
	
	/**
	 * 设置：第三节
	 */
	 
	public void setDisanjie(String disanjie) {
		this.disanjie = disanjie;
	}
	
	/**
	 * 获取：第三节
	 */
	public String getDisanjie() {
		return disanjie;
	}
				
	
	/**
	 * 设置：第四节
	 */
	 
	public void setDisijie(String disijie) {
		this.disijie = disijie;
	}
	
	/**
	 * 获取：第四节
	 */
	public String getDisijie() {
		return disijie;
	}
				
	
	/**
	 * 设置：第五节
	 */
	 
	public void setDiwujie(String diwujie) {
		this.diwujie = diwujie;
	}
	
	/**
	 * 获取：第五节
	 */
	public String getDiwujie() {
		return diwujie;
	}
			
}
