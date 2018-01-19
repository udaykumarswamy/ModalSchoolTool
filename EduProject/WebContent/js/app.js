var myapp = angular.module('deccanApp', ['ngRoute']);
myapp.config(['$routeProvider', function ($routeProvider)
    {
        $routeProvider.when('/ManageUser', {
            templateUrl: "manageUser.html"
        }).when('/DataFeed', {
            templateUrl: "datafeed.html"
        }).when('/analytics', {
            templateUrl: "analytics.html"
        }).when('/payment', {
            templateUrl: "payment.html"
        }).when('/adduser', {
            templateUrl: "adduser.html"
        }).when('/deleteUser', {
            templateUrl: "deleteUser.html"
        }).when('/PlaceOrder',{
            templateUrl :"placeOrder.html"
        });
}
]);