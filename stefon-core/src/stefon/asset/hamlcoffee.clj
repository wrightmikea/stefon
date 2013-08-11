(ns stefon.asset.hamlcoffee
  (:require [stefon.jsengine :as jsengine]
            [stefon.asset :as asset]))

;; imported from
;; https://raw.github.com/netzpirat/haml-coffee/master/dist/compiler/hamlcoffee.js
;; https://raw.github.com/netzpirat/haml_coffee_assets/master/lib/js/haml_coffee_assets.js
(def compile
  (jsengine/compiler "compileHamlCoffee"
                     ["coffee-script.js"
                      "hamlcoffee.js"
                      "haml_coffee_assets-rhino-fix.js"
                      "haml_coffee_assets.js"
                      "hamlcoffee-wrapper.js"]))

(asset/register "hamlc" compile)