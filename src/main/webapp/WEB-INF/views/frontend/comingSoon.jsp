<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="layout" uri="http://callidora.lk/jsp/template-inheritance" %>

<layout:extends name="base">
    <layout:put block="title">
        <title>Coming Soon | eBookStore</title>
    </layout:put>
    <layout:put block="contents">
        <main id="content">
            <div class="container">
                <div class="space-2 space-md-3 space-lg-4 space-top-xl-6 space-bottom-xl-5">
                    <div class="d-flex flex-column align-items-center">
                        <div class="font-weight-medium font-size-15 font-size-xs-25 mb-3">We’re coming soon.
                        </div>
                        <h6 class="font-weight-medium mb-2 col-lg-7 text-center text-lh-lg mb-5">Our website is under
                            construction. We’ll be here soon with our new awesome site, subscribe to be notified.</h6>
                        <div class="countdown-timer">
                            <div class="d-flex justify-content-between">
                                <div class="py-2d75 d-md-flex align-items-center pr-3">
                                    <span class="font-weight-medium font-size-3">114</span>
                                    <span class="font-size-2 ml-md-2 ml-wd-2 d-xl-block d-wd-inline mr-md-1">Days</span>
                                </div>
                                <div class="border-left pr-3">&nbsp;</div>
                                <div class="py-2d75 d-md-flex align-items-center pr-3">
                                    <span class="font-weight-medium font-size-3">03</span>
                                    <span class="font-size-2 ml-md-2 ml-wd-2 d-xl-block d-wd-inline mr-md-1">Hours</span>
                                </div>
                                <div class="border-left pr-3">&nbsp;</div>
                                <div class="py-2d75 d-md-flex align-items-center pr-3">
                                    <span class="font-weight-medium font-size-3">60</span>
                                    <span class="font-size-2 ml-md-2 ml-wd-2 d-xl-block d-wd-inline mr-md-1">Mins</span>
                                </div>
                                <div class="border-left pr-3">&nbsp;</div>
                                <div class="py-2d75 d-md-flex align-items-center pr-0">
                                    <span class="font-weight-medium font-size-3">25</span>
                                    <span class="font-size-2 ml-md-2 ml-wd-2 d-xl-block d-wd-inline mr-md-1">Secs</span>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>
    </layout:put>
</layout:extends>
