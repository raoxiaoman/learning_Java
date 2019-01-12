package com.raohui.iteratormode;

import java.util.*;

/**
 * IteratorMode
 */
public class IteratorModeTest {
    public static void main(String args[]) {
        List<Object> projects = new ArrayList<>();
        projects.add("raohui");
        projects.add("leihui");
        projects.add("qihai");
        projects.add("gangge");

        AbstractObjectList list = new ProjectList(projects);
        AbstractIterator iterator = list.CreateIterator();

        System.out.println("正向遍历");
        while(!iterator.isLast()){
            System.out.println(iterator.getNextItem());
            iterator.next();
        }
        
        System.out.println("----------------------------------");
        System.out.println("反向遍历");
        while(!iterator.isFirst()){
            System.out.println(iterator.getPreviousIterm());
            iterator.previous();;
        }
    }

}

abstract class AbstractObjectList {
    List<Object> objects = new ArrayList<>();

    AbstractObjectList(List<Object> objects) {
        this.objects = objects;
    }

    public void addObject(Object o) {
        objects.add(o);
    }

    public void removeObject(Object o) {
        objects.remove(o);
    }

    public List<Object> getObjects() {
        return this.objects;
    }

    public abstract AbstractIterator CreateIterator();
}

class ProjectList extends AbstractObjectList {
    public ProjectList(List<Object> objects) {
        super(objects);
    }

    @Override
    public AbstractIterator CreateIterator() {
        return new ProjectListIterator(this);
    }
}

interface AbstractIterator {
    public void next();

    public Boolean isLast();

    public void previous();

    public Boolean isFirst();

    public Object getNextItem();

    public Object getPreviousIterm();
}

class ProjectListIterator implements AbstractIterator {
    private AbstractObjectList projectList;
    private List<Object> projects;
    private int cursor1;
    private int cursor2;

    public ProjectListIterator(AbstractObjectList projectList) {
        this.projectList = projectList;
        this.projects = this.projectList.getObjects();
        cursor1 = 0;
        cursor2 = projects.size() - 1;
    }

    @Override
    public void next() {
        if (cursor1 < projects.size()) {
            cursor1++;
        }
    }

    @Override
    public Boolean isLast() {
        return cursor1 == projects.size();
    }

    @Override
    public void previous() {
        if (cursor2 > -1) {
            cursor2--;
        }
    }

    @Override
    public Boolean isFirst() {
        return cursor2 == -1;
    }

    @Override
    public Object getNextItem() {
        return projects.get(cursor1);
    }

    @Override
    public Object getPreviousIterm() {
        return projects.get(cursor2);
    }

}
