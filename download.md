---
layout: download 
title: Download 
slug: /download
items:
  - title: Mac 
    image:
      src: /assets/img/work/mac.png
      alt: report 
    download: https://www.dropbox.com/sh/yqdb2vkkf2clhti/AACCsILskApL3s8MsBHN52sPa?dl=0 
    description: Version 1.0 
  - title: Linux 
    image:
      src: /assets/img/work/linux.png
      alt: study 
    download: https://www.dropbox.com/sh/bjxdii83bpcqte1/AACnSTH5s71vWLlb0NbHvTAoa?dl=0
    description: Version 1.0. 
---
HybridSynchAADL is a plugin of OSATE, the standard tool environment for AADL, and supports the modeling and formal anlaysis of HybridSynchAADL models within OSATE. 

HybridSynchAADL uses Maude combined with SMT solving to symbolically encode all possible continuous behaviors depending on imprecise clocks. Please download Maude combined with SMT: [Maude-SE](https://maude-se.github.io/)

HybridSynchAADL has been tested on macOS Catalina and Linux (Ubuntu x64) using Java 1.8

## For a Mac user
Notice that OSATE binary is not signed. This can result in an error message when starting OSATE.

To correct this issue, run the following command to allow OSATE execution.
```
$ sudo xattr -rd com.apple.quarantine osate2.app/
```

## Stable Version
<br />
<br />
