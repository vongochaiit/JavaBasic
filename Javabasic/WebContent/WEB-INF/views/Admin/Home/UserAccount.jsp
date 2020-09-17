<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="mt" tagdir="/WEB-INF/tags"%>
<mt:admin_template title="">
	
	<jsp:attribute name="content">
		<style>
			.sty{
				margin-bottom: 20px;
			}
		</style>
		<div style="text-align: center;"><h2>User Account</h2></div>
		<hr>
		<a href="${pageContext.request.contextPath}/Management/UserAccount/Create" class="btn btn-primary create-link" style="margin-bottom: 1%">Add New</a>
		
		<div class="card shadow mb-4">
            <div class="card-body">
              <div class="table-responsive" >
                <table class="table table-bordered table-striped" id="dataTable" style="text-align: center;">
                  <thead>
                    <tr>
                      <th>User Name</th>
                      <th>Full Name</th>
                      <th>Date Of Birth</th>
                      <th>Phone Number</th>
                      <th>Point</th>
                      <th></th>           
                    </tr>
                  </thead>
                  <tbody>
                    <c:forEach items="${list}" var="account">
                    	<tr>
                    		<td>${account.userName}</td>
                    		<td>${account.firstName}</td>
                    		<td>${account.dateOfBirth}</td>
                    		<td>${account.phoneNumber}</td>
                    		<td>${account.point}</td>
                    		<td><a onclick="return confirm('Are you sure you want to delete this item?')" href="UserAccount/Delete?userId=${account.userId}"><i class="fas fa-trash-alt" aria-hidden="true" style="color: red" ></i></a> &nbsp &nbsp <a href="UserAccount/Edit?userId=${account.userId}"><i class="fas fa-edit" aria-hidden="true" style="color: green"></i></a> </td>
                    	</tr>
                    </c:forEach>
                  </tbody>
                </table>
              </div>
            </div>
          </div>
          
	</jsp:attribute>
</mt:admin_template>