Copyright 2010 Dylan Just

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this any file in this distribution
except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.


File Mangler
============
Simple API for dealing with files in java.

Author: Dylan Just
License: Apache License, version 2. See NOTICE and LICENSE files.

Usage
=====
FileMangler m = new DefaultFileMangler();

DefaultFileMangler is a facade that aggregates the classes in the "bits" package.
Either use the DefaultFileMangler, or the individual bits, whatever suits your style.

Note: all checked exceptions are 'edged', so instead of getting, e.g. java.io.IOExceptions, you'll get
IOExceptions wrapped in a runtime EdgeException.
