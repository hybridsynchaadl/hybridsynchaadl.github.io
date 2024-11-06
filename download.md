---
layout: download 
slug: /download
---

## Download MR-HybridSynchAADL Tool

The MR-HybridSynchAADL tool is an [OSATE2](https://osate.org/) plugin. The tool is
available for Linux (64-bit) and macOS (64-bit). The following libraries are
required. 

* JRE-17: <a href="https://openjdk.java.net/install/">https://openjdk.java.net/install/</a>
* Maude-SE: <a href="https://maude-se.github.io/">https://maude-se.github.io/</a>

### 1. Download MR-HybridSynchAADL Integrated with OSATE2
* [MR-HybridSynchAADL 1.0 for Linux (64-bit)](https://www.dropbox.com/sh/bjxdii83bpcqte1/AACnSTH5s71vWLlb0NbHvTAoa?dl=0)
* [MR-HybridSynchAADL 1.0 for macOS (64-bit)](https://www.dropbox.com/sh/ua5zds97b2j7n01/AAAjLUBHNAzb7impOw99ryAfa?dl=0)

Note that the OSATE2 binary for macOS is not signed. To correct this issue, run
the following command: 

```$ sudo xattr -rd com.apple.quarantine osate2.app/ ```

### 2. Install MR-HybridSynchAADL into Existing OSATE2


<p>
The MR-HybridSynchAADL tool is composed of three plugin packages (three jar files). Download 
<a href="https://tinyurl.com/4v6d46ue">plugins.zip</a> and unzip the archive
file.
</p>


To install the plugin packages into OSATE2, create a directory <code>dropins</code> in the installed OSATE2 directory (for
macOS, <code>osate2.app/Contents/Eclipse/</code>). Move the plugin packages into 
<code>dropins</code>.

Insert the following lines after <code>#version=1</code> in the
<code>bundles.info</code> file to let OSATE2 detect the plugins.

> edu.postech.aadl.synch,1.0.0.202104261605,dropins/edu.postech.aadl.synch_1.0.0.202104261605.jar,4,false
> edu.postech.aadl.xtext.propspec,1.0.0.202104261605,dropins/edu.postech.aadl.xtext.propspec_1.0.0.202104261605.jar,4,false
> edu.postech.aadl.xtext.propspec.ui,1.0.0.202104261605,dropins/edu.postech.aadl.xtext.propspec.ui_1.0.0.202104261605.jar,4,false

The <code>bundles.info</code> file is located in:
* Linux : OSATE2/configuration/org.eclipse.equinox.simpleconfigurator 
* macOS : osate2.app/Contents/Eclipse/configuration/org.eclipse.equinox.simpleconfigurator


When you run the MR-HybridSynchAADL tool, you can see the following window.

![OSATE](https://raw.githubusercontent.com/hybridsynchaadl/HybridSynchAADL/master/images/start.png)

## Download Source Code
The current version of the tool's source code is available at the [Github repository](https://github.com/hybridsynchaadl/HybridSynchAADL)
