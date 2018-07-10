package com.raohui.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class student implements Serializable {

    private static final long serialVersionUID = 1529656365942L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String sno;

    /**
    * 
    * isNullAble:1
    */
    private String sname;

    /**
    * 
    * isNullAble:1
    */
    private Integer sage;

    /**
    * 
    * isNullAble:1
    */
    private String sex;


    public void setSno(String sno){
        this.sno = sno;
    }

    public String getSno(){
        return this.sno;
    }

    public void setSname(String sname){
        this.sname = sname;
    }

    public String getSname(){
        return this.sname;
    }

    public void setSage(Integer sage){
        this.sage = sage;
    }

    public Integer getSage(){
        return this.sage;
    }

    public void setSex(String sex){
        this.sex = sex;
    }

    public String getSex(){
        return this.sex;
    }
    @Override
    public String toString() {
        return "student{" +
                "sno='" + sno + '\'' +
                "sname='" + sname + '\'' +
                "sage='" + sage + '\'' +
                "sex='" + sex + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends student{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){
            return this.fetchFields;
        }

        private List<String> snoList;


        private List<String> fuzzySno;

        public List<String> getFuzzySno(){
            return this.fuzzySno;
        }

        private List<String> rightFuzzySno;

        public List<String> getRightFuzzySno(){
            return this.rightFuzzySno;
        }
        private List<String> snameList;


        private List<String> fuzzySname;

        public List<String> getFuzzySname(){
            return this.fuzzySname;
        }

        private List<String> rightFuzzySname;

        public List<String> getRightFuzzySname(){
            return this.rightFuzzySname;
        }
        private List<Integer> sageList;

        private Integer sageSt;

        private Integer sageEd;

        public Integer getSageSt(){
            return this.sageSt;
        }

        public Integer getSageEd(){
            return this.sageEd;
        }

        private List<String> sexList;


        private List<String> fuzzySex;

        public List<String> getFuzzySex(){
            return this.fuzzySex;
        }

        private List<String> rightFuzzySex;

        public List<String> getRightFuzzySex(){
            return this.rightFuzzySex;
        }
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }


        public QueryBuilder fuzzySno (List<String> fuzzySno){
            this.fuzzySno = fuzzySno;
            return this;
        }

        public QueryBuilder fuzzySno (String ... fuzzySno){
            if (fuzzySno != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzySno){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzySno = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzySno (List<String> rightFuzzySno){
            this.rightFuzzySno = rightFuzzySno;
            return this;
        }

        public QueryBuilder rightFuzzySno (String ... rightFuzzySno){
            if (rightFuzzySno != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzySno){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzySno = list;
            }
            return this;
        }

        public QueryBuilder sno(String sno){
            setSno(sno);
            return this;
        }

        public QueryBuilder snoList(String ... sno){
            if (sno != null){
                List<String> list = new ArrayList<>();
                for (String item : sno){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.snoList = list;
            }

            return this;
        }

        public QueryBuilder snoList(List<String> sno){
            this.snoList = sno;
            return this;
        }

        public QueryBuilder fetchSno(){
            setFetchFields("fetchFields","sno");
            return this;
        }

        public QueryBuilder excludeSno(){
            setFetchFields("excludeFields","sno");
            return this;
        }



        public QueryBuilder fuzzySname (List<String> fuzzySname){
            this.fuzzySname = fuzzySname;
            return this;
        }

        public QueryBuilder fuzzySname (String ... fuzzySname){
            if (fuzzySname != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzySname){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzySname = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzySname (List<String> rightFuzzySname){
            this.rightFuzzySname = rightFuzzySname;
            return this;
        }

        public QueryBuilder rightFuzzySname (String ... rightFuzzySname){
            if (rightFuzzySname != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzySname){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzySname = list;
            }
            return this;
        }

        public QueryBuilder sname(String sname){
            setSname(sname);
            return this;
        }

        public QueryBuilder snameList(String ... sname){
            if (sname != null){
                List<String> list = new ArrayList<>();
                for (String item : sname){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.snameList = list;
            }

            return this;
        }

        public QueryBuilder snameList(List<String> sname){
            this.snameList = sname;
            return this;
        }

        public QueryBuilder fetchSname(){
            setFetchFields("fetchFields","sname");
            return this;
        }

        public QueryBuilder excludeSname(){
            setFetchFields("excludeFields","sname");
            return this;
        }



        public QueryBuilder sageBetWeen(Integer sageSt,Integer sageEd){
            this.sageSt = sageSt;
            this.sageEd = sageEd;
            return this;
        }

        public QueryBuilder sageGreaterEqThan(Integer sageSt){
            this.sageSt = sageSt;
            return this;
        }
        public QueryBuilder sageLessEqThan(Integer sageEd){
            this.sageEd = sageEd;
            return this;
        }


        public QueryBuilder sage(Integer sage){
            setSage(sage);
            return this;
        }

        public QueryBuilder sageList(Integer ... sage){
            if (sage != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : sage){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.sageList = list;
            }

            return this;
        }

        public QueryBuilder sageList(List<Integer> sage){
            this.sageList = sage;
            return this;
        }

        public QueryBuilder fetchSage(){
            setFetchFields("fetchFields","sage");
            return this;
        }

        public QueryBuilder excludeSage(){
            setFetchFields("excludeFields","sage");
            return this;
        }



        public QueryBuilder fuzzySex (List<String> fuzzySex){
            this.fuzzySex = fuzzySex;
            return this;
        }

        public QueryBuilder fuzzySex (String ... fuzzySex){
            if (fuzzySex != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzySex){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzySex = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzySex (List<String> rightFuzzySex){
            this.rightFuzzySex = rightFuzzySex;
            return this;
        }

        public QueryBuilder rightFuzzySex (String ... rightFuzzySex){
            if (rightFuzzySex != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzySex){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzySex = list;
            }
            return this;
        }

        public QueryBuilder sex(String sex){
            setSex(sex);
            return this;
        }

        public QueryBuilder sexList(String ... sex){
            if (sex != null){
                List<String> list = new ArrayList<>();
                for (String item : sex){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.sexList = list;
            }

            return this;
        }

        public QueryBuilder sexList(List<String> sex){
            this.sexList = sex;
            return this;
        }

        public QueryBuilder fetchSex(){
            setFetchFields("fetchFields","sex");
            return this;
        }

        public QueryBuilder excludeSex(){
            setFetchFields("excludeFields","sex");
            return this;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public student build(){
            return this;
        }
    }

}
