var generator = {
	initialize : function(succesCallback, errorCallback){
		cordova.exec(
		succesCallback,
		errorCallback,
		'Generator',
		'initialize',
		[]
		);
	}

}
module.exports = generator;
