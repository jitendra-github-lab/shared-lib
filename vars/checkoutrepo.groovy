#!/usr/bin/env groovy

def checkoutRepo(String url) {
  sh "git clone ${url}"
  sh "ls -ltr -a"
  dir('docker-practical'){
    commit_id = sh(script: "git rev-parse HEAD", returnStdout: true).trim()
  }
  return commit_id
}
