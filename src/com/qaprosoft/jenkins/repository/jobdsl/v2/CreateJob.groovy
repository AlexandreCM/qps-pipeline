package com.qaprosoft.jenkins.repository.jobdsl.v2

import com.qaprosoft.jenkins.repository.jobdsl.v2.Creator
import com.qaprosoft.jenkins.repository.jobdsl.factory.BuildJobFactory
import com.qaprosoft.jenkins.repository.jobdsl.factory.BuildListViewFactory


def creator = new Creator(this)
creator.createJob()

def buildJobFactory = new BuildJobFactory(this)
buildJobFactory.job("Automation/Factory-Generated-Job", "Factory job")

def buildListViewFactory = new BuildListViewFactory(this)
buildListViewFactory.listView("Automation", "view", "", "Factory-Generated-Job")