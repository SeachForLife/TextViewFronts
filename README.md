# TextViewFronts
重写Textview控件。 可进行内部部分字符串特效，颜色，大小进行更改</br>
效果如图:</br>
![image](https://github.com/SeachForLife/TextViewFronts/raw/master/ScreenShots/show.jpg)</br>

# 方法说明
TextViewFronts findAndSetStrColor(int order, String str, String code)</br>
</br>
order：</br>
可选参数 1 变更颜色 2 变更字体特效 3 变更字体大小(暂时没有发现支持html的字体精确大小，先用big和small代替)</br>
</br>
str:</br>
需要变更的字符串（必须在文本中包含）</br>
</br>
code:</br>
选择指令后填写参数：</br>
1： 选择RGB颜色代码  例：#ff8000</br>
2： 选择需的要字体效果  srong 字体加粗 u 下划线 i斜体 tt创建打字机风格的字体</br>
3： 选择需要放大还是缩小效果 big 放大  small缩小</br>
</br>
