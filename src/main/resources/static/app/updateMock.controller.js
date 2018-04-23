/**
 * Created by vamsiravi on 4/22/2018.
 */
(function () {
    'use strict';

    angular
        .module('app')
        .controller('UpdateMockService', UpdateMockService);

    UpdateMockService.$inject = ['$http'];

    function UpdateMockService($http) {
        var vm = this;

        vm.bookings = [];
        vm.getAll = getAll;
        vm.getAffordable = getAffordable;
        vm.deleteBooking = deleteBooking;

        init();

        function init(){
            getAll();
        }

        function getAll(){
            var url = "/booking-app/bookings/all";
            var bookingsPromise = $http.get(url);
            bookingsPromise.then(function(response){
                vm.bookings = response.data;
            });
        }

        function getAffordable(){
            var url = "/booking-app/bookings/affordable/" + 100;
            var bookingsPromise = $http.get(url);
            bookingsPromise.then(function(response){
                vm.bookings = response.data;
            });
        }

        function deleteBooking(id){
            var url = "/booking-app/bookings/delete/" + id;
            $http.post(url).then(function(response){
                vm.bookings = response.data;
            });
        }

        function create(){
            var url = "/booking-app/bookings/create";

            var booking = {
                pricePerNight:300,
                hotelName:"Some Hotel",
                nbOfNights:5
            };

            $http.post(url, booking).then(function(response){
                alert('Hotel saved :)');
            });
        }
    }
})();
