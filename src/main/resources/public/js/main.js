var app = angular.module("springDemo", []);
app.controller("AppCtrl", function ($scope, $http) {

    $scope.websites = [];


    $http.get('http://localhost:8090/api/stackoverflow').then(function (response) {
        $scope.websites = response.data;
        console.log(response.data);

    });


    //
    // $scope.websites = [{
    //     iconImageUrl: '',
    //     id: 'stackoverflow',
    //     website: 'stackoverflow.com',
    //     title: 'StackOverflow Website',
    //     description: 'StackOverflow description'
    // }];
});

