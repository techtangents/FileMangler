Copyright 2010 Dylan Just

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.


License Cop
===========
A tool for adding license/copyright headers to your source files.   

Author: Dylan Just
License: Apache 2. See NOTICE and LICENSE files.

Usage
=====
  Command line:
    java -jar LicenseCop.jar folder

  Java:
    new LicenseCop().go(folder);

where 'folder' is the root folder of your project.
Your project requires a build/header.txt file containing your header text.

If all goes well, your files will end up with the header text in the right comment style for the file type.
No console output unless something goes wrong.

Requires java 6.

How it works
============
Assumes each source file starts with a block comment.
This comment is removed and replaced with a block comment containing the text in your header.txt file.

The code is driven by the EPipes library, developed by Ephox, which is soon to be open sourced.

Template Fields
===============
You can insert ${year} into your header.txt, which will be replaced by the year in the output.

Building
========
LicenseCop is built with Ent, a build system developed by Ephox. This tool is currently private and closed-source,
but it may be opened up in the near future.

Caveats/Issues/Quirks
=====================
Nothing major... just be aware of the following. As always, make sure your code is backed up and
in a version control system before using this tool. 

- Currently all source files are rewritten to disk, even if the header is already ok.
    Might be slow in larger projects.
- As it removes the block comment at the start of the file, you may lose non-license blocks (e.g. javadoc)'
    on the first run for a project
- Only supports .js and .java files
- Only block-style comments are supported.
- No line prefixes. i.e.
/*
license
*/
not:
/*
 * license
 */
- Runs in place, rather than copying to a temp file.
- Always uses \n for line endings - .git complains about this, and sometimes you end up with removed
    newlines at the end of files.
- The header comment always goes before the java package declaration.
    If yours is after the package dec, you may get two of them.
