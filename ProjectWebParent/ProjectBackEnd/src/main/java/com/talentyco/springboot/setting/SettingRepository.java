package com.talentyco.springboot.setting;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

import com.shopme.common.entity.setting.Setting;
import com.shopme.common.entity.setting.SettingCategory;
import com.talentyco.bisogne.common.entity.setting.Setting;
import com.talentyco.bisogne.common.entity.setting.SettingCategory;

public interface SettingRepository extends CrudRepository<Setting, String> {
	public List<Setting> findByCategory(SettingCategory category);
}