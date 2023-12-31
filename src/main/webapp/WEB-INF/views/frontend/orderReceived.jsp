

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="layout" uri="http://callidora.lk/jsp/template-inheritance" %>

<layout:extends name="base">
    <layout:put block="title">
        <title>Cart | eBookStore</title>
    </layout:put>
    <layout:put block="contents">
        <main id="content">
            <div class="bg-gray-200 space-bottom-3">
                <div class="container">
                    <div class="py-5 py-lg-7">
                        <h6 class="font-weight-medium font-size-7 text-center mt-lg-1">Order Received</h6>
                    </div>
                    <div class="max-width-890 mx-auto">
                        <div class="bg-white pt-6 border">
                            <h6 class="font-size-3 font-weight-medium text-center mb-4 pb-xl-1">Thank you. Your order has been
                                received.</h6>
                            <div class="border-bottom mb-5 pb-5 overflow-auto overflow-md-visible">
                                <div class="pl-3">
                                    <table class="table table-borderless mb-0 ml-1">
                                        <thead>
                                        <tr>
                                            <th scope="col" class="font-size-2 font-weight-normal py-0">Order number:</th>
                                            <th scope="col" class="font-size-2 font-weight-normal py-0">Date:</th>
                                            <th scope="col" class="font-size-2 font-weight-normal py-0 text-md-center">Total:
                                            </th>
                                            <th scope="col" class="font-size-2 font-weight-normal py-0 text-md-right pr-md-9">
                                                Payment method:
                                            </th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr>
                                            <th scope="row" class="pr-0 py-0 font-weight-medium">1779</th>
                                            <td class="pr-0 py-0 font-weight-medium">March 24, 2020</td>
                                            <td class="pr-0 py-0 font-weight-medium text-md-center">$2930</td>
                                            <td class="pr-md-4 py-0 font-weight-medium text-md-right">Direct bank transfer</td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <div class="border-bottom mb-5 pb-6">
                                <div class="px-3 px-md-4">
                                    <div class="ml-md-2">
                                        <h6 class="font-size-3 on-weight-medium mb-4 pb-1">Order Details</h6>
                                        <div class="d-flex justify-content-between mb-4">
                                            <div class="d-flex align-items-baseline">
                                                <div>
                                                    <h6 class="font-size-2 font-weight-normal mb-1">The Overdue Life of <br> Amy
                                                        Byler</h6>
                                                    <span class="font-size-2 text-gray-600">(Paperback, English)</span>
                                                </div>
                                                <span class="font-size-2 ml-4 ml-md-8">x7</span>
                                            </div>
                                            <span class="font-weight-medium font-size-2">$951</span>
                                        </div>
                                        <div class="d-flex justify-content-between">
                                            <div class="d-flex align-items-baseline">
                                                <div>
                                                    <h6 class="font-size-2 font-weight-normal mb-1">All You Can Ever Know: <br>
                                                        A Memoir</h6>
                                                    <span class="font-size-2 text-gray-600">(Paperback, English)</span>
                                                </div>
                                                <span class="font-size-2 ml-2 ml-md-6">x3</span>
                                            </div>
                                            <span class="font-weight-medium font-size-2">$348</span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="border-bottom mb-5 pb-5">
                                <ul class="list-unstyled px-3 pl-md-5 pr-md-4 mb-0">
                                    <li class="d-flex justify-content-between py-2">
                                        <span class="font-weight-medium font-size-2">Subtotal:</span>
                                        <span class="font-weight-medium font-size-2">$951</span>
                                    </li>
                                    <li class="d-flex justify-content-between py-2">
                                        <span class="font-weight-medium font-size-2">Shipping:</span>
                                        <span class="font-weight-medium font-size-2">Free Shipping</span>
                                    </li>
                                    <li class="d-flex justify-content-between pt-2">
                                        <span class="font-weight-medium font-size-2">Payment Method:</span>
                                        <span class="font-weight-medium font-size-2">Direct bank transfer</span>
                                    </li>
                                </ul>
                            </div>
                            <div class="border-bottom mb-5 pb-4">
                                <div class="px-3 pl-md-5 pr-md-4">
                                    <div class="d-flex justify-content-between">
                                        <span class="font-size-2 font-weight-medium">Total</span>
                                        <span class="font-weight-medium fon-size-2">$2498</span>
                                    </div>
                                </div>
                            </div>
                            <div class="px-3 pl-md-5 pr-md-4 mb-6 pb-xl-1">
                                <div class="row row-cols-1 row-cols-md-2">
                                    <div class="col">
                                        <div class="mb-6 mb-md-0">
                                            <h6 class="font-weight-medium font-size-22 mb-3">Billing Address
                                            </h6>
                                            <address class="d-flex flex-column mb-0">
                                                <span class="text-gray-600 font-size-2">Ali Tufan</span>
                                                <span class="text-gray-600 font-size-2">Bedford St,</span>
                                                <span class="text-gray-600 font-size-2">Covent Garden, </span>
                                                <span class="text-gray-600 font-size-2">London WC2E 9ED</span>
                                                <span class="text-gray-600 font-size-2">United Kingdom</span>
                                            </address>
                                        </div>
                                    </div>
                                    <div class="col">
                                        <h6 class="font-weight-medium font-size-22 mb-3">Shipping Address
                                        </h6>
                                        <address class="d-flex flex-column mb-0">
                                            <span class="text-gray-600 font-size-2">Ali Tufan</span>
                                            <span class="text-gray-600 font-size-2">Bedford St,</span>
                                            <span class="text-gray-600 font-size-2">Covent Garden, </span>
                                            <span class="text-gray-600 font-size-2">London WC2E 9ED</span>
                                            <span class="text-gray-600 font-size-2">United Kingdom</span>
                                        </address>
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