# 工具设置

## brew

```
brew install git        安装软件
brew uninstall wget     卸载软件
brew search /gi*/       查询软件    /gi*/ 正则    
brew list               列出已安装的软件
brew update             更新brew
brew home               用浏览器打开brew的官方网站
brew info               显示软件信息
brew deps               显示包依赖
```


* brew 安装目录 /usr/local/Cellar
* brew 配置目录 /usr/local/etc
* brew 命令目录 /usr/local/bin
* brew在安装完成后自动在/usr/local/bin加个软连接，所以平常都是用这个路径

### 加速


## sublime

### 快捷键

* cmd + shift + d        复制并粘贴当前选中内容
* cmd + g 跳转到相应的行
* cmd + m 在括号起始位置和终止位置之间切换
* cmd + Shift + m 选中括号内内容
* cmd + Shift + k 删除光标所在行
* cmd + x 当光标选中区间时剪切选中区间，否则剪切光标所在行
* cmd + Shift + up 向上选择行，并支持同时编辑多行
* cmd + Shift + down 向下选择行，并支持同时编辑多行
* cmd + l 选择光标所在行
* cmd + p
	- 输入当前项目中的文件名，快速搜索文件
	- 输入@和关键字，查找文件中函数名
	- 输入：和数字，跳转到文件中该行代码
	- 输入#和关键字，查找变量名

* 列模式编辑
	选中几行
	cmd + shift + l
	光标选择

* markdown


### 命令行打开文件


1. vim ~/.bash_profile

2. 添加如下alias:

	alias subl="'/Applications/Sublime Text.app/Contents/SharedSupport/bin/subl'"

3. source ~/.bash_profile

4. 使用：
	subl ~/.
	可以直接打开目录

## git

### 配置

* [常用 Git 命令清单](http://www.ruanyifeng.com/blog/2015/12/git-cheat-sheet.html)



### markdown安装

```
Package Control     shift + cmd + p

install package

安装Markdown Preview 和  Markdown Editing

```


