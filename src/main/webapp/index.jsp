<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/20/2021
  Time: 5:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <div class="player">
    <video controls>
      <source src="demoImage – demo.java 2021-08-05 23-33-33.mp4" type="video/mp4">
      <!-- fallback content here -->
    </video>
    <div class="controls">
      <button class="play" data-icon="P" aria-label="play pause toggle"></button>
      <button class="stop" data-icon="S" aria-label="stop"></button>
      <div class="timer">
        <div></div>
        <span aria-label="timer">00:00</span>
      </div>
      <button class="rwd" data-icon="B" aria-label="rewind"></button>
      <button class="fwd" data-icon="F" aria-label="fast forward"></button>
    </div>
  </div>
  $END$
  </body>
</html>
