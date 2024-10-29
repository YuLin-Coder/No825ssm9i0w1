const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm9i0w1/",
            name: "ssm9i0w1",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm9i0w1/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "选课排课系统"
        } 
    }
}
export default base
