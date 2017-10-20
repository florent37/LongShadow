# LongShadow

Add a long shadow on any Android View

[![gif](https://raw.githubusercontent.com/florent37/LongShadow/master/media/sample.gif)](https://github.com/florent37/LongShadow)

INSERT IMAGE

<a href="https://play.google.com/store/apps/details?id=com.github.florent37.florent.champigny">
  <img alt="Android app on Google Play" src="https://developer.android.com/images/brand/en_app_rgb_wo_45.png" />
</a>

```
<com.github.florent37.longshadow.LongShadow
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/shadow"
        app:shadow_angle="60"
        app:shadow_color="#739440"
        android:background="#99ca55">

        <TextView
            android:id="@+id/logo"
            android:layout_width="wrap_content"
            android:layout_height="120dp"
            android:gravity="center"
            android:textColor="#FFF"
            android:textSize="30sp"
            android:layout_gravity="center"
            android:text="hello world!" />

    </com.github.florent37.longshadow.LongShadow>
```

<a href='https://ko-fi.com/A160LCC' target='_blank'><img height='36' style='border:0px;height:36px;' src='https://az743702.vo.msecnd.net/cdn/kofi1.png?v=0' border='0' alt='Buy Me a Coffee at ko-fi.com' /></a>

[ ![Download](https://api.bintray.com/packages/florent37/maven/rxlifecycle/images/download.svg) ](https://bintray.com/florent37/maven/rxlifecycle/_latestVersion)

```java
dependencies {

    compile 'com.github.florent37:rxlifecycle:(lastversion)'

    compile "com.android.support:appcompat-v7:26.1.0"
    
    compile 'io.reactivex.rxjava2:rxjava:2.1.0'
    
}
```

# Credits

Author: Florent Champigny [http://www.florentchampigny.com/](http://www.florentchampigny.com/)

Blog : [http://www.tutos-android-france.com/](http://www.www.tutos-android-france.com/)

<a href="https://play.google.com/store/apps/details?id=com.github.florent37.florent.champigny">
  <img alt="Android app on Google Play" src="https://developer.android.com/images/brand/en_app_rgb_wo_45.png" />
</a>
<a href="https://plus.google.com/+florentchampigny">
  <img alt="Follow me on Google+"
       src="https://raw.githubusercontent.com/florent37/DaVinci/master/mobile/src/main/res/drawable-hdpi/gplus.png" />
</a>
<a href="https://twitter.com/florent_champ">
  <img alt="Follow me on Twitter"
       src="https://raw.githubusercontent.com/florent37/DaVinci/master/mobile/src/main/res/drawable-hdpi/twitter.png" />
</a>
<a href="https://www.linkedin.com/in/florentchampigny">
  <img alt="Follow me on LinkedIn"
       src="https://raw.githubusercontent.com/florent37/DaVinci/master/mobile/src/main/res/drawable-hdpi/linkedin.png" />
</a>


License
--------

    Copyright 2017 Florent37, Inc.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
