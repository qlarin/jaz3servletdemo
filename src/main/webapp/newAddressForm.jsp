<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Nowy adres</title>
</head>
<body>

<jsp:useBean id="address" class="jaz3servletdemo.source.UserAddress" scope="session" />

<h3>Dodaj nowy adres</h3>

<form action="" method="get">
	Typ adresu: <select name="addresstype">
		<option value="zam">Zameldowania</option>
		<option value="kor">Korespondencyjny</option>
		<option value="pr">Pracy</option>
	</select><br>
	Województwo: <select name="province">
		<option value="1">Dolnośląskie</option>
		<option value="2">Kujawsko-pomorskie</option>
		<option value="3">Lubelskie</option>
		<option value="4">Lubuskie</option>
		<option value="5">Łódzkie</option>
		<option value="6">Małopolskie</option>
		<option value="7">Mazowieckie</option>
		<option value="8">Opolskie</option>
		<option value="9">Podkarpackie</option>
		<option value="10">Podlaskie</option>
		<option value="11">Pomorskie</option>
		<option value="12">Śląskie</option>
		<option value="13">Świętokrzyskie</option>
		<option value="14">Warmińsko-mazurskie</option>
		<option value="15">Wielkopolskie</option>
		<option value="16">Zachodniopomorskie</option>
	</select><br>
	Miasto: <input type="text" name="city" value="${address.city}"><br>
	Kod pocztowy: <input type="text" name="postcode" value="${address.postcode}"><br>
	Ulica: <input type="text" name="street" value="${address.street}"><br>
	Numer domu/mieszkania: <input type="text" name="housenr" value="${address.housenr}"><br><br>
	<input type="submit" value="Dodaj adres"><br>
</form>

</body>
</html>