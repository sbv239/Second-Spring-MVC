<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Please, enter details:</h2>
<div>

    <form:form action="showDetails" modelAttribute="employee">
        <p>Name <form:input path="name"/> <form:errors path="name" /></p>
        <p>Surname <form:input path="surname"/> <form:errors path="surname" /></p>
        <p>Salary <form:input path="salary"/><form:errors path="salary" /></p>
        <p>Department <form:select path="department">
            <form:options items="${employee.departments}"/>
        </form:select></p>
        <p>Which car do you want?</p>
        <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
        <p>Foreign language(s):</p>
        <div>
            <form:checkboxes path="languages" items="${employee.languageList}"/>
        </div>
        <div>
            Phone number: <form:input path="phoneNumber"/><form:errors path="phoneNumber"/>
        </div>
        <div>
            Email number: <form:input path="email"/><form:errors path="email"/>
        </div>
        <p><input type="submit" value="Ok"></p>
    </form:form>

</div>
</body>
</html>