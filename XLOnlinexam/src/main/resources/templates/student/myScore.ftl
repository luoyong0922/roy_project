<html>
<head>
    <title>学生试卷列表</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${rc.contextPath}/static/css/bootstrap.min.css">
    <script src="${rc.contextPath}/static/js/jquery-1.11.0.js"></script>
    <style>
    .select-control{
    /*display: block;*/
    width: 150px;
    height: 34px;
    padding: 6px 12px;
    font-size: 14px;
    line-height: 1.42857143;
    color: #555;
    background-color: #fff;
    background-image: none;
    border: 1px solid #ccc;
    border-radius: 4px;
    -webkit-box-shadow: inset 0 1px 1px rgba(0,0,0,.075);
    box-shadow: inset 0 1px 1px rgba(0,0,0,.075);
    -webkit-transition: border-color ease-in-out .15s,-webkit-box-shadow ease-in-out .15s;
    -o-transition: border-color ease-in-out .15s,box-shadow ease-in-out .15s;
    transition: border-color ease-in-out .15s,box-shadow ease-in-out .15s;
    }
    </style>
</head>
<body>

<div class="container">

    <h2 style="text-align: center">试卷列表</h2><br/>

    <form action="${rc.contextPath}/studentController/getStuScore?pageIndex=1" method="post" id="search">
        课程名称：
        <select name="teacCourseId" id="selectValue" class="select-control">
            <option value="0">--请选择课程--</option>
            <#list teacCourses as teacCourse>
                <option value="${teacCourse.id}">${teacCourse.courseName}</option>
            </#list>
        </select>
        <input type="button" class="btn btn-primary" value="搜索" onclick="javascript:roy()">&emsp;&emsp;&emsp;
        <input type="button" class="btn btn-info" value="成绩统计表" onclick="javascript:toStatistics()"/>&emsp;&emsp;
        <input type="button" class="btn btn-info" value="成绩排名表" onclick="javascript:toScoreOrder()"/>
    </form>
    <script>
        function roy(){

            if($('#selectValue option:selected').val() == 0){
                alert('你还未选择课程！');
            }else {
                $("#search").submit();
            }
        }
    </script>

    <div class="container">

        <table class="table table-hover" id="Test">
            <thead>
            <tr>
                <th>序号</th>
                <th>试卷编号</th>
                <th>课程名称</th>
                <th>老师姓名</th>
                <th>考试时间</th>
                <th>成绩</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
    <#list pageInfo.list as stuScore>
    <tr>
        <td>${stuScore?counter}</td>
        <td>${stuScore.paperId}</td>
        <td>${stuScore.courseName}</td>
        <td>${stuScore.teacName}</td>
        <td>${stuScore.testTime}</td>
        <td>${stuScore.score}</td>
        <td>
            <a href="${rc.contextPath}/paperController/toMarking/${stuScore.paperId}?courseName=${stuScore.courseName}">查看详情</a>
        </td>
    </tr>
    </#list>
            </tbody>
        </table>
    </div>

<#include "../pageHelper2.ftl"/>
</div>

<script>

    function toStatistics() {
        var teacCourseId=$('#selectValue  option:selected').val();
        if(teacCourseId == 0){
            alert('你还未选择课程！');
        }else {
            window.location = '${rc.contextPath}/teacherController/pieByTeacCourseId?teacCourseId=' + teacCourseId;
        }
    }
    function toScoreOrder() {
        var teacCourseId=$('#selectValue  option:selected').val();
        var courseName=$('#selectValue option:selected').text();
        if(teacCourseId == 0){
            alert('你还未选择课程！');
        }else {
            window.location = '${rc.contextPath}/teacherController/showGradeOrder/' + courseName + '?teacCourseId=' + teacCourseId;
        }
    }
</script>

</body>
</html>