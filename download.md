---
layout: download 
title: Download 
slug: /download
---
The HybridSynchAADL tool is an [OSATE2](https://osate.org/) plugin. The tool runs in
<b>Java1.8</b> and is available for Linux(Ubuntu). Check whether Java1.8 is
installed in your local machine or not. If it is not installed, go
to this
[link](https://www.oracle.com/kr/java/technologies/javase/javase-jdk8-downloads.html),
and download Java1.8.

The HybridSynchAADL tool also uses Maude with SMT solver which is a rewriting
modulo SMT extension of Maude 3.0 at C++ level. You can download it in this
[link](https://maude-se.github.io/)


You can download HybridSynchAADL tool as plugin projcect (three jar files). The
installation process is explained below the 'Installation' section. The OSATE2
tool including our plugin version is also provided: 

HybridSynchAADL 1.0 source:
* [Source](https://tinyurl.com/xfsyrfz8)


HybridSynchAADL 1.0 plugin:
* [Plugin](https://tinyurl.com/4v6d46ue)


OSATE2 including HybridSynchAADL 1.0:
* [Linux(Ubuntu)](https://www.dropbox.com/sh/bjxdii83bpcqte1/AACnSTH5s71vWLlb0NbHvTAoa?dl=0)


## Installation  
Download a latest version OSATE2 available for Linux(Ubuntu). Make the
<b>dropins</b> directory in downloaded OSATE directory. Unzip the plugins.zip
file and put the three jar files into the 'dropins' directory.  In the
<b>configuration/org.eclipase.equinox.simpleconfigurator</b> directory, there
is a <b>bundles.info</b> file which contains a list of all plugins installed in
the current OSATE2.



Write the following lines under <b>#version=1</b> in the <b>bundles.info</b> file.

> edu.postech.aadl.synch,1.0.0.202104261605,dropins/edu.postech.aadl.synch_1.0.0.202104261605.jar,4,false
> edu.postech.aadl.xtext.propspec,1.0.0.202104261605,dropins/edu.postech.aadl.xtext.propspec_1.0.0.202104261605.jar,4,false
> edu.postech.aadl.xtext.propspec.ui,1.0.0.202104261605,dropins/edu.postech.aadl.xtext.propspec.ui_1.0.0.202104261605.jar,4,false

You can now run <b>OSATE2</b> and perform an analysis. If you successfully execute
<b>OSATE2</b> with our plugins, you can see the following window.

![OSATE](https://raw.githubusercontent.com/hybridsynchaadl/HybridSynchAADL/master/images/start.png)

There must be the menu named by "HybridSynchAADL" when our plugins are
successfullly included in OSATE2.

## Getting Started + Example

The easiest way to get started is to run some of the simple HybridSynchAADL
models. Follow the step-by-step instruction guideline at Section 6 in <b>User
Manual</b> in the 'Documentation' menu. 



## HybridSynchAADL Property Set

The tool provides HybridSynchAADL language for modeling virtually synchronous
CPSs in AADL. The HybridSynchAADL language is a subset of AADL extended with
the following property set 'Hybrid_SynchAADL'. We use a subset of AADL without
changing the meaning of AADL constructs or adding a new annex so that AADL
experts can easily develop and understand HybridSynchAADL models. Download the
AADL file specifying the 'Hybrid_SynchAADL' property and put it into the
'propertysets' directory in your AADL project:

HybridSynchAADL property set:
* [property_set](https://hybridsynchaadl.github.io/assets/HybridSynchAADL.aadl)
