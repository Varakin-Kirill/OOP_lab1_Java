<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Finding the frequency of a word in a file</title>
</head>
<body>
<h1>Поиск частоты слова в тексте</h1>
<form action="WordFrequencyServlet" method="GET">
  Введите слова для поиска: <input name="word" />
  <br><br>
  <input type="submit" value="Найти" />
</form>
</body>
</html>