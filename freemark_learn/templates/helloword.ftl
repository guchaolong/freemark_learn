FreeMark学习笔记
模板引擎
模板+数据=输出
.ftl + 一个Map = html、text等

数据就是数据模型，是一个树状结构（Map)
如：Map data = new HashMap();
data.put("key1","value1")
.ftl文件中使用key1就行



大括号中是Map中的key值
${key1},你是煞笔吗

<#--注释内容-->

<#include "hi.ftl">

${df ! "df不存在"}
${key4 ! "key为null"}
感叹号表示如果key为null或不存在，显示引号中的值

<#if key5??>两个？？表示存在且不为空</#if>

#if指令
<#if key1 == '张三'>张三你好</#if>

序列List或数组
<#list animals as animal>
    ${animal}
</#list>
<#list arrays as arr>
    ${arr}
</#list>
${animals[0]}、${animals[1]}


Map
${maps.key2}
<#if maps.key3 == 'value3'>动态内容：${maps.key3}</#if>
<#if maps.key3 == 'value3'>静态内容</#if>
${maps["key3"]}
由以上可以看出：在标签和指令内，即尖括号内，使用hash的key,在外面就要用美元符号加大括号

Object
person的值是个对象，下面会输出Person@ed17bee这种
${person}
${person.age}

${key6}
${key6[1]}  //取第一个字符
${key6[2]}  //取第二个字符

<#--
<#if key6.length() != 0>dfsf</#if>  //错误写法
-->

${"hello"+"word"+"!"}
意思就是大括号中是一个表达式，会把表达式的结果输出出来

${key7[0..4]}   //取0-4之间的字符  如key7为helloWord  截取得hello
${key7[4..]}  //取4和4之后的字符 helloWord  截取得oWord
${key7[4..]+"*****"}
${key7[key7?length-4..] + "****"}







