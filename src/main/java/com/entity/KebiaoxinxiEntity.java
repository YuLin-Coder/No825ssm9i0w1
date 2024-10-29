package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 课表信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-27 09:42:06
 */
@TableName("kebiaoxinxi")
public class KebiaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KebiaoxinxiEntity() {
		
	}
	
	public KebiaoxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 班级
	 */
					
	private String banji;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：班级
	 */
	public void setBanji(String banji) {
		this.banji = banji;
	}
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
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
