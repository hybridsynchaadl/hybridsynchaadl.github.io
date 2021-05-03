---
layout: download 
title: Download 
slug: /download
---
The HybridSynchAADL tool is an [OSATE2](https://osate.org/) plugin. The tool
runs in <b>Java1.8</b> and is available for Linux(Ubuntu) and macOS. Check
whether Java1.8 is installed in your local machine or not. If it is not
installed, go to this
[link](https://www.oracle.com/kr/java/technologies/javase/javase-jdk8-downloads.html),
and download Java1.8.

The HybridSynchAADL tool also uses Maude with SMT solver which is a rewriting
modulo SMT extension of Maude 3.0 at C++ level. You can download it in this
[link](https://maude-se.github.io/)

The HybridSynchAADL tool integrated with OSATE2 can be downloaded on the following links:
* [HybridSynchAADL 1.0 for Linux64](https://www.dropbox.com/sh/bjxdii83bpcqte1/AACnSTH5s71vWLlb0NbHvTAoa?dl=0)
* [HybridSynchAADL 1.0 for macOS](https://www.dropbox.com/sh/bjxdii83bpcqte1/AACnSTH5s71vWLlb0NbHvTAoa?dl=0)


Note that OSATE2 binary for macOS is not signed. This can result in an error message when starting OSATE.
To correct this issue, run the following command to allow OSATE2 execution:
> $ sudo xattr -rd com.apple.quarantine osate2.app/ 

When you run the HybridSynchAADL tool, you can see the following window.

![OSATE](https://raw.githubusercontent.com/hybridsynchaadl/HybridSynchAADL/master/images/start.png)

## Installation from OSATE2 
When you already have OSATE2 for Linux64 or macOS, you can integrate our tool
into OSATE2. We provide our tool as plugin projects (three jar files). Download
the 'plugins.zip' file in this [link](https://tinyurl.com/4v6d46ue) and unzip
the file.


### 1. Create the "dropins" directory
To include our plugin projects into OSATE2, create the directory named by
<b>dropins</b> in the OSATE2 directory (for macOS, 'osate2.app/Contents/Eclipse/').
Put three jar files into the <b>dropins</b> directory.


### 2. Write our plugin information
To notify that our plugin should be included into OSATE2, you need to write the
following lines under <b>#version=1</b> in the <b>bundles.info</b> file.

> edu.postech.aadl.synch,1.0.0.202104261605,dropins/edu.postech.aadl.synch_1.0.0.202104261605.jar,4,false
> edu.postech.aadl.xtext.propspec,1.0.0.202104261605,dropins/edu.postech.aadl.xtext.propspec_1.0.0.202104261605.jar,4,false
> edu.postech.aadl.xtext.propspec.ui,1.0.0.202104261605,dropins/edu.postech.aadl.xtext.propspec.ui_1.0.0.202104261605.jar,4,false

The <b>bundles.info</b> file is located in:
* OSATE2/configuration/org.eclipse.equinox.simpleconfigurator (for Linux64)
* osate2.app/Contents/Eclipse/org.eclipse.equinox.simpleconfigurator (for macOS)


### 3. Run OSATE2 integrated with our tool

You can now run <b>OSATE2</b> and perform an analysis. There must be the menu
named by "HybridSynchAADL" when our plugins are successfullly included in
OSATE2.

## Source Code
There is a github webpage maintaining current release version of our tool.
Go to the following github page to get the source code of our tool: [Source](https://github.com/hybridsynchaadl/HybridSynchAADL)
