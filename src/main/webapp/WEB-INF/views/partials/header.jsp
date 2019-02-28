<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<header>

	<span> <c:choose>

			<c:when test="${ not empty profile }">

				<div class="card" style="width: 18rem;">
					<div class="card-body">
   <h5 class="card-title">Welcome, ${ profile.firstname } </h5>
						 <a
							class="btn btn-primary" href="/logout" role="button">Logout</a>
								<p class="message">${ message }</p>
					</div>
				</div>
			</c:when>

			<c:otherwise>

				<div style="width: 18rem;">
					<div >
						<h5 >Welcome!</h5>
						<a  href="/user-login" role="button">Login</a>
						<a href="/user-registration" role="button">Register</a>
					</div>
				</div>
			</c:otherwise>
		</c:choose>
	</span>
</header>