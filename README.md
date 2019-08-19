创建项目

 mvn archetype:generate  -DarchetypeGroupId=com.xzq.archetype  -DarchetypeArtifactId=xzq-boot-archetype -DarchetypeVersion=1.0-Release -DarchetypeRepository=http://47.96.128.158:8081/repository/maven-releases/ -Dwebport=8081  -DgroupId=com.xzq.projectname -DartifactId=projectname -Dversion=1.0 -DarchetypeCatalog=internal
 
参数说明:

    -Dwebport 指定web容器端口
    -DgroupId 指定group名,我们的项目应该意com.xzq开头
    -DartifactId 项目名
    -Dversion 项目版本号

本地测试:

    mvni
 mvn archetype:generate  -DarchetypeGroupId=com.xzq.archetype  -DarchetypeArtifactId=xzq-boot-archetype -DarchetypeVersion=1.0-Release -DarchetypeRepository=http://47.96.128.158:8081/repository/maven-releases/ -Dwebport=8081  -DgroupId=com.xzq.projectname -DartifactId=projectname -Dversion=1.0 -DarchetypeCatalog=internal
