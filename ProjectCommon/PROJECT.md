<h1>Architecture project Common</h1>
<br>
<h4>com.talentyco.bisogne.common</h4>
<ul> 
<li style="color: red;">Constans.java</li>
</ul>
<br>
<h4>com.talentyco.bisogne.common.entity</h4>
<ul> 
<li style="color: red;">AbstractAddress.java</li>
<li style="color: red;">IdBasedEntity.java</li>
<li style="color: red;">AbstractAddressWithCountry.java</li>
<li style="color: red;">Address.java</li>
<li style="color: red;">Authentication.java</li>
<li style="color: red;">Brand.java</li>
<li style="color: red;">CardItem.java</li>
<li style="color: red;">Category.java</li>
<li style="color: red;">Country.java</li>
<li style="color: red;">Currency.java</li>
<li style="color: red;">Customer.java</li>
<li style="color: red;">Role.java</li>
<li style="color: red;">ShippingRate.java</li>
<li style="color: red;">State.java</li>
<li style="color: red;">StateDTO.java</li>
<li style="color: red;">User.java</li>
</ul>
<br>
<h4>com.talentyco.bisogne.common.entity.order</h4>
<ul> 
<li style="color: red;">Order.java</li>
<li style="color: red;">OrderDetail.java</li>
<li style="color: red;">OrderStatus.java</li>
<li style="color: red;">OrderTrack.java</li>
<li style="color: red;">PaymentMethod.java</li>
</ul>
<br>
<h4>com.talentyco.bisogne.common.entity.product</h4>
<ul> 
<li style="color: red;">Product.java</li>
<li style="color: red;">ProductDetail.java</li>
<li style="color: red;">ProductImage.java</li>
</ul>
<br>
<h4>com.talentyco.bisogne.common.entity.setting</h4>
<ul> 
<li style="color: red;">Setting.java</li>
<li style="color: red;">SettingBag.java</li>
<li style="color: red;">SettingCategory.java</li>
</ul>
<br>
<h4>com.talentyco.bisogne.common.exception</h4>
<ul> 
<li style="color: red;">CategoryNotFoundException.java</li>
<li style="color: red;">CustomerNotFoundException.java</li>
<li style="color: red;">OrderNotFoundException.java</li>
<li style="color: red;">ProductNotFoundException.java</li>
</ul>
<br>
<pre>
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.5.6</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
	<groupId>com.talentyco</groupId>
	<artifactId>ProjectCommon</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>ProjectCommon</name>
	<description>Project Common  All Entity</description>
	<properties>
		<java.version>11</java.version>
	</properties>
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-test</artifactId>
            <version>2.5.6</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>RELEASE</version>
            <scope>test</scope>
        </dependency>
		<!-- https://mvnrepository.com/artifact/org.projectlombok/lombok -->
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<version>1.18.22</version>
			<scope>provided</scope>
		</dependency>
	</dependencies>
</project>
</pre>