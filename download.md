---
layout: download 
title: Download 
slug: /download
---
HybridSynchAADL tool is an [OSATE](https://osate.org/) plugin. The tool runs in
<b>java1.8</b> and is available for Linux(Ubuntu). Check whether java1.8 is
installed in your local machine or not. If it is not installed, go
to this
[link](https://www.oracle.com/kr/java/technologies/javase/javase-jdk8-downloads.html),
and download java1.8.


You can download HybridSynchAADL tool as plugin projcect (three jar files). The
installation process is explained below section 'Installtion' for operating
system. The OSATE2 tool including our plugin version also can be downloaded.

HybridSynchAADL 1.0 plugin:
* [Plugin](https://hybridsynchaadl.github.io/plugins/plugins.zip)


Installed HybridSynchAADL 1.0 in OSATE2:
* [Linux(Ubuntu)](https://www.dropbox.com/sh/bjxdii83bpcqte1/AACnSTH5s71vWLlb0NbHvTAoa?dl=0)


## Installation  
Download a latest version OSATE2 available for Linux(Ubuntu). Download our plugin 
in in this [link](https://hybridsynchaadl.github.io/plugins/plugins.zip).
Make the <b>dropins</b> folder in downloaded OSATE directory, and put three jar files 
into it.  In <b>osate/configuration/org.eclipase.equinox.simpleconfigurator</b>,
there is a <b>bundles.info</b> file which contains a list of all the plugins
installed in the current system.

Put the following code under <b>#version=1</b> in the <b>bundles.info</b> file

> edu.postech.aadl.synch,1.0.0.202104250702,dropins/edu.postech.aadl.synch_1.0.0.202104250702.jar,4,false
> edu.postech.aadl.xtext.propspec,1.0.0.202104250702,dropins/edu.postech.aadl.xtext.propspec_1.0.0.202104250702.jar,4,false
> edu.postech.aadl.xtext.propspec.ui,1.0.0.202104250702,dropins/edu.postech.aadl.xtext.propspec.ui_1.0.0.202104250702.jar,4,false

You can now run <b>OSATE2</b> and start verification. If you successfully execute
<b>OSATE2</b> with our plugins, you can see the following window.

![OSATE](https://raw.githubusercontent.com/hybridsynchaadl/HybridSynchAADL/master/images/start.png)

There must be the menu named by "HybridSynchAADL" when our plugins are
successfullly included in OSATE.

## Getting Started + Example

The easiest way to get started is to run some of the simple HybridSynchAADL
models. Follow the step-by-step instruction guideline in <b>tutorial.pdf</b> in
this repository.

Note that HybridSynchAADL tool uses Maude-with-SMT which is a rewriting modulo
SMT extension of Maude 3.0 at C++ level. You can download it in this
[link](https://maude-se.github.io/)


## HybridSynchAADL Property Set

The tool provides HybridSynchAADL language for modeling virtually synchronous CPSs in AADL. The HybridSynchAADL language is a subset of AADL extended with the following property set 'Hybrid_SynchAADL'. We use a subset of AADL without changing the meaning of AADL constructs or adding a new annex so that AADL experts can easily develop and understand HybridSynchAADL models

HybridSynchAADL property set:
* [Property_Set](https://hybridsynchaadl.github.io/assets/propertysets.zip)
