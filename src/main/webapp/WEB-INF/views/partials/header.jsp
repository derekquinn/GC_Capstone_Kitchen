<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<header>
	<span> <c:choose>
			<c:when test="${ not empty profile }">
				<div>
					<a href="/logout" role="button">Logout</a>
				</div>
			</c:when>

			<c:otherwise>
				<div>
					<a href="/user-login" role="button">Login</a>
					<a href="/user-registration" role="button">Register</a>
				</div>
			</c:otherwise>
		</c:choose>
	</span>
</header>