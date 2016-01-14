# DistributedSpaceLayout
This is a tiny library extending LinearLayout to automatically distribute evenly spaces between children without doing anything

## Gradle
```
compile 'no.hyper.distributedspacelayout:distributedspacelayout:0.2'
```

## Usage
```xml
<no.hyper.distributedspacelayout.DistributedSpaceLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:custom="http://schemas.android.com/apk/res/auto-res"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="no.hyper.distributedspacelayoutproject.MainActivity"
    android:orientation="vertical"
    custom:start="true"
    custom:end="true">

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="First button"/>

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Second button"/>

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Third button"/>

</no.hyper.distributedspacelayout.DistributedSpaceLayout>
```
Four Space children are added into this view : one before the first button, one between each buttons and the last one at the end :

![screenshot_2015-12-10-10-08-09](https://cloud.githubusercontent.com/assets/1524348/11718253/4ca6c354-9f55-11e5-8932-4e7b47733e25.png)

The custom attributes `start` and `end` are used to specify if you want a space element added before your first child and after the last one. The default value is `true` when they are not declared in the xml.

## Liscence
```
The MIT License (MIT)

Copyright (c) 2015 Hyper Interaktiv



Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:



The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.



THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.  IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
```


