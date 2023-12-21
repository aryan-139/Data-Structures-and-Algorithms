/**
 * @return {Function}
 */
var createHelloWorld = function() {
    // return ()=>"Hello World";
    return function(...args){
        return("Hello World");
    }
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */