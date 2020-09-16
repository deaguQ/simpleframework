package demo.annotation;

@CourseInfoAnnotation(courseName = "剑指java面试", courseTag = "面试",
        courseProfile = "不仅讲解Java相关的核心知识，还涉及网络、数据库、缓存框架等核心知识，"
                + "帮助大家构建海陆空一体化的面试护城河。"
                + "全面提升大家的内功。"
)
public class ImoocCourse {
    @PersonInfoAnnotation(name = "翔仔", language = {"Java","C++","Go","Python","PHP","JS"})
    private String author;
    @CourseInfoAnnotation(courseName = "校园商铺",
            courseTag = "实战",
            courseProfile = "手把手教会从前端到后端开发多店铺商铺管理系统，"
                    + "可以用在毕设创业中，学习完会对SSM以及Springboot有一个"
                    + "全面的了解",
            courseIndex = 144)
    public void getCourseInfo() {

    }
}
