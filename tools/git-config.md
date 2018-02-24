# config

全局配置文件： ~/.gitconfig
每个仓库的配置文件: 	.git/config

## 配置别名

```
全局配置：
git config --global alias.st status
git config --global alias.co checkout
git config --global alias.ci commit
git config --global alias.br branch
git config --global alias.unstage 'reset HEAD'

配置某一个项目：
git config user.name 'coffee928'
git config user.email 'zhangsheng928@gmail.com'

```


```
[alias]
    ad = add
    co = checkout
    st = status
    cm = commit -m
    br = branch
    bm = branch -m
    bd = branch -D
    cb = checkout -b
    df = diff
    ls = log --stat
    lp = log -p
    plo = pull origin
    plode = pull origin develop
    pho = push origin
```




## 常用命令

```
git status
git add .                           添加所有修改的文件
git add file1 file2
git add dir

git commit -m "chang log"
git push origin master              提交到远程主干     

```

```
git reset HEAD file                 把暂存区的修改撤销掉（unstage），重新放回工作区

```


```
git stash                           备份当前的工作区的内容
git stash list                      显示所有备份 
git stash pop stash@{num}           num 是你要恢复的操作的序号
git stash pop                       相当于是stash@{0}
git stash clear                     删除所有stash
```
```
git log --author=sheng.zs

git reflog                          查看所有日志

```


### 本地版本回退退
```
git reset --hard Obfafd             本地版本回退
```


### 远程版本回退
```
1. 回退本地分支
    git reflog
    git reset --hard Obfafd

2. 强制推送到远程分支
    git push -f

```




