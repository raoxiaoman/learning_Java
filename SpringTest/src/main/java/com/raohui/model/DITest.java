package com.raohui.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class DITest {
    List<String> lists;
    Set<String> sets;
    Map<Integer, String> maps;
    Properties properties;

    @Resource
    private
    HelloWorld helloWorld1;
    @Autowired(required = false)
    @Qualifier("helloWorld2")
    HelloWorld helloWorld2;

    public List<String> getLists() {
        return lists;
    }

    @Required
    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public Set<String> getSets() {
        return sets;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public Map<Integer, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<Integer, String> maps) {
        this.maps = maps;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public HelloWorld getHelloWorld1() {
        return helloWorld1;
    }

    public HelloWorld getHelloWorld2() {
        return helloWorld2;
    }
}
