整合spring和mybatis

注意：
1、jdbc.properties文件中，一定不要出现和pom文件中重复的property，否则可能读到的是pom文件中的
2、如果出错，记得去target目录下，查看相应的文件是否都进行编译了，包括class、xml、properties文件