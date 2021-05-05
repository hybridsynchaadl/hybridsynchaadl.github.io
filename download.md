---
layout: download 
title: Download 
slug: /download
---
The HybridSynchAADL tool is an [OSATE2](https://osate.org/) plugin. The tool is available for Linux (64-bit) and macOS (64-bit). As a prerequisite JAVA8 and Maude-SE are required. 

* JAVA8: <a href="https://www.oracle.com/kr/java/technologies/javase/javase-jdk8-downloads.html">https://www.oracle.com/kr/java/technologies/javase/javase-jdk8-downloads.html</a>
* Maude-SE: <a href="https://maude-se.github.io/">https://maude-se.github.io/</a>


There are two ways to download the HybridSynchAADL:


<b>First</b>, you can download the HybridSynchAADL tool integrated with OSATE2 on the following links:
* [HybridSynchAADL 1.0 for Linux64](https://www.dropbox.com/sh/bjxdii83bpcqte1/AACnSTH5s71vWLlb0NbHvTAoa?dl=0)
* [HybridSynchAADL 1.0 for macOS](https://www.dropbox.com/sh/ua5zds97b2j7n01/AAAjLUBHNAzb7impOw99ryAfa?dl=0): 

Note that the OSATE2 binary is not signed. To correct this issue, run the
following command: 

```$ sudo xattr -rd com.apple.quarantine osate2.app/ ```

<p>
<b>Second</b>, you can install the HybridSynchAADL tool into OSATE2 manually.
We provide our tool as plugin projects (three jar files). Download 
<a href="https://tinyurl.com/4v6d46ue">plugins.zip</a> and unzip the archive
file.
</p>


Create the directory <code>dropins</code> in the OSATE2 directory (for
macOS, 'osate2.app/Contents/Eclipse/').  Put three jar files into the
<code>dropins</code> directory.


To notify that our plugin should be included into OSATE2, you need to write the
following lines under <code>#version=1</code> in the <code>bundles.info</code> file.

> edu.postech.aadl.synch,1.0.0.202104261605,dropins/edu.postech.aadl.synch_1.0.0.202104261605.jar,4,false
> edu.postech.aadl.xtext.propspec,1.0.0.202104261605,dropins/edu.postech.aadl.xtext.propspec_1.0.0.202104261605.jar,4,false
> edu.postech.aadl.xtext.propspec.ui,1.0.0.202104261605,dropins/edu.postech.aadl.xtext.propspec.ui_1.0.0.202104261605.jar,4,false

The <code>bundles.info</code> file is located in:
* Linux64: OSATE2/configuration/org.eclipse.equinox.simpleconfigurator 
* macOS: osate2.app/Contents/Eclipse/org.eclipse.equinox.simpleconfigurator


There must be the menu <code>HybridSynchAADL</code> when our plugins are
successfullly included in OSATE2.

When you run the HybridSynchAADL tool, you can see the following window.

![OSATE](https://raw.githubusercontent.com/hybridsynchaadl/HybridSynchAADL/master/images/start.png)

## Source Code
The current version of the HybridSynchAADL tool is available at the [Github repository](https://github.com/hybridsynchaadl/HybridSynchAADL)
