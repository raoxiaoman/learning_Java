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
public class sc implements Serializable {

    private static final long serialVersionUID = 1529656371225L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String sno;

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
    private Integer grade;


    public void setSno(String sno){
        this.sno = sno;
    }

    public String getSno(){
        return this.sno;
    }

    public void setCno(String cno){
        this.cno = cno;
    }

    public String getCno(){
        return this.cno;
    }

    public void setGrade(Integer grade){
        this.grade = grade;
    }

    public Integer getGrade(){
        return this.grade;
    }
    @Override
    public String toString() {
        return "sc{" +
                "sno='" + sno + '\'' +
                "cno='" + cno + '\'' +
                "grade='" + grade + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends sc{
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
        private List<String> cnoList;


        private List<String> fuzzyCno;

        public List<String> getFuzzyCno(){
            return this.fuzzyCno;
        }

        private List<String> rightFuzzyCno;

        public List<String> getRightFuzzyCno(){
            return this.rightFuzzyCno;
        }
        private List<Integer> gradeList;

        private Integer gradeSt;

        private Integer gradeEd;

        public Integer getGradeSt(){
            return this.gradeSt;
        }

        public Integer getGradeEd(){
            return this.gradeEd;
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



        public QueryBuilder gradeBetWeen(Integer gradeSt,Integer gradeEd){
            this.gradeSt = gradeSt;
            this.gradeEd = gradeEd;
            return this;
        }

        public QueryBuilder gradeGreaterEqThan(Integer gradeSt){
            this.gradeSt = gradeSt;
            return this;
        }
        public QueryBuilder gradeLessEqThan(Integer gradeEd){
            this.gradeEd = gradeEd;
            return this;
        }


        public QueryBuilder grade(Integer grade){
            setGrade(grade);
            return this;
        }

        public QueryBuilder gradeList(Integer ... grade){
            if (grade != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : grade){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.gradeList = list;
            }

            return this;
        }

        public QueryBuilder gradeList(List<Integer> grade){
            this.gradeList = grade;
            return this;
        }

        public QueryBuilder fetchGrade(){
            setFetchFields("fetchFields","grade");
            return this;
        }

        public QueryBuilder excludeGrade(){
            setFetchFields("excludeFields","grade");
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

        public sc build(){
            return this;
        }
    }

}
