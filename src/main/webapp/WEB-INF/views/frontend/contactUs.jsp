<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="layout" uri="http://callidora.lk/jsp/template-inheritance" %>

<layout:extends name="base">
    <layout:put block="title">
        <title>Contact Us | eBookStore</title>
    </layout:put>
    <layout:put block="contents">
        <main id="content">
            <div class="py-3 py-lg-7">
                <h6 class="font-weight-medium font-size-7 text-center my-1">Contact Us</h6>
            </div>
            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d1013.5670516110969!2d80.44942927372759!3d7.257199598929997!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3ae314aec6ea9083%3A0xc996d5f1fb40ae70!2sWalpoladeniya%20Rd%2C%20Mawanella!5e0!3m2!1sen!2slk!4v1691291523880!5m2!1sen!2slk"
                    height="500" style="border:0; width:100%;" allowfullscreen></iframe>
<%--            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d1013.5670516110969!2d80.44942927372759!3d7.257199598929997!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3ae314aec6ea9083%3A0xc996d5f1fb40ae70!2sWalpoladeniya%20Rd%2C%20Mawanella!5e0!3m2!1sen!2slk!4v1691291523880!5m2!1sen!2slk"--%>
<%--                    width="600" height="300" frameborder="0"--%>
<%--                    style="border:0; width: 100%; height:100%" allowfullscreen></iframe>--%>
            <div class="container">
                <div class="space-bottom-1 space-bottom-lg-2">
                    <div class="pb-4">
                        <div class="col-lg-8 mx-auto">
                            <div class="bg-white mt-n10 mt-md-n13 pt-5 pt-lg-7 px-3 px-md-5 pl-xl-10 pr-xl-3">
                                <div class="ml-xl-4">
                                    <div class="mb-4 mb-lg-7">
                                        <h6 class="font-weight medium font-size-10 mb-4 mb-lg-7">Contact Information</h6>
                                        <p class="font-weight-medium font-italic">We will answer any questions you may have
                                            about our online sales, rights or partnership service right here.
                                        </p>
                                    </div>
                                    <div class="mb-4 mb-lg-8">
                                        <div class="row">
                                            <div class="col-md-6">
                                                <h6 class="font-weight-medium font-size-4 mb-4">Head Office</h6>
                                                <address class="font-size-2 mb-5">
                                            <span class="mb-2 font-weight-normal text-dark">
                                            Mawanella, Kegalle. <br> Sri Lanka
                                            </span>
                                                </address>
                                                <div>
                                                    <a href="mailto:sale@bookworm.com"
                                                       class="font-size-2 d-block link-black-100 mb-1">sales@ebookstore.com</a>
                                                    <a href="tel:+1246-345-0695" class="font-size-2 d-block link-black-100">+94 76-268-4595</a>
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <h6 class="font-size-4 font-weight-medium">Social Media</h6>
                                                <ul class="list-unstyled mb-0 d-flex">
                                                    <li class="btn pl-0">
                                                        <a class="link-black-100" href="#">
                                                            <span class="fab fa-instagram"></span>
                                                        </a>
                                                    </li>
                                                    <li class="btn">
                                                        <a class="link-black-100" href="#">
                                                            <span class="fab fa-facebook-f"></span>
                                                        </a>
                                                    </li>
                                                    <li class="btn">
                                                        <a class="link-black-100" href="#">
                                                            <span class="fab fa-youtube"></span>
                                                        </a>
                                                    </li>
                                                    <li class="btn">
                                                        <a class="link-black-100" href="#">
                                                            <span class="fab fa-twitter"></span>
                                                        </a>
                                                    </li>
                                                    <li class="btn">
                                                        <a class="link-black-100" href="#">
                                                            <span class="fab fa-pinterest"></span>
                                                        </a>
                                                    </li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="mb-5 mb-xl-9 pb-xl-1">

                                    </div>
                                    <div>
                                        <h6 class="font-weight-medium font-size-10 mb-3 pb-xl-1">Get In Touch</h6>
                                        <form class="js-validate" novalidate="novalidate">
                                            <div class="row">

                                                <div class="col-sm-6 mb-5">
                                                    <div class="js-form-message">
                                                        <label for="exampleFormControlInput1">Name</label>
                                                        <input id="exampleFormControlInput1" type="text"
                                                               class="form-control rounded-0" name="name"
                                                               aria-label="Jack Wayley" required data-error-class="u-has-error"
                                                               data-msg="Please enter your name."
                                                               data-success-class="u-has-success">
                                                    </div>
                                                </div>


                                                <div class="col-sm-6 mb-5">
                                                    <div class="js-form-message">
                                                        <label for="exampleFormControlInput2">Email</label>
                                                        <input id="exampleFormControlInput2" type="email"
                                                               class="form-control rounded-0" name="email"
                                                               aria-label="jackwayley@gmail.com" required
                                                               data-msg="Please enter a valid email address."
                                                               data-error-class="u-has-error"
                                                               data-success-class="u-has-success">
                                                    </div>
                                                </div>

                                                <div class="col-sm-12 mb-5">
                                                    <div class="js-form-message">
                                                        <label for="exampleFormControlInput3">Subject</label>
                                                        <input id="exampleFormControlInput3" type="email"
                                                               class="form-control rounded-0" name="email"
                                                               aria-label="jackwayley@gmail.com" required
                                                               data-msg="Please enter a valid email address."
                                                               data-error-class="u-has-error"
                                                               data-success-class="u-has-success">
                                                    </div>
                                                </div>
                                                <div class="col-sm-12 mb-5">
                                                    <div class="js-form-message">
                                                        <div class="input-group flex-column">
                                                            <label for="exampleFormControlInput4">Details please! Your review
                                                                helps other shoppers.</label>
                                                            <textarea id="exampleFormControlInput4"
                                                                      class="form-control rounded-0 pl-3 font-size-2 placeholder-color-3"
                                                                      rows="6" cols="77" name="text"
                                                                      placeholder="What did you like or dislike? What should other shoppers know before buying?"
                                                                      aria-label="Hi there, I would like to ..."
                                                                      required data-msg="Please enter a reason."
                                                                      data-error-class="u-has-error"
                                                                      data-success-class="u-has-success"></textarea>
                                                        </div>
                                                    </div>
                                                </div>

                                                <div class="col d-flex justify-content-lg-start">
                                                    <button type="submit"
                                                            class="btn btn-wide btn-dark text-white rounded-0 transition-3d-hover height-60">
                                                        Sumbit Message
                                                    </button>
                                                </div>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>
    </layout:put>
</layout:extends>
