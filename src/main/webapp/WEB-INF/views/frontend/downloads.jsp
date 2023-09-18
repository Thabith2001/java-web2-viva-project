
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="layout" uri="http://callidora.lk/jsp/template-inheritance" %>

<layout:extends name="base">
    <layout:put block="title">
        <title>Downloads | eBookStore</title>
    </layout:put>
    <layout:put block="contents">

        <main id="content">
            <div class="container">
                <div class="row">
                    <div class="col-md-3 border-right">
                            <%-------------------my account navigation-------------------%>
                        <jsp:include page="myAccountNavigation.jsp"/>
                            <%-------------------my account navigation-------------------%>
                    </div>
                    <div class="col-md-9">
                        <div class="tab-content" id="pills-tabContent">

                            <!----------------------Downloads--------------------------->
                            <jsp:include page="myAccountDownloads.jsp"/>
                            <!----------------------Downloads--------------------------->

                        </div>
                    </div>
                </div>
            </div>
        </main>
    </layout:put>
</layout:extends>
