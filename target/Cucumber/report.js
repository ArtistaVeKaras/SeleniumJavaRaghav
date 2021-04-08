$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginTestpageRegx.feature");
formatter.feature({
  "line": 1,
  "name": "as a user I want to able to log in",
  "description": "",
  "id": "as-a-user-i-want-to-able-to-log-in",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12238609824,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Login",
  "description": "",
  "id": "as-a-user-i-want-to-able-to-log-in;login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@TestCompleted"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "am on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter my \"username\" as \"Montego001\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter my \"password\" as \"12345678\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click  login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I shoud be on the login page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestPageRegularx.am_on_the_login_page()"
});
formatter.result({
  "duration": 4235190536,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 12
    },
    {
      "val": "Montego001",
      "offset": 26
    }
  ],
  "location": "LoginTestPageRegularx.i_enter_my_as(String,String)"
});
formatter.result({
  "duration": 292896059,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 12
    },
    {
      "val": "12345678",
      "offset": 26
    }
  ],
  "location": "LoginTestPageRegularx.i_enter_my_as(String,String)"
});
formatter.result({
  "duration": 2273617982,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestPageRegularx.iClickLoginButton()"
});
formatter.result({
  "duration": 1591305186,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestPageRegularx.iShoudBeOnTheLoginPage()"
});
formatter.result({
  "duration": 36644,
  "status": "passed"
});
formatter.after({
  "duration": 1319008933,
  "status": "passed"
});
formatter.uri("ScenarioOutlineExamplesTable.feature");
formatter.feature({
  "line": 1,
  "name": "As a user I want to be able to login",
  "description": "using my username and password and confirm\nam on the home page",
  "id": "as-a-user-i-want-to-be-able-to-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "login",
  "description": "",
  "id": "as-a-user-i-want-to-be-able-to-login;login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@TestCompleted"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "am on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter my \"Username\" as \"\u003cUsername_Details\u003e\" in the textfield",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter my \"Password\" as \"\u003cPassword_Details\u003e\" in the textfield",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click the login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I should be on home page",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "as-a-user-i-want-to-be-able-to-login;login;",
  "rows": [
    {
      "cells": [
        "Username_Details",
        "Password_Details"
      ],
      "line": 15,
      "id": "as-a-user-i-want-to-be-able-to-login;login;;1"
    },
    {
      "cells": [
        "montego01",
        "12345678"
      ],
      "line": 16,
      "id": "as-a-user-i-want-to-be-able-to-login;login;;2"
    },
    {
      "cells": [
        "montego123",
        "123459999"
      ],
      "line": 17,
      "id": "as-a-user-i-want-to-be-able-to-login;login;;3"
    },
    {
      "cells": [
        "claudiomontego",
        "128888777"
      ],
      "line": 18,
      "id": "as-a-user-i-want-to-be-able-to-login;login;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6254352550,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "login",
  "description": "",
  "id": "as-a-user-i-want-to-be-able-to-login;login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@TestCompleted"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "am on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter my \"Username\" as \"montego01\" in the textfield",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter my \"Password\" as \"12345678\" in the textfield",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click the login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I should be on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestPageRegularx.am_on_the_login_page()"
});
formatter.result({
  "duration": 3823963000,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "LoginTestSteps.iClickTheLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 936000228,
  "status": "passed"
});
formatter.before({
  "duration": 5694496342,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "login",
  "description": "",
  "id": "as-a-user-i-want-to-be-able-to-login;login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@TestCompleted"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "am on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter my \"Username\" as \"montego123\" in the textfield",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter my \"Password\" as \"123459999\" in the textfield",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click the login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I should be on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestPageRegularx.am_on_the_login_page()"
});
formatter.result({
  "duration": 3670571665,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "LoginTestSteps.iClickTheLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 953851775,
  "status": "passed"
});
formatter.before({
  "duration": 5446862593,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "login",
  "description": "",
  "id": "as-a-user-i-want-to-be-able-to-login;login;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@TestCompleted"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "am on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter my \"Username\" as \"claudiomontego\" in the textfield",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter my \"Password\" as \"128888777\" in the textfield",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click the login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I should be on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestPageRegularx.am_on_the_login_page()"
});
formatter.result({
  "duration": 3666205360,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "LoginTestSteps.iClickTheLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 844823911,
  "status": "passed"
});
});