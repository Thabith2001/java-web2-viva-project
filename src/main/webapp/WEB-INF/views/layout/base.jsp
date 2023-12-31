
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="layout" uri="http://callidora.lk/jsp/template-inheritance" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <layout:block name="title">

    </layout:block>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="shortcut icon" href="assets/img/favicon.png">

    <link href="https://fonts.googleapis.com/css2?family=Inter:wght@400;500;700&amp;display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v6.1.1/css/all.css" />

    <link rel="stylesheet" href="assets/vendor/font-awesome/css/fontawesome-all.min.css">
    <link rel="stylesheet" href="assets/vendor/flaticon/font/flaticon.css">
    <link rel="stylesheet" href="assets/vendor/animate.css/animate.css">
    <link rel="stylesheet" href="assets/vendor/bootstrap-select/dist/css/bootstrap-select.min.css">
    <link rel="stylesheet" href="assets/vendor/slick-carousel/slick/slick.css" />
    <link rel="stylesheet" href="assets/vendor/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.css">

    <link rel="stylesheet" href="assets/css/theme.css">
</head>

<body>

<jsp:include page="/WEB-INF/views/frontend/include/header.jsp"/>

<layout:block name="contents">

</layout:block>

<jsp:include page="/WEB-INF/views/frontend/include/footer.jsp"/>

<script src="assets/vendor/jquery/dist/jquery.min.js"></script>
<script src="assets/vendor/jquery-migrate/dist/jquery-migrate.min.js"></script>
<script src="assets/vendor/popper.js/dist/umd/popper.min.js"></script>
<script src="assets/vendor/bootstrap/bootstrap.min.js"></script>
<script src="assets/vendor/bootstrap-select/dist/js/bootstrap-select.min.js"></script>
<script src="assets/vendor/multilevel-sliding-mobile-menu/dist/jquery.zeynep.js"></script>
<script src="assets/vendor/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.concat.min.js"></script>
<script src="assets/vendor/slick-carousel/slick/slick.min.js"></script>

<script src="assets/js/hs.core.js"></script>
<script src="assets/js/components/hs.unfold.js"></script>
<script src="assets/js/components/hs.malihu-scrollbar.js"></script>
<script src="assets/js/components/hs.slick-carousel.js"></script>
<script src="assets/js/components/hs.show-animation.js"></script>
<script src="assets/js/components/hs.selectpicker.js"></script>
<script src="assets/js/components/hs.show-animation.js"></script>


<script>
    $(document).on('ready', function() {
        // initialization of unfold component
        $.HSCore.components.HSUnfold.init($('[data-unfold-target]'));

        // initialization of malihu scrollbar
        $.HSCore.components.HSMalihuScrollBar.init($('.js-scrollbar'));

        // initialization of slick carousel
        $.HSCore.components.HSSlickCarousel.init('.js-slick-carousel');

        // initialization of show animations
        $.HSCore.components.HSShowAnimation.init('.js-animation-link');

        // init zeynepjs
        var zeynep = $('.zeynep').zeynep({
            onClosed: function() {
                // enable main wrapper element clicks on any its children element
                $("body main").attr("style", "");

                console.log('the side menu is closed.');
            },
            onOpened: function() {
                // disable main wrapper element clicks on any its children element
                $("body main").attr("style", "pointer-events: none;");

                console.log('the side menu is opened.');
            }
        });

        // handle zeynep overlay click
        $(".zeynep-overlay").click(function() {
            zeynep.close();
        });

        // open side menu if the button is clicked
        $(".cat-menu").click(function() {
            if ($("html").hasClass("zeynep-opened")) {
                zeynep.close();
            } else {
                zeynep.open();
            }
        });
    });
</script>
</body>

</html>