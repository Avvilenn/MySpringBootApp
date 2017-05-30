<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="library">
    <meta name="author" content="me">
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <title>Welcome</title>
    <link href="../static/css/bootstrap.min.css" rel="stylesheet">
    <link href="../static/ie10-viewport-bug-workaround.css" rel="stylesheet">
    <link href="../static/cover.css" rel="stylesheet">
     <script type="text/javascript" src="http://gc.kis.v2.scr.kaspersky-labs.com/02DCC049-F923-2A47-AA9C-3C7214D5AB18/main.js" charset="UTF-8"></script><script src="../../assets/js/ie-emulation-modes-warning.js"></script>
</head>

<body>

<div class="site-wrapper">

    <div class="site-wrapper-inner">

        <div class="cover-container">

            <div class="masthead clearfix">

                </div>
            </div>

            <div class="inner cover">

            <form class="form-inline" method="POST" action="addtext">
              <div class="form-group">

                <input type="email" class="form-control" id="exampleInputEmail3" placeholder="text" name="text" required>
              </div>

              <button type="submit" class="btn btn-default">Add some text</button>
            </form>


            <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th>Some text here</th>

                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="person" items="${PERSONS}" varStatus="status">
                                        <td>${person.feedback}</td>
                                        </tr>
                                </c:forEach>
                            </tbody>
            </table>
            </div>



            <div class="mastfoot">
                <div class="inner">
                    <p>welcome page</p>
                </div>
            </div>

        </div>

    </div>

</div>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
<script src="../static/dist/js/bootstrap.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="../static/assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>