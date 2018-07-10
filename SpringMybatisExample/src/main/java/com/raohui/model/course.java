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
public class course implements Serializable {

    private static final long serialVersionUID = 1529656377337L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String cno;

    /**
    * 
    * isNullAble:1
    */
    private String cname;

    /**
    * 
    * isNullAble:1
    */
    private String cpno;


    public void setCno(String cno){
        this.cno = cno;
    }

    public String getCno(){
        return this.cno;
    }

    public void setCname(String cname){
        this.cname = cname;
    }

    public String getCname(){
        return this.cname;
    }

    public void setCpno(String cpno){
        this.cpno = cpno;
    }

    public String getCpno(){
        return this.cpno;
    }
    @Override
    public String toString() {
        return "course{" +
                "cno='" + cno + '\'' +
                "cname='" + cname + '\'' +
                "cpno='" + cpno + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends course{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){
            return this.fetchFields;
        }

        private List<String> cnoList;


        private List<String> fuzzyCno;

        public List<String> getFuzzyCno(){
            return this.fuzzyCno;
        }

        private List<String> rightFuzzyCno;

        public List<String> getRightFuzzyCno(){
            return this.rightFuzzyCno;
        }
        private List<String> cnameList;


        private List<String> fuzzyCname;

        public List<String> getFuzzyCname(){
            return this.fuzzyCname;
        }

        private List<String> rightFuzzyCname;

        public List<String> getRightFuzzyCname(){
            return this.rightFuzzyCname;
        }
        private List<String> cpnoList;


        private List<String> fuzzyCpno;

        public List<String> getFuzzyCpno(){
            return this.fuzzyCpno;
        }

        private List<String> rightFuzzyCpno;

        public List<String> getRightFuzzyCpno(){
            return this.rightFuzzyCpno;
        }
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }


        public QueryBuilder fuzzyCno (List<String> fuzzyCno){
            this.fuzzyCno = fuzzyCno;
            return this;
        }

        public QueryBuilder fuzzyCno (String ... fuzzyCno){
            if (fuzzyCno != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyCno){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyCno = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyCno (List<String> rightFuzzyCno){
            this.rightFuzzyCno = rightFuzzyCno;
            return this;
        }

        public QueryBuilder rightFuzzyCno (String ... rightFuzzyCno){
            if (rightFuzzyCno != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyCno){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyCno = list;
            }
            return this;
        }

        public QueryBuilder cno(String cno){
            setCno(cno);
            return this;
        }

        public QueryBuilder cnoList(String ... cno){
            if (cno != null){
                List<String> list = new ArrayList<>();
                for (String item : cno){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.cnoList = list;
            }

            return this;
        }

        public QueryBuilder cnoList(List<String> cno){
            this.cnoList = cno;
            return this;
        }

        public QueryBuilder fetchCno(){
            setFetchFields("fetchFields","cno");
            return this;
        }

        public QueryBuilder excludeCno(){
            setFetchFields("excludeFields","cno");
            return this;
        }



        public QueryBuilder fuzzyCname (List<String> fuzzyCname){
            this.fuzzyCname = fuzzyCname;
            return this;
        }

        public QueryBuilder fuzzyCname (String ... fuzzyCname){
            if (fuzzyCname != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyCname){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyCname = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyCname (List<String> rightFuzzyCname){
            this.rightFuzzyCname = rightFuzzyCname;
            return this;
        }

        public QueryBuilder rightFuzzyCname (String ... rightFuzzyCname){
            if (rightFuzzyCname != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyCname){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyCname = list;
            }
            return this;
        }

        public QueryBuilder cname(String cname){
            setCname(cname);
            return this;
        }

        public QueryBuilder cnameList(String ... cname){
            if (cname != null){
                List<String> list = new ArrayList<>();
                for (String item : cname){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.cnameList = list;
            }

            return this;
        }

        public QueryBuilder cnameList(List<String> cname){
            this.cnameList = cname;
            return this;
        }

        public QueryBuilder fetchCname(){
            setFetchFields("fetchFields","cname");
            return this;
        }

        public QueryBuilder excludeCname(){
            setFetchFields("excludeFields","cname");
            return this;
        }



        public QueryBuilder fuzzyCpno (List<String> fuzzyCpno){
            this.fuzzyCpno = fuzzyCpno;
            return this;
        }

        public QueryBuilder fuzzyCpno (String ... fuzzyCpno){
            if (fuzzyCpno != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyCpno){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyCpno = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyCpno (List<String> rightFuzzyCpno){
            this.rightFuzzyCpno = rightFuzzyCpno;
            return this;
        }

        public QueryBuilder rightFuzzyCpno (String ... rightFuzzyCpno){
            if (rightFuzzyCpno != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyCpno){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyCpno = list;
            }
            return this;
        }

        public QueryBuilder cpno(String cpno){
            setCpno(cpno);
            return this;
        }

        public QueryBuilder cpnoList(String ... cpno){
            if (cpno != null){
                List<String> list = new ArrayList<>();
                for (String item : cpno){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.cpnoList = list;
            }

            return this;
        }

        public QueryBuilder cpnoList(List<String> cpno){
            this.cpnoList = cpno;
            return this;
        }

        public QueryBuilder fetchCpno(){
            setFetchFields("fetchFields","cpno");
            return this;
        }

        public QueryBuilder excludeCpno(){
            setFetchFields("excludeFields","cpno");
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

        public course build(){
            return this;
        }
    }

}
