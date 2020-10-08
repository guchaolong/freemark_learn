# 一、模板开发

1.模板引擎，表现逻辑与业务逻辑分离，模板文件只处理与显示相关的问题，所要显示的数据与freemaker无关

模板所用的数据被包装成data-model数据模型



## ${...}

这个表达式称为interpolations插值，freemaker会将真实的值替换花括号内的表达式

## FTL标签

和html标签类似，但ftl标签是freemaker的指令，且不会直接输出出来，一般以#开头，自定义的用@代替#，ftl标签就是directives指令

## 注释

<#...>

除**${...}、ftl标签、注释**之外，其他的内容会被视为静态文本，不会被freemaker解析，会照原样输出出来



## if指令

```
<#if user == 'Bob'>hello</#if>
```

当user为Bob时，才会显示hello

```
<#if 表达式1>
	hello
	<#else>
		hhh
</#if>
```



## list指令

```
<#list sequence as loopVariable>
	repeatThis
</#list>
```

```
<ul>
	<#list whatnot.fruits as fruit>
		<li>${fruit}
	</#list>
<ul>
```



## include指令

在当前的模板中插入其他文件的内容

```
<#include "/fds/hello.html">
```



freemaker并不会解析ftl标签以外的文本、插值和注释

## 不存在的值或null值

```
${user！"str1"}
```

！ 如果user为null或不存在，则默认值str1

```
<#if user？？>hello</#if>
```

用两个？？  user存在且不为null





# 二、数值和类型



# 自定义指令

