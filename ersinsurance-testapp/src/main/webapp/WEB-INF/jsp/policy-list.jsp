<%@ include file="common/header.jsp"%>
<%@ include file="common/navigation.jsp"%>

<div class="container">
 <div>
  <a type="button" class="btn btn-primary btn-md" href="/add-todo">Add Policy</a>
 </div>
 <br>
 <div class="panel panel-primary">
  <div class="panel-heading">
   <h3>List of POLICIES's</h3>
  </div>
  <div class="panel-body">
   <table class="table table-striped">
    <thead>
     <tr>
      <th width="40%">Description</th>
      <th width="40%">Target Date</th>
      <th width="20%"></th>
     </tr>
    </thead>
    <tbody>
     <c:forEach items="${policies}" var="policies">
      <tr>
       <td>${policies.description}</td>
       <td><fmt:formatDate value="${todo.targetDate}"
         pattern="dd/MM/yyyy" /></td>
       <td><a type="button" class="btn btn-success"
        href="/update-todo?id=${policies.id}">Update</a>
       <a type="button" class="btn btn-warning"
        href="/delete-todo?id=${policies.id}">Delete</a></td>
      </tr>
     </c:forEach>
    </tbody>
   </table>
  </div>
 </div>

</div>
<%@ include file="common/footer.jsp"%>