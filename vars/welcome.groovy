#!/usr/bin/env groovy

def call(String url) {
  sh "git clone ${url}"
  sh "ls -ltr -a"
  sh "cd docker-practical"
  commit_id = sh(script: "git rev-parse HEAD", returnStdout: true).trim()
  return commit_id
}
