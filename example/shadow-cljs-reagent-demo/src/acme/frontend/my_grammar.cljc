(ns acme.frontend.my-grammar
  (:require
    [girouette.tw.core :refer [make-api]]
    [girouette.util :as util]
    [girouette.tw.common :as common]
    [girouette.tw.layout :as layout]
    [girouette.tw.flexbox :as flexbox]
    [girouette.tw.grid :as grid]
    [girouette.tw.box-alignment :as box-alignment]
    [girouette.tw.spacing :as spacing]
    [girouette.tw.sizing :as sizing]
    [girouette.tw.typography :as typography]
    [girouette.tw.background :as background]
    [girouette.tw.border :as border]
    [girouette.tw.effect :as effect]
    [girouette.tw.table :as table]
    [girouette.tw.animation :as animation]
    [girouette.tw.transform :as transform]
    [girouette.tw.interactivity :as interactivity]
    [girouette.tw.svg :as svg]
    [girouette.tw.accessibility :as accessibility]))

(def default-components
  (util/into-one-vector
    [common/components
     layout/components
     flexbox/components
     grid/components
     box-alignment/components
     spacing/components
     sizing/components
     typography/components
     background/components
     border/components]))
     ;effect/components
     ;table/components
     ;animation/components
     ;transform/components
     ;interactivity/components
     ;svg/components
     ;accessibility/components]))


(def class-name->garden
  (:class-name->garden (make-api default-components)))
