<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<!DOCTYPE html>
		<html>
			<head>
				<meta charset="UTF-8">
				<title>Calculatrice en ligne</title>
				<Link rel='stylesheet' type='text/css' href='style.css'/>
			</head>
				<body>
					<h1>CALCULATRICE EN LIGNE</h1>
				<p>	
					${resultat}
				</p>	
					<form method='post' action=''>
					<input type='number' name= 'operande1' step='any' size='20' autofocus/>
					<select name='operateur' size='1'>
						<option value='+'>+</option>
						<option value='-'>-</option>
						<option value='x'>x</option>
						<option value='/'>/</option>
					</select>
					<input type='number' name='operande2' step='any' size='20' />
					<input type='submit' name='valider' size='2' value='='/>
					</form>
				</body>
		</html>