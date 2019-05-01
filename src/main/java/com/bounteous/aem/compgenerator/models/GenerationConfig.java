/*
 * ***********************************************************************
 * BOUNTEOUS CONFIDENTIAL
 * ___________________
 *
 * Copyright 2019 Bounteous
 * All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains the property
 * of Bounteous and its suppliers, if any. The intellectual and
 * technical concepts contained herein are proprietary to Bounteous
 * and its suppliers and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Bounteous.
 * ***********************************************************************
 */
package com.bounteous.aem.compgenerator.models;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.CaseUtils;

public class GenerationConfig {

    private String name;

    private String title;

    private String group;

    private String type;

    private Options options;

    private String compDir;

    private String javaFormatedName;


    public String getName() {
        if(StringUtils.isNotBlank(name)){
            return name.replaceAll("[^a-z0-9+]", "-");
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJavaFormatedName() {
        if(StringUtils.isNotBlank(name)){
            javaFormatedName = CaseUtils.toCamelCase(name.replaceAll("-", " "), true);
        }
        return javaFormatedName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    public String getCompDir() {
        return compDir;
    }

    public void setCompDir(String compDir) {
        this.compDir = compDir;
    }

}
