#!/usr/bin/env groovy

def call(String url) {
  sh "git clone ${url}"
}
