<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@include file="../include/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="${path}/resources/css/top.css" rel="stylesheet"/>
<title>Insert title here</title>
</head>
<body>
	    <div class="container">
        <div class="container_in">
            <div class="menu_top">
                <h2>TOP</h2>
                <ul>
                    <li><a href="">ALL</a></li>
                    <li><a href="">TEE</a></li>
                </ul>
            </div>
            <div class="item_list">
                <div class="item_list_menu">
                    <div class="item_count">

                      <!--   Total : <span>1</span>items -->
                    </div>
                    <div class="item_sort">
                        <ul><!--  
                            <li><a href="">신상품</a></li>
                            <li><a href="">상품명</a></li>
                            <li><a href="">낮은가격</a></li>
                            <li><a href="">높은가격</a></li>
                            <li><a href="">제조사</a></li>
                            <li><a href="">사용후기</a></li>-->
                        </ul>
                    </div>    
                </div>
                <div class="item">
                    <ul>
                    	<c:forEach items="${list}" var="list">
                        <li>
                            <div class="item_photo">
                                <a href=""><img src="../top/t1.gif" alt=""></a>
                            </div>
                            <div class="item_text">
                                <p class="item_name">
                                    <a href="">${list.gdsName}</a>
                                </p>
                                <p class="item_price">
                                    <span>${list.gdsPrice}</span>원
                                </p>
                            </div>
                        </li>
                        </c:forEach>
                    </ul>
<!--  
                    <div class="item_pager">
                        <div class="item_pager_in">
                            <a href="" class="first"><img src="../top/btn_page_first.gif" alt=""></a>
                            <a href="" class="prev"><img src="../top/btn_page_prev.gif" alt=""></a>
                            <ul>
                                <li class="on"><a href="">1</a></li>
                                <li><a href="">2</a></li>
                                <li><a href="">3</a></li>
                                <li><a href="">4</a></li>
                                <li><a href="">5</a></li>
                            </ul>
                            <a href="" class="next"><img src="../top/btn_page_next.gif" alt=""></a>
                            <a href="" class="last"><img src="../top/btn_page_last.gif" alt=""></a>
                        </div>
                    </div>
                    -->
                </div>
            </div>
        </div>
    </div>
    <%@include file="../include/footer.jsp" %>
</body>
</html>