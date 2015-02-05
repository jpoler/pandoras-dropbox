(ns pandoras-dropbox.client-config
  (:require [clojure.data.json :as json]))

(defn read-config-file
  [filename]
  (json/read-str (slurp filename)))


