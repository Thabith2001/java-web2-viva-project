<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="layout" uri="http://callidora.lk/jsp/template-inheritance" %>

<layout:extends name="base">
    <layout:put block="title">
        <title>Order Tracking | eBookStore</title>
    </layout:put>
    <layout:put block="contents">
        <main id="content">
            <div class="container">
                <div class="space-bottom-2 space-bottom-lg-4">
                    <div class="pb-lg-2">
                        <div class="py-4 pt-lg-8 pb-lg-7">
                            <h6 class="font-weight-medium font-size-7 text-center">Order Tracking</h6>
                        </div>
                        <div class="max-width-770 mx-auto">
                            <p class="font-size-2 text-center text-lh-1dot72 text-gray-600 mb-6">To track your order please
                                enter your Order ID in the box below and press the "Track" button. This was given to you on your
                                receipt and in the confirmation email you should have received.</p>
                        </div>
                        <div class="row mb-6">
                            <div class="col-md-6 mb-5 mb-md-0">
                                <div class="js-form-message">
                                    <label for="exampleFormControlInput1">Order ID</label>
                                    <input type="text" class="form-control rounded-0" name="name" aria-label="Jack Wayley"
                                           id="exampleFormControlInput1" required data-error-class="u-has-error"
                                           data-msg="Please enter your name." data-success-class="u-has-success">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="js-form-message">
                                    <label for="exampleFormControlInput2">Billing Email</label>
                                    <input type="email" class="form-control rounded-0 font-size pl-3 placeholder-color-3"
                                           id="exampleFormControlInput2" name="email" aria-label="jackwayley@gmail.com" required
                                           placeholder="creativelayers088@gmail.com"
                                           data-msg="Please enter a valid email address."
                                           data-error-class="u-has-error" data-success-class="u-has-success">
                                </div>
                            </div>
                        </div>
                        <div class="d-flex justify-content-lg-start">
                            <button type="submit"
                                    class="btn btn-wide btn-dark text-white rounded-0 transition-3d-hover height-60 width-250">
                                Track
                            </button>
                        </div>
                    </div>
                </div>
            </div>
        </main>
    </layout:put>
</layout:extends>
