var bookListApp = angular.module('bookListApp', [])


bookListApp.controller('bookListCtrl', function($scope, $http){
		
	$scope.refreshBookList = function(bookListId) {
		
		$http.get('/bookstore/rest/booklist/' + $scope.bookListId).success(
				function(data){
					$scope.bookList = data;
				});
	
	};
	
	
	$scope.clearBookList = function() {
		$http.delete('/bookstore/rest/booklist/'+$scope.cart).success(
		function(data){
			$scope.refreshBookList($scope.bookListId);
		});
	};

	
	
	$scope.initBookListId = function(bookListId){
		$scope.bookListId = bookListId;
		$scope.refreshBookList($scope.bookListId);
	};
	

	
	$scope.addToBookList = function(bookId){
		$http.put('/bookstore/rest/booklist/add/' + bookId).success(
		function(data){
		alert("book  added to the list!");	
		});
	};
	
	
	$scope.removeFromBookList = function(bookId){
		$http.put('/bookstore/rest/booklist/remove/'+bookId).success(function(data){
			$scope.refreshBookList($scope.bookListId);
		});
	}
	
	
	
});