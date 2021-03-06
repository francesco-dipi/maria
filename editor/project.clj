(defproject maria/editor "0.1.0-SNAPSHOT"
  :description "A ClojureScript editor for beginners"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}

  :min-lein-version "2.7.1"

  :dependencies ~(into '[[thheller/shadow-cljs "2.1.22"]
                         [org.clojure/clojure "1.9.0-alpha17"]
                         [org.clojure/clojurescript "1.9.946"]]
                   (->
                     (slurp "shadow-cljs.edn")
                     (read-string)
                     (:dependencies)))

  :clean-targets ^{:protect false} ["public/js/compiled"
                                    "target"]

  :source-paths ~(->
                   (slurp "shadow-cljs.edn")
                   (read-string)
                   (:source-paths))

  :deploy-via :clojars)
