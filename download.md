---
layout: download 
title: Download 
slug: /download
---
HybridSynchAADL tool is an [OSATE](https://osate.org/) plugin. The tool runs in
<b>java version 8</b> and is available for Linux and macOS. Check whether java
version 8 is installed in your local machine or not. If it is not installed, go
to this
[link](https://www.oracle.com/kr/java/technologies/javase/javase-jdk8-downloads.html),
and download java version 8.

HybridSynchAADL 1.0 platform package:
* [OS X](https://www.dropbox.com/sh/yqdb2vkkf2clhti/AACCsILskApL3s8MsBHN52sPa?dl=0)
* [Linux(Ubuntu)](https://www.dropbox.com/sh/bjxdii83bpcqte1/AACnSTH5s71vWLlb0NbHvTAoa?dl=0)


Notice that OSATE binary is not signed. This can result in an error message when starting OSATE.
To correct this issue, run the following command to allow OSATE execution.
```
$ sudo xattr -rd com.apple.quarantine osate2.app/
```


## Installation  
Download a recent OSATE available for Linux and macOS. Download plugins of our
tools in in this [link](https://hybridsynchaadl.github.io/plugins/plugins.zip).
Make the <b>dropins</b> folder in downloaded OSATE directory, and move out plugins
into it.  In <b>osate/configuration/org.eclipase.equinox.simpleconfigurator</b>,
there is a <b>bundles.info</b> file which contains a list of all the plugins
installed in the current system.

Put the following code under <b>#version=1</b> in the <b>bundles.info</b> file

> edu.postech.aadl.synch,1.0.0.202104110533,dropins/edu.postech.aadl.synch_1.0.0.202104110533.jar,4,false
> edu.postech.aadl.xtext.propspec,1.0.0.202104110533,dropins/edu.postech.aadl.xtext.propspec_1.0.0.202104110533.jar,4,false
> edu.postech.aadl.xtext.propspec.ui,1.0.0.202104110533,dropins/edu.postech.aadl.xtext.propspec.ui_1.0.0.202104110533.jar,4,false

You can now run <b>OSATE</b> and start verification. If you successfully execute
<b>OSATE</b> with our plugins, you can find the following window.

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

## Installation (for Developer)

For developing HybridSynchAADL, download osate developer version in your local
computer. Please refer to the <b>Developer Documentation</b> in OSATE web page.
After successfully setting up an OSATE development environment, import three plugin projects in this repository:

* edu.postech.aadl.synch
* edu.postech.aadl.xtext.propspec
* edu.postech.aadl.xtext.propspec.ui

HybridSynchAADL uses [ANTLR](https://www.antlr.org/) which is a powerful parser
generator for java when parsing continuous dynamics in environment component.
You can download ANTLR and ANTLR IDE in <b>Eclilpse Markeplace</b>.
