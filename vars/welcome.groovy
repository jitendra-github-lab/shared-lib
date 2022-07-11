#!/usr/bin/env groovy

def cloneGitRepo(String url) {
  sh "git clone ${url}"
  commit_id = sh(script: "git rev-parse HEAD", returnStdout: true).trim()
  return commit_id
}
