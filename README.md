# CandyWeather
第一行代码 SunnyWeather 练习项目

minSdk 22 | targetSdk 32 | compileSdk 32

kotlin-android-extensions插件已被弃用，换成ViewBinding；
PlaceFragment中Fragment.onActivityCreated已被弃用，换成onViewCreated；
PlaceFragment中LiveData.observe第一个参数换成viewLifecycleOwner/getViewLifecycleOwner()