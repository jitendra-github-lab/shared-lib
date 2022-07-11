#!/usr/bin/env groovy

def cloneGitRepo(String url) {
  sh "git clone ${url}"
}
