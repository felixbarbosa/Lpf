if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'OlaJS'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'OlaJS'.");
}
var OlaJS = function (_, Kotlin) {
  'use strict';
  var println = Kotlin.kotlin.io.println_s8jyv4$;
  function main() {
    println('Ola Mundo');
    window.alert('ola a todos');
    var div = document.getElementById('texto');
    if (div != null)
      div.innerHTML = div.innerHTML + 'Este texto esta no programa kotlin';
  }
  _.main = main;
  main();
  Kotlin.defineModule('OlaJS', _);
  return _;
}(typeof OlaJS === 'undefined' ? {} : OlaJS, kotlin);
