$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/BookingRoomslviaTransfer.feature");
formatter.feature({
  "line": 2,
  "name": "Booking Hotel",
  "description": "User want to checkout Hotel",
  "id": "booking-hotel",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Bookingroomhotel"
    },
    {
      "line": 1,
      "name": "@Development"
    }
  ]
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 5,
      "value": "#@positiveCase"
    },
    {
      "line": 6,
      "value": "#Scenario Outline: Booking Hotel via Transfer as payment method"
    },
    {
      "line": 7,
      "value": "#Given The User Login \"\u003cemail\u003e\"  as email, \"\u003cpassword\u003e\" as password"
    },
    {
      "line": 8,
      "value": "#And The User go to HomePage"
    },
    {
      "line": 9,
      "value": "#When The User set \"\u003chotellocation\u003e\", select The Hotel Prime, set CheckIn and Checkout"
    },
    {
      "line": 10,
      "value": "#And The User search hotel"
    },
    {
      "line": 11,
      "value": "#And The User choose how many room input"
    },
    {
      "line": 12,
      "value": "#Then The User continue process payment"
    },
    {
      "line": 13,
      "value": "#And The User validate Rooms \u0026 Summary"
    },
    {
      "line": 14,
      "value": "#And The User Confirmation Order via Transfer as payment method"
    },
    {
      "line": 15,
      "value": "#Then The User see Order, Total as Order Confirmation"
    },
    {
      "line": 16,
      "value": "#"
    },
    {
      "line": 17,
      "value": "#Examples:"
    },
    {
      "line": 18,
      "value": "#| email                 | password    | hotellocation |"
    },
    {
      "line": 19,
      "value": "#| QA-Admin1@getnada.com | P@ssw0rd123 | Aceh          |"
    }
  ],
  "line": 22,
  "name": "Booking Hotel via Transfer as payment method",
  "description": "",
  "id": "booking-hotel;booking-hotel-via-transfer-as-payment-method",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 21,
      "name": "@positiveCase"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "The User Login \"\u003cemail\u003e\"  as email, \"\u003cpassword\u003e\" as password",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "The User go to HomePage",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "The User set \"\u003chotellocation\u003e\", select The Hotel Prime, set \"\u003ccheckin\u003e\" as date Check In and \"\u003ccheckout\u003e\" as date Check Out",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "The User search hotel",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "The User choose how many room input",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "The User continue process payment",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "The User validate Rooms \u0026 Summary",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "The User Confirmation Order via Transfer as payment method",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "The User see Order, Total as Order Confirmation",
  "keyword": "Then "
});
formatter.examples({
  "line": 33,
  "name": "",
  "description": "",
  "id": "booking-hotel;booking-hotel-via-transfer-as-payment-method;",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "hotellocation",
        "checkin",
        "checkout"
      ],
      "line": 34,
      "id": "booking-hotel;booking-hotel-via-transfer-as-payment-method;;1"
    },
    {
      "cells": [
        "QA-Admin1@getnada.com",
        "P@ssw0rd123",
        "Aceh",
        "06-11-2021",
        "07-11-2021"
      ],
      "line": 35,
      "id": "booking-hotel;booking-hotel-via-transfer-as-payment-method;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 22241028533,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Booking Hotel via Transfer as payment method",
  "description": "",
  "id": "booking-hotel;booking-hotel-via-transfer-as-payment-method;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Development"
    },
    {
      "line": 21,
      "name": "@positiveCase"
    },
    {
      "line": 1,
      "name": "@Bookingroomhotel"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "The User Login \"QA-Admin1@getnada.com\"  as email, \"P@ssw0rd123\" as password",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "The User go to HomePage",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "The User set \"Aceh\", select The Hotel Prime, set \"06-11-2021\" as date Check In and \"07-11-2021\" as date Check Out",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "The User search hotel",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "The User choose how many room input",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "The User continue process payment",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "The User validate Rooms \u0026 Summary",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "The User Confirmation Order via Transfer as payment method",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "The User see Order, Total as Order Confirmation",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "QA-Admin1@getnada.com",
      "offset": 16
    },
    {
      "val": "P@ssw0rd123",
      "offset": 51
    }
  ],
  "location": "BookingRoomsviaTransferSteps.the_user_login_as_email_as_password(String,String)"
});
formatter.result({
  "duration": 4928060598,
  "status": "passed"
});
formatter.match({
  "location": "BookingRoomsviaTransferSteps.the_user_go_to_home_page()"
});
formatter.result({
  "duration": 3247095784,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Aceh",
      "offset": 14
    },
    {
      "val": "06-11-2021",
      "offset": 50
    },
    {
      "val": "07-11-2021",
      "offset": 84
    }
  ],
  "location": "BookingRoomsviaTransferSteps.setHotelDateDynamic(String,String,String)"
});
formatter.result({
  "duration": 1026995186,
  "status": "passed"
});
formatter.match({
  "location": "BookingRoomsviaTransferSteps.the_user_search_hotel()"
});
formatter.result({
  "duration": 4204528305,
  "status": "passed"
});
formatter.match({
  "location": "BookingRoomsviaTransferSteps.setQuantity()"
});
formatter.result({
  "duration": 3120450105,
  "status": "passed"
});
formatter.match({
  "location": "BookingRoomsviaTransferSteps.clickButtonContinueProcess()"
});
formatter.result({
  "duration": 1480012338,
  "status": "passed"
});
formatter.match({
  "location": "BookingRoomsviaTransferSteps.the_User_see_Order_Total_as_Order_Confirmation()"
});
formatter.result({
  "duration": 158166023785,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#cgv\"}\n  (Session info: chrome\u003d93.0.4577.82)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027superuser.local\u0027, ip: \u0027fe80:0:0:0:b0:e09e:6972:89e9%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.5\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 93.0.4577.82, chrome: {chromedriverVersion: 92.0.4515.107 (87a818b10553..., userDataDir: /var/folders/r9/x26cy6x527l...}, goog:chromeOptions: {debuggerAddress: localhost:61398}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 990f06d3bc568b19b978c1ee72d5a662\n*** Element info: {Using\u003did, value\u003dcgv}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\n\tat page_object.QuickOrderDetailPage.ClickCheckBoxTnc(QuickOrderDetailPage.java:91)\n\tat step_definitions.BookingRoomsviaTransferSteps.the_User_see_Order_Total_as_Order_Confirmation(BookingRoomsviaTransferSteps.java:112)\n\tat ✽.And The User validate Rooms \u0026 Summary(Features/BookingRoomslviaTransfer.feature:29)\n",
  "status": "failed"
});
formatter.match({
  "location": "BookingRoomsviaTransferSteps.viewOrderSummary()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BookingRoomsviaTransferSteps.OrderConfirmation()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current Page URL is http://qa.cilsy.id:8080/en/quick-order");
formatter.after({
  "duration": 7507371,
  "status": "passed"
});
});